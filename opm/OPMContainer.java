/**
 */
package opm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPM Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link opm.OPMContainer#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see opm.OpmPackage#getOPMContainer()
 * @model
 * @generated
 */
public interface OPMContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link opm.OPMNode}.
	 * It is bidirectional and its opposite is '{@link opm.OPMNode#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see opm.OpmPackage#getOPMContainer_Nodes()
	 * @see opm.OPMNode#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<OPMNode> getNodes();

} // OPMContainer
