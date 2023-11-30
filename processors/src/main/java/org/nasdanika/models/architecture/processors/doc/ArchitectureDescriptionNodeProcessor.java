package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedGraphNodeProcessor;

public class ArchitectureDescriptionNodeProcessor<T extends ArchitectureDescription> extends DocumentedNamedGraphNodeProcessor<T> {
	
	public ArchitectureDescriptionNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}
	
	// ArchitectureElement
}
