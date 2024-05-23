module org.nasdanika.models.architecture.processors {
		
	requires transitive org.nasdanika.models.architecture;
	requires transitive org.nasdanika.models.graph.processors;
	
	exports org.nasdanika.models.architecture.processors.ecore;
	opens org.nasdanika.models.architecture.processors.ecore; // For loading resources
	
	exports org.nasdanika.models.architecture.processors.doc;
	opens org.nasdanika.models.architecture.processors.doc; // For loading resources
	
}
