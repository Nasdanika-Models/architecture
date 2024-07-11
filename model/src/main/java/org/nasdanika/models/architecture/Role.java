/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.Role#getActors <em>Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.Role#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.Role#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ArchitectureElement, StringIdentity {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.Actor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.architecture.Actor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRole_Actors()
	 * @see org.nasdanika.models.architecture.Actor#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.architecture.Role#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRole_Extends()
	 * @see org.nasdanika.models.architecture.Role#getExtensions
	 * @model opposite="extensions"
	 * @generated
	 */
	EList<Role> getExtends();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.architecture.Role#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRole_Extensions()
	 * @see org.nasdanika.models.architecture.Role#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Role> getExtensions();

} // Role
