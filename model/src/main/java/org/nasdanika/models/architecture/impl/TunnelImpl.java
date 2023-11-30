/**
 */
package org.nasdanika.models.architecture.impl;

import java.time.Duration;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.graph.model.impl.DocumentedNamedTunnelImpl;

import org.nasdanika.models.architecture.ArchitectureElement;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipTarget;
import org.nasdanika.models.architecture.Role;
import org.nasdanika.models.architecture.Tunnel;

import org.nasdanika.models.architecture.Undergoer;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tunnel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.architecture.impl.TunnelImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.TunnelImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.TunnelImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.TunnelImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.models.architecture.impl.TunnelImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TunnelImpl extends DocumentedNamedTunnelImpl<RelationshipTarget, Relationship> implements Tunnel {
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
	protected TunnelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.TUNNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(ArchitecturePackage.TUNNEL__START, NcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, ArchitecturePackage.TUNNEL__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(ArchitecturePackage.TUNNEL__START, NcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(ArchitecturePackage.TUNNEL__END, NcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, ArchitecturePackage.TUNNEL__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(ArchitecturePackage.TUNNEL__END, NcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(ArchitecturePackage.TUNNEL__DURATION, NcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(ArchitecturePackage.TUNNEL__DURATION, NcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return (String)eDynamicGet(ArchitecturePackage.TUNNEL__ICON, ArchitecturePackage.Literals.ARCHITECTURE_ELEMENT__ICON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		eDynamicSet(ArchitecturePackage.TUNNEL__ICON, ArchitecturePackage.Literals.ARCHITECTURE_ELEMENT__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ArchitecturePackage.TUNNEL__ROLES, ArchitecturePackage.Literals.UNDERGOER__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.TUNNEL__START:
				return basicSetStart(null, msgs);
			case ArchitecturePackage.TUNNEL__END:
				return basicSetEnd(null, msgs);
			case ArchitecturePackage.TUNNEL__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.TUNNEL__START:
				return getStart();
			case ArchitecturePackage.TUNNEL__END:
				return getEnd();
			case ArchitecturePackage.TUNNEL__DURATION:
				return getDuration();
			case ArchitecturePackage.TUNNEL__ICON:
				return getIcon();
			case ArchitecturePackage.TUNNEL__ROLES:
				return getRoles();
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
			case ArchitecturePackage.TUNNEL__START:
				setStart((Temporal)newValue);
				return;
			case ArchitecturePackage.TUNNEL__END:
				setEnd((Temporal)newValue);
				return;
			case ArchitecturePackage.TUNNEL__DURATION:
				setDuration((Duration)newValue);
				return;
			case ArchitecturePackage.TUNNEL__ICON:
				setIcon((String)newValue);
				return;
			case ArchitecturePackage.TUNNEL__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case ArchitecturePackage.TUNNEL__START:
				setStart((Temporal)null);
				return;
			case ArchitecturePackage.TUNNEL__END:
				setEnd((Temporal)null);
				return;
			case ArchitecturePackage.TUNNEL__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ArchitecturePackage.TUNNEL__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ArchitecturePackage.TUNNEL__ROLES:
				getRoles().clear();
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
			case ArchitecturePackage.TUNNEL__START:
				return getStart() != null;
			case ArchitecturePackage.TUNNEL__END:
				return getEnd() != null;
			case ArchitecturePackage.TUNNEL__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case ArchitecturePackage.TUNNEL__ICON:
				return ICON_EDEFAULT == null ? getIcon() != null : !ICON_EDEFAULT.equals(getIcon());
			case ArchitecturePackage.TUNNEL__ROLES:
				return !getRoles().isEmpty();
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
				case ArchitecturePackage.TUNNEL__START: return NcorePackage.PERIOD__START;
				case ArchitecturePackage.TUNNEL__END: return NcorePackage.PERIOD__END;
				case ArchitecturePackage.TUNNEL__DURATION: return NcorePackage.PERIOD__DURATION;
				default: return -1;
			}
		}
		if (baseClass == ArchitectureElement.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.TUNNEL__ICON: return ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON;
				default: return -1;
			}
		}
		if (baseClass == Undergoer.class) {
			switch (derivedFeatureID) {
				case ArchitecturePackage.TUNNEL__ROLES: return ArchitecturePackage.UNDERGOER__ROLES;
				default: return -1;
			}
		}
		if (baseClass == Relationship.class) {
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
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case NcorePackage.PERIOD__START: return ArchitecturePackage.TUNNEL__START;
				case NcorePackage.PERIOD__END: return ArchitecturePackage.TUNNEL__END;
				case NcorePackage.PERIOD__DURATION: return ArchitecturePackage.TUNNEL__DURATION;
				default: return -1;
			}
		}
		if (baseClass == ArchitectureElement.class) {
			switch (baseFeatureID) {
				case ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON: return ArchitecturePackage.TUNNEL__ICON;
				default: return -1;
			}
		}
		if (baseClass == Undergoer.class) {
			switch (baseFeatureID) {
				case ArchitecturePackage.UNDERGOER__ROLES: return ArchitecturePackage.TUNNEL__ROLES;
				default: return -1;
			}
		}
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TunnelImpl
