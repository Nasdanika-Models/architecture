/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.ArchitectureView#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureView()
 * @model
 * @generated
 */
public interface ArchitectureView extends org.nasdanika.models.togaf.core.ArchitectureView {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.Representation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureView_Representation()
	 * @model
	 * @generated
	 */
	EList<Representation> getRepresentation();

} // ArchitectureView
