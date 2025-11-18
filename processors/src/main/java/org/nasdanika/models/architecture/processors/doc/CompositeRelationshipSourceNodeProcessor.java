package org.nasdanika.models.architecture.processors.doc;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.CompositeRelationshipSource;

public class CompositeRelationshipSourceNodeProcessor<T extends CompositeRelationshipSource> extends DomainNodeProcessor<T> implements CompositeRelationshipSourceNodeProcessorMixIn<T> {
	
	public CompositeRelationshipSourceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}
	
	// RelationshipSource

}
