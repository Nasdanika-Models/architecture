import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.architecture.c4.util.C4EPackageResourceSetCapabilityFactory;
import org.nasdanika.models.architecture.util.ArchitectureEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.architecture {
	exports org.nasdanika.models.architecture;
	exports org.nasdanika.models.architecture.impl;
	exports org.nasdanika.models.architecture.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;	
	requires transitive org.nasdanika.graph.model;
	requires transitive org.nasdanika.models.party;
	
	provides CapabilityFactory with 
		ArchitectureEPackageResourceSetCapabilityFactory,
		C4EPackageResourceSetCapabilityFactory; 
	
}