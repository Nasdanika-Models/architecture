/**
 */
package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.models.architecture.CompositeRelationshipTarget;

public interface CompositeRelationshipTargetNodeProcessorMixIn<T extends CompositeRelationshipTarget> extends DomainNodeProcessorMixIn<T>, RelationshipTargetNodeProcessorMixIn<T> {
	
} 
