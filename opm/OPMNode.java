/**
 */
package opm;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPM Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link opm.OPMNode#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link opm.OPMNode#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link opm.OPMNode#getContainer <em>Container</em>}</li>
 *   <li>{@link opm.OPMNode#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see opm.OpmPackage#getOPMNode()
 * @model
 * @generated
 */
public interface OPMNode extends OPMContainer {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link opm.OPMLink}.
	 * It is bidirectional and its opposite is '{@link opm.OPMLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see opm.OpmPackage#getOPMNode_IncomingLinks()
	 * @see opm.OPMLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<OPMLink> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link opm.OPMLink}.
	 * It is bidirectional and its opposite is '{@link opm.OPMLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see opm.OpmPackage#getOPMNode_OutgoingLinks()
	 * @see opm.OPMLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<OPMLink> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link opm.OPMContainer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OPMContainer)
	 * @see opm.OpmPackage#getOPMNode_Container()
	 * @see opm.OPMContainer#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	OPMContainer getContainer();

	/**
	 * Sets the value of the '{@link opm.OPMNode#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OPMContainer value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * The default value is <code>"0,0,50,50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see opm.OpmPackage#getOPMNode_Constraints()
	 * @model default="0,0,50,50" dataType="opm.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link opm.OPMNode#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<OPMLink> getOutgoingStructuralLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<OPMLink> getIncomingStructuralLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OPMObjectProcessDiagram getOpd();

} // OPMNode
