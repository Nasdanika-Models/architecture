/**
 */
package org.nasdanika.models.architecture;

import org.nasdanika.graph.model.DocumentedNamedTunnel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tunnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tunnel is a relationship which logically groups other relationships. For example, two composite nodes may have a tunnel relationship which groups relationships between their child elements. A real life example is a VPN tunnel between two networks.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.architecture.ArchitecturePackage#getTunnel()
 * @model
 * @generated
 */
public interface Tunnel extends DocumentedNamedTunnel<RelationshipTarget, Relationship>, Relationship {
} // Tunnel
