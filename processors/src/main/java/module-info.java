module org.nasdanika.models.architecture.processors {
		
	requires transitive org.nasdanika.models.architecture;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.architecture.processors;
	opens org.nasdanika.models.architecture.processors; // For loading resources
	
}
