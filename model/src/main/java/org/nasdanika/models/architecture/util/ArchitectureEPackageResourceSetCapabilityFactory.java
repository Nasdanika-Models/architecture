package org.nasdanika.models.architecture.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.c4.C4Package;

public class ArchitectureEPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

	@Override
	protected EPackage getEPackage() {
		return ArchitecturePackage.eINSTANCE;
	}

	@Override
	protected URI getDocumentationURI() {
		return URI.createURI("https://architecture.models.nasdanika.org/");
	}

}
