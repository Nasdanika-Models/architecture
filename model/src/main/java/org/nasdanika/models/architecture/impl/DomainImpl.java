/**
 */
package org.nasdanika.models.architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.graph.model.DocumentedNamedGraph;
import org.nasdanika.graph.model.Graph;
import org.nasdanika.graph.model.ModelPackage;
import org.nasdanika.models.architecture.Actor;
import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.architecture.ArchitectureDescriptionElement;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.Domain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.impl.DomainImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.DomainImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends ArchitectureDescriptionElementImpl implements Domain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArchitectureDescriptionElement> getElements() {
		return (EList<ArchitectureDescriptionElement>)eDynamicGet(ArchitecturePackage.DOMAIN__ELEMENTS, ModelPackage.Literals.GRAPH__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Actor> getActors() {
		return (EList<Actor>)eDynamicGet(ArchitecturePackage.DOMAIN__ACTORS, ArchitecturePackage.Literals.ARCHITECTURE_DESCRIPTION__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.DOMAIN__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.DOMAIN__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.DOMAIN__ELEMENTS:
				return getElements();
			case ArchitecturePackage.DOMAIN__ACTORS:
				return getActors();
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
			case ArchitecturePackage.DOMAIN__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ArchitectureDescriptionElement>)newValue);
				return;
			case ArchitecturePackage.DOMAIN__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
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
			case ArchitecturePackage.DOMAIN__ELEMENTS:
				getElements().clear();
				return;
			case ArchitecturePackage.DOMAIN__ACTORS:
				getActors().clear();
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
			case ArchitecturePackage.DOMAIN__ELEMENTS:
				return !getElements().isEmpty();
			case ArchitecturePackage.DOMAIN__ACTORS:
				return !getActors().isEmpty();
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
		if (baseClass == Graph.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.DOMAIN__ELEMENTS: return ModelPackage.GRAPH__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedGraph.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArchitectureDescription.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.DOMAIN__ACTORS: return ArchitecturePackage.ARCHITECTURE_DESCRIPTION__ACTORS;
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
		if (baseClass == Graph.class) {
			switch (baseFeatureID) {
				case ModelPackage.GRAPH__ELEMENTS: return ArchitecturePackage.DOMAIN__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedGraph.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArchitectureDescription.class) {
			switch (baseFeatureID) {
				case ArchitecturePackage.ARCHITECTURE_DESCRIPTION__ACTORS: return ArchitecturePackage.DOMAIN__ACTORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DomainImpl
