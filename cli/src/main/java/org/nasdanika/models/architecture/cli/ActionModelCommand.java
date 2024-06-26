package org.nasdanika.models.architecture.cli;

import java.io.File;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.ContextMixIn;
import org.nasdanika.cli.ProgressMonitorMixIn;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.graph.emf.ActionGenerator;

import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Parameters;


@Command(
		description = "Generates architecture documentation action model",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "action-model")
public class ActionModelCommand extends CommandBase {
	
	@Mixin
	private ArchitectureModelMixIn architectureModelMixIn;
	
	@Mixin
	private ProgressMonitorMixIn progressMonitorMixIn;
	
	@Parameters(
		index =  "0",	
		arity = "1",
		description = {  
			"Model URI or file path, resolved relative",
			"to the current directory",
			"or looked up in registered rule sets",
			"if -R option is provided"
		})
	private String model;

	@Parameters(index =  "1", description = "Output file")
	private File output;
	
	@Mixin
	private ContextMixIn contextMixIn;
		
	@Override
	public Integer call() throws Exception {
		try (ProgressMonitor progressMonitor = progressMonitorMixIn.createProgressMonitor(4)) {
			EObject eObj = architectureModelMixIn.getEObject(model, progressMonitor.split("Loading architecture model", 1));
			
			Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(progressMonitor.split("Diagnostic", 1));		
			Context context = contextMixIn.createContext(progressMonitor.split("Creating context", 1));
			try (ProgressMonitor actionGeneratorProgressMonitor = progressMonitor.split("Generating action model", 1)) {
				ActionGenerator actionGenerator = ActionGenerator.load(
						eObj, 
						context, 
						null, 
						null, 
						null, 
						diagnosticConsumer, 
						actionGeneratorProgressMonitor); 
				actionGenerator.generateActionModel(
						diagnosticConsumer, 
						output,
						actionGeneratorProgressMonitor);
			}			
		}
		return 0;
	}

}
