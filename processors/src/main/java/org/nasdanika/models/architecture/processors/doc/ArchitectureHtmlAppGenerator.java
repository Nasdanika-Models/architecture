package org.nasdanika.models.architecture.processors.doc;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.html.model.app.graph.emf.HtmlAppGenerator;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.ncore.NcorePackage;

public class ArchitectureHtmlAppGenerator extends HtmlAppGenerator {

	public ArchitectureHtmlAppGenerator(
			Collection<? extends EObject> sources,
			ArchitectureNodeProcessorFactory nodeProcessorFactory, 
			Collection<? extends EObject> references,
			Function<? super EObject, URI> uriResolver) {
		super(sources, references, uriResolver, nodeProcessorFactory);
	}
	
	private static Map<EPackage, URI> REFERENCES = Map.ofEntries(
			Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
			Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/")),			
			Map.entry(GraphPackage.eINSTANCE, URI.createURI("https://graph.models.nasdanika.org/")),			
			Map.entry(ArchitecturePackage.eINSTANCE, URI.createURI("https://architecture.models.nasdanika.org/")));
		
	public ArchitectureHtmlAppGenerator(
			EObject source,
			URI baseURI,
			ArchitectureNodeProcessorFactory nodeProcessorFactory) {
		super(
			Collections.singleton(source),
			REFERENCES.keySet(), 
			eObj -> {
				if (eObj == source) {
					return baseURI;
				}
				return REFERENCES.get(eObj);
			},
			nodeProcessorFactory);
	}
		
	public ArchitectureHtmlAppGenerator(EObject source, ArchitectureNodeProcessorFactory nodeProcessorFactory) {
		this(source, URI.createURI("tmp://" + UUID.randomUUID() + "/" + UUID.randomUUID() + "/"), nodeProcessorFactory);
	}
	
	public ArchitectureHtmlAppGenerator(EObject source) {
		this(source, new ArchitectureNodeProcessorFactory(Context.EMPTY_CONTEXT, null));
	}
	
}
