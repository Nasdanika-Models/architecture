package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.graph.model.Connection;
import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.models.graph.processors.doc.DocumentedNamedTunnelNodeProcessorMixIn;

public interface TunnelNodeProcessorMixIn extends DocumentedNamedTunnelNodeProcessorMixIn<ConnectionTarget<?>, Connection<?>>, RelationshipNodeProcessorMixIn {
	
} 
