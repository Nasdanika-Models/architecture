/**
 */
package org.nasdanika.models.architecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.graph.model.ModelPackage;

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
import org.nasdanika.models.architecture.Relationship;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.architecture.RelationshipTarget;
import org.nasdanika.models.architecture.Tunnel;

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
		ModelPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

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

		architectureDescriptionElementEClass = createEClass(ARCHITECTURE_DESCRIPTION_ELEMENT);

		architectureDescriptionEClass = createEClass(ARCHITECTURE_DESCRIPTION);

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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		architectureElementEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		architectureElementEClass.getESuperTypes().add(theNcorePackage.getPeriod());
		architectureDescriptionElementEClass.getESuperTypes().add(theModelPackage.getDocumentedNamedGraphElement());
		architectureDescriptionElementEClass.getESuperTypes().add(this.getArchitectureElement());
		EGenericType g1 = createEGenericType(theModelPackage.getDocumentedNamedGraph());
		EGenericType g2 = createEGenericType(this.getArchitectureDescriptionElement());
		g1.getETypeArguments().add(g2);
		architectureDescriptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getArchitectureElement());
		architectureDescriptionEClass.getEGenericSuperTypes().add(g1);
		domainEClass.getESuperTypes().add(this.getArchitectureDescriptionElement());
		domainEClass.getESuperTypes().add(this.getArchitectureDescription());
		g1 = createEGenericType(this.getArchitectureDescriptionElement());
		relationshipTargetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModelPackage.getDocumentedNamedConnectionTarget());
		g2 = createEGenericType(this.getRelationship());
		g1.getETypeArguments().add(g2);
		relationshipTargetEClass.getEGenericSuperTypes().add(g1);
		compositeRelationshipTargetEClass.getESuperTypes().add(this.getDomain());
		compositeRelationshipTargetEClass.getESuperTypes().add(this.getRelationshipTarget());
		g1 = createEGenericType(theModelPackage.getDocumentedNamedConnection());
		g2 = createEGenericType(this.getRelationshipTarget());
		g1.getETypeArguments().add(g2);
		relationshipEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getArchitectureElement());
		relationshipEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModelPackage.getDocumentedNamedConnectionSource());
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
		g1 = createEGenericType(theModelPackage.getDocumentedNamedTunnel());
		g2 = createEGenericType(this.getRelationshipTarget());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getRelationship());
		g1.getETypeArguments().add(g2);
		tunnelEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getRelationship());
		tunnelEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(architectureElementEClass, ArchitectureElement.class, "ArchitectureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(architectureDescriptionElementEClass, ArchitectureDescriptionElement.class, "ArchitectureDescriptionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(architectureDescriptionEClass, ArchitectureDescription.class, "ArchitectureDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
