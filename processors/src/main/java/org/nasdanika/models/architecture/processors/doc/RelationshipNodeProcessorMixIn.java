/**
 */
package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedConnectionNodeProcessorMixIn;

public interface RelationshipNodeProcessorMixIn extends DocumentedNamedConnectionNodeProcessorMixIn<ConnectionTarget<?>>, ArchitectureElementNodeProcessorMixIn, UndergoerNodeProcessorMixIn {
	
} 
