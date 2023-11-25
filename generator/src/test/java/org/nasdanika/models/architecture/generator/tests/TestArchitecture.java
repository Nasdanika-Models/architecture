package org.nasdanika.models.architecture.generator.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Mapper;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.drawio.model.ModelElement;
import org.nasdanika.drawio.model.Page;
import org.nasdanika.graph.model.util.GraphPropertySetterFeatureMapper;
import org.nasdanika.models.architecture.util.ArchitectureDrawioFactory;
import org.nasdanika.persistence.Marked;

public class TestArchitecture {
	
	@Test
	public void testLoadArchitectureDocument() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Context context = Context.EMPTY_CONTEXT;
		ResourceSet resourceSet = org.nasdanika.html.model.app.gen.Util.createResourceSet(context, progressMonitor);
		URI diagramURI = URI.createFileURI(new File("architecture.drawio").getCanonicalPath());
		Resource diagramModel = resourceSet.getResource(diagramURI, true);
		
		ArchitectureDrawioFactory architectureDrawioFactory = new ArchitectureDrawioFactory() {
			
			@Override
			protected Mapper<EObject, EObject> getMapper(int phase, int pass) {
				ArchitectureDrawioFactory self = this; 
				
				return new GraphPropertySetterFeatureMapper() {

					@Override
					protected Setter<EObject, EObject> getFeatureSetter(
							EObject source, 
							ConfigType configType,
							ConfigSubType configSubType, 
							EStructuralFeature feature) {
						
						if (feature instanceof EReference && ((EReference) feature).isContainment())  {							
							return phase == 0 ? super.getFeatureSetter(source, configType, configSubType, feature) : null;					
						}
						
						return phase == 0 ? null : super.getFeatureSetter(source, configType, configSubType, feature);					
					}

					@Override
					protected boolean isTopLevelPage(Page page) {
						return self.isTopLevelPage(page);
					}

					@Override
					protected boolean isPageElement(ModelElement drawioModelElement) {
						return self.isPageElement(drawioModelElement);
					}
					
					@Override
					protected String getPropertyNamespace() {
						return self.getPropertyNamespace();
					}

					@Override
					protected EClassifier getType(String type, EObject context) {
						return self.getType(type, context instanceof Marked ? (Marked) context : null);
					}
					
				};		
			}
		};
		
		Transformer<EObject,EObject> graphFactory = new Transformer<>(architectureDrawioFactory);
		Collection<EObject> diagramModelContents = new ArrayList<>();
		diagramModel.getAllContents().forEachRemaining(e -> {
			if (e instanceof org.nasdanika.drawio.model.Document
					|| e instanceof org.nasdanika.drawio.model.Page
					|| e instanceof org.nasdanika.drawio.model.ModelElement) {
				diagramModelContents.add(e);
//				System.out.println(e);
			}
		});
		Map<EObject, EObject> graphElements = graphFactory.transform(diagramModelContents, false, progressMonitor);
		System.out.println(graphElements.size());
		
