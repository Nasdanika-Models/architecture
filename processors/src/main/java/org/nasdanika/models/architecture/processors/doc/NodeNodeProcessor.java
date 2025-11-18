package org.nasdanika.models.architecture.processors.doc;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.Node;

public class NodeNodeProcessor<T extends Node> extends RelationshipSourceNodeProcessor<T> implements NodeNodeProcessorMixIn<T> {
	
	public NodeNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}
	
	// RelationshipTarget

}
