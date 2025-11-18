package org.nasdanika.models.architecture.processors.ecore;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;

@EPackageNodeProcessorFactory(nsURI = ArchitecturePackage.eNS_URI)
public class ArchitectureEcoreGenProcessorsFactory {

	private Context context;
	
	@Factory
	public final ActorProcessorFactory actorProcessorFactory;
	
	@Factory
	public final ArchitectureDescriptionProcessorFactory architectureDescriptionProcessorFactory;
	
	@Factory
	public final ArchitectureDescriptionElementProcessorFactory architectureDescriptionElementProcessorFactory;
	
	@Factory
	public final ArchitectureElementProcessorFactory architectureElementProcessorFactory;
	
	@Factory
	public final CompositeNodeProcessorFactory compositeNodeProcessorFactory;
	
	@Factory
	public final CompositeRelationshipSourceProcessorFactory compositeRelationshipSourceProcessorFactory;
	
	@Factory
	public final CompositeRelationshipTargetProcessorFactory compositeRelationshipTargetProcessorFactory;
	
	@Factory
	public final DomainProcessorFactory domainProcessorFactory;
	
	@Factory
	public final NodeProcessorFactory nodeProcessorFactory;
	
	@Factory
	public final PartyActorProcessorFactory partyActorProcessorFactory;
	
	@Factory
	public final PersonActorProcessorFactory personActorProcessorFactory;
	
	@Factory
	public final RelationshipProcessorFactory relationshipProcessorFactory;
	
	@Factory
	public final RelationshipSourceProcessorFactory relationshipSourceProcessorFactory;
	
	@Factory
	public final RelationshipTargetProcessorFactory relationshipTargetProcessorFactory;
	
	@Factory
	public final RoleProcessorFactory roleProcessorFactory;
	
	@Factory
	public final TunnelProcessorFactory tunnelProcessorFactory;
	
	@Factory
	public final UndergoerProcessorFactory undergoerProcessorFactory;	
		
	public ArchitectureEcoreGenProcessorsFactory(Context context) {
		this.context = context;
		
		actorProcessorFactory = new ActorProcessorFactory(context);
		architectureDescriptionProcessorFactory = new ArchitectureDescriptionProcessorFactory(context);
		architectureDescriptionElementProcessorFactory = new ArchitectureDescriptionElementProcessorFactory(context);
		architectureElementProcessorFactory = new ArchitectureElementProcessorFactory(context);
		compositeNodeProcessorFactory = new CompositeNodeProcessorFactory(context);
		compositeRelationshipSourceProcessorFactory = new CompositeRelationshipSourceProcessorFactory(context);
		compositeRelationshipTargetProcessorFactory = new CompositeRelationshipTargetProcessorFactory(context);
		domainProcessorFactory = new DomainProcessorFactory(context);
		nodeProcessorFactory = new NodeProcessorFactory(context);
		partyActorProcessorFactory = new PartyActorProcessorFactory(context);
		personActorProcessorFactory = new PersonActorProcessorFactory(context);
		relationshipProcessorFactory = new RelationshipProcessorFactory(context);
		relationshipSourceProcessorFactory = new RelationshipSourceProcessorFactory(context);
		relationshipTargetProcessorFactory = new RelationshipTargetProcessorFactory(context);
		roleProcessorFactory = new RoleProcessorFactory(context);
		tunnelProcessorFactory = new TunnelProcessorFactory(context);
		undergoerProcessorFactory = new UndergoerProcessorFactory(context);
	}
	
	@EPackageNodeProcessorFactory(
			label = "Architecture Model",
			description = "Classes for modeling software architectures",
			actionPrototype = """
            app-action:
              content:
                content-markdown:
                  source:
                    content-resource:
                      location: architecture.md
			"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