		URI graphURI = URI.createFileURI(new File("target/architecture.xmi").getCanonicalPath());
		Resource graphResource = resourceSet.createResource(graphURI);
		diagramModel.getContents().stream().map(graphElements::get).forEach(graphResource.getContents()::add);
		graphResource.save(null);		
	}
	
	@Test
	public void testLoadAwsDocument() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Context context = Context.EMPTY_CONTEXT;
		ResourceSet resourceSet = org.nasdanika.html.model.app.gen.Util.createResourceSet(context, progressMonitor);
		URI diagramURI = URI.createFileURI(new File("aws.drawio").getCanonicalPath());
		Resource diagramModel = resourceSet.getResource(diagramURI, true);
		
		ArchitectureDrawioFactory architectureDrawioFactory = new ArchitectureDrawioFactory() {
			
			@Override
			protected Mapper<EObject, EObject> getMapper(int phase, int pass) {
				ArchitectureDrawioFactory self = this; 
				
				return new GraphPropertySetterFeatureMapper() {

					@Override
					protected Setter<EObject, EObject> getFeatureSetter(
							EObject source, 
							ConfigType configType,
							ConfigSubType configSubType, 
							EStructuralFeature feature) {
						
						if (feature instanceof EReference && ((EReference) feature).isContainment())  {							
							return phase == 0 ? super.getFeatureSetter(source, configType, configSubType, feature) : null;					
						}
						
						return phase == 0 ? null : super.getFeatureSetter(source, configType, configSubType, feature);					
					}

					@Override
					protected boolean isTopLevelPage(Page page) {
						return self.isTopLevelPage(page);
					}

					@Override
					protected boolean isPageElement(ModelElement drawioModelElement) {
						return self.isPageElement(drawioModelElement);
					}
					
					@Override
					protected String getPropertyNamespace() {
						return self.getPropertyNamespace();
					}

					@Override
					protected EClassifier getType(String type, EObject context) {
						return self.getType(type, context instanceof Marked ? (Marked) context : null);
					}
					
				};		
			}
		};
		
		Transformer<EObject,EObject> graphFactory = new Transformer<>(architectureDrawioFactory);
		Collection<EObject> diagramModelContents = new ArrayList<>();
		diagramModel.getAllContents().forEachRemaining(e -> {
			if (e instanceof org.nasdanika.drawio.model.Document
					|| e instanceof org.nasdanika.drawio.model.Page
					|| e instanceof org.nasdanika.drawio.model.ModelElement) {
				diagramModelContents.add(e);
//				System.out.println(e);
			}
		});
		Map<EObject, EObject> graphElements = graphFactory.transform(diagramModelContents, false, progressMonitor);
		System.out.println(graphElements.size());
		
		URI graphURI = URI.createFileURI(new File("target/aws.xmi").getCanonicalPath());
		Resource graphResource = resourceSet.createResource(graphURI);
		diagramModel.getContents().stream().map(graphElements::get).forEach(graphResource.getContents()::add);
		graphResource.save(null);		
	}
	
