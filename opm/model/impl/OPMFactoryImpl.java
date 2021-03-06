/**
 */
package com.oscar.opm.model.impl;

import com.oscar.opm.model.*;

import java.io.File;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OPMFactoryImpl extends EFactoryImpl implements OPMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OPMFactory init() {
		try {
			OPMFactory theOPMFactory = (OPMFactory)EPackage.Registry.INSTANCE.getEFactory(OPMPackage.eNS_URI);
			if (theOPMFactory != null) {
				return theOPMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OPMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMFactoryImpl() {
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
			case OPMPackage.OPM_CONTAINER: return createOPMContainer();
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM: return createOPMObjectProcessDiagram();
			case OPMPackage.OPM_NODE: return createOPMNode();
			case OPMPackage.OPM_THING: return createOPMThing();
			case OPMPackage.OPM_OBJECT: return createOPMObject();
			case OPMPackage.OPM_PROCESS: return createOPMProcess();
			case OPMPackage.OPM_STRUCTURAL_LINK_AGGREGATOR: return createOPMStructuralLinkAggregator();
			case OPMPackage.OPM_LINK: return createOPMLink();
			case OPMPackage.OPM_PROCEDURAL_LINK: return createOPMProceduralLink();
			case OPMPackage.OSCAR_CODE: return createOscarCode();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OPMPackage.OPM_STRUCTURAL_LINK_AGGREGATOR_KIND:
				return createOPMStructuralLinkAggregatorKindFromString(eDataType, initialValue);
			case OPMPackage.OPM_PROCEDURAL_LINK_KIND:
				return createOPMProceduralLinkKindFromString(eDataType, initialValue);
			case OPMPackage.OPM_LINK_ROUTER_KIND:
				return createOPMLinkRouterKindFromString(eDataType, initialValue);
			case OPMPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case OPMPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case OPMPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OPMPackage.OPM_STRUCTURAL_LINK_AGGREGATOR_KIND:
				return convertOPMStructuralLinkAggregatorKindToString(eDataType, instanceValue);
			case OPMPackage.OPM_PROCEDURAL_LINK_KIND:
				return convertOPMProceduralLinkKindToString(eDataType, instanceValue);
			case OPMPackage.OPM_LINK_ROUTER_KIND:
				return convertOPMLinkRouterKindToString(eDataType, instanceValue);
			case OPMPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case OPMPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case OPMPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMContainer createOPMContainer() {
		OPMContainerImpl opmContainer = new OPMContainerImpl();
		return opmContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObjectProcessDiagram createOPMObjectProcessDiagram() {
		OPMObjectProcessDiagramImpl opmObjectProcessDiagram = new OPMObjectProcessDiagramImpl();
		return opmObjectProcessDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObject createOPMObject() {
		OPMObjectImpl opmObject = new OPMObjectImpl();
		return opmObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMProcess createOPMProcess() {
		OPMProcessImpl opmProcess = new OPMProcessImpl();
		return opmProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMLink createOPMLink() {
		OPMLinkImpl opmLink = new OPMLinkImpl();
		return opmLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMThing createOPMThing() {
		OPMThingImpl opmThing = new OPMThingImpl();
		return opmThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMStructuralLinkAggregator createOPMStructuralLinkAggregator() {
		OPMStructuralLinkAggregatorImpl opmStructuralLinkAggregator = new OPMStructuralLinkAggregatorImpl();
		return opmStructuralLinkAggregator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMProceduralLink createOPMProceduralLink() {
		OPMProceduralLinkImpl opmProceduralLink = new OPMProceduralLinkImpl();
		return opmProceduralLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscarCode createOscarCode() {
		OscarCodeImpl oscarCode = new OscarCodeImpl();
		return oscarCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMNode createOPMNode() {
		OPMNodeImpl opmNode = new OPMNodeImpl();
		return opmNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMStructuralLinkAggregatorKind createOPMStructuralLinkAggregatorKindFromString(EDataType eDataType, String initialValue) {
		OPMStructuralLinkAggregatorKind result = OPMStructuralLinkAggregatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOPMStructuralLinkAggregatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMProceduralLinkKind createOPMProceduralLinkKindFromString(EDataType eDataType, String initialValue) {
		OPMProceduralLinkKind result = OPMProceduralLinkKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOPMProceduralLinkKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMLinkRouterKind createOPMLinkRouterKindFromString(EDataType eDataType, String initialValue) {
		OPMLinkRouterKind result = OPMLinkRouterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOPMLinkRouterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if(values.length != 4) {
			return null;
		}
		
		Rectangle rect = new Rectangle();
		try {
			rect.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
			rect.setSize(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
		} catch (NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			rect = null;
		}
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null) {
		    return null;
		  }
		  Rectangle rect = (Rectangle) instanceValue;
		  return rect.x+","+rect.y+","+rect.width+","+rect.height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if(values.length != 2) {
			return null;
		}
		return new Point(Integer.parseInt(values[0]),Integer.parseInt(values[1]));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null){
			return null;
		}
		Point point = (Point) instanceValue;
		return point.x + "," + point.y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return new File(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return ((File) instanceValue).getAbsolutePath();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMPackage getOPMPackage() {
		return (OPMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OPMPackage getPackage() {
		return OPMPackage.eINSTANCE;
	}

} //OPMFactoryImpl
