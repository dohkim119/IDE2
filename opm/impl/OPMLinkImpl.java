/**
 */
package opm.impl;

import java.util.Collection;

import opm.OPMLink;
import opm.OPMLinkRouterKind;
import opm.OPMNode;
import opm.OPMObjectProcessDiagram;
import opm.OpmPackage;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OPM Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link opm.impl.OPMLinkImpl#getOpd <em>Opd</em>}</li>
 *   <li>{@link opm.impl.OPMLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link opm.impl.OPMLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link opm.impl.OPMLinkImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link opm.impl.OPMLinkImpl#getRouterKind <em>Router Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OPMLinkImpl extends EObjectImpl implements OPMLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OPMNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected OPMNode target;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> bendpoints;

	/**
	 * The default value of the '{@link #getRouterKind() <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterKind()
	 * @generated
	 * @ordered
	 */
	protected static final OPMLinkRouterKind ROUTER_KIND_EDEFAULT = OPMLinkRouterKind.BENDPOINT;

	/**
	 * The cached value of the '{@link #getRouterKind() <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterKind()
	 * @generated
	 * @ordered
	 */
	protected OPMLinkRouterKind routerKind = ROUTER_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpmPackage.Literals.OPM_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObjectProcessDiagram getOpd() {
		if (eContainerFeatureID() != OpmPackage.OPM_LINK__OPD) return null;
		return (OPMObjectProcessDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpd(OPMObjectProcessDiagram newOpd, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOpd, OpmPackage.OPM_LINK__OPD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpd(OPMObjectProcessDiagram newOpd) {
		if (newOpd != eInternalContainer() || (eContainerFeatureID() != OpmPackage.OPM_LINK__OPD && newOpd != null)) {
			if (EcoreUtil.isAncestor(this, newOpd))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOpd != null)
				msgs = ((InternalEObject)newOpd).eInverseAdd(this, OpmPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS, OPMObjectProcessDiagram.class, msgs);
			msgs = basicSetOpd(newOpd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpmPackage.OPM_LINK__OPD, newOpd, newOpd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OPMNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpmPackage.OPM_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OPMNode newSource, NotificationChain msgs) {
		OPMNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpmPackage.OPM_LINK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OPMNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, OpmPackage.OPM_NODE__OUTGOING_LINKS, OPMNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, OpmPackage.OPM_NODE__OUTGOING_LINKS, OPMNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpmPackage.OPM_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (OPMNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpmPackage.OPM_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(OPMNode newTarget, NotificationChain msgs) {
		OPMNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpmPackage.OPM_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(OPMNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, OpmPackage.OPM_NODE__INCOMING_LINKS, OPMNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, OpmPackage.OPM_NODE__INCOMING_LINKS, OPMNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpmPackage.OPM_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, OpmPackage.OPM_LINK__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMLinkRouterKind getRouterKind() {
		return routerKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouterKind(OPMLinkRouterKind newRouterKind) {
		OPMLinkRouterKind oldRouterKind = routerKind;
		routerKind = newRouterKind == null ? ROUTER_KIND_EDEFAULT : newRouterKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpmPackage.OPM_LINK__ROUTER_KIND, oldRouterKind, routerKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpmPackage.OPM_LINK__OPD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOpd((OPMObjectProcessDiagram)otherEnd, msgs);
			case OpmPackage.OPM_LINK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, OpmPackage.OPM_NODE__OUTGOING_LINKS, OPMNode.class, msgs);
				return basicSetSource((OPMNode)otherEnd, msgs);
			case OpmPackage.OPM_LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OpmPackage.OPM_NODE__INCOMING_LINKS, OPMNode.class, msgs);
				return basicSetTarget((OPMNode)otherEnd, msgs);
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
			case OpmPackage.OPM_LINK__OPD:
				return basicSetOpd(null, msgs);
			case OpmPackage.OPM_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case OpmPackage.OPM_LINK__TARGET:
				return basicSetTarget(null, msgs);
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
			case OpmPackage.OPM_LINK__OPD:
				return eInternalContainer().eInverseRemove(this, OpmPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS, OPMObjectProcessDiagram.class, msgs);
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
			case OpmPackage.OPM_LINK__OPD:
				return getOpd();
			case OpmPackage.OPM_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OpmPackage.OPM_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OpmPackage.OPM_LINK__BENDPOINTS:
				return getBendpoints();
			case OpmPackage.OPM_LINK__ROUTER_KIND:
				return getRouterKind();
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
			case OpmPackage.OPM_LINK__OPD:
				setOpd((OPMObjectProcessDiagram)newValue);
				return;
			case OpmPackage.OPM_LINK__SOURCE:
				setSource((OPMNode)newValue);
				return;
			case OpmPackage.OPM_LINK__TARGET:
				setTarget((OPMNode)newValue);
				return;
			case OpmPackage.OPM_LINK__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
				return;
			case OpmPackage.OPM_LINK__ROUTER_KIND:
				setRouterKind((OPMLinkRouterKind)newValue);
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
			case OpmPackage.OPM_LINK__OPD:
				setOpd((OPMObjectProcessDiagram)null);
				return;
			case OpmPackage.OPM_LINK__SOURCE:
				setSource((OPMNode)null);
				return;
			case OpmPackage.OPM_LINK__TARGET:
				setTarget((OPMNode)null);
				return;
			case OpmPackage.OPM_LINK__BENDPOINTS:
				getBendpoints().clear();
				return;
			case OpmPackage.OPM_LINK__ROUTER_KIND:
				setRouterKind(ROUTER_KIND_EDEFAULT);
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
			case OpmPackage.OPM_LINK__OPD:
				return getOpd() != null;
			case OpmPackage.OPM_LINK__SOURCE:
				return source != null;
			case OpmPackage.OPM_LINK__TARGET:
				return target != null;
			case OpmPackage.OPM_LINK__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case OpmPackage.OPM_LINK__ROUTER_KIND:
				return routerKind != ROUTER_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (bendpoints: ");
		result.append(bendpoints);
		result.append(", routerKind: ");
		result.append(routerKind);
		result.append(')');
		return result.toString();
	}

} //OPMLinkImpl
