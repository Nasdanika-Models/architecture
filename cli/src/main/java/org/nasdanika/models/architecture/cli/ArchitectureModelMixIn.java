package org.nasdanika.models.architecture.cli;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.persistence.EObjectCapabilityFactory;
import org.nasdanika.emf.persistence.EObjectCapabilityFactory.EObjectRequirement;
import org.nasdanika.models.architecture.util.ArchitectureDrawioResourceFactory;
import org.nasdanika.ncore.util.NcoreResourceSet;

import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.Spec;

/**
 * Mix-in for loading an architecture model
 */
public class ArchitectureModelMixIn {
		
	@Option(
		names = {"-f", "--file"},
		description = "Mdel parameter is a file path")
	private boolean isFile;
	
	@Spec CommandSpec spec;
			
	public EObject getEObject(String model, ProgressMonitor progressMonitor) throws FileNotFoundException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		File currentDir = new File(".");
		URI modelURI;
		if (isFile) {
			File modelFile = new File(model);
			modelURI = URI.createFileURI(modelFile.getAbsolutePath()).appendFragment("/");				
		} else {
			URI baseURI = URI.createFileURI(currentDir.getAbsolutePath()).appendSegment("");
			 modelURI = URI.createURI(model).resolve(baseURI);
		}
		
		NcoreResourceSet resourceSet = new NcoreResourceSet();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("drawio", new ArchitectureDrawioResourceFactory(uri -> resourceSet.getEObject(uri, true)));
		ResourceSetRequirement resourceSetRequirement = new ResourceSetRequirement(resourceSet, null, null);
		EObjectRequirement requirement = EObjectCapabilityFactory.createRequirement(modelURI, resourceSetRequirement);
		Iterable<CapabilityProvider<Object>> providers = capabilityLoader.load(ServiceCapabilityFactory.createRequirement(EObject.class, null, requirement), progressMonitor);
		Collection<EObject> results = Collections.synchronizedCollection(new ArrayList<>());
		for (CapabilityProvider<Object> provider: providers) {
			provider.getPublisher().subscribe(r -> results.add((EObject) r), error -> error.printStackTrace());
		}
		for (EObject result: results) {
			return result;
		}
		throw new ParameterException(spec.commandLine(), "Architecture model not found for URI: " + modelURI);
	}

}
