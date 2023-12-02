package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.models.architecture.RelationshipTarget;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedConnectionTargetNodeProcessorMixIn;

public interface RelationshipTargetNodeProcessorMixIn<T extends RelationshipTarget> extends ArchitectureDescriptionElementNodeProcessorMixIn<T>, DocumentedNamedConnectionTargetNodeProcessorMixIn<T> {
	
} 
