package org.nasdanika.models.architecture.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.graph.model.util.GraphDrawioFactory;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.c4.C4Package;

/**
 * Factory for mapping drawio model to graph model
 * @param <G>
 * @param <E>
 */
public abstract class ArchitectureDrawioFactory extends GraphDrawioFactory<EObject> {

	public ArchitectureDrawioFactory(ResourceSet resourceSet) {
		super(resourceSet);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Returns a map with graph and ncore entries.
	 */
	@Override
	protected Map<String, EPackage> getEPackages() {		
		Map<String, EPackage> ret = new LinkedHashMap<>();
		ret.put("architecture", ArchitecturePackage.eINSTANCE);
		ret.put("c4", C4Package.eINSTANCE);
		ret.putAll(super.getEPackages());
		return ret;
	}

}
