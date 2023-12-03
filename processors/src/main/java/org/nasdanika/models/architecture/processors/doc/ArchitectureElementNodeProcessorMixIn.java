/**
 */
package org.nasdanika.models.architecture.processors.doc;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.model.util.AbstractDrawioFactory;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.models.architecture.ArchitectureElement;
import org.nasdanika.models.ncore.processors.doc.DocumentedNamedElementNodeProcessorMixIn;
import org.nasdanika.models.ncore.processors.doc.PeriodNodeProcessorMixIn;

public interface ArchitectureElementNodeProcessorMixIn<T extends ArchitectureElement> extends DocumentedNamedElementNodeProcessorMixIn<T>, PeriodNodeProcessorMixIn<T> {
	
	/**
	 * Sets icon
	 */
	default void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		T target = getTarget();
		String icon = target.getIcon();
		if (source == target && label instanceof Action) {
			if (!Util.isBlank(icon)) {
				String location = ((Action) label).getLocation();
				URI uri = getUri();
				if (uri != null && location != null && uri.toString().equals(location)) {
					label.setIcon(icon);
				}
			}
			
			for (Map.Entry<String, String> representation: getRepresentations().entrySet()) {
				label.getRepresentations().put(representation.getKey(), representation.getValue());
			}
		}
	}
	
	default Map<String,String> getRepresentations() {
		T target = getTarget();
		String drawioRepresentation = target.getRepresentations().get(AbstractDrawioFactory.DRAWIO_REPRESENTATION);
		if (!Util.isBlank(drawioRepresentation)) {
			return Collections.singletonMap(AbstractDrawioFactory.DRAWIO_REPRESENTATION, drawioRepresentation);
		}
		return Collections.emptyMap();
	}

} 
