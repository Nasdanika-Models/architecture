package org.nasdanika.models.architecture.demos.ibs.tests;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.drawio.Node;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.html.model.app.gen.AppSiteGenerator;
import org.nasdanika.html.model.app.graph.emf.EObjectReflectiveProcessorFactoryProvider;
import org.nasdanika.models.architecture.processors.doc.ArchitectureHtmlAppGenerator;
import org.nasdanika.models.architecture.processors.doc.ArchitectureNodeProcessorFactory;
import org.nasdanika.models.architecture.util.ArchitectureDrawioResourceFactory;
import org.nasdanika.models.ecore.graph.processors.EcoreHtmlAppGenerator;

public class TestInternetBankingSystemSiteGen {
	
	@Test
	@Disabled
	public void testGenerateInternetBankingSystemSiteWithMapping() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("drawio", new ArchitectureDrawioResourceFactory(uri -> resourceSet.getEObject(uri, true)) {
			
			@Override
			protected void filterRepresentationElement(
					org.nasdanika.drawio.ModelElement representationElement, 
					EObject semanticElement,
					Map<EObject, EObject> registry, 
					ProgressMonitor progressMonitor) {

				super.filterRepresentationElement(representationElement, semanticElement, registry, progressMonitor);
				
				if (representationElement instanceof Node) {
					Node node = (Node) representationElement;
					if ("MainframeBankingSystemFacadeImpl".equals(node.getId())) {
						node.getStyle().put("fillColor", "#ffe6cc");
						node.getStyle().put("strokeColor", "#d79b00");
					}
				}					
			}
						
		});
				
		File ibsDiagramFile = new File("internet-banking-system.drawio").getCanonicalFile();
		Resource ibsResource = resourceSet.getResource(URI.createFileURI(ibsDiagramFile.getAbsolutePath()), true);
		
		// Generating an action model
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
								
		File output = new File(actionModelsDir, "ibs.xmi");
				
		ArchitectureHtmlAppGenerator htmlAppGenerator = new ArchitectureHtmlAppGenerator(
				ibsResource.getContents().get(0),
				new ArchitectureNodeProcessorFactory(context, null)) {
			

			@Override
			protected org.nasdanika.html.model.app.graph.emf.EObjectReflectiveProcessorFactoryProvider createReflectiveFactoryProvider(Object reflectiveFactory) {
				return new EObjectReflectiveProcessorFactoryProvider(reflectiveFactory) {
					
					@Override
					protected boolean isCompactPath(ProcessorConfig config) {
						return true;
						
					}					
					
				};				
			}
			
		};
		
		htmlAppGenerator.generateHtmlAppModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
				
		// Generating a web site
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://architecture.models.nasdanika.org/demos/internet-banking-system";		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path);				
			};
			
		};		
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				pageTemplateURI, 
				siteMapDomain, 
				new File("../../docs/demo/internet-banking-system"), // Publishing to the repository's docs directory for GitHub pages 
				new File("target/ibs-doc-site-work-dir"), 
				true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errorCount != 23) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
		
	}
	
	/**
	 * Uses the generic action generator
	 * @throws Exception
	 */	
	@Test
	public void testGenerateInternetBankingSystemSiteWithMappingEcoreActionGenerator() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("drawio", new ArchitectureDrawioResourceFactory(uri -> resourceSet.getEObject(uri, true)) {
			
			@Override
			protected void filterRepresentationElement(
					org.nasdanika.drawio.ModelElement representationElement, 
					EObject semanticElement,
					Map<EObject, EObject> registry, 
					ProgressMonitor progressMonitor) {

				super.filterRepresentationElement(representationElement, semanticElement, registry, progressMonitor);
				
				if (representationElement instanceof Node) {
					Node node = (Node) representationElement;
					if ("MainframeBankingSystemFacadeImpl".equals(node.getId())) {
						node.getStyle().put("fillColor", "#ffe6cc");
						node.getStyle().put("strokeColor", "#d79b00");
					}
				}					
			}
						
		});
				
		File ibsDiagramFile = new File("internet-banking-system.drawio").getCanonicalFile();
		Resource ibsResource = resourceSet.getResource(URI.createFileURI(ibsDiagramFile.getAbsolutePath()), true);
		
		// Generating an action model
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
								
		File output = new File(actionModelsDir, "ibs.xmi");
		
		EcoreHtmlAppGenerator htmlAppGenerator = EcoreHtmlAppGenerator.loadEcoreHtmlAppGenerator(
				ibsResource.getContents().get(0), 
				context,
				null, // java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,			
				null, // Predicate<Object> factoryPredicate,
				null, // Predicate<EPackage> ePackagePredicate,
				diagnosticConsumer,
				progressMonitor);
		
		htmlAppGenerator.generateHtmlAppModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
				
		// Generating a web site
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://architecture.models.nasdanika.org/demos/internet-banking-system";		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path);				
			};
			
		};		
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				pageTemplateURI, 
				siteMapDomain, 
				new File("../../docs/demo/internet-banking-system"), // Publishing to the repository's docs directory for GitHub pages 
				new File("target/ibs-doc-site-work-dir"), 
				true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errorCount != 23) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
		
	}	
	
}
