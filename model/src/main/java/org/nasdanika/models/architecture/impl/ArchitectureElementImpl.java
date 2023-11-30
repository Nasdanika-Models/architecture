/**
 */
package org.nasdanika.models.architecture.impl;

import java.time.Duration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.architecture.ArchitectureElement;
import org.nasdanika.models.architecture.ArchitecturePackage;

import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.Temporal;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.impl.ArchitectureElementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.ArchitectureElementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.ArchitectureElementImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.ArchitectureElementImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureElementImpl extends DocumentedNamedElementImpl implements ArchitectureElement {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ARCHITECTURE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(ArchitecturePackage.ARCHITECTURE_ELEMENT__START, NcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, ArchitecturePackage.ARCHITECTURE_ELEMENT__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(ArchitecturePackage.ARCHITECTURE_ELEMENT__START, NcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(ArchitecturePackage.ARCHITECTURE_ELEMENT__END, NcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, ArchitecturePackage.ARCHITECTURE_ELEMENT__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(ArchitecturePackage.ARCHITECTURE_ELEMENT__END, NcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(ArchitecturePackage.ARCHITECTURE_ELEMENT__DURATION, NcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(ArchitecturePackage.ARCHITECTURE_ELEMENT__DURATION, NcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return (String)eDynamicGet(ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON, ArchitecturePackage.Literals.ARCHITECTURE_ELEMENT__ICON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		eDynamicSet(ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON, ArchitecturePackage.Literals.ARCHITECTURE_ELEMENT__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__START:
				return basicSetStart(null, msgs);
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__END:
				return basicSetEnd(null, msgs);
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
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__START:
				return getStart();
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__END:
				return getEnd();
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__DURATION:
				return getDuration();
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON:
				return getIcon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__START:
				setStart((Temporal)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__END:
				setEnd((Temporal)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__DURATION:
				setDuration((Duration)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON:
				setIcon((String)newValue);
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
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__START:
				setStart((Temporal)null);
				return;
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__END:
				setEnd((Temporal)null);
				return;
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON:
				setIcon(ICON_EDEFAULT);
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
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__START:
				return getStart() != null;
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__END:
				return getEnd() != null;
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON:
				return ICON_EDEFAULT == null ? getIcon() != null : !ICON_EDEFAULT.equals(getIcon());
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
		if (baseClass == Period.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.ARCHITECTURE_ELEMENT__START: return NcorePackage.PERIOD__START;
				case ArchitecturePackage.ARCHITECTURE_ELEMENT__END: return NcorePackage.PERIOD__END;
				case ArchitecturePackage.ARCHITECTURE_ELEMENT__DURATION: return NcorePackage.PERIOD__DURATION;
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
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case NcorePackage.PERIOD__START: return ArchitecturePackage.ARCHITECTURE_ELEMENT__START;
				case NcorePackage.PERIOD__END: return ArchitecturePackage.ARCHITECTURE_ELEMENT__END;
				case NcorePackage.PERIOD__DURATION: return ArchitecturePackage.ARCHITECTURE_ELEMENT__DURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ArchitectureElementImpl
