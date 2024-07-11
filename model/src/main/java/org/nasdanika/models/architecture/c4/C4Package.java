/**
 */
package org.nasdanika.models.architecture.c4;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.nasdanika.models.architecture.ArchitecturePackage;

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
 * @see org.nasdanika.models.architecture.c4.C4Factory
 * @model kind="package"
 * @generated
 */
public interface C4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "c4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/architecture/c4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.architecture.c4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	C4Package eINSTANCE = org.nasdanika.models.architecture.c4.impl.C4PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.c4.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.c4.impl.ContextImpl
	 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = ArchitecturePackage.DOMAIN__ID;

	/**
	 * The feature id for the '<em><b>Semantic Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SEMANTIC_MAPPINGS = ArchitecturePackage.DOMAIN__SEMANTIC_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__MARKERS = ArchitecturePackage.DOMAIN__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__URIS = ArchitecturePackage.DOMAIN__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = ArchitecturePackage.DOMAIN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UUID = ArchitecturePackage.DOMAIN__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__LABEL_PROTOTYPE = ArchitecturePackage.DOMAIN__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__REPRESENTATIONS = ArchitecturePackage.DOMAIN__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ANNOTATIONS = ArchitecturePackage.DOMAIN__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = ArchitecturePackage.DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DOCUMENTATION = ArchitecturePackage.DOMAIN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_HELP = ArchitecturePackage.DOMAIN__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__START = ArchitecturePackage.DOMAIN__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__END = ArchitecturePackage.DOMAIN__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DURATION = ArchitecturePackage.DOMAIN__DURATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ICON = ArchitecturePackage.DOMAIN__ICON;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ROLES = ArchitecturePackage.DOMAIN__ROLES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ELEMENTS = ArchitecturePackage.DOMAIN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ACTORS = ArchitecturePackage.DOMAIN__ACTORS;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ArchitecturePackage.DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = ArchitecturePackage.DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.c4.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.c4.impl.PersonImpl
	 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = ArchitecturePackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Semantic Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SEMANTIC_MAPPINGS = ArchitecturePackage.NODE__SEMANTIC_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MARKERS = ArchitecturePackage.NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__URIS = ArchitecturePackage.NODE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = ArchitecturePackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__UUID = ArchitecturePackage.NODE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LABEL_PROTOTYPE = ArchitecturePackage.NODE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REPRESENTATIONS = ArchitecturePackage.NODE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ANNOTATIONS = ArchitecturePackage.NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = ArchitecturePackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOCUMENTATION = ArchitecturePackage.NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTEXT_HELP = ArchitecturePackage.NODE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OUTGOING_CONNECTIONS = ArchitecturePackage.NODE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__START = ArchitecturePackage.NODE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__END = ArchitecturePackage.NODE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DURATION = ArchitecturePackage.NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ICON = ArchitecturePackage.NODE__ICON;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = ArchitecturePackage.NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__INCOMING_CONNECTIONS = ArchitecturePackage.NODE__INCOMING_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = ArchitecturePackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = ArchitecturePackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.c4.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.c4.impl.SystemImpl
	 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = ArchitecturePackage.COMPOSITE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Semantic Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SEMANTIC_MAPPINGS = ArchitecturePackage.COMPOSITE_NODE__SEMANTIC_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MARKERS = ArchitecturePackage.COMPOSITE_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__URIS = ArchitecturePackage.COMPOSITE_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = ArchitecturePackage.COMPOSITE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__UUID = ArchitecturePackage.COMPOSITE_NODE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LABEL_PROTOTYPE = ArchitecturePackage.COMPOSITE_NODE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REPRESENTATIONS = ArchitecturePackage.COMPOSITE_NODE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ANNOTATIONS = ArchitecturePackage.COMPOSITE_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = ArchitecturePackage.COMPOSITE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DOCUMENTATION = ArchitecturePackage.COMPOSITE_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTEXT_HELP = ArchitecturePackage.COMPOSITE_NODE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__START = ArchitecturePackage.COMPOSITE_NODE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__END = ArchitecturePackage.COMPOSITE_NODE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DURATION = ArchitecturePackage.COMPOSITE_NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ICON = ArchitecturePackage.COMPOSITE_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROLES = ArchitecturePackage.COMPOSITE_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ELEMENTS = ArchitecturePackage.COMPOSITE_NODE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ACTORS = ArchitecturePackage.COMPOSITE_NODE__ACTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OUTGOING_CONNECTIONS = ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INCOMING_CONNECTIONS = ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = ArchitecturePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = ArchitecturePackage.COMPOSITE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.c4.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.c4.impl.ContainerImpl
	 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = ArchitecturePackage.COMPOSITE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Semantic Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SEMANTIC_MAPPINGS = ArchitecturePackage.COMPOSITE_NODE__SEMANTIC_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MARKERS = ArchitecturePackage.COMPOSITE_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__URIS = ArchitecturePackage.COMPOSITE_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = ArchitecturePackage.COMPOSITE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__UUID = ArchitecturePackage.COMPOSITE_NODE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LABEL_PROTOTYPE = ArchitecturePackage.COMPOSITE_NODE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REPRESENTATIONS = ArchitecturePackage.COMPOSITE_NODE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ANNOTATIONS = ArchitecturePackage.COMPOSITE_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = ArchitecturePackage.COMPOSITE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOCUMENTATION = ArchitecturePackage.COMPOSITE_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTEXT_HELP = ArchitecturePackage.COMPOSITE_NODE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__START = ArchitecturePackage.COMPOSITE_NODE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__END = ArchitecturePackage.COMPOSITE_NODE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DURATION = ArchitecturePackage.COMPOSITE_NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ICON = ArchitecturePackage.COMPOSITE_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ROLES = ArchitecturePackage.COMPOSITE_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = ArchitecturePackage.COMPOSITE_NODE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ACTORS = ArchitecturePackage.COMPOSITE_NODE__ACTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OUTGOING_CONNECTIONS = ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INCOMING_CONNECTIONS = ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ArchitecturePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ArchitecturePackage.COMPOSITE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.c4.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.c4.impl.ComponentImpl
	 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = ArchitecturePackage.COMPOSITE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Semantic Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SEMANTIC_MAPPINGS = ArchitecturePackage.COMPOSITE_NODE__SEMANTIC_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MARKERS = ArchitecturePackage.COMPOSITE_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__URIS = ArchitecturePackage.COMPOSITE_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = ArchitecturePackage.COMPOSITE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UUID = ArchitecturePackage.COMPOSITE_NODE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LABEL_PROTOTYPE = ArchitecturePackage.COMPOSITE_NODE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REPRESENTATIONS = ArchitecturePackage.COMPOSITE_NODE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANNOTATIONS = ArchitecturePackage.COMPOSITE_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ArchitecturePackage.COMPOSITE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DOCUMENTATION = ArchitecturePackage.COMPOSITE_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTEXT_HELP = ArchitecturePackage.COMPOSITE_NODE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__START = ArchitecturePackage.COMPOSITE_NODE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__END = ArchitecturePackage.COMPOSITE_NODE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DURATION = ArchitecturePackage.COMPOSITE_NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ICON = ArchitecturePackage.COMPOSITE_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ROLES = ArchitecturePackage.COMPOSITE_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ELEMENTS = ArchitecturePackage.COMPOSITE_NODE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ACTORS = ArchitecturePackage.COMPOSITE_NODE__ACTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTGOING_CONNECTIONS = ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INCOMING_CONNECTIONS = ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ArchitecturePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ArchitecturePackage.COMPOSITE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.c4.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.c4.impl.CodeImpl
	 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getCode()
	 * @generated
	 */
	int CODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = ArchitecturePackage.COMPOSITE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Semantic Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SEMANTIC_MAPPINGS = ArchitecturePackage.COMPOSITE_NODE__SEMANTIC_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__MARKERS = ArchitecturePackage.COMPOSITE_NODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__URIS = ArchitecturePackage.COMPOSITE_NODE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DESCRIPTION = ArchitecturePackage.COMPOSITE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__UUID = ArchitecturePackage.COMPOSITE_NODE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__LABEL_PROTOTYPE = ArchitecturePackage.COMPOSITE_NODE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__REPRESENTATIONS = ArchitecturePackage.COMPOSITE_NODE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ANNOTATIONS = ArchitecturePackage.COMPOSITE_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__NAME = ArchitecturePackage.COMPOSITE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DOCUMENTATION = ArchitecturePackage.COMPOSITE_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CONTEXT_HELP = ArchitecturePackage.COMPOSITE_NODE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__START = ArchitecturePackage.COMPOSITE_NODE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__END = ArchitecturePackage.COMPOSITE_NODE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DURATION = ArchitecturePackage.COMPOSITE_NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ICON = ArchitecturePackage.COMPOSITE_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ROLES = ArchitecturePackage.COMPOSITE_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ELEMENTS = ArchitecturePackage.COMPOSITE_NODE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ACTORS = ArchitecturePackage.COMPOSITE_NODE__ACTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__OUTGOING_CONNECTIONS = ArchitecturePackage.COMPOSITE_NODE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__INCOMING_CONNECTIONS = ArchitecturePackage.COMPOSITE_NODE__INCOMING_CONNECTIONS;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = ArchitecturePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = ArchitecturePackage.COMPOSITE_NODE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.architecture.c4.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.architecture.c4.impl.RelationshipImpl
	 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = ArchitecturePackage.RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ArchitecturePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__BIDIRECTIONAL = ArchitecturePackage.RELATIONSHIP__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MARKERS = ArchitecturePackage.RELATIONSHIP__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__URIS = ArchitecturePackage.RELATIONSHIP__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIPTION = ArchitecturePackage.RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UUID = ArchitecturePackage.RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LABEL_PROTOTYPE = ArchitecturePackage.RELATIONSHIP__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__REPRESENTATIONS = ArchitecturePackage.RELATIONSHIP__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ANNOTATIONS = ArchitecturePackage.RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ArchitecturePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DOCUMENTATION = ArchitecturePackage.RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CONTEXT_HELP = ArchitecturePackage.RELATIONSHIP__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__START = ArchitecturePackage.RELATIONSHIP__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__END = ArchitecturePackage.RELATIONSHIP__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DURATION = ArchitecturePackage.RELATIONSHIP__DURATION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ICON = ArchitecturePackage.RELATIONSHIP__ICON;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ROLES = ArchitecturePackage.RELATIONSHIP__ROLES;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ArchitecturePackage.RELATIONSHIP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.c4.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.nasdanika.models.architecture.c4.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.c4.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.nasdanika.models.architecture.c4.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.c4.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.nasdanika.models.architecture.c4.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.c4.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.models.architecture.c4.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.c4.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.nasdanika.models.architecture.c4.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.c4.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.nasdanika.models.architecture.c4.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.architecture.c4.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.nasdanika.models.architecture.c4.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	C4Factory getC4Factory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.c4.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.c4.impl.ContextImpl
		 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.c4.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.c4.impl.PersonImpl
		 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.c4.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.c4.impl.SystemImpl
		 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.c4.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.c4.impl.ContainerImpl
		 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.c4.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.c4.impl.ComponentImpl
		 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.c4.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.c4.impl.CodeImpl
		 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.architecture.c4.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.architecture.c4.impl.RelationshipImpl
		 * @see org.nasdanika.models.architecture.c4.impl.C4PackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

	}

} //C4Package
