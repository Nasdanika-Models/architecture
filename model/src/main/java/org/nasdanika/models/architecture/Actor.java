/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Actors play roles/have responsibilies on model elements implementing Undergoer 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.Actor#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends ArchitectureElement, StringIdentity {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.architecture.Role#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles played by this actor
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getActor_Roles()
	 * @see org.nasdanika.models.architecture.Role#getActors
	 * @model opposite="actors"
	 * @generated
	 */
	EList<Role> getRoles();

} // Actor
