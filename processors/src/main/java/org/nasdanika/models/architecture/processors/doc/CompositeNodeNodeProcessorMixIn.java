package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.models.architecture.CompositeNode;

public interface CompositeNodeNodeProcessorMixIn<T extends CompositeNode> extends DomainNodeProcessorMixIn<T>, NodeNodeProcessorMixIn<T> {
	
} 
