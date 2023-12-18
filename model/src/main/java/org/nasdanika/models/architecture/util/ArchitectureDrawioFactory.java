package org.nasdanika.models.architecture.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.graph.model.util.GraphDrawioFactory;
import org.nasdanika.models.architecture.ArchitecturePackage;

/**
 * Factory for mapping drawio model to graph model
 * @param <G>
 * @param <E>
 */
public abstract class ArchitectureDrawioFactory extends GraphDrawioFactory<EObject> {

	/**
	 * Returns a map with graph and ncore entries.
	 */
	@Override
	protected Map<String, EPackage> getEPackages() {		
		Map<String, EPackage> ret = new LinkedHashMap<>();
		ret.put("architecture", ArchitecturePackage.eINSTANCE);
		ret.putAll(super.getEPackages());
		return ret;
	}

}
