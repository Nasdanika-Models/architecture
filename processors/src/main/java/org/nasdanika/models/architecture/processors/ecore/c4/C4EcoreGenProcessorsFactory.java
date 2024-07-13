package org.nasdanika.models.architecture.processors.ecore.c4;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.c4.C4Package;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;

@EPackageNodeProcessorFactory(nsURI = C4Package.eNS_URI)
public class C4EcoreGenProcessorsFactory {

	private Context context;
		
	@Factory
	public final CodeProcessorFactory codeProcessorFactory;
	
	@Factory
	public final ComponentProcessorFactory componentProcessorFactory;
	
	@Factory
	public final ContainerProcessorFactory containerProcessorFactory;
	
	@Factory
	public final ContextProcessorFactory contextProcessorFactory;
	
	@Factory
	public final PersonProcessorFactory personProcessorFactory;
	
	@Factory
	public final SystemProcessorFactory systemProcessorFactory;
	
	@Factory
	public final RelationshipProcessorFactory relationshipProcessorFactory;
	
	public C4EcoreGenProcessorsFactory(Context context) {
		this.context = context;
		
		codeProcessorFactory = new CodeProcessorFactory(context);
		componentProcessorFactory = new ComponentProcessorFactory(context);
		containerProcessorFactory = new ContainerProcessorFactory(context);
		contextProcessorFactory = new ContextProcessorFactory(context);
		personProcessorFactory = new PersonProcessorFactory(context);
		systemProcessorFactory = new SystemProcessorFactory(context);
		relationshipProcessorFactory = new RelationshipProcessorFactory(context);
	}
	
	@EPackageNodeProcessorFactory(
			label = "C4",
			description = "Classes for mapping C4 Model visualizations",
			actionPrototype = """
            app-action:
              content:
                content-markdown:
                 style: true
                 source:
                    content-resource:
                      location: c4.md
			"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
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
