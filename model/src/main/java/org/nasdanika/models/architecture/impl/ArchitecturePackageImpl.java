/**
 */
package org.nasdanika.models.architecture.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.graph.model.ModelPackage;

import org.nasdanika.models.architecture.Actor;
import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.architecture.ArchitectureDescriptionElement;
import org.nasdanika.models.architecture.ArchitectureElement;
import org.nasdanika.models.architecture.ArchitectureFactory;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.CompositeNode;
import org.nasdanika.models.architecture.CompositeRelationshipSource;
import org.nasdanika.models.architecture.CompositeRelationshipTarget;
import org.nasdanika.models.architecture.Domain;
import org.nasdanika.models.architecture.Node;
import org.nasdanika.models.architecture.PartyActor;
import org.nasdanika.models.architecture.PersonActor;
import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.architecture.RelationshipTarget;
import org.nasdanika.models.architecture.Role;
import org.nasdanika.models.architecture.Tunnel;

import org.nasdanika.models.architecture.Undergoer;
import org.nasdanika.models.party.PartyPackage;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturePackageImpl extends EPackageImpl implements ArchitecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undergoerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDescriptionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRelationshipTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRelationshipSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tunnelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.architecture.ArchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitecturePackageImpl() {
		super(eNS_URI, ArchitectureFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitecturePackage init() {
		if (isInited) return (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArchitecturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArchitecturePackageImpl theArchitecturePackage = registeredArchitecturePackage instanceof ArchitecturePackageImpl ? (ArchitecturePackageImpl)registeredArchitecturePackage : new ArchitecturePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		org.nasdanika.drawio.model.ModelPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitecturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitecturePackage.eNS_URI, theArchitecturePackage);
		return theArchitecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureElement() {
		return architectureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchitectureElement_Icon() {
		return (EAttribute)architectureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_Roles() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyActor() {
		return partyActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonActor() {
		return personActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Actors() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Extends() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Extensions() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUndergoer() {
		return undergoerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUndergoer_Roles() {
		return (EReference)undergoerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureDescriptionElement() {
		return architectureDescriptionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureDescription() {
		return architectureDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureDescription_Actors() {
		return (EReference)architectureDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipTarget() {
		return relationshipTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeRelationshipTarget() {
		return compositeRelationshipTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipSource() {
		return relationshipSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeRelationshipSource() {
		return compositeRelationshipSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeNode() {
		return compositeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTunnel() {
		return tunnelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureFactory getArchitectureFactory() {
		return (ArchitectureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		architectureElementEClass = createEClass(ARCHITECTURE_ELEMENT);
		createEAttribute(architectureElementEClass, ARCHITECTURE_ELEMENT__ICON);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__ROLES);

		partyActorEClass = createEClass(PARTY_ACTOR);

		personActorEClass = createEClass(PERSON_ACTOR);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__ACTORS);
		createEReference(roleEClass, ROLE__EXTENDS);
		createEReference(roleEClass, ROLE__EXTENSIONS);

		undergoerEClass = createEClass(UNDERGOER);
		createEReference(undergoerEClass, UNDERGOER__ROLES);

		architectureDescriptionElementEClass = createEClass(ARCHITECTURE_DESCRIPTION_ELEMENT);

		architectureDescriptionEClass = createEClass(ARCHITECTURE_DESCRIPTION);
		createEReference(architectureDescriptionEClass, ARCHITECTURE_DESCRIPTION__ACTORS);

		domainEClass = createEClass(DOMAIN);

		relationshipTargetEClass = createEClass(RELATIONSHIP_TARGET);

		compositeRelationshipTargetEClass = createEClass(COMPOSITE_RELATIONSHIP_TARGET);

		relationshipEClass = createEClass(RELATIONSHIP);

		relationshipSourceEClass = createEClass(RELATIONSHIP_SOURCE);

		compositeRelationshipSourceEClass = createEClass(COMPOSITE_RELATIONSHIP_SOURCE);

		nodeEClass = createEClass(NODE);

		compositeNodeEClass = createEClass(COMPOSITE_NODE);

		tunnelEClass = createEClass(TUNNEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);
		PartyPackage thePartyPackage = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		ModelPackage theModelPackage_1 = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		architectureElementEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		architectureElementEClass.getESuperTypes().add(theNcorePackage.getPeriod());
		actorEClass.getESuperTypes().add(this.getArchitectureElement());
		actorEClass.getESuperTypes().add(theNcorePackage.getStringIdentity());
		partyActorEClass.getESuperTypes().add(this.getActor());
		partyActorEClass.getESuperTypes().add(thePartyPackage.getParty());
		personActorEClass.getESuperTypes().add(this.getPartyActor());
		personActorEClass.getESuperTypes().add(thePartyPackage.getPerson());
		roleEClass.getESuperTypes().add(this.getArchitectureElement());
		roleEClass.getESuperTypes().add(theNcorePackage.getStringIdentity());
		architectureDescriptionElementEClass.getESuperTypes().add(theModelPackage_1.getDocumentedNamedGraphElement());
		architectureDescriptionElementEClass.getESuperTypes().add(this.getArchitectureElement());
		architectureDescriptionElementEClass.getESuperTypes().add(this.getUndergoer());
		EGenericType g1 = createEGenericType(theModelPackage_1.getDocumentedNamedGraph());
		EGenericType g2 = createEGenericType(this.getArchitectureDescriptionElement());
		g1.getETypeArguments().add(g2);
		architectureDescriptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getArchitectureElement());
		architectureDescriptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUndergoer());
		architectureDescriptionEClass.getEGenericSuperTypes().add(g1);
		domainEClass.getESuperTypes().add(this.getArchitectureDescriptionElement());
		domainEClass.getESuperTypes().add(this.getArchitectureDescription());
		g1 = createEGenericType(this.getArchitectureDescriptionElement());
		relationshipTargetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModelPackage_1.getDocumentedNamedConnectionTarget());
		g2 = createEGenericType(this.getRelationship());
		g1.getETypeArguments().add(g2);
		relationshipTargetEClass.getEGenericSuperTypes().add(g1);
		compositeRelationshipTargetEClass.getESuperTypes().add(this.getDomain());
		compositeRelationshipTargetEClass.getESuperTypes().add(this.getRelationshipTarget());
		g1 = createEGenericType(theModelPackage_1.getDocumentedNamedConnection());
		g2 = createEGenericType(this.getRelationshipTarget());
		g1.getETypeArguments().add(g2);
		relationshipEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getArchitectureElement());
		relationshipEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUndergoer());
		relationshipEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModelPackage_1.getDocumentedNamedConnectionSource());
		g2 = createEGenericType(this.getRelationship());
		g1.getETypeArguments().add(g2);
		relationshipSourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getArchitectureDescriptionElement());
		relationshipSourceEClass.getEGenericSuperTypes().add(g1);
		compositeRelationshipSourceEClass.getESuperTypes().add(this.getDomain());
		compositeRelationshipSourceEClass.getESuperTypes().add(this.getRelationshipSource());
		nodeEClass.getESuperTypes().add(this.getRelationshipSource());
		nodeEClass.getESuperTypes().add(this.getRelationshipTarget());
		compositeNodeEClass.getESuperTypes().add(this.getDomain());
		compositeNodeEClass.getESuperTypes().add(this.getNode());
		g1 = createEGenericType(theModelPackage_1.getDocumentedNamedTunnel());
		g2 = createEGenericType(this.getRelationshipTarget());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getRelationship());
		g1.getETypeArguments().add(g2);
		tunnelEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getRelationship());
		tunnelEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(architectureElementEClass, ArchitectureElement.class, "ArchitectureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureElement_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Roles(), this.getRole(), this.getRole_Actors(), "roles", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyActorEClass, PartyActor.class, "PartyActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personActorEClass, PersonActor.class, "PersonActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Actors(), this.getActor(), this.getActor_Roles(), "actors", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Extends(), this.getRole(), this.getRole_Extensions(), "extends", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Extensions(), this.getRole(), this.getRole_Extends(), "extensions", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(undergoerEClass, Undergoer.class, "Undergoer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUndergoer_Roles(), this.getRole(), null, "roles", null, 0, -1, Undergoer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUndergoer_Roles().getEKeys().add(theNcorePackage.getStringIdentity_Id());

		initEClass(architectureDescriptionElementEClass, ArchitectureDescriptionElement.class, "ArchitectureDescriptionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(architectureDescriptionEClass, ArchitectureDescription.class, "ArchitectureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureDescription_Actors(), this.getActor(), null, "actors", null, 0, -1, ArchitectureDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getArchitectureDescription_Actors().getEKeys().add(theNcorePackage.getStringIdentity_Id());

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipTargetEClass, RelationshipTarget.class, "RelationshipTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeRelationshipTargetEClass, CompositeRelationshipTarget.class, "CompositeRelationshipTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipSourceEClass, RelationshipSource.class, "RelationshipSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeRelationshipSourceEClass, CompositeRelationshipSource.class, "CompositeRelationshipSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeNodeEClass, CompositeNode.class, "CompositeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tunnelEClass, Tunnel.class, "Tunnel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Classes for documenting (software) architectures"
		   });
		addAnnotation
		  (architectureElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for elements of architecture"
		   });
		addAnnotation
		  (getArchitectureElement_Icon(),
		   source,
		   new String[] {
			   "documentation", "Architecture element icon. Treated as URL if contains ``/`` or as a CSS class otherwise. E.g. ``fas fa-wrench`` would be treated as a CSS class. If this attribute is blank then the type icon is used. For example, a generic server icon defined at the Server type can be overridden by an icon defined at a server instance (e.g. Web Server)."
		   });
		addAnnotation
		  (actorEClass,
		   source,
		   new String[] {
			   "documentation", "Actors play roles/have responsibilies on model elements implementing Undergoer "
		   });
		addAnnotation
		  (getActor_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles played by this actor"
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "documentation", "A role is played by an Actor performing activities on the containing Undergoer"
		   });
		addAnnotation
		  (getRole_Extends(),
		   source,
		   new String[] {
			   "documentation", "A role can be a specialization (extension) of one or more roles"
		   });
		addAnnotation
		  (getRole_Extensions(),
		   source,
		   new String[] {
			   "documentation", "Roles extending this role"
		   });
		addAnnotation
		  (undergoerEClass,
		   source,
		   new String[] {
			   "documentation", "Something operated on by actors in roles. A container of roles referencing actors. For example, a Server is patched by the \"Unix Support\" role and Joe Doe plays this role."
		   });
		addAnnotation
		  (getUndergoer_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles operating on this model element"
		   });
		addAnnotation
		  (architectureDescriptionElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for elements of architecture descriptions"
		   });
		addAnnotation
		  (architectureDescriptionEClass,
		   source,
		   new String[] {
			   "documentation", "Architecture description contains architecture elements and reference elements such as stakeholders. Architecture description elements are keyed by string identifiers which allows to implement architecture inheritance similar to inheritance in object-oriented languages such as Java or layering in Docker images - a new architecture may be derived from an existing architecture by applying a layer of deltas. This is also similar to a commit tree in Git."
		   });
		addAnnotation
		  (getArchitectureDescription_Actors(),
		   source,
		   new String[] {
			   "documentation", "Actors operating on the elements of this architecture description"
		   });
		addAnnotation
		  (domainEClass,
		   source,
		   new String[] {
			   "documentation", "Domains allow to organize architecture descriptions into a hierarchy"
		   });
		addAnnotation
		  (relationshipTargetEClass,
		   source,
		   new String[] {
			   "documentation", "An architecture description which can have incoming relationships"
		   });
		addAnnotation
		  (compositeRelationshipTargetEClass,
		   source,
		   new String[] {
			   "documentation", "Relationship target which is also a domain, i.e. it may contain other architecture description elements"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "documentation", "Relationship between two architecture description elements. Relationships are contained by their source and uniquiely identified in the source by a string id. This allows to implement relationship inheritance behaviors such as overriding (replacing), adding, or removing."
		   });
		addAnnotation
		  (relationshipSourceEClass,
		   source,
		   new String[] {
			   "documentation", "Source of relationships uniquely identified by string ids. It provides support for architecture inheritance/layering - replacing (overriding), adding, or removing relationships"
		   });
		addAnnotation
		  (compositeRelationshipSourceEClass,
		   source,
		   new String[] {
			   "documentation", "Relationship source which is also a domain. I.e. it may contain other architecture description elements."
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "documentation", "Node is both relationship source and target. I.e. it may have both incoming and outgoing relationships."
		   });
		addAnnotation
		  (compositeNodeEClass,
		   source,
		   new String[] {
			   "documentation", "Node which is also a domain. I.e. it may contain other architecture description elements."
		   });
		addAnnotation
		  (tunnelEClass,
		   source,
		   new String[] {
			   "documentation", "Tunnel is a relationship which logically groups other relationships. For example, two composite nodes may have a tunnel relationship which groups relationships between their child elements. A real life example is a VPN tunnel between two networks."
		   });
	}

} //ArchitecturePackageImpl
