/**
 */
package org.nasdanika.models.architecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.architecture.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureFactoryImpl extends EFactoryImpl implements ArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchitectureFactory init() {
		try {
			ArchitectureFactory theArchitectureFactory = (ArchitectureFactory)EPackage.Registry.INSTANCE.getEFactory(ArchitecturePackage.eNS_URI);
			if (theArchitectureFactory != null) {
				return theArchitectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArchitecturePackage.ARCHITECTURE_ELEMENT: return createArchitectureElement();
			case ArchitecturePackage.ACTOR: return createActor();
			case ArchitecturePackage.ROLE: return createRole();
			case ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT: return createArchitectureDescriptionElement();
			case ArchitecturePackage.ARCHITECTURE_DESCRIPTION: return createArchitectureDescription();
			case ArchitecturePackage.DOMAIN: return createDomain();
			case ArchitecturePackage.RELATIONSHIP_TARGET: return createRelationshipTarget();
			case ArchitecturePackage.COMPOSITE_RELATIONSHIP_TARGET: return createCompositeRelationshipTarget();
			case ArchitecturePackage.RELATIONSHIP: return createRelationship();
			case ArchitecturePackage.RELATIONSHIP_SOURCE: return createRelationshipSource();
			case ArchitecturePackage.COMPOSITE_RELATIONSHIP_SOURCE: return createCompositeRelationshipSource();
			case ArchitecturePackage.NODE: return createNode();
			case ArchitecturePackage.COMPOSITE_NODE: return createCompositeNode();
			case ArchitecturePackage.TUNNEL: return createTunnel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureElement createArchitectureElement() {
		ArchitectureElementImpl architectureElement = new ArchitectureElementImpl();
		return architectureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureDescriptionElement createArchitectureDescriptionElement() {
		ArchitectureDescriptionElementImpl architectureDescriptionElement = new ArchitectureDescriptionElementImpl();
		return architectureDescriptionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureDescription createArchitectureDescription() {
		ArchitectureDescriptionImpl architectureDescription = new ArchitectureDescriptionImpl();
		return architectureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipTarget createRelationshipTarget() {
		RelationshipTargetImpl relationshipTarget = new RelationshipTargetImpl();
		return relationshipTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeRelationshipTarget createCompositeRelationshipTarget() {
		CompositeRelationshipTargetImpl compositeRelationshipTarget = new CompositeRelationshipTargetImpl();
		return compositeRelationshipTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipSource createRelationshipSource() {
		RelationshipSourceImpl relationshipSource = new RelationshipSourceImpl();
		return relationshipSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeRelationshipSource createCompositeRelationshipSource() {
		CompositeRelationshipSourceImpl compositeRelationshipSource = new CompositeRelationshipSourceImpl();
		return compositeRelationshipSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeNode createCompositeNode() {
		CompositeNodeImpl compositeNode = new CompositeNodeImpl();
		return compositeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tunnel createTunnel() {
		TunnelImpl tunnel = new TunnelImpl();
		return tunnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitecturePackage getArchitecturePackage() {
		return (ArchitecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitecturePackage getPackage() {
		return ArchitecturePackage.eINSTANCE;
	}

} //ArchitectureFactoryImpl
