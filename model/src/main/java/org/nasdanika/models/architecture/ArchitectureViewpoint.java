/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.ArchitectureViewpoint#getRepresentationSpecifications <em>Representation Specifications</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureViewpoint()
 * @model
 * @generated
 */
public interface ArchitectureViewpoint extends org.nasdanika.models.togaf.core.ArchitectureViewpoint {
	/**
	 * Returns the value of the '<em><b>Representation Specifications</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.RepresentationSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Specifications</em>' reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureViewpoint_RepresentationSpecifications()
	 * @model
	 * @generated
	 */
	EList<RepresentationSpecification> getRepresentationSpecifications();

} // ArchitectureViewpoint
