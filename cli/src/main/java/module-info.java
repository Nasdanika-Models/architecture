import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.architecture.cli.ArchitectureCommandFactory;

module org.nasdanika.models.architecture.cli {
	
	exports org.nasdanika.models.architecture.cli;

	requires transitive org.nasdanika.html.model.app.gen.cli;
	requires transitive org.nasdanika.models.architecture.processors;
	requires spring.core;
	requires org.eclipse.emf.ecore.xmi;
	
	opens org.nasdanika.models.architecture.cli to info.picocli;
	
	provides CapabilityFactory with
		ArchitectureCommandFactory;

}
