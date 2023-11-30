/**
 */
package org.nasdanika.models.architecture;

import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for elements of architecture
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.ArchitectureElement#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureElement()
 * @model
 * @generated
 */
public interface ArchitectureElement extends DocumentedNamedElement, Period {

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Architecture element icon. Treated as URL if contains ``/`` or as a CSS class otherwise. E.g. ``fas fa-wrench`` would be treated as a CSS class. If this attribute is blank then the type icon is used. For example, a generic server icon defined at the Server type can be overridden by an icon defined at a server instance (e.g. Web Server).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureElement_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.architecture.ArchitectureElement#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);
} // ArchitectureElement
