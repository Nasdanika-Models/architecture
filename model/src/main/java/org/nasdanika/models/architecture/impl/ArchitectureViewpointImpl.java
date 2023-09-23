/**
 */
package org.nasdanika.models.architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.ArchitectureViewpoint;
import org.nasdanika.models.architecture.RepresentationSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.impl.ArchitectureViewpointImpl#getRepresentationSpecifications <em>Representation Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureViewpointImpl extends org.nasdanika.models.togaf.core.impl.ArchitectureViewpointImpl implements ArchitectureViewpoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureViewpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ARCHITECTURE_VIEWPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RepresentationSpecification> getRepresentationSpecifications() {
		return (EList<RepresentationSpecification>)eDynamicGet(ArchitecturePackage.ARCHITECTURE_VIEWPOINT__REPRESENTATION_SPECIFICATIONS, ArchitecturePackage.Literals.ARCHITECTURE_VIEWPOINT__REPRESENTATION_SPECIFICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.ARCHITECTURE_VIEWPOINT__REPRESENTATION_SPECIFICATIONS:
				return getRepresentationSpecifications();
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
			case ArchitecturePackage.ARCHITECTURE_VIEWPOINT__REPRESENTATION_SPECIFICATIONS:
				getRepresentationSpecifications().clear();
				getRepresentationSpecifications().addAll((Collection<? extends RepresentationSpecification>)newValue);
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
			case ArchitecturePackage.ARCHITECTURE_VIEWPOINT__REPRESENTATION_SPECIFICATIONS:
				getRepresentationSpecifications().clear();
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
			case ArchitecturePackage.ARCHITECTURE_VIEWPOINT__REPRESENTATION_SPECIFICATIONS:
				return !getRepresentationSpecifications().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureViewpointImpl
