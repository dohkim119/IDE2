/**
 */
package opm.impl;

import opm.*;

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
public class OpmFactoryImpl extends EFactoryImpl implements OpmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpmFactory init() {
		try {
			OpmFactory theOpmFactory = (OpmFactory)EPackage.Registry.INSTANCE.getEFactory(OpmPackage.eNS_URI);
			if (theOpmFactory != null) {
				return theOpmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpmFactoryImpl() {
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
			case OpmPackage.OPM_CONTAINER: return createOPMContainer();
			case OpmPackage.OPM_OBJECT_PROCESS_DIAGRAM: return createOPMObjectProcessDiagram();
			case OpmPackage.OPM_NODE: return createOPMNode();
			case OpmPackage.OPM_THING: return createOPMThing();
			case OpmPackage.OPM_OBJECT: return createOPMObject();
			case OpmPackage.OPM_PROCESS: return createOPMProcess();
			case OpmPackage.OPM_LINK: return createOPMLink();
			case OpmPackage.OPM_PROCEDURAL_LINK: return createOPMProceduralLink();
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
			case OpmPackage.OPM_PROCEDURAL_LINK_KIND:
				return createOPMProceduralLinkKindFromString(eDataType, initialValue);
			case OpmPackage.OPM_LINK_ROUTER_KIND:
				return createOPMLinkRouterKindFromString(eDataType, initialValue);
			case OpmPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case OpmPackage.POINT:
				return createPointFromString(eDataType, initialValue);
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
			case OpmPackage.OPM_PROCEDURAL_LINK_KIND:
				return convertOPMProceduralLinkKindToString(eDataType, instanceValue);
			case OpmPackage.OPM_LINK_ROUTER_KIND:
				return convertOPMLinkRouterKindToString(eDataType, instanceValue);
			case OpmPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case OpmPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
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
	public OPMNode createOPMNode() {
		OPMNodeImpl opmNode = new OPMNodeImpl();
		return opmNode;
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
	public OPMProceduralLink createOPMProceduralLink() {
		OPMProceduralLinkImpl opmProceduralLink = new OPMProceduralLinkImpl();
		return opmProceduralLink;
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
	 * @generated
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
	 * @generated
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
	 * @generated
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
	 * @generated
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
	 * @generated
	 */
	public OpmPackage getOpmPackage() {
		return (OpmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpmPackage getPackage() {
		return OpmPackage.eINSTANCE;
	}

} //OpmFactoryImpl
