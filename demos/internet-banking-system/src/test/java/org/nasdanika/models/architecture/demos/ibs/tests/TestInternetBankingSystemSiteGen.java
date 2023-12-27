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
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.diagramgenerator.plantuml.PlantUMLDiagramGenerator;
import org.nasdanika.drawio.Node;
import org.nasdanika.html.model.app.gen.ActionSiteGenerator;
import org.nasdanika.models.architecture.processors.doc.ArchitectureActionGenerator;
import org.nasdanika.models.architecture.processors.doc.ArchitectureNodeProcessorFactory;
import org.nasdanika.models.architecture.util.ArchitectureDrawioResourceFactory;

public class TestInternetBankingSystemSiteGen {
	
	@Test
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
		context.register(DiagramGenerator.class, new PlantUMLDiagramGenerator());
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
								
		File output = new File(actionModelsDir, "ibs.xmi");
				
		ArchitectureActionGenerator actionGenerator = new ArchitectureActionGenerator(
				ibsResource.getContents().get(0),
				new ArchitectureNodeProcessorFactory(context, null));
		
		actionGenerator.generateActionModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
				
		// Generating a web site
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://architecture.models.nasdanika.org/demos/internet-banking-system";		
		ActionSiteGenerator actionSiteGenerator = new ActionSiteGenerator() {
			
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
		
		if (errors.size() != 11) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
		
	}
	
}
