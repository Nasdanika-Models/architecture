package org.nasdanika.models.architecture.cli;

import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.cli.RootCommand;

import picocli.CommandLine.Command;

@Command(
		description = "Architecture commands",
		name = "architecture",
		versionProvider = ModuleVersionProvider.class,
		subcommands = {
			ActionModelCommand.class,
			DocSiteCommand.class
		},		
		mixinStandardHelpOptions = true)
@ParentCommands(RootCommand.class)
public class ArchitectureCommand extends CommandGroup {
	

}
