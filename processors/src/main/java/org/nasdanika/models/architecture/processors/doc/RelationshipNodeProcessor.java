package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedConnectionNodeProcessor;

public class RelationshipNodeProcessor<T extends Relationship> extends DocumentedNamedConnectionNodeProcessor<T> implements RelationshipNodeProcessorMixIn {
	
	public RelationshipNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}
	
	// ArchitectureElement
	
	// Undergoer

}
