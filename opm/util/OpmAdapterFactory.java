/**
 */
package opm.util;

import opm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see opm.OpmPackage
 * @generated
 */
public class OpmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpmSwitch<Adapter> modelSwitch =
		new OpmSwitch<Adapter>() {
			@Override
			public Adapter caseOPMContainer(OPMContainer object) {
				return createOPMContainerAdapter();
			}
			@Override
			public Adapter caseOPMObjectProcessDiagram(OPMObjectProcessDiagram object) {
				return createOPMObjectProcessDiagramAdapter();
			}
			@Override
			public Adapter caseOPMNode(OPMNode object) {
				return createOPMNodeAdapter();
			}
			@Override
			public Adapter caseOPMThing(OPMThing object) {
				return createOPMThingAdapter();
			}
			@Override
			public Adapter caseOPMObject(OPMObject object) {
				return createOPMObjectAdapter();
			}
			@Override
			public Adapter caseOPMProcess(OPMProcess object) {
				return createOPMProcessAdapter();
			}
			@Override
			public Adapter caseOPMLink(OPMLink object) {
				return createOPMLinkAdapter();
			}
			@Override
			public Adapter caseOPMProceduralLink(OPMProceduralLink object) {
				return createOPMProceduralLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link opm.OPMContainer <em>OPM Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see opm.OPMContainer
	 * @generated
	 */
	public Adapter createOPMContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link opm.OPMObjectProcessDiagram <em>OPM Object Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see opm.OPMObjectProcessDiagram
	 * @generated
	 */
	public Adapter createOPMObjectProcessDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link opm.OPMNode <em>OPM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see opm.OPMNode
	 * @generated
	 */
	public Adapter createOPMNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link opm.OPMThing <em>OPM Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see opm.OPMThing
	 * @generated
	 */
	public Adapter createOPMThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link opm.OPMObject <em>OPM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see opm.OPMObject
	 * @generated
	 */
	public Adapter createOPMObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link opm.OPMProcess <em>OPM Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see opm.OPMProcess
	 * @generated
	 */
	public Adapter createOPMProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link opm.OPMLink <em>OPM Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see opm.OPMLink
	 * @generated
	 */
	public Adapter createOPMLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link opm.OPMProceduralLink <em>OPM Procedural Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see opm.OPMProceduralLink
	 * @generated
	 */
	public Adapter createOPMProceduralLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OpmAdapterFactory
