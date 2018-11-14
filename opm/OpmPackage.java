/**
 */
package opm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see opm.OpmFactory
 * @model kind="package"
 * @generated
 */
public interface OpmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.rubis.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *  * @generated
	 */
	String eCONTENT_TYPE = "xml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * 
	 */
	OpmPackage eINSTANCE = opm.impl.OpmPackageImpl.init();

	/**
	 * The meta object id for the '{@link opm.impl.OPMContainerImpl <em>OPM Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.impl.OPMContainerImpl
	 * @see opm.impl.OpmPackageImpl#getOPMContainer()
	 * @generated
	 */
	int OPM_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_CONTAINER__NODES = 0;

	/**
	 * The number of structural features of the '<em>OPM Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OPM Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link opm.impl.OPMObjectProcessDiagramImpl <em>OPM Object Process Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.impl.OPMObjectProcessDiagramImpl
	 * @see opm.impl.OpmPackageImpl#getOPMObjectProcessDiagram()
	 * @generated
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM__NODES = OPM_CONTAINER__NODES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM__LINKS = OPM_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OPM Object Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM_FEATURE_COUNT = OPM_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OPM Object Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM_OPERATION_COUNT = OPM_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link opm.impl.OPMNodeImpl <em>OPM Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.impl.OPMNodeImpl
	 * @see opm.impl.OpmPackageImpl#getOPMNode()
	 * @generated
	 */
	int OPM_NODE = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__NODES = OPM_CONTAINER__NODES;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__INCOMING_LINKS = OPM_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__OUTGOING_LINKS = OPM_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__CONTAINER = OPM_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE__CONSTRAINTS = OPM_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OPM Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE_FEATURE_COUNT = OPM_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS = OPM_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS = OPM_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Opd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE___GET_OPD = OPM_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>OPM Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_NODE_OPERATION_COUNT = OPM_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link opm.impl.OPMThingImpl <em>OPM Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.impl.OPMThingImpl
	 * @see opm.impl.OpmPackageImpl#getOPMThing()
	 * @generated
	 */
	int OPM_THING = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__NODES = OPM_NODE__NODES;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__INCOMING_LINKS = OPM_NODE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__OUTGOING_LINKS = OPM_NODE__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__CONTAINER = OPM_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__CONSTRAINTS = OPM_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__NAME = OPM_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING__DESCRIPTION = OPM_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OPM Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING_FEATURE_COUNT = OPM_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING___GET_OUTGOING_STRUCTURAL_LINKS = OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING___GET_INCOMING_STRUCTURAL_LINKS = OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Opd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING___GET_OPD = OPM_NODE___GET_OPD;

	/**
	 * The number of operations of the '<em>OPM Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_THING_OPERATION_COUNT = OPM_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link opm.impl.OPMObjectImpl <em>OPM Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.impl.OPMObjectImpl
	 * @see opm.impl.OpmPackageImpl#getOPMObject()
	 * @generated
	 */
	int OPM_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__NODES = OPM_THING__NODES;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__INCOMING_LINKS = OPM_THING__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__OUTGOING_LINKS = OPM_THING__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__CONTAINER = OPM_THING__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__CONSTRAINTS = OPM_THING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__NAME = OPM_THING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT__DESCRIPTION = OPM_THING__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>OPM Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_FEATURE_COUNT = OPM_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT___GET_OUTGOING_STRUCTURAL_LINKS = OPM_THING___GET_OUTGOING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT___GET_INCOMING_STRUCTURAL_LINKS = OPM_THING___GET_INCOMING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Opd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT___GET_OPD = OPM_THING___GET_OPD;

	/**
	 * The number of operations of the '<em>OPM Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_OBJECT_OPERATION_COUNT = OPM_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link opm.impl.OPMProcessImpl <em>OPM Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.impl.OPMProcessImpl
	 * @see opm.impl.OpmPackageImpl#getOPMProcess()
	 * @generated
	 */
	int OPM_PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__NODES = OPM_THING__NODES;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__INCOMING_LINKS = OPM_THING__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__OUTGOING_LINKS = OPM_THING__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__CONTAINER = OPM_THING__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__CONSTRAINTS = OPM_THING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__NAME = OPM_THING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS__DESCRIPTION = OPM_THING__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>OPM Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS_FEATURE_COUNT = OPM_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS___GET_OUTGOING_STRUCTURAL_LINKS = OPM_THING___GET_OUTGOING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Incoming Structural Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS___GET_INCOMING_STRUCTURAL_LINKS = OPM_THING___GET_INCOMING_STRUCTURAL_LINKS;

	/**
	 * The operation id for the '<em>Get Opd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS___GET_OPD = OPM_THING___GET_OPD;

	/**
	 * The number of operations of the '<em>OPM Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCESS_OPERATION_COUNT = OPM_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link opm.impl.OPMLinkImpl <em>OPM Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.impl.OPMLinkImpl
	 * @see opm.impl.OpmPackageImpl#getOPMLink()
	 * @generated
	 */
	int OPM_LINK = 6;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__OPD = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__BENDPOINTS = 3;

	/**
	 * The feature id for the '<em><b>Router Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK__ROUTER_KIND = 4;

	/**
	 * The number of structural features of the '<em>OPM Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>OPM Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link opm.impl.OPMProceduralLinkImpl <em>OPM Procedural Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.impl.OPMProceduralLinkImpl
	 * @see opm.impl.OpmPackageImpl#getOPMProceduralLink()
	 * @generated
	 */
	int OPM_PROCEDURAL_LINK = 7;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__OPD = OPM_LINK__OPD;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__SOURCE = OPM_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__TARGET = OPM_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__BENDPOINTS = OPM_LINK__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Router Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__ROUTER_KIND = OPM_LINK__ROUTER_KIND;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK__KIND = OPM_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OPM Procedural Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK_FEATURE_COUNT = OPM_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OPM Procedural Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPM_PROCEDURAL_LINK_OPERATION_COUNT = OPM_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link opm.OPMProceduralLinkKind <em>OPM Procedural Link Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.OPMProceduralLinkKind
	 * @see opm.impl.OpmPackageImpl#getOPMProceduralLinkKind()
	 * @generated
	 */
	int OPM_PROCEDURAL_LINK_KIND = 8;

	/**
	 * The meta object id for the '{@link opm.OPMLinkRouterKind <em>OPM Link Router Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see opm.OPMLinkRouterKind
	 * @see opm.impl.OpmPackageImpl#getOPMLinkRouterKind()
	 * @generated
	 */
	int OPM_LINK_ROUTER_KIND = 9;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see opm.impl.OpmPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 10;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see opm.impl.OpmPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 11;


	/**
	 * Returns the meta object for class '{@link opm.OPMContainer <em>OPM Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Container</em>'.
	 * @see opm.OPMContainer
	 * @generated
	 */
	EClass getOPMContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link opm.OPMContainer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see opm.OPMContainer#getNodes()
	 * @see #getOPMContainer()
	 * @generated
	 */
	EReference getOPMContainer_Nodes();

	/**
	 * Returns the meta object for class '{@link opm.OPMObjectProcessDiagram <em>OPM Object Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Object Process Diagram</em>'.
	 * @see opm.OPMObjectProcessDiagram
	 * @generated
	 */
	EClass getOPMObjectProcessDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link opm.OPMObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see opm.OPMObjectProcessDiagram#getLinks()
	 * @see #getOPMObjectProcessDiagram()
	 * @generated
	 */
	EReference getOPMObjectProcessDiagram_Links();

	/**
	 * Returns the meta object for class '{@link opm.OPMNode <em>OPM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Node</em>'.
	 * @see opm.OPMNode
	 * @generated
	 */
	EClass getOPMNode();

	/**
	 * Returns the meta object for the reference list '{@link opm.OPMNode#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see opm.OPMNode#getIncomingLinks()
	 * @see #getOPMNode()
	 * @generated
	 */
	EReference getOPMNode_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link opm.OPMNode#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see opm.OPMNode#getOutgoingLinks()
	 * @see #getOPMNode()
	 * @generated
	 */
	EReference getOPMNode_OutgoingLinks();

	/**
	 * Returns the meta object for the container reference '{@link opm.OPMNode#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see opm.OPMNode#getContainer()
	 * @see #getOPMNode()
	 * @generated
	 */
	EReference getOPMNode_Container();

	/**
	 * Returns the meta object for the attribute '{@link opm.OPMNode#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see opm.OPMNode#getConstraints()
	 * @see #getOPMNode()
	 * @generated
	 */
	EAttribute getOPMNode_Constraints();

	/**
	 * Returns the meta object for the '{@link opm.OPMNode#getOutgoingStructuralLinks() <em>Get Outgoing Structural Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Structural Links</em>' operation.
	 * @see opm.OPMNode#getOutgoingStructuralLinks()
	 * @generated
	 */
	EOperation getOPMNode__GetOutgoingStructuralLinks();

	/**
	 * Returns the meta object for the '{@link opm.OPMNode#getIncomingStructuralLinks() <em>Get Incoming Structural Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Structural Links</em>' operation.
	 * @see opm.OPMNode#getIncomingStructuralLinks()
	 * @generated
	 */
	EOperation getOPMNode__GetIncomingStructuralLinks();

	/**
	 * Returns the meta object for the '{@link opm.OPMNode#getOpd() <em>Get Opd</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Opd</em>' operation.
	 * @see opm.OPMNode#getOpd()
	 * @generated
	 */
	EOperation getOPMNode__GetOpd();

	/**
	 * Returns the meta object for class '{@link opm.OPMThing <em>OPM Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Thing</em>'.
	 * @see opm.OPMThing
	 * @generated
	 */
	EClass getOPMThing();

	/**
	 * Returns the meta object for the attribute '{@link opm.OPMThing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see opm.OPMThing#getName()
	 * @see #getOPMThing()
	 * @generated
	 */
	EAttribute getOPMThing_Name();

	/**
	 * Returns the meta object for the attribute '{@link opm.OPMThing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see opm.OPMThing#getDescription()
	 * @see #getOPMThing()
	 * @generated
	 */
	EAttribute getOPMThing_Description();

	/**
	 * Returns the meta object for class '{@link opm.OPMObject <em>OPM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Object</em>'.
	 * @see opm.OPMObject
	 * @generated
	 */
	EClass getOPMObject();

	/**
	 * Returns the meta object for class '{@link opm.OPMProcess <em>OPM Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Process</em>'.
	 * @see opm.OPMProcess
	 * @generated
	 */
	EClass getOPMProcess();

	/**
	 * Returns the meta object for class '{@link opm.OPMLink <em>OPM Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Link</em>'.
	 * @see opm.OPMLink
	 * @generated
	 */
	EClass getOPMLink();

	/**
	 * Returns the meta object for the container reference '{@link opm.OPMLink#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Opd</em>'.
	 * @see opm.OPMLink#getOpd()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Opd();

	/**
	 * Returns the meta object for the reference '{@link opm.OPMLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see opm.OPMLink#getSource()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Source();

	/**
	 * Returns the meta object for the reference '{@link opm.OPMLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see opm.OPMLink#getTarget()
	 * @see #getOPMLink()
	 * @generated
	 */
	EReference getOPMLink_Target();

	/**
	 * Returns the meta object for the attribute list '{@link opm.OPMLink#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see opm.OPMLink#getBendpoints()
	 * @see #getOPMLink()
	 * @generated
	 */
	EAttribute getOPMLink_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link opm.OPMLink#getRouterKind <em>Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router Kind</em>'.
	 * @see opm.OPMLink#getRouterKind()
	 * @see #getOPMLink()
	 * @generated
	 */
	EAttribute getOPMLink_RouterKind();

	/**
	 * Returns the meta object for class '{@link opm.OPMProceduralLink <em>OPM Procedural Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPM Procedural Link</em>'.
	 * @see opm.OPMProceduralLink
	 * @generated
	 */
	EClass getOPMProceduralLink();

	/**
	 * Returns the meta object for the attribute '{@link opm.OPMProceduralLink#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see opm.OPMProceduralLink#getKind()
	 * @see #getOPMProceduralLink()
	 * @generated
	 */
	EAttribute getOPMProceduralLink_Kind();

	/**
	 * Returns the meta object for enum '{@link opm.OPMProceduralLinkKind <em>OPM Procedural Link Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OPM Procedural Link Kind</em>'.
	 * @see opm.OPMProceduralLinkKind
	 * @generated
	 */
	EEnum getOPMProceduralLinkKind();

	/**
	 * Returns the meta object for enum '{@link opm.OPMLinkRouterKind <em>OPM Link Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OPM Link Router Kind</em>'.
	 * @see opm.OPMLinkRouterKind
	 * @generated
	 */
	EEnum getOPMLinkRouterKind();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpmFactory getOpmFactory();

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
		 * The meta object literal for the '{@link opm.impl.OPMContainerImpl <em>OPM Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.impl.OPMContainerImpl
		 * @see opm.impl.OpmPackageImpl#getOPMContainer()
		 * @generated
		 */
		EClass OPM_CONTAINER = eINSTANCE.getOPMContainer();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_CONTAINER__NODES = eINSTANCE.getOPMContainer_Nodes();

		/**
		 * The meta object literal for the '{@link opm.impl.OPMObjectProcessDiagramImpl <em>OPM Object Process Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.impl.OPMObjectProcessDiagramImpl
		 * @see opm.impl.OpmPackageImpl#getOPMObjectProcessDiagram()
		 * @generated
		 */
		EClass OPM_OBJECT_PROCESS_DIAGRAM = eINSTANCE.getOPMObjectProcessDiagram();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_OBJECT_PROCESS_DIAGRAM__LINKS = eINSTANCE.getOPMObjectProcessDiagram_Links();

		/**
		 * The meta object literal for the '{@link opm.impl.OPMNodeImpl <em>OPM Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.impl.OPMNodeImpl
		 * @see opm.impl.OpmPackageImpl#getOPMNode()
		 * @generated
		 */
		EClass OPM_NODE = eINSTANCE.getOPMNode();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_NODE__INCOMING_LINKS = eINSTANCE.getOPMNode_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_NODE__OUTGOING_LINKS = eINSTANCE.getOPMNode_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_NODE__CONTAINER = eINSTANCE.getOPMNode_Container();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_NODE__CONSTRAINTS = eINSTANCE.getOPMNode_Constraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Structural Links</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS = eINSTANCE.getOPMNode__GetOutgoingStructuralLinks();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Structural Links</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS = eINSTANCE.getOPMNode__GetIncomingStructuralLinks();

		/**
		 * The meta object literal for the '<em><b>Get Opd</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPM_NODE___GET_OPD = eINSTANCE.getOPMNode__GetOpd();

		/**
		 * The meta object literal for the '{@link opm.impl.OPMThingImpl <em>OPM Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.impl.OPMThingImpl
		 * @see opm.impl.OpmPackageImpl#getOPMThing()
		 * @generated
		 */
		EClass OPM_THING = eINSTANCE.getOPMThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_THING__NAME = eINSTANCE.getOPMThing_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_THING__DESCRIPTION = eINSTANCE.getOPMThing_Description();

		/**
		 * The meta object literal for the '{@link opm.impl.OPMObjectImpl <em>OPM Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.impl.OPMObjectImpl
		 * @see opm.impl.OpmPackageImpl#getOPMObject()
		 * @generated
		 */
		EClass OPM_OBJECT = eINSTANCE.getOPMObject();

		/**
		 * The meta object literal for the '{@link opm.impl.OPMProcessImpl <em>OPM Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.impl.OPMProcessImpl
		 * @see opm.impl.OpmPackageImpl#getOPMProcess()
		 * @generated
		 */
		EClass OPM_PROCESS = eINSTANCE.getOPMProcess();

		/**
		 * The meta object literal for the '{@link opm.impl.OPMLinkImpl <em>OPM Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.impl.OPMLinkImpl
		 * @see opm.impl.OpmPackageImpl#getOPMLink()
		 * @generated
		 */
		EClass OPM_LINK = eINSTANCE.getOPMLink();

		/**
		 * The meta object literal for the '<em><b>Opd</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__OPD = eINSTANCE.getOPMLink_Opd();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__SOURCE = eINSTANCE.getOPMLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPM_LINK__TARGET = eINSTANCE.getOPMLink_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_LINK__BENDPOINTS = eINSTANCE.getOPMLink_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Router Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_LINK__ROUTER_KIND = eINSTANCE.getOPMLink_RouterKind();

		/**
		 * The meta object literal for the '{@link opm.impl.OPMProceduralLinkImpl <em>OPM Procedural Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.impl.OPMProceduralLinkImpl
		 * @see opm.impl.OpmPackageImpl#getOPMProceduralLink()
		 * @generated
		 */
		EClass OPM_PROCEDURAL_LINK = eINSTANCE.getOPMProceduralLink();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPM_PROCEDURAL_LINK__KIND = eINSTANCE.getOPMProceduralLink_Kind();

		/**
		 * The meta object literal for the '{@link opm.OPMProceduralLinkKind <em>OPM Procedural Link Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.OPMProceduralLinkKind
		 * @see opm.impl.OpmPackageImpl#getOPMProceduralLinkKind()
		 * @generated
		 */
		EEnum OPM_PROCEDURAL_LINK_KIND = eINSTANCE.getOPMProceduralLinkKind();

		/**
		 * The meta object literal for the '{@link opm.OPMLinkRouterKind <em>OPM Link Router Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see opm.OPMLinkRouterKind
		 * @see opm.impl.OpmPackageImpl#getOPMLinkRouterKind()
		 * @generated
		 */
		EEnum OPM_LINK_ROUTER_KIND = eINSTANCE.getOPMLinkRouterKind();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see opm.impl.OpmPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see opm.impl.OpmPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

	}

} //OpmPackage
