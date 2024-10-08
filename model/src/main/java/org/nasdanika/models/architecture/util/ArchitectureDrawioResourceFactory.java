package org.nasdanika.models.architecture.util;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.script.ScriptEngine;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.drawio.model.ModelFactory;
import org.nasdanika.drawio.model.util.AbstractDrawioFactory;
import org.nasdanika.emf.SpecLoadingDrawioFactory;
import org.nasdanika.persistence.Marker;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Uses {@link FamilyDrawioFactory} to load family model from a Drawio diagram. 
 * @author Pavel
 * @deprecated Use {@link SpecLoadingDrawioFactory}
 */
@Deprecated
public class ArchitectureDrawioResourceFactory implements Resource.Factory {
	
	protected Function<URI,EObject> uriResolver;
	
	public ArchitectureDrawioResourceFactory(Function<URI,EObject> uriResolver) {
		this.uriResolver = uriResolver;
	}
		
	@Override
	public Resource createResource(URI uri) {
		return new ArchitectureDrawioResource(uri, uriResolver) {
			
			@Override
			protected ClassLoader getClassLoader(EObject context, URI baseURI, Supplier<ClassLoader> logicalParentClassLoaderSupplier) {
				return ArchitectureDrawioResourceFactory.this.getClassLoader(context, baseURI, logicalParentClassLoaderSupplier);
			};
			
			@Override
			protected URI getAppBase() {
				return ArchitectureDrawioResourceFactory.this.getAppBase();
			}
			
			@Override
			protected void filterRepresentationElement(
					org.nasdanika.drawio.ModelElement representationElement, 
					EObject semanticElement, 
					Map<EObject, EObject> registry,
					ProgressMonitor progressMonitor) {
				ArchitectureDrawioResourceFactory.this.filterRepresentationElement(representationElement, semanticElement, registry, progressMonitor);
			}
			
			@Override
			protected Iterable<Map.Entry<String,Object>> getVariables(EObject context) {
				return ArchitectureDrawioResourceFactory.this.getVariables(this, context);
			};
			
			@Override
			protected String getProperty(String name) {
				return ArchitectureDrawioResourceFactory.this.getProperty(this, name);
			}
			
		};
	}
	
	protected String getProperty(ArchitectureDrawioResource architectureDrawioResource, String name) {
		return null;
	}

	protected Function<Marker, org.nasdanika.ncore.Marker> getMarkerFactory() {
		return null;
	}
	
	protected ModelFactory getDrawioFactory() {
		return org.nasdanika.drawio.model.ModelFactory.eINSTANCE;
	}
	
	protected ProgressMonitor getProgressMonitor() {
		return new NullProgressMonitor();
	}
	
	protected EvaluationContext createEvaluationContext(Object context) {
		return new StandardEvaluationContext();
	}	
	
	protected ClassLoader getClassLoader(EObject context, URI baseURI, Supplier<ClassLoader> logicalParentClassLoaderSupplier) {
		return logicalParentClassLoaderSupplier == null ? Thread.currentThread().getContextClassLoader() : logicalParentClassLoaderSupplier.get();
	}	

	protected URI getAppBase() {
		return AbstractDrawioFactory.DEFAULT_APP_BASE;
	}
	
	/**
	 * Override to implement filtering of a representation element. 
	 * For example, if an element represents a processing unit, its background color or image can be modified depending on the load - red for overloaded, green for OK, grey for planned offline.  
	 * @param representationElement
	 * @param registry
	 * @param progressMonitor
	 */
	protected void filterRepresentationElement(
			org.nasdanika.drawio.ModelElement representationElement, 
			EObject semanticElement,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
	}
	
	protected void configureScriptEngine(
			ScriptEngine engine, 
			ArchitectureDrawioResource resource,
			EObject diagramElement, 
			EObject semanticElement,
			Map<EObject, EObject> registry, 
			int pass, 
			ProgressMonitor progressMonitor) {		
		
	}	
	
	protected Iterable<Entry<String, Object>> getVariables(ArchitectureDrawioResource resource, EObject context) {
		return Collections.emptySet();
	}
			
}
