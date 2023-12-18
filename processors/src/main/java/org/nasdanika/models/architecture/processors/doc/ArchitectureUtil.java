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

public final class ArchitectureUtil {
	
	// Singleton
	private ArchitectureUtil() {
		
	}
		
	// --- Single source and base URI ---	
	
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
	public static Map<EObject,Collection<Label>> generateActionModel(
			EObject source,
			URI baseURI,
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,
			Consumer<Diagnostic> diagnosticConsumer,
			ProgressMonitor progressMonitor) {
		
		
		ArchitectureNodeProcessorFactory nodeProcessorFactory = new ArchitectureNodeProcessorFactory(context, null);
		
		Map<EObject, URI> references = Map.ofEntries(
				Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
				Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/")),			
				Map.entry(GraphPackage.eINSTANCE, URI.createURI("https://graph.models.nasdanika.org/")),			
				Map.entry(ArchitecturePackage.eINSTANCE, URI.createURI("https://architecture.models.nasdanika.org/"))			
			);				
		
		
		return org.nasdanika.html.model.app.graph.emf.Util.generateActionModel(
				source, 
				baseURI, 
				nodeProcessorFactory, 
				references, 
				diagnosticConsumer, 
				progressMonitor);
		
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
	public static void generateActionModel(
			EObject source,
			URI baseURI,
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,
			Consumer<Diagnostic> diagnosticConsumer,
			URI actionModelResourceURI,
			ProgressMonitor progressMonitor) throws IOException {
	
		Map<EObject, Collection<Label>> labelMap = generateActionModel(
				source,
				baseURI,
				context, 
				prototypeProvider, 
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
	public static void generateActionModel(
			EObject source,
			URI baseURI,
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,
			Consumer<Diagnostic> diagnosticConsumer,
			File actionModelFile,
			ProgressMonitor progressMonitor) throws IOException {
		
		generateActionModel(
				source,
				baseURI,
				context, 
				prototypeProvider, 
				diagnosticConsumer, 
				URI.createFileURI(actionModelFile.getCanonicalFile().getAbsolutePath()), progressMonitor);
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
	public static Map<EObject,Collection<Label>> generateActionModel(
			EObject source,
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,
			Consumer<Diagnostic> diagnosticConsumer,
			ProgressMonitor progressMonitor) {
		
		return generateActionModel(
				source, 
				null,
				context, 
				prototypeProvider, 
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
	public static void generateActionModel(
			EObject source,
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,
			Consumer<Diagnostic> diagnosticConsumer,
			URI actionModelResourceURI,
			ProgressMonitor progressMonitor) throws IOException {
	
		generateActionModel(
				source,
				null,
				context, 
				prototypeProvider, 
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
	public static void generateActionModel(
			EObject source,
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,
			Consumer<Diagnostic> diagnosticConsumer,
			File actionModelFile,
			ProgressMonitor progressMonitor) throws IOException {
		
		generateActionModel(
				source,
				null,
				context, 
				prototypeProvider, 
				diagnosticConsumer, 
				URI.createFileURI(actionModelFile.getCanonicalFile().getAbsolutePath()), 
				progressMonitor);
	}
	
}
