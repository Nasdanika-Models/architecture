/**
 */
package org.nasdanika.models.architecture.processors.ecore.c4;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.c4.C4Package;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;

@EClassifierNodeProcessorFactory(classifierID = C4Package.SYSTEM)
public class SystemProcessorFactory {
	
	private Context context;

	public SystemProcessorFactory(Context context) {
		this.context = context;
	}
	
	@EClassifierNodeProcessorFactory(
			// label = "...",
			description = "The highest level of abstraction describing something that delivers value to its users",
			actionPrototype = """
	            app-action:
	              content:
	                content-markdown:
	                  style: true
	                  source:
	                    content-resource:
	                      location: system.md
				""",
			icon = "https://img.icons8.com/external-wanicon-two-tone-wanicon/64/external-system-big-data-wanicon-two-tone-wanicon.png"
	)
	public EClassNodeProcessor createEClassNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
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
