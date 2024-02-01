/**
 */
package org.nasdanika.models.architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.PartyActor;

import org.nasdanika.models.party.ContactMethod;
import org.nasdanika.models.party.Party;
import org.nasdanika.models.party.PartyPackage;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.impl.PartyActorImpl#getContactMethods <em>Contact Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyActorImpl extends ActorImpl implements PartyActor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.PARTY_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ContactMethod> getContactMethods() {
		return (EList<ContactMethod>)eDynamicGet(ArchitecturePackage.PARTY_ACTOR__CONTACT_METHODS, PartyPackage.Literals.PARTY__CONTACT_METHODS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.PARTY_ACTOR__CONTACT_METHODS:
				return ((InternalEList<?>)getContactMethods()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.PARTY_ACTOR__CONTACT_METHODS:
				return getContactMethods();
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
			case ArchitecturePackage.PARTY_ACTOR__CONTACT_METHODS:
				getContactMethods().clear();
				getContactMethods().addAll((Collection<? extends ContactMethod>)newValue);
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
			case ArchitecturePackage.PARTY_ACTOR__CONTACT_METHODS:
				getContactMethods().clear();
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
			case ArchitecturePackage.PARTY_ACTOR__CONTACT_METHODS:
				return !getContactMethods().isEmpty();
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
		if (baseClass == DocumentedNamedStringIdentity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Party.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.PARTY_ACTOR__CONTACT_METHODS: return PartyPackage.PARTY__CONTACT_METHODS;
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
		if (baseClass == DocumentedNamedStringIdentity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Party.class) {
			switch (baseFeatureID) {
				case PartyPackage.PARTY__CONTACT_METHODS: return ArchitecturePackage.PARTY_ACTOR__CONTACT_METHODS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PartyActorImpl
