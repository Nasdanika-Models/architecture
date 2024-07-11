/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.graph.model.DocumentedNamedGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.ArchitectureDescription#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureDescription()
 * @model
 * @generated
 */
public interface ArchitectureDescription extends DocumentedNamedGraph<ArchitectureDescriptionElement>, ArchitectureElement, Undergoer {

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actors operating on the elements of this architecture description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureDescription_Actors()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Actor> getActors();
} // ArchitectureDescription
