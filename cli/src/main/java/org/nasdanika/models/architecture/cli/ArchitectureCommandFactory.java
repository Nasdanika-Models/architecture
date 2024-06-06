package org.nasdanika.models.architecture.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class ArchitectureCommandFactory extends SubCommandCapabilityFactory<ArchitectureCommand> {

	@Override
		protected CompletionStage<ArchitectureCommand> doCreateCommand(
				List<CommandLine> parentPath,
				BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
				ProgressMonitor progressMonitor) {
			return CompletableFuture.completedStage(new ArchitectureCommand());
		}

	@Override
	protected Class<ArchitectureCommand> getCommandType() {
		return ArchitectureCommand.class;
	}

}
