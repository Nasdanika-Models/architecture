/**
 */
package org.nasdanika.models.architecture.c4.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.drawio.model.ModelPackage;

import org.nasdanika.models.architecture.ArchitecturePackage;

import org.nasdanika.models.architecture.c4.C4Factory;
import org.nasdanika.models.architecture.c4.C4Package;
import org.nasdanika.models.architecture.c4.Code;
import org.nasdanika.models.architecture.c4.Component;
import org.nasdanika.models.architecture.c4.Context;
import org.nasdanika.models.architecture.c4.Person;

import org.nasdanika.models.architecture.c4.Relationship;
import org.nasdanika.models.architecture.impl.ArchitecturePackageImpl;

import org.nasdanika.models.party.PartyPackage;

import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class C4PackageImpl extends EPackageImpl implements C4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

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
	 * @see org.nasdanika.models.architecture.c4.C4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private C4PackageImpl() {
		super(eNS_URI, C4Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link C4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static C4Package init() {
		if (isInited) return (C4Package)EPackage.Registry.INSTANCE.getEPackage(C4Package.eNS_URI);

		// Obtain or create and register package
		Object registeredC4Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		C4PackageImpl theC4Package = registeredC4Package instanceof C4PackageImpl ? (C4PackageImpl)registeredC4Package : new C4PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();
		org.nasdanika.graph.model.ModelPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(registeredPackage instanceof ArchitecturePackageImpl ? registeredPackage : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theC4Package.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theC4Package.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theC4Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(C4Package.eNS_URI, theC4Package);
		return theC4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCode() {
		return codeEClass;
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
	public C4Factory getC4Factory() {
		return (C4Factory)getEFactoryInstance();
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
		contextEClass = createEClass(CONTEXT);

		personEClass = createEClass(PERSON);

		systemEClass = createEClass(SYSTEM);

		containerEClass = createEClass(CONTAINER);

		componentEClass = createEClass(COMPONENT);

		codeEClass = createEClass(CODE);

		relationshipEClass = createEClass(RELATIONSHIP);
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
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contextEClass.getESuperTypes().add(theArchitecturePackage.getDomain());
		personEClass.getESuperTypes().add(theArchitecturePackage.getNode());
		systemEClass.getESuperTypes().add(theArchitecturePackage.getCompositeNode());
		containerEClass.getESuperTypes().add(theArchitecturePackage.getCompositeNode());
		componentEClass.getESuperTypes().add(theArchitecturePackage.getCompositeNode());
		codeEClass.getESuperTypes().add(theArchitecturePackage.getCompositeNode());
		relationshipEClass.getESuperTypes().add(theArchitecturePackage.getRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, org.nasdanika.models.architecture.c4.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, org.nasdanika.models.architecture.c4.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //C4PackageImpl
