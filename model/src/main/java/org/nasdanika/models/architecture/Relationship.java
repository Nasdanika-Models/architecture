/**
 */
package org.nasdanika.models.architecture;

import org.nasdanika.graph.model.DocumentedNamedConnection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relationship between two architecture description elements. Relationships are contained by their source and uniquiely identified in the source by a string id. This allows to implement relationship inheritance behaviors such as overriding (replacing), adding, or removing.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends DocumentedNamedConnection<RelationshipTarget>, ArchitectureElement {
} // Relationship