//	@Test
//	public void testGenerateGraphDoc() throws Exception {
//		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
//		MutableContext context = Context.EMPTY_CONTEXT.fork();
//		context.register(DiagramGenerator.class, new PlantUMLDiagramGenerator());
//		ResourceSet resourceSet = org.nasdanika.html.model.app.gen.Util.createResourceSet(context, progressMonitor);
//		resourceSet.getPackageRegistry().put(FlowPackage.eNS_URI, FlowPackage.eINSTANCE);
//		
//		URI flowURI = URI.createFileURI(new File("target/flow.xmi").getCanonicalPath());
//		Resource flowResource = resourceSet.getResource(flowURI, true);
//		
//		Transformer<EObject,Element> graphFactory = new Transformer<>(new EObjectGraphFactory());
//		Map<EObject, Element> graph = graphFactory.transform(flowResource.getContents(), false, progressMonitor);
//
//		NopEndpointProcessorConfigFactory<WidgetFactory> configFactory = new NopEndpointProcessorConfigFactory<>() {
//			
//			@Override
//			protected boolean isPassThrough(Connection connection) {
//				return false;
//			}
//			
//		};
//		
//		Transformer<Element,ProcessorConfig> processorConfigTransformer = new Transformer<>(configFactory);				
//		Map<Element, ProcessorConfig> configs = processorConfigTransformer.transform(graph.values(), false, progressMonitor);
//		
//		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);
//		FlowNodeProcessorFactory flowNodeProcessorFactory = new FlowNodeProcessorFactory(context, null);		
//		CapabilityNodeProcessorFactory capabilityNodeProcessorFactory = new CapabilityNodeProcessorFactory(context, null);		
//		
//		EObjectNodeProcessorReflectiveFactory<WidgetFactory, WidgetFactory> eObjectNodeProcessorReflectiveFactory = new EObjectNodeProcessorReflectiveFactory<>(flowNodeProcessorFactory, capabilityNodeProcessorFactory);
//		EObjectReflectiveProcessorFactoryProvider eObjectReflectiveProcessorFactoryProvider = new EObjectReflectiveProcessorFactoryProvider(eObjectNodeProcessorReflectiveFactory);
//		Map<Element, ProcessorInfo<Object>> registry = eObjectReflectiveProcessorFactoryProvider.getFactory().createProcessors(configs.values(), false, progressMonitor);
//		
//		WidgetFactory flowProcessor = null;
//		Collection<Throwable> resolveFailures = new ArrayList<>();		
//		URI baseActionURI = URI.createURI("local://flow.models.nasdanika.org/demo/");
//		
//		Map<EObject, URI> uriMap = Map.ofEntries(
//				Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
//				Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/")),			
//				Map.entry(CapabilityPackage.eINSTANCE, URI.createURI("https://capability.models.nasdanika.org/")),			
//				Map.entry(FlowPackage.eINSTANCE, URI.createURI("https://flow.models.nasdanika.org/")),
//				Map.entry(flowResource.getContents().get(0), baseActionURI)				
//			);
//		
//		for (EObject topLevel: uriMap.keySet()) {
//			for (Entry<Element, ProcessorInfo<Object>> re: registry.entrySet()) {
//				Element element = re.getKey();
//				if (element instanceof EObjectNode) {
//					EObjectNode eObjNode = (EObjectNode) element;
//					EObject target = eObjNode.get();
//					if (target == topLevel) {
//						ProcessorInfo<Object> info = re.getValue();
//						Object processor = info.getProcessor();
//						if (processor instanceof WidgetFactory) {
//							WidgetFactory widgetFactoryNodeProcessor = (WidgetFactory) processor;
//							widgetFactoryNodeProcessor.resolve(uriMap.get(topLevel), progressMonitor);
//							
//							if (topLevel == flowResource.getContents().get(0)) { 							
//								flowProcessor = widgetFactoryNodeProcessor;
//							}
//						}
//					}
//				}
//			}			
//		}
//		
//		if (!resolveFailures.isEmpty()) {
//			NasdanikaException ne = new NasdanikaException("Theres's been " + resolveFailures.size() +  " failures during URI resolution: " + resolveFailures);
//			for (Throwable failure: resolveFailures) {
//				ne.addSuppressed(failure);
//			}
//			throw ne;
//		}								
//		
//		ResourceSet actionModelsResourceSet = new ResourceSetImpl();
//		actionModelsResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
//		
//		File actionModelsDir = new File("target\\action-models\\");
//		actionModelsDir.mkdirs();
//		
//		File output = new File(actionModelsDir, "flow-actions.xmi");
//		Resource actionModelResource = actionModelsResourceSet.createResource(URI.createFileURI(output.getAbsolutePath()));
//		Collection<Label> labels = flowProcessor.createLabelsSupplier().call(progressMonitor, diagnosticConsumer);
//		for (Label label: labels) {
//			if (label instanceof Link) {
//				Link link = (Link) label;
//				String location = link.getLocation();
//				if (!org.nasdanika.common.Util.isBlank(location)) {
//					URI uri = URI.createURI(location);
//					if (!uri.isRelative()) {
//						link.setLocation("${base-uri}" + uri.deresolve(baseActionURI, true, true, true).toString());
//					}
//				}
//			}
//		}
//						
//		actionModelResource.getContents().addAll(labels);
//		actionModelResource.save(null);
//				
//		String rootActionResource = "flow-actions.yml";
//		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
//		
//		String pageTemplateResource = "page-template.yml";
//		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
//		
//		String siteMapDomain = "https://flow.models.nasdanika.org/demo";		
//		ActionSiteGenerator actionSiteGenerator = new ActionSiteGenerator() {
//			
//			protected boolean isDeleteOutputPath(String path) {
//				return !"CNAME".equals(path);				
//			};
//			
//		};		
//		
//		Map<String, Collection<String>> errors = actionSiteGenerator.generate(rootActionURI, pageTemplateURI, siteMapDomain, new File("../docs/demo"), new File("target/flow-doc-site-work-dir"), true);
//				
//		int errorCount = 0;
//		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
//			System.err.println(ee.getKey());
//			for (String error: ee.getValue()) {
//				System.err.println("\t" + error);
//				++errorCount;
//			}
//		}
//		
//		System.out.println("There are " + errorCount + " site errors");
//		
//		if (errors.size() != 0) {
//			throw new ExecutionException("There are problems with pages: " + errorCount);
//		}		
//		
//	}
	
}
