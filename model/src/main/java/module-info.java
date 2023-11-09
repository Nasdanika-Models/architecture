module org.nasdanika.models.architecture {
	exports org.nasdanika.models.architecture;
	exports org.nasdanika.models.architecture.impl;
	exports org.nasdanika.models.architecture.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;	
	requires transitive org.nasdanika.graph.model;
	
}