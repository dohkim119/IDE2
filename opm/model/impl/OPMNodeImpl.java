/**
 */
package com.oscar.opm.model.impl;

import com.oscar.opm.model.OPMContainer;
import com.oscar.opm.model.OPMFactory;
import com.oscar.opm.model.OPMLink;
import com.oscar.opm.model.OPMNode;
import com.oscar.opm.model.OPMObjectProcessDiagram;
import com.oscar.opm.model.OPMPackage;
import com.oscar.opm.model.OPMStructuralLinkAggregator;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.oscar.opm.model.impl.OPMNodeImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.oscar.opm.model.impl.OPMNodeImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.oscar.opm.model.impl.OPMNodeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.oscar.opm.model.impl.OPMNodeImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OPMNodeImpl extends OPMContainerImpl implements OPMNode {
	/**
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMLink> incomingLinks;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMLink> outgoingLinks;

	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = (Rectangle)OPMFactory.eINSTANCE.createFromString(OPMPackage.eINSTANCE.getRectangle(), "0,0,50,50");

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPMPackage.Literals.OPM_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_NODE__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
     * <!-- begin-user-doc -->
     * Finds the container {@link OPMObjectProcessDiagram} by going up in the 
     * {@link OPMContainer} hierarchy until it is found.
     * @return the containing {@link OPMObjectProcessDiagram}, which is the topmost {@link OPMContainer}
     * in the container hierarchy.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public OPMObjectProcessDiagram getOpd() {
        OPMContainer currentContainer = getContainer();
        while(!(currentContainer instanceof OPMObjectProcessDiagram)) {
            // the container must be a node.
            OPMNode containerNode = (OPMNode) getContainer();
            currentContainer = containerNode.getContainer();
        }

        return (OPMObjectProcessDiagram) currentContainer;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMLink> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectWithInverseResolvingEList<OPMLink>(OPMLink.class, this, OPMPackage.OPM_NODE__INCOMING_LINKS, OPMPackage.OPM_LINK__TARGET);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMLink> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectWithInverseResolvingEList<OPMLink>(OPMLink.class, this, OPMPackage.OPM_NODE__OUTGOING_LINKS, OPMPackage.OPM_LINK__SOURCE);
		}
		return outgoingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMContainer getContainer() {
		if (eContainerFeatureID() != OPMPackage.OPM_NODE__CONTAINER) return null;
		return (OPMContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(OPMContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, OPMPackage.OPM_NODE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(OPMContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != OPMPackage.OPM_NODE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, OPMPackage.OPM_CONTAINER__NODES, OPMContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_NODE__CONTAINER, newContainer, newContainer));
	}

	/**
     * <!-- begin-user-doc -->
     * Return a list of outgoing links that start at this node and end
     * in a {@link OPMStructuralLinkAggregator}.
     * The current implementation calculates this list by calling 
     * {@link OPMNodeImpl#getOutgoingLinks()} and filtering the result.
     * <!-- end-user-doc -->
     * @generated NOT
     */
	public EList<OPMLink> getOutgoingStructuralLinks() {
		EList<OPMLink> outgoingStructuralLinks = new BasicEList<OPMLink>();
		for(OPMLink link : getOutgoingLinks()) {
			if(link.getTarget() instanceof OPMStructuralLinkAggregator) {
				outgoingStructuralLinks.add(link);
			}
		}
		return outgoingStructuralLinks;
	}

	/**
     * <!-- begin-user-doc -->
     * Return a list of incoming links that start at a {@link OPMStructuralLinkAggregator} 
     * and end at this node.
     * The current implementation calculates this list by calling 
     * {@link OPMNodeImpl#getIncomingLinks()} and filtering the results.
     * <!-- end-user-doc -->
     * @generated NOT
     */
	public EList<OPMLink> getIncomingStructuralLinks() {
		EList<OPMLink> incomingStructuralLinks = new BasicEList<OPMLink>();
		for(OPMLink link : getIncomingLinks()) {
			if(link.getSource() instanceof OPMStructuralLinkAggregator) {
				incomingStructuralLinks.add(link);
			}
		}
		return incomingStructuralLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
			case OPMPackage.OPM_NODE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((OPMContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case OPMPackage.OPM_NODE__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OPMPackage.OPM_NODE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, OPMPackage.OPM_CONTAINER__NODES, OPMContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				return getIncomingLinks();
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				return getOutgoingLinks();
			case OPMPackage.OPM_NODE__CONTAINER:
				return getContainer();
			case OPMPackage.OPM_NODE__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends OPMLink>)newValue);
				return;
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends OPMLink>)newValue);
				return;
			case OPMPackage.OPM_NODE__CONTAINER:
				setContainer((OPMContainer)newValue);
				return;
			case OPMPackage.OPM_NODE__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case OPMPackage.OPM_NODE__CONTAINER:
				setContainer((OPMContainer)null);
				return;
			case OPMPackage.OPM_NODE__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OPMPackage.OPM_NODE__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case OPMPackage.OPM_NODE__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
			case OPMPackage.OPM_NODE__CONTAINER:
				return getContainer() != null;
			case OPMPackage.OPM_NODE__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OPMPackage.OPM_NODE___GET_OUTGOING_STRUCTURAL_LINKS:
				return getOutgoingStructuralLinks();
			case OPMPackage.OPM_NODE___GET_INCOMING_STRUCTURAL_LINKS:
				return getIncomingStructuralLinks();
			case OPMPackage.OPM_NODE___GET_OPD:
				return getOpd();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //OPMNodeImpl
