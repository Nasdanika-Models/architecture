/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.RepresentationSpecification#getGoverns <em>Governs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRepresentationSpecification()
 * @model
 * @generated
 */
public interface RepresentationSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Governs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.architecture.Representation}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.architecture.Representation#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governs</em>' reference list.
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRepresentationSpecification_Governs()
	 * @see org.nasdanika.models.architecture.Representation#getSpecification
	 * @model opposite="specification"
	 * @generated
	 */
	EList<Representation> getGoverns();

} // RepresentationSpecification
