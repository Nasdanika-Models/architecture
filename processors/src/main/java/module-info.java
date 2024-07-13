import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.architecture.processors.doc.ArchitectureNodeProcessorFactoryCapabilityFactory;
import org.nasdanika.models.architecture.processors.ecore.ArchitectureECoreGenProcessorsCapabilityFactory;
import org.nasdanika.models.architecture.processors.ecore.c4.C4ECoreGenProcessorsCapabilityFactory;

module org.nasdanika.models.architecture.processors {
		
	requires transitive org.nasdanika.models.architecture;
	requires transitive org.nasdanika.models.graph.processors;
	
	exports org.nasdanika.models.architecture.processors.ecore;
	opens org.nasdanika.models.architecture.processors.ecore; // For loading resources
	
	exports org.nasdanika.models.architecture.processors.ecore.c4;
	opens org.nasdanika.models.architecture.processors.ecore.c4; // For loading resources
	
	exports org.nasdanika.models.architecture.processors.doc;
	opens org.nasdanika.models.architecture.processors.doc; // For loading resources

	provides CapabilityFactory with 
		ArchitectureNodeProcessorFactoryCapabilityFactory,
		C4ECoreGenProcessorsCapabilityFactory,
		ArchitectureECoreGenProcessorsCapabilityFactory; 
	
}
