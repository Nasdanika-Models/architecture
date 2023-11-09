/**
 */
package org.nasdanika.models.architecture;

import org.nasdanika.graph.model.DocumentedNamedGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Architecture description contains architecture elements and reference elements such as stakeholders. Architecture description elements are keyed by string identifiers which allows to implement architecture inheritance similar to inheritance in object-oriented languages such as Java or layering in Docker images - a new architecture may be derived from an existing architecture by applying a layer of deltas. This is also similar to a commit tree in Git.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getArchitectureDescription()
 * @model
 * @generated
 */
public interface ArchitectureDescription extends DocumentedNamedGraph<ArchitectureDescriptionElement>, ArchitectureElement {
} // ArchitectureDescription
