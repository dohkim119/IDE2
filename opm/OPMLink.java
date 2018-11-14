/**
 */
package opm;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPM Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link opm.OPMLink#getOpd <em>Opd</em>}</li>
 *   <li>{@link opm.OPMLink#getSource <em>Source</em>}</li>
 *   <li>{@link opm.OPMLink#getTarget <em>Target</em>}</li>
 *   <li>{@link opm.OPMLink#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link opm.OPMLink#getRouterKind <em>Router Kind</em>}</li>
 * </ul>
 *
 * @see opm.OpmPackage#getOPMLink()
 * @model
 * @generated
 */
public interface OPMLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Opd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link opm.OPMObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opd</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opd</em>' container reference.
	 * @see #setOpd(OPMObjectProcessDiagram)
	 * @see opm.OpmPackage#getOPMLink_Opd()
	 * @see opm.OPMObjectProcessDiagram#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	OPMObjectProcessDiagram getOpd();

	/**
	 * Sets the value of the '{@link opm.OPMLink#getOpd <em>Opd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opd</em>' container reference.
	 * @see #getOpd()
	 * @generated
	 */
	void setOpd(OPMObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link opm.OPMNode#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OPMNode)
	 * @see opm.OpmPackage#getOPMLink_Source()
	 * @see opm.OPMNode#getOutgoingLinks
	 * @model opposite="outgoingLinks"
	 * @generated
	 */
	OPMNode getSource();

	/**
	 * Sets the value of the '{@link opm.OPMLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OPMNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link opm.OPMNode#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OPMNode)
	 * @see opm.OpmPackage#getOPMLink_Target()
	 * @see opm.OPMNode#getIncomingLinks
	 * @model opposite="incomingLinks"
	 * @generated
	 */
	OPMNode getTarget();

	/**
	 * Sets the value of the '{@link opm.OPMLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OPMNode value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see opm.OpmPackage#getOPMLink_Bendpoints()
	 * @model dataType="opm.Point"
	 * @generated
	 */
	EList<Point> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Router Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link opm.OPMLinkRouterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Kind</em>' attribute.
	 * @see opm.OPMLinkRouterKind
	 * @see #setRouterKind(OPMLinkRouterKind)
	 * @see opm.OpmPackage#getOPMLink_RouterKind()
	 * @model
	 * @generated
	 */
	OPMLinkRouterKind getRouterKind();

	/**
	 * Sets the value of the '{@link opm.OPMLink#getRouterKind <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Kind</em>' attribute.
	 * @see opm.OPMLinkRouterKind
	 * @see #getRouterKind()
	 * @generated
	 */
	void setRouterKind(OPMLinkRouterKind value);

} // OPMLink
