package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.CompositeRelationshipTarget;

public class CompositeRelationshipTargetNodeProcessor<T extends CompositeRelationshipTarget> extends DomainNodeProcessor<T> implements CompositeRelationshipTargetNodeProcessorMixIn<T> {
	
	public CompositeRelationshipTargetNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}
	
	// RelationshipTarget

}
