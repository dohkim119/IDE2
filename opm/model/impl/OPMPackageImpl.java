/**
 */
package com.oscar.opm.model.impl;

import com.oscar.opm.model.OPMContainer;
import com.oscar.opm.model.OPMFactory;
import com.oscar.opm.model.OPMLink;
import com.oscar.opm.model.OPMLinkRouterKind;
import com.oscar.opm.model.OPMNode;
import com.oscar.opm.model.OPMObject;
import com.oscar.opm.model.OPMObjectProcessDiagram;
import com.oscar.opm.model.OPMPackage;
import com.oscar.opm.model.OPMProceduralLink;
import com.oscar.opm.model.OPMProceduralLinkKind;
import com.oscar.opm.model.OPMProcess;
import com.oscar.opm.model.OPMStructuralLinkAggregator;
import com.oscar.opm.model.OPMStructuralLinkAggregatorKind;
import com.oscar.opm.model.OPMThing;

import com.oscar.opm.model.OscarCode;
import java.io.File;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OPMPackageImpl extends EPackageImpl implements OPMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmObjectProcessDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmStructuralLinkAggregatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmProceduralLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscarCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum opmStructuralLinkAggregatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum opmProceduralLinkKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum opmLinkRouterKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

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
	 * @see com.oscar.opm.model.OPMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OPMPackageImpl() {
		super(eNS_URI, OPMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OPMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OPMPackage init() {
		if (isInited) return (OPMPackage)EPackage.Registry.INSTANCE.getEPackage(OPMPackage.eNS_URI);

		// Obtain or create and register package
		OPMPackageImpl theOPMPackage = (OPMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OPMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OPMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOPMPackage.createPackageContents();

		// Initialize created meta-data
		theOPMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOPMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OPMPackage.eNS_URI, theOPMPackage);
		return theOPMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMContainer() {
		return opmContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMContainer_Nodes() {
		return (EReference)opmContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMObjectProcessDiagram() {
		return opmObjectProcessDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMObjectProcessDiagram_Links() {
		return (EReference)opmObjectProcessDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMObject() {
		return opmObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMProcess() {
		return opmProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMLink() {
		return opmLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMLink_Opd() {
		return (EReference)opmLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMLink_Source() {
		return (EReference)opmLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMLink_Target() {
		return (EReference)opmLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMLink_Bendpoints() {
		return (EAttribute)opmLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMLink_RouterKind() {
		return (EAttribute)opmLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMThing() {
		return opmThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMThing_Name() {
		return (EAttribute)opmThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMThing_Description() {
		return (EAttribute)opmThingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMStructuralLinkAggregator() {
		return opmStructuralLinkAggregatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMStructuralLinkAggregator_Kind() {
		return (EAttribute)opmStructuralLinkAggregatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMProceduralLink() {
		return opmProceduralLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMProceduralLink_Kind() {
		return (EAttribute)opmProceduralLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscarCode() {
		return oscarCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscarCode_Codefile() {
		return (EAttribute)oscarCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMNode() {
		return opmNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMNode_Constraints() {
		return (EAttribute)opmNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMNode_IncomingLinks() {
		return (EReference)opmNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMNode_OutgoingLinks() {
		return (EReference)opmNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMNode_Container() {
		return (EReference)opmNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOPMNode__GetOutgoingStructuralLinks() {
		return opmNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOPMNode__GetIncomingStructuralLinks() {
		return opmNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOPMNode__GetOpd() {
		return opmNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOPMStructuralLinkAggregatorKind() {
		return opmStructuralLinkAggregatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOPMProceduralLinkKind() {
		return opmProceduralLinkKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOPMLinkRouterKind() {
		return opmLinkRouterKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMFactory getOPMFactory() {
		return (OPMFactory)getEFactoryInstance();
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
		opmContainerEClass = createEClass(OPM_CONTAINER);
		createEReference(opmContainerEClass, OPM_CONTAINER__NODES);

		opmObjectProcessDiagramEClass = createEClass(OPM_OBJECT_PROCESS_DIAGRAM);
		createEReference(opmObjectProcessDiagramEClass, OPM_OBJECT_PROCESS_DIAGRAM__LINKS);

		opmNodeEClass = createEClass(OPM_NODE);
		createEReference(opmNodeEClass, OPM_NODE__INCOMING_LINKS);
		createEReference(opmNodeEClass, OPM_NODE__OUTGOING_LINKS);
		createEReference(opmNodeEClass, OPM_NODE__CONTAINER);
		createEAttribute(opmNodeEClass, OPM_NODE__CONSTRAINTS);
		createEOperation(opmNodeEClass, OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS);
		createEOperation(opmNodeEClass, OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS);
		createEOperation(opmNodeEClass, OPM_NODE___GET_OPD);

		opmThingEClass = createEClass(OPM_THING);
		createEAttribute(opmThingEClass, OPM_THING__NAME);
		createEAttribute(opmThingEClass, OPM_THING__DESCRIPTION);

		opmObjectEClass = createEClass(OPM_OBJECT);

		opmProcessEClass = createEClass(OPM_PROCESS);

		opmStructuralLinkAggregatorEClass = createEClass(OPM_STRUCTURAL_LINK_AGGREGATOR);
		createEAttribute(opmStructuralLinkAggregatorEClass, OPM_STRUCTURAL_LINK_AGGREGATOR__KIND);

		opmLinkEClass = createEClass(OPM_LINK);
		createEReference(opmLinkEClass, OPM_LINK__OPD);
		createEReference(opmLinkEClass, OPM_LINK__SOURCE);
		createEReference(opmLinkEClass, OPM_LINK__TARGET);
		createEAttribute(opmLinkEClass, OPM_LINK__BENDPOINTS);
		createEAttribute(opmLinkEClass, OPM_LINK__ROUTER_KIND);

		opmProceduralLinkEClass = createEClass(OPM_PROCEDURAL_LINK);
		createEAttribute(opmProceduralLinkEClass, OPM_PROCEDURAL_LINK__KIND);

		oscarCodeEClass = createEClass(OSCAR_CODE);
		createEAttribute(oscarCodeEClass, OSCAR_CODE__CODEFILE);

		// Create enums
		opmStructuralLinkAggregatorKindEEnum = createEEnum(OPM_STRUCTURAL_LINK_AGGREGATOR_KIND);
		opmProceduralLinkKindEEnum = createEEnum(OPM_PROCEDURAL_LINK_KIND);
		opmLinkRouterKindEEnum = createEEnum(OPM_LINK_ROUTER_KIND);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
		fileEDataType = createEDataType(FILE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		opmObjectProcessDiagramEClass.getESuperTypes().add(this.getOPMContainer());
		opmNodeEClass.getESuperTypes().add(this.getOPMContainer());
		opmThingEClass.getESuperTypes().add(this.getOPMNode());
		opmObjectEClass.getESuperTypes().add(this.getOPMThing());
		opmProcessEClass.getESuperTypes().add(this.getOPMThing());
		opmStructuralLinkAggregatorEClass.getESuperTypes().add(this.getOPMNode());
		opmProceduralLinkEClass.getESuperTypes().add(this.getOPMLink());
		oscarCodeEClass.getESuperTypes().add(this.getOPMObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(opmContainerEClass, OPMContainer.class, "OPMContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMContainer_Nodes(), this.getOPMNode(), this.getOPMNode_Container(), "nodes", null, 0, -1, OPMContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmObjectProcessDiagramEClass, OPMObjectProcessDiagram.class, "OPMObjectProcessDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMObjectProcessDiagram_Links(), this.getOPMLink(), this.getOPMLink_Opd(), "links", null, 0, -1, OPMObjectProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmNodeEClass, OPMNode.class, "OPMNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMNode_IncomingLinks(), this.getOPMLink(), this.getOPMLink_Target(), "incomingLinks", null, 0, -1, OPMNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMNode_OutgoingLinks(), this.getOPMLink(), this.getOPMLink_Source(), "outgoingLinks", null, 0, -1, OPMNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMNode_Container(), this.getOPMContainer(), this.getOPMContainer_Nodes(), "container", null, 0, 1, OPMNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMNode_Constraints(), this.getRectangle(), "constraints", "0,0,50,50", 0, 1, OPMNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOPMNode__GetOutgoingStructuralLinks(), this.getOPMLink(), "getOutgoingStructuralLinks", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOPMNode__GetIncomingStructuralLinks(), this.getOPMLink(), "getIncomingStructuralLinks", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOPMNode__GetOpd(), this.getOPMObjectProcessDiagram(), "getOpd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(opmThingEClass, OPMThing.class, "OPMThing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMThing_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, OPMThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMThing_Description(), ecorePackage.getEString(), "description", "", 0, 1, OPMThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmObjectEClass, OPMObject.class, "OPMObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmProcessEClass, OPMProcess.class, "OPMProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmStructuralLinkAggregatorEClass, OPMStructuralLinkAggregator.class, "OPMStructuralLinkAggregator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMStructuralLinkAggregator_Kind(), this.getOPMStructuralLinkAggregatorKind(), "kind", null, 0, 1, OPMStructuralLinkAggregator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmLinkEClass, OPMLink.class, "OPMLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMLink_Opd(), this.getOPMObjectProcessDiagram(), this.getOPMObjectProcessDiagram_Links(), "opd", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMLink_Source(), this.getOPMNode(), this.getOPMNode_OutgoingLinks(), "source", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMLink_Target(), this.getOPMNode(), this.getOPMNode_IncomingLinks(), "target", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMLink_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMLink_RouterKind(), this.getOPMLinkRouterKind(), "routerKind", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmProceduralLinkEClass, OPMProceduralLink.class, "OPMProceduralLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMProceduralLink_Kind(), this.getOPMProceduralLinkKind(), "kind", null, 0, 1, OPMProceduralLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oscarCodeEClass, OscarCode.class, "OscarCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOscarCode_Codefile(), this.getFile(), "codefile", ".default.txt", 0, 1, OscarCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(opmStructuralLinkAggregatorKindEEnum, OPMStructuralLinkAggregatorKind.class, "OPMStructuralLinkAggregatorKind");
		addEEnumLiteral(opmStructuralLinkAggregatorKindEEnum, OPMStructuralLinkAggregatorKind.AGGREGATION);
		addEEnumLiteral(opmStructuralLinkAggregatorKindEEnum, OPMStructuralLinkAggregatorKind.EXHIBITION);
		addEEnumLiteral(opmStructuralLinkAggregatorKindEEnum, OPMStructuralLinkAggregatorKind.GENERALIZATION);

		initEEnum(opmProceduralLinkKindEEnum, OPMProceduralLinkKind.class, "OPMProceduralLinkKind");
		addEEnumLiteral(opmProceduralLinkKindEEnum, OPMProceduralLinkKind.AGENT);
		addEEnumLiteral(opmProceduralLinkKindEEnum, OPMProceduralLinkKind.INSTRUMENT);
		addEEnumLiteral(opmProceduralLinkKindEEnum, OPMProceduralLinkKind.CONSUMPTION);
		addEEnumLiteral(opmProceduralLinkKindEEnum, OPMProceduralLinkKind.EFFECT);
		addEEnumLiteral(opmProceduralLinkKindEEnum, OPMProceduralLinkKind.RESULT);

		initEEnum(opmLinkRouterKindEEnum, OPMLinkRouterKind.class, "OPMLinkRouterKind");
		addEEnumLiteral(opmLinkRouterKindEEnum, OPMLinkRouterKind.BENDPOINT);
		addEEnumLiteral(opmLinkRouterKindEEnum, OPMLinkRouterKind.MANHATTAN);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OPMPackageImpl
