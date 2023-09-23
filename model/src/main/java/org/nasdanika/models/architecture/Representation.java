/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.Representation#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRepresentation()
 * @model
 * @generated
 */
public interface Representation extends EObject {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.RepresentationSpecification}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.architecture.RepresentationSpecification#getGoverns <em>Governs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRepresentation_Specification()
	 * @see org.nasdanika.models.architecture.RepresentationSpecification#getGoverns
	 * @model opposite="governs"
	 * @generated
	 */
	EList<RepresentationSpecification> getSpecification();

} // Representation
