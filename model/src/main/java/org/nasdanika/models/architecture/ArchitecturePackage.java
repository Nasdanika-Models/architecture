/**
 */
package org.nasdanika.models.architecture;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.models.togaf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = org.nasdanika.models.architecture.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.impl.RepresentationImpl
	 * @see org.nasdanika.models.architecture.impl.ArchitecturePackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.impl.RepresentationSpecificationImpl <em>Representation Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.impl.RepresentationSpecificationImpl
	 * @see org.nasdanika.models.architecture.impl.ArchitecturePackageImpl#getRepresentationSpecification()
	 * @generated
	 */
	int REPRESENTATION_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Governs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_SPECIFICATION__GOVERNS = 0;

	/**
	 * The number of structural features of the '<em>Representation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Representation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_SPECIFICATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.impl.ArchitectureViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.impl.ArchitectureViewpointImpl
	 * @see org.nasdanika.models.architecture.impl.ArchitecturePackageImpl#getArchitectureViewpoint()
	 * @generated
	 */
	int ARCHITECTURE_VIEWPOINT = 2;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT__FRAMES = CorePackage.ARCHITECTURE_VIEWPOINT__FRAMES;

	/**
	 * The feature id for the '<em><b>Governs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT__GOVERNS = CorePackage.ARCHITECTURE_VIEWPOINT__GOVERNS;

	/**
	 * The feature id for the '<em><b>Model Kinds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT__MODEL_KINDS = CorePackage.ARCHITECTURE_VIEWPOINT__MODEL_KINDS;

	/**
	 * The feature id for the '<em><b>Representation Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT__REPRESENTATION_SPECIFICATIONS = CorePackage.ARCHITECTURE_VIEWPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT_FEATURE_COUNT = CorePackage.ARCHITECTURE_VIEWPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEWPOINT_OPERATION_COUNT = CorePackage.ARCHITECTURE_VIEWPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.impl.ArchitectureViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.impl.ArchitectureViewImpl
	 * @see org.nasdanika.models.architecture.impl.ArchitecturePackageImpl#getArchitectureView()
	 * @generated
	 */
	int ARCHITECTURE_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__ADDRESSES = CorePackage.ARCHITECTURE_VIEW__ADDRESSES;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__MODELS = CorePackage.ARCHITECTURE_VIEW__MODELS;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW__REPRESENTATION = CorePackage.ARCHITECTURE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW_FEATURE_COUNT = CorePackage.ARCHITECTURE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_VIEW_OPERATION_COUNT = CorePackage.ARCHITECTURE_VIEW_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see org.nasdanika.models.architecture.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.architecture.Representation#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specification</em>'.
	 * @see org.nasdanika.models.architecture.Representation#getSpecification()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Specification();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.RepresentationSpecification <em>Representation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Specification</em>'.
	 * @see org.nasdanika.models.architecture.RepresentationSpecification
	 * @generated
	 */
	EClass getRepresentationSpecification();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.architecture.RepresentationSpecification#getGoverns <em>Governs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Governs</em>'.
	 * @see org.nasdanika.models.architecture.RepresentationSpecification#getGoverns()
	 * @see #getRepresentationSpecification()
	 * @generated
	 */
	EReference getRepresentationSpecification_Governs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.ArchitectureViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see org.nasdanika.models.architecture.ArchitectureViewpoint
	 * @generated
	 */
	EClass getArchitectureViewpoint();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.architecture.ArchitectureViewpoint#getRepresentationSpecifications <em>Representation Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representation Specifications</em>'.
	 * @see org.nasdanika.models.architecture.ArchitectureViewpoint#getRepresentationSpecifications()
	 * @see #getArchitectureViewpoint()
	 * @generated
	 */
	EReference getArchitectureViewpoint_RepresentationSpecifications();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.ArchitectureView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.nasdanika.models.architecture.ArchitectureView
	 * @generated
	 */
	EClass getArchitectureView();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.architecture.ArchitectureView#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representation</em>'.
	 * @see org.nasdanika.models.architecture.ArchitectureView#getRepresentation()
	 * @see #getArchitectureView()
	 * @generated
	 */
	EReference getArchitectureView_Representation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureFactory getArchitectureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.impl.RepresentationImpl
		 * @see org.nasdanika.models.architecture.impl.ArchitecturePackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__SPECIFICATION = eINSTANCE.getRepresentation_Specification();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.impl.RepresentationSpecificationImpl <em>Representation Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.impl.RepresentationSpecificationImpl
		 * @see org.nasdanika.models.architecture.impl.ArchitecturePackageImpl#getRepresentationSpecification()
		 * @generated
		 */
		EClass REPRESENTATION_SPECIFICATION = eINSTANCE.getRepresentationSpecification();

		/**
		 * The meta object literal for the '<em><b>Governs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_SPECIFICATION__GOVERNS = eINSTANCE.getRepresentationSpecification_Governs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.impl.ArchitectureViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.impl.ArchitectureViewpointImpl
		 * @see org.nasdanika.models.architecture.impl.ArchitecturePackageImpl#getArchitectureViewpoint()
		 * @generated
		 */
		EClass ARCHITECTURE_VIEWPOINT = eINSTANCE.getArchitectureViewpoint();

		/**
		 * The meta object literal for the '<em><b>Representation Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_VIEWPOINT__REPRESENTATION_SPECIFICATIONS = eINSTANCE.getArchitectureViewpoint_RepresentationSpecifications();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.impl.ArchitectureViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.impl.ArchitectureViewImpl
		 * @see org.nasdanika.models.architecture.impl.ArchitecturePackageImpl#getArchitectureView()
		 * @generated
		 */
		EClass ARCHITECTURE_VIEW = eINSTANCE.getArchitectureView();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_VIEW__REPRESENTATION = eINSTANCE.getArchitectureView_Representation();

	}

} //ArchitecturePackage
