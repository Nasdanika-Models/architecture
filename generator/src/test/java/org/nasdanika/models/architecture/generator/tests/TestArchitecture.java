package org.nasdanika.models.architecture.generator.tests;

import java.io.File;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleDescriptor.Requires;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.icepear.echarts.charts.graph.GraphEdgeLineStyle;
import org.icepear.echarts.charts.graph.GraphEmphasis;
import org.icepear.echarts.charts.graph.GraphSeries;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.render.Engine;
import org.jgrapht.alg.drawing.FRLayoutAlgorithm2D;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.MapLayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.graph.DefaultUndirectedGraph;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.Mapper;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.diagramgenerator.plantuml.PlantUMLDiagramGenerator;
import org.nasdanika.drawio.model.Document;
import org.nasdanika.drawio.model.ModelElement;
import org.nasdanika.drawio.model.Page;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectGraphFactory;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.model.ModelPackage;
import org.nasdanika.graph.model.util.GraphPropertySetterFeatureMapper;
import org.nasdanika.graph.processor.NopEndpointProcessorConfigFactory;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessorReflectiveFactory;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.Link;
import org.nasdanika.html.model.app.gen.ActionSiteGenerator;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.html.model.app.graph.emf.EObjectReflectiveProcessorFactoryProvider;
import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.processors.doc.ArchitectureNodeProcessorFactory;
import org.nasdanika.models.architecture.util.ArchitectureDrawioFactory;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.GraphFactory;
import org.nasdanika.models.echarts.graph.Item;
import org.nasdanika.models.echarts.graph.Node;
import org.nasdanika.ncore.NcorePackage;
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
			protected Mapper<EObject, EObject> getMapper(int pass) {
				ArchitectureDrawioFactory self = this; 
				
				return new GraphPropertySetterFeatureMapper() {

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

					@Override
					protected URI getBaseURI(ModelElement source) {
						return self.getBaseURI(source);
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
			protected Mapper<EObject, EObject> getMapper(int pass) {
				ArchitectureDrawioFactory self = this; 
				
				return new GraphPropertySetterFeatureMapper() {

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

					@Override
					protected URI getBaseURI(ModelElement source) {
						return self.getBaseURI(source);
					}
					
				};		
			}
			
			@Override
			protected void configureDocumentElement(
					Document document, 
					ArchitectureDescription documentElement,
					Map<EObject, EObject> registry, ProgressMonitor progressMonitor) {
				
				documentElement.setName("My AWS Architecture");
				
//				```
//				${representations/drawio/info}
//				```				
				
				EObject doc = createMarkdownDoc(
						"""
						Hello!
						
						```drawio
						${representations/drawio/diagram}
						```
						
						""",
					diagramURI, 
					progressMonitor);
				
				documentElement.getDocumentation().add(doc);			
				super.configureDocumentElement(document, documentElement, registry, progressMonitor);
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
	
	@Test
	public void testGenerateAwsDoc() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		context.register(DiagramGenerator.class, new PlantUMLDiagramGenerator());
		ResourceSet resourceSet = org.nasdanika.html.model.app.gen.Util.createResourceSet(context, progressMonitor);
		resourceSet.getPackageRegistry().put(ArchitecturePackage.eNS_URI, ArchitecturePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(NcorePackage.eNS_URI, NcorePackage.eINSTANCE);
		
		URI awsURI = URI.createFileURI(new File("target/aws.xmi").getCanonicalPath());
		Resource awsResource = resourceSet.getResource(awsURI, true);
		
		Transformer<EObject,Element> graphFactory = new Transformer<>(new EObjectGraphFactory() {
			
			@Override
			protected boolean isCompactPath() {
				return true;
			}
			
		});
		Map<EObject, Element> graph = graphFactory.transform(awsResource.getContents(), false, progressMonitor);

		NopEndpointProcessorConfigFactory<WidgetFactory> configFactory = new NopEndpointProcessorConfigFactory<>() {
			
			@Override
			protected boolean isPassThrough(Connection connection) {
				return false;
			}
			
		};
		
		Transformer<Element,ProcessorConfig> processorConfigTransformer = new Transformer<>(configFactory);				
		Map<Element, ProcessorConfig> configs = processorConfigTransformer.transform(graph.values(), false, progressMonitor);
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);
		ArchitectureNodeProcessorFactory architectureNodeProcessorFactory = new ArchitectureNodeProcessorFactory(context, null);		
		
		EObjectNodeProcessorReflectiveFactory<WidgetFactory, WidgetFactory> eObjectNodeProcessorReflectiveFactory = new EObjectNodeProcessorReflectiveFactory<>(architectureNodeProcessorFactory);
		EObjectReflectiveProcessorFactoryProvider eObjectReflectiveProcessorFactoryProvider = new EObjectReflectiveProcessorFactoryProvider(eObjectNodeProcessorReflectiveFactory) {
			
			@Override
			protected boolean isCompactPath() {
				return true;
			}
			
			
		};
		Map<Element, ProcessorInfo<Object>> registry = eObjectReflectiveProcessorFactoryProvider.getFactory().createProcessors(configs.values(), false, progressMonitor);
		
		WidgetFactory architectureProcessor = null;
		Collection<Throwable> resolveFailures = new ArrayList<>();		
		URI baseActionURI = URI.createURI("local://architecture.models.nasdanika.org/demo/aws/");
		
		Map<EObject, URI> uriMap = Map.ofEntries(
				Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
				Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/")),			
				Map.entry(ModelPackage.eINSTANCE, URI.createURI("https://graph.models.nasdanika.org/")),			
				Map.entry(ArchitecturePackage.eINSTANCE, URI.createURI("https://architecture.models.nasdanika.org/")),
				Map.entry(awsResource.getContents().get(0), baseActionURI)				
			);
		
		for (EObject topLevel: uriMap.keySet()) {
			for (Entry<Element, ProcessorInfo<Object>> re: registry.entrySet()) {
				Element element = re.getKey();
				if (element instanceof EObjectNode) {
					EObjectNode eObjNode = (EObjectNode) element;
					EObject target = eObjNode.get();
					if (target == topLevel) {
						ProcessorInfo<Object> info = re.getValue();
						Object processor = info.getProcessor();
						if (processor instanceof WidgetFactory) {
							WidgetFactory widgetFactoryNodeProcessor = (WidgetFactory) processor;
							widgetFactoryNodeProcessor.resolve(uriMap.get(topLevel), progressMonitor);
							
							if (topLevel == awsResource.getContents().get(0)) { 							
								architectureProcessor = widgetFactoryNodeProcessor;
							}
						}
					}
				}
			}			
		}
		
		if (!resolveFailures.isEmpty()) {
			NasdanikaException ne = new NasdanikaException("Theres's been " + resolveFailures.size() +  " failures during URI resolution: " + resolveFailures);
			for (Throwable failure: resolveFailures) {
				ne.addSuppressed(failure);
			}
			throw ne;
		}								
		
		ResourceSet actionModelsResourceSet = new ResourceSetImpl();
		actionModelsResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		
		File output = new File(actionModelsDir, "aws-actions.xmi");
		Resource actionModelResource = actionModelsResourceSet.createResource(URI.createFileURI(output.getAbsolutePath()));
		Collection<Label> labels = architectureProcessor.createLabelsSupplier().call(progressMonitor, diagnosticConsumer);
		for (Label label: labels) {
			if (label instanceof Link) {
				Link link = (Link) label;
				String location = link.getLocation();
				if (!org.nasdanika.common.Util.isBlank(location)) {
					URI uri = URI.createURI(location);
					if (!uri.isRelative()) {
						link.setLocation("${base-uri}" + uri.deresolve(baseActionURI, true, true, true).toString());
					}
				}
			}
		}
						
		actionModelResource.getContents().addAll(labels);
		actionModelResource.save(null);
				
		String rootActionResource = "aws-actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://architecture.models.nasdanika.org/demo/aws";		
		ActionSiteGenerator actionSiteGenerator = new ActionSiteGenerator() {
			
			@Override
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path);				
			};
			
			@Override
			protected Context createContext(ProgressMonitor progressMonitor) {
				return context;
			}
			
		};		
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(rootActionURI, pageTemplateURI, siteMapDomain, new File("../docs/demo/aws"), new File("target/aws-doc-site-work-dir"), true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errors.size() != 0) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
		
	}
	
	// --- Module dependency graph ---
	
	private Node getModuleNode(
			Module module, 
			ModuleLayer layer, 
			Graph graph, 
			Item nsdCategory,
			Item eclipseCategory,
			Item javaCategory,
			Item otherCategory) {
		for (Node n: graph.getNodes()) {
			if (n.getName().equals(module.getName())) {
				return n;
			}
		}
		Node ret = GraphFactory.eINSTANCE.createNode();
		ret.setName(module.getName());
		
		if (ret.getName().startsWith("org.nasdanika.")) {
			ret.setCategory(nsdCategory);
		} else if (ret.getName().startsWith("org.eclipse.")) {
			ret.setCategory(eclipseCategory);
		} else if (ret.getName().startsWith("java.")) {
			ret.setCategory(javaCategory);
		} else {
			ret.setCategory(otherCategory);
		}
		
		ret.getSymbolSize().add(10.0 + Math.log(1 + module.getDescriptor().exports().size()));
		
//		org.nasdanika.models.echarts.graph.Label label = GraphFactory.eINSTANCE.createLabel();
//		label.setColor("red");
//		ret.setLabel(label);
		
		graph.getNodes().add(ret);
		return ret;
	}
	
	private Node moduleToNode(
			Module module, 
			ModuleLayer layer, 
			Graph graph,
			Item nsdCategory,
			Item eclipseCategory,
			Item javaCategory,
			Item otherCategory) {
		ModuleDescriptor moduleDescriptor = module.getDescriptor();		
		Node moduleNode = getModuleNode(module, layer, graph, nsdCategory, eclipseCategory, javaCategory, otherCategory);
		for (Requires req: moduleDescriptor.requires()) {
			Optional<Module> rmo = layer.findModule(req.name());
			if (rmo.isPresent()) {
				Node reqNode = moduleToNode(rmo.get(), layer, graph, nsdCategory, eclipseCategory, javaCategory, otherCategory);
				org.nasdanika.models.echarts.graph.Link reqLink = GraphFactory.eINSTANCE.createLink();				
				reqLink.setTarget(reqNode);
				moduleNode.getOutgoingLinks().add(reqLink);
			}
		}		
		return moduleNode;
	}
	
	/**
	 * Generates Graph JSON from a model
	 */
	@Test
	public void testModuleGraphForce() {
		Module thisModule = getClass().getModule();
		ModuleLayer moduleLayer = thisModule.getLayer();
		
		Graph graph = GraphFactory.eINSTANCE.createGraph();
		
		Item nsdCategory = GraphFactory.eINSTANCE.createItem();
		nsdCategory.setName("Nasdanika");
		graph.getCategories().add(nsdCategory);
		
		Item eclipseCategory = GraphFactory.eINSTANCE.createItem();
		eclipseCategory.setName("Eclipse");
		graph.getCategories().add(eclipseCategory);
		
		Item javaCategory = GraphFactory.eINSTANCE.createItem();
		javaCategory.setName("Java");
		graph.getCategories().add(javaCategory);
		
		Item otherCategory = GraphFactory.eINSTANCE.createItem();
		otherCategory.setName("Other");
		graph.getCategories().add(otherCategory);
		
		moduleToNode(thisModule, moduleLayer, graph, nsdCategory, eclipseCategory, javaCategory, otherCategory);
		forceLayout(graph);
		
		GraphSeries graphSeries = new org.icepear.echarts.charts.graph.GraphSeries()
				.setSymbolSize(16)
				.setDraggable(true)				
				.setLayout("none")
	            .setLabel(new SeriesLabel().setShow(true).setPosition("right"))
	            .setLineStyle(new GraphEdgeLineStyle().setColor("source").setCurveness(0))
	            .setRoam(true)
	            .setEmphasis(new GraphEmphasis().setFocus("adjacency"))
	            .setEdgeSymbol(new String[] { "none", "arrow" }); // Line style width 10?
		
		graph.configureGraphSeries(graphSeries);
		
    	org.icepear.echarts.Graph echartsGraph = new org.icepear.echarts.Graph()
                .setTitle("Module Dependencies")
//                .setTooltip("item")
                .setLegend()
                .addSeries(graphSeries);
    	
	    Engine engine = new Engine();
	    new File("target/charts").mkdirs();
	    engine.render("target/charts/module-graph-force.html", echartsGraph, "90%", "2000px", false);		
	}
	
	/**
	 * Uses JGraphT {@link FRLayoutAlgorithm2D} to force layout the graph.
	 * @param graph
	 */
	protected void forceLayout(Graph graph) {
		// Using JGraphT for force layout
		DefaultUndirectedGraph<Node, org.nasdanika.models.echarts.graph.Link> dGraph = new DefaultUndirectedGraph<>(org.nasdanika.models.echarts.graph.Link.class);
		
		// Populating
		for (Node node: graph.getNodes()) {
			dGraph.addVertex(node);
		}	
		
		for (Node node: graph.getNodes()) {
			for (org.nasdanika.models.echarts.graph.Link link: node.getOutgoingLinks()) {
				if (dGraph.getEdge(link.getTarget(), node) == null) { // Not yet connected, connect
					dGraph.addEdge(node, link.getTarget(), link);
				}
			}
		}		
		
		FRLayoutAlgorithm2D<Node, org.nasdanika.models.echarts.graph.Link> forceLayout = new FRLayoutAlgorithm2D<>();
		MapLayoutModel2D<Node> model = new MapLayoutModel2D<>(new Box2D(1000.0, 800.0));
		forceLayout.layout(dGraph, model);
		model.forEach(ne -> {
			Node node = ne.getKey();
			Point2D point = ne.getValue();
			node.setX(point.getX());
			node.setY(point.getY());
		});
		
	}	
	
}
