package org.nasdanika.models.architecture.processors.doc;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.ncore.NcorePackage;

public class ArchitectureActionGenerator {
	
	protected ArchitectureNodeProcessorFactory nodeProcessorFactory;
	
	public ArchitectureActionGenerator() {
		this(Context.EMPTY_CONTEXT, null);
	}
	
	public ArchitectureActionGenerator(Context context, java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider) {
		this(new ArchitectureNodeProcessorFactory(context, prototypeProvider));
	}
		
	public ArchitectureActionGenerator(ArchitectureNodeProcessorFactory nodeProcessorFactory) {
		this.nodeProcessorFactory = nodeProcessorFactory;
	}
		
	/**
	 * Generates actions for a single source with a baseURI
	 * @param source
	 * @param baseURI Base URI. Can be null. If null, a random URI is generated. Use base URI if you want to generate relative links to referenced objects. 
	 * @param nodeProcessorFactory
	 * @param references
	 * @param diagnosticConsumer
	 * @param progressMonitor
	 * @return
	 */
	public Map<EObject,Collection<Label>> generateActionModel(
			EObject source,
			URI baseURI,
			Consumer<Diagnostic> diagnosticConsumer,
			ProgressMonitor progressMonitor) {		
		
		return org.nasdanika.html.model.app.graph.emf.Util.generateActionModel(
				source, 
				baseURI, 
				nodeProcessorFactory, 
				getReferencedEPackages(), 
				diagnosticConsumer, 
				progressMonitor);
		
	}

	protected Map<EObject, URI> getReferencedEPackages() {
		return Map.ofEntries(
				Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
				Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/")),			
				Map.entry(GraphPackage.eINSTANCE, URI.createURI("https://graph.models.nasdanika.org/")),			
				Map.entry(ArchitecturePackage.eINSTANCE, URI.createURI("https://architecture.models.nasdanika.org/"))			
			);
	}
	
	/**
	 * Generates actions for a single source and saves to a resource identified by URI
	 * @param source
	 * @param baseURI
	 * @param nodeProcessorFactory
	 * @param references
	 * @param diagnosticConsumer
	 * @param actionModelResourceURI Resource URI
	 * @param progressMonitor
	 * @throws IOException
	 */
	public void generateActionModel(
			EObject source,
			URI baseURI,
			Consumer<Diagnostic> diagnosticConsumer,
			URI actionModelResourceURI,
			ProgressMonitor progressMonitor) throws IOException {
	
		Map<EObject, Collection<Label>> labelMap = generateActionModel(
				source,
				baseURI,
				diagnosticConsumer, 
				progressMonitor);
		
		org.nasdanika.html.model.app.graph.emf.Util.saveLabelMap(labelMap, actionModelResourceURI);
	}
	
	/**
	 * Generates actions for a single source and saves to a file
	 * @param source
	 * @param baseURI
	 * @param nodeProcessorFactory
	 * @param references
	 * @param diagnosticConsumer
	 * @param actionModelFile
	 * @param progressMonitor
	 * @throws IOException
	 */
	public void generateActionModel(
			EObject source,
			URI baseURI,
			Consumer<Diagnostic> diagnosticConsumer,
			File actionModelFile,
			ProgressMonitor progressMonitor) throws IOException {
		
		generateActionModel(
				source,
				baseURI,
				diagnosticConsumer, 
				URI.createFileURI(actionModelFile.getCanonicalFile().getAbsolutePath()), 
				progressMonitor);
	}
	
	
	// --- Single source ---	
	
	/**
	 * Generates actions for a single source with a random base URI.
	 * @param source
	 * @param nodeProcessorFactory
	 * @param references
	 * @param diagnosticConsumer
	 * @param progressMonitor
	 * @return
	 */
	public Map<EObject,Collection<Label>> generateActionModel(
			EObject source,
			Consumer<Diagnostic> diagnosticConsumer,
			ProgressMonitor progressMonitor) {
		
		return generateActionModel(
				source, 
				null,
				diagnosticConsumer,
				progressMonitor);
		
	}	

	/**
	 * 	 * Generates actions for a single source with a random base URI and saves to a resource at provided URI.
	 * @param source
	 * @param nodeProcessorFactory
	 * @param references
	 * @param diagnosticConsumer
	 * @param actionModelResourceURI Action resource URI
	 * @param progressMonitor
	 * @throws IOException
	 */
	public void generateActionModel(
			EObject source,
			Consumer<Diagnostic> diagnosticConsumer,
			URI actionModelResourceURI,
			ProgressMonitor progressMonitor) throws IOException {
	
		generateActionModel(
				source,
				null,
				diagnosticConsumer,
				actionModelResourceURI,
				progressMonitor);
	}

	/**
	 * Generates actions for a single source with a random base URI and saves to a file.
	 * @param source
	 * @param nodeProcessorFactory
	 * @param references
	 * @param diagnosticConsumer
	 * @param actionModelFile
	 * @param progressMonitor
	 * @throws IOException
	 */
	public void generateActionModel(
			EObject source,
			Consumer<Diagnostic> diagnosticConsumer,
			File actionModelFile,
			ProgressMonitor progressMonitor) throws IOException {
		
		generateActionModel(
				source,
				null,
				diagnosticConsumer, 
				URI.createFileURI(actionModelFile.getCanonicalFile().getAbsolutePath()), 
				progressMonitor);
	}
	
}
