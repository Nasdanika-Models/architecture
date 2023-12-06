/**
 */
package org.nasdanika.models.architecture.processors.doc;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.drawio.Document;
import org.nasdanika.drawio.Page;
import org.nasdanika.drawio.model.util.AbstractDrawioFactory;
import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedGraphNodeProcessorMixIn;
import org.nasdanika.ncore.ListProperty;
import org.nasdanika.ncore.Property;
import org.xml.sax.SAXException;
import org.nasdanika.common.Util;

public interface ArchitectureDescriptionNodeProcessorMixIn<T extends ArchitectureDescription> extends DocumentedNamedGraphNodeProcessorMixIn<T>, ArchitectureElementNodeProcessorMixIn<T> {
	
	@Override
	default Map<String,String> getRepresentations() {
		T target = getTarget();
		Property topLevelPages = target.getAnnotation(AbstractDrawioFactory.TOP_LEVEL_PAGES_ANNOTATION);
		if (topLevelPages instanceof ListProperty) {
			List<Object> topLevelPagesList = ((ListProperty) topLevelPages).toList();
			String drawioRepresentation = target.getRepresentations().get(AbstractDrawioFactory.DRAWIO_REPRESENTATION);
			if (!Util.isBlank(drawioRepresentation)) {
				try {
					Document drawioDocument = Document.load(URI.createURI(drawioRepresentation));
					Iterator<Page> pit = drawioDocument.getPages().iterator();
					while (pit.hasNext()) {
						Page page = pit.next();
						if (!topLevelPagesList.contains(page.getId())) {
							pit.remove();
						}
					}
					return Collections.singletonMap(AbstractDrawioFactory.DRAWIO_REPRESENTATION, drawioDocument.toDataURI(true).toString());
				} catch (IOException | ParserConfigurationException | SAXException | TransformerException e) {
					throw new NasdanikaException("Error processing representation", e);
				}
			}
		}
		return ArchitectureElementNodeProcessorMixIn.super.getRepresentations();
	}
	

//	EList<Actor> getActors();
	
} 
