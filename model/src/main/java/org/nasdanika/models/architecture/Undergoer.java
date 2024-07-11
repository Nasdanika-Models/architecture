/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undergoer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.Undergoer#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getUndergoer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Undergoer extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getUndergoer_Roles()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Role> getRoles();

} // Undergoer
