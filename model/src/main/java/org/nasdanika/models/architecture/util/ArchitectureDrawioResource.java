package org.nasdanika.models.architecture.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.drawio.emf.DrawioResource;
import org.nasdanika.drawio.model.ModelFactory;
import org.nasdanika.persistence.Marker;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Loads Drawio model using {@link DrawioResource} and then transforms it to the architecture model.
 */
public class ArchitectureDrawioResource extends ResourceImpl {
		
	protected Function<URI,EObject> uriResolver;
	
	public ArchitectureDrawioResource(Function<URI,EObject> uriResolver) {
		super();
		this.uriResolver = uriResolver;
	}

	public ArchitectureDrawioResource(URI uri, Function<URI,EObject> uriResolver) {
		super(uri);
		this.uriResolver = uriResolver;
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Resource diagramResource = new DrawioResource(getURI()) {

			@Override
			protected Function<Marker, org.nasdanika.ncore.Marker> getMarkerFactory() {
				return ArchitectureDrawioResource.this.getMarkerFactory();
			}

			@Override
			protected ModelFactory getFactory() {
				return ArchitectureDrawioResource.this.getDrawioFactory();
			}
			
		};
		
		diagramResource.load(inputStream, options);
		
		ArchitectureDrawioFactory architectureDrawioFactory = new ArchitectureDrawioFactory() {

			@Override
			protected EObject getByRefId(String refId, int pass, Map<EObject, EObject> registry) {				
				return ArchitectureDrawioResource.this.getByRefId(refId, pass, registry);
			}
			
			@Override
			protected EvaluationContext createEvaluationContext() {
				return ArchitectureDrawioResource.this.createEvaluationContext();
			}
			
		};
		
		Transformer<EObject,EObject> graphFactory = new Transformer<>(architectureDrawioFactory);
		Collection<EObject> diagramModelContents = new ArrayList<>();
		diagramResource.getAllContents().forEachRemaining(e -> {
			if (e instanceof org.nasdanika.drawio.model.Document
					|| e instanceof org.nasdanika.drawio.model.Page
					|| e instanceof org.nasdanika.drawio.model.ModelElement) {
				diagramModelContents.add(e);
			}
		});
		
		Map<EObject, EObject> graphElements = graphFactory.transform(diagramModelContents, false, getProgressMonitor());
		
		diagramResource.getContents().stream().map(graphElements::get).forEach(getContents()::add);
	}

	protected ProgressMonitor getProgressMonitor() {
		return new NullProgressMonitor();
	}

	protected Function<Marker, org.nasdanika.ncore.Marker> getMarkerFactory() {
		return null;
	}

	protected ModelFactory getDrawioFactory() {
		return org.nasdanika.drawio.model.ModelFactory.eINSTANCE;
	}	
	
	protected EObject getByRefId(String refId, int pass, Map<EObject, EObject> registry) {
		if (uriResolver == null) {
			return null;
		}
		
		URI refURI = URI.createURI(refId);
		if(!getURI().isRelative()) {
			refURI = refURI.resolve(getURI());
		}
		return uriResolver.apply(refURI);
	}
	
	protected EvaluationContext createEvaluationContext() {
		return new StandardEvaluationContext();
	}	

}
