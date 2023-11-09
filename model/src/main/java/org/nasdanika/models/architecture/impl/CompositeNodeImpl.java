/**
 */
package org.nasdanika.models.architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.graph.model.ConnectionSource;
import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedConnectionSource;
import org.nasdanika.graph.model.DocumentedNamedConnectionTarget;
import org.nasdanika.graph.model.ModelPackage;

import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.CompositeNode;
import org.nasdanika.models.architecture.Node;
import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.architecture.RelationshipTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.impl.CompositeNodeImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.CompositeNodeImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeNodeImpl extends DomainImpl implements CompositeNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.COMPOSITE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relationship> getOutgoingConnections() {
		return (EList<Relationship>)eDynamicGet(ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS, ModelPackage.Literals.CONNECTION_SOURCE__OUTGOING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relationship> getIncomingConnections() {
		return (EList<Relationship>)eDynamicGet(ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS, ModelPackage.Literals.CONNECTION_TARGET__INCOMING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS:
				return ((InternalEList<?>)getOutgoingConnections()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
			case ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS:
				return getIncomingConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				getOutgoingConnections().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Relationship>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				return;
			case ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS:
				return !getOutgoingConnections().isEmpty();
			case ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS:
				return !getIncomingConnections().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConnectionSource.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS: return ModelPackage.CONNECTION_SOURCE__OUTGOING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedConnectionSource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RelationshipSource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConnectionTarget.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS: return ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedConnectionTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RelationshipTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConnectionSource.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONNECTION_SOURCE__OUTGOING_CONNECTIONS: return ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedConnectionSource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RelationshipSource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConnectionTarget.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS: return ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedConnectionTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RelationshipTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CompositeNodeImpl
