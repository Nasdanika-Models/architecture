package org.nasdanika.models.architecture.processors.doc;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessor;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.Actor;
import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.architecture.ArchitectureDescriptionElement;
import org.nasdanika.models.architecture.ArchitectureElement;
import org.nasdanika.models.architecture.CompositeNode;
import org.nasdanika.models.architecture.CompositeRelationshipSource;
import org.nasdanika.models.architecture.CompositeRelationshipTarget;
import org.nasdanika.models.architecture.Domain;
import org.nasdanika.models.architecture.Node;
import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.architecture.RelationshipTarget;
import org.nasdanika.models.architecture.Role;
import org.nasdanika.models.architecture.Tunnel;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate graph documentation.
 * @author Pavel
 *
 */
public class ArchitectureNodeProcessorFactory {
			
	protected Context context;
	protected java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider;

	protected java.util.function.Function<ProgressMonitor, Action> getPrototypeProvider(NodeProcessorConfig<WidgetFactory, WidgetFactory> config) {
		return progressMonitor -> {
			if (prototypeProvider != null) {
				for (URI identifier: NcoreUtil.getIdentifiers(((EObjectNode) config.getElement()).get())) {
					Action prototype = prototypeProvider.apply(identifier, progressMonitor);
					if (prototype != null) {
						return prototype;
					}				
				}			
			}
			return AppFactory.eINSTANCE.createAction();
		};		
	}
	
	/**
	 * 
	 * @param context
	 * @param reflectiveFactories Objects with annotated methods for creating processors. 
	 */
	public ArchitectureNodeProcessorFactory(
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider)  {
		this.context = context;
		this.prototypeProvider = prototypeProvider;
	}
	
	//	ArchitectureElement.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.ArchitectureElement.class)
	public Object createArchitectureElementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ArchitectureElementNodeProcessor<ArchitectureElement>(config, context, getPrototypeProvider(config));
	}
	
	//	ArchitectureDescription.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.ArchitectureDescription.class)
	public Object createArchitectureDescriptionNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ArchitectureDescriptionNodeProcessor<ArchitectureDescription>(config, context, getPrototypeProvider(config));
	}
	
	//	ArchitectureDescriptionElement.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.ArchitectureDescriptionElement.class)
	public Object createArchitectureDescriptionElementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ArchitectureDescriptionElementNodeProcessor<ArchitectureDescriptionElement>(config, context, getPrototypeProvider(config));
	}
	
	//	Domain.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.Domain.class)
	public Object createDomainNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new DomainNodeProcessor<Domain>(config, context, getPrototypeProvider(config));
	}
	
	//	RelationshipSource.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.RelationshipSource.class)
	public Object createRelationshipSourceNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new RelationshipSourceNodeProcessor<RelationshipSource>(config, context, getPrototypeProvider(config));
	}
	
	//	RelationshipTarget.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.RelationshipTarget.class)
	public Object createRelationshipTargetNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new RelationshipTargetNodeProcessor<RelationshipTarget>(config, context, getPrototypeProvider(config));
	}
	
	//	CompositeRelationshipSource.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.CompositeRelationshipSource.class)
	public Object createCompositeRelationshipSourceNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CompositeRelationshipSourceNodeProcessor<CompositeRelationshipSource>(config, context, getPrototypeProvider(config));
	}
	
	//	CompositeRelationshipTarget.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.CompositeRelationshipTarget.class)
	public Object createCompositeRelationshipTargetNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CompositeRelationshipTargetNodeProcessor<CompositeRelationshipTarget>(config, context, getPrototypeProvider(config));
	}
	
	//	Node.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.Node.class)
	public Object createNodeNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new NodeNodeProcessor<Node>(config, context, getPrototypeProvider(config));
	}
	
	//	CompositeNode.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.CompositeNode.class)
	public Object createCompositeNodeNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CompositeNodeNodeProcessor<CompositeNode>(config, context, getPrototypeProvider(config));
	}
	

	//	Relationship.java
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.Relationship.class)
	public Object createRelationshipNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new RelationshipNodeProcessor<Relationship>(config, context, getPrototypeProvider(config));
	}
	
	//	Tunnel.java	
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.Tunnel.class)
	public Object createTunnelNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new TunnelNodeProcessor<Tunnel>(config, context, getPrototypeProvider(config));
	}
	
	// Role
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.Role.class)
	public Object createRoleNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new RoleNodeProcessor<Role>(config, context, getPrototypeProvider(config));
	}
	
	// Actor
	@EObjectNodeProcessor(type = org.nasdanika.models.architecture.Actor.class)
	public Object createActorNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ActorNodeProcessor<Actor>(config, context, getPrototypeProvider(config));
	}
	
}
