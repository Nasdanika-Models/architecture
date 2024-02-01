/**
 */
package org.nasdanika.models.architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.architecture.Actor;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.Role;

import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.impl.RoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.RoleImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.RoleImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.RoleImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends ArchitectureElementImpl implements Role {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(ArchitecturePackage.ROLE__ID, NcorePackage.Literals.STRING_IDENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(ArchitecturePackage.ROLE__ID, NcorePackage.Literals.STRING_IDENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Actor> getActors() {
		return (EList<Actor>)eDynamicGet(ArchitecturePackage.ROLE__ACTORS, ArchitecturePackage.Literals.ROLE__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getExtends() {
		return (EList<Role>)eDynamicGet(ArchitecturePackage.ROLE__EXTENDS, ArchitecturePackage.Literals.ROLE__EXTENDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getExtensions() {
		return (EList<Role>)eDynamicGet(ArchitecturePackage.ROLE__EXTENSIONS, ArchitecturePackage.Literals.ROLE__EXTENSIONS, true, true);
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
			case ArchitecturePackage.ROLE__ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActors()).basicAdd(otherEnd, msgs);
			case ArchitecturePackage.ROLE__EXTENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtends()).basicAdd(otherEnd, msgs);
			case ArchitecturePackage.ROLE__EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
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
			case ArchitecturePackage.ROLE__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ROLE__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.ROLE__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.ROLE__ID:
				return getId();
			case ArchitecturePackage.ROLE__ACTORS:
				return getActors();
			case ArchitecturePackage.ROLE__EXTENDS:
				return getExtends();
			case ArchitecturePackage.ROLE__EXTENSIONS:
				return getExtensions();
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
			case ArchitecturePackage.ROLE__ID:
				setId((String)newValue);
				return;
			case ArchitecturePackage.ROLE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ArchitecturePackage.ROLE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends Role>)newValue);
				return;
			case ArchitecturePackage.ROLE__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Role>)newValue);
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
			case ArchitecturePackage.ROLE__ID:
				setId(ID_EDEFAULT);
				return;
			case ArchitecturePackage.ROLE__ACTORS:
				getActors().clear();
				return;
			case ArchitecturePackage.ROLE__EXTENDS:
				getExtends().clear();
				return;
			case ArchitecturePackage.ROLE__EXTENSIONS:
				getExtensions().clear();
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
			case ArchitecturePackage.ROLE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case ArchitecturePackage.ROLE__ACTORS:
				return !getActors().isEmpty();
			case ArchitecturePackage.ROLE__EXTENDS:
				return !getExtends().isEmpty();
			case ArchitecturePackage.ROLE__EXTENSIONS:
				return !getExtensions().isEmpty();
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
		if (baseClass == StringIdentity.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.ROLE__ID: return NcorePackage.STRING_IDENTITY__ID;
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
		if (baseClass == StringIdentity.class) {
			switch (baseFeatureID) {
				case NcorePackage.STRING_IDENTITY__ID: return ArchitecturePackage.ROLE__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RoleImpl
