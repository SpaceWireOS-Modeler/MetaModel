/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.impl;

import java.util.Collection;

import jp.pizzafactory.model.spacewireos.networkTopology.FDIR;
import jp.pizzafactory.model.spacewireos.networkTopology.Link;
import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage;
import jp.pizzafactory.model.spacewireos.networkTopology.Node;
import jp.pizzafactory.model.spacewireos.networkTopology.Router;
import jp.pizzafactory.model.spacewireos.networkTopology.Subnet;
import jp.pizzafactory.model.spacewireos.networkTopology.Timeslot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl#getFDIR <em>FDIR</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl#getTimeslot <em>Timeslot</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl#getRouter <em>Router</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl#getNode <em>Node</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubnetImpl extends MinimalEObjectImpl.Container implements Subnet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getFDIR() <em>FDIR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFDIR()
	 * @generated
	 * @ordered
	 */
	protected FDIR fDIR;

	/**
	 * The cached value of the '{@link #getTimeslot() <em>Timeslot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeslot()
	 * @generated
	 * @ordered
	 */
	protected Timeslot timeslot;

	/**
	 * The cached value of the '{@link #getRouter() <em>Router</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouter()
	 * @generated
	 * @ordered
	 */
	protected EList<Router> router;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkTopologyPackage.Literals.SUBNET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FDIR getFDIR() {
		return fDIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFDIR(FDIR newFDIR, NotificationChain msgs) {
		FDIR oldFDIR = fDIR;
		fDIR = newFDIR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.SUBNET__FDIR, oldFDIR, newFDIR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFDIR(FDIR newFDIR) {
		if (newFDIR != fDIR) {
			NotificationChain msgs = null;
			if (fDIR != null)
				msgs = ((InternalEObject)fDIR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkTopologyPackage.SUBNET__FDIR, null, msgs);
			if (newFDIR != null)
				msgs = ((InternalEObject)newFDIR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkTopologyPackage.SUBNET__FDIR, null, msgs);
			msgs = basicSetFDIR(newFDIR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.SUBNET__FDIR, newFDIR, newFDIR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timeslot getTimeslot() {
		return timeslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeslot(Timeslot newTimeslot, NotificationChain msgs) {
		Timeslot oldTimeslot = timeslot;
		timeslot = newTimeslot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.SUBNET__TIMESLOT, oldTimeslot, newTimeslot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeslot(Timeslot newTimeslot) {
		if (newTimeslot != timeslot) {
			NotificationChain msgs = null;
			if (timeslot != null)
				msgs = ((InternalEObject)timeslot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkTopologyPackage.SUBNET__TIMESLOT, null, msgs);
			if (newTimeslot != null)
				msgs = ((InternalEObject)newTimeslot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkTopologyPackage.SUBNET__TIMESLOT, null, msgs);
			msgs = basicSetTimeslot(newTimeslot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.SUBNET__TIMESLOT, newTimeslot, newTimeslot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Router> getRouter() {
		if (router == null) {
			router = new EObjectContainmentEList<Router>(Router.class, this, NetworkTopologyPackage.SUBNET__ROUTER);
		}
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, NetworkTopologyPackage.SUBNET__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, NetworkTopologyPackage.SUBNET__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkTopologyPackage.SUBNET__FDIR:
				return basicSetFDIR(null, msgs);
			case NetworkTopologyPackage.SUBNET__TIMESLOT:
				return basicSetTimeslot(null, msgs);
			case NetworkTopologyPackage.SUBNET__ROUTER:
				return ((InternalEList<?>)getRouter()).basicRemove(otherEnd, msgs);
			case NetworkTopologyPackage.SUBNET__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case NetworkTopologyPackage.SUBNET__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkTopologyPackage.SUBNET__FDIR:
				return getFDIR();
			case NetworkTopologyPackage.SUBNET__TIMESLOT:
				return getTimeslot();
			case NetworkTopologyPackage.SUBNET__ROUTER:
				return getRouter();
			case NetworkTopologyPackage.SUBNET__NODE:
				return getNode();
			case NetworkTopologyPackage.SUBNET__LINK:
				return getLink();
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
			case NetworkTopologyPackage.SUBNET__FDIR:
				setFDIR((FDIR)newValue);
				return;
			case NetworkTopologyPackage.SUBNET__TIMESLOT:
				setTimeslot((Timeslot)newValue);
				return;
			case NetworkTopologyPackage.SUBNET__ROUTER:
				getRouter().clear();
				getRouter().addAll((Collection<? extends Router>)newValue);
				return;
			case NetworkTopologyPackage.SUBNET__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case NetworkTopologyPackage.SUBNET__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
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
			case NetworkTopologyPackage.SUBNET__FDIR:
				setFDIR((FDIR)null);
				return;
			case NetworkTopologyPackage.SUBNET__TIMESLOT:
				setTimeslot((Timeslot)null);
				return;
			case NetworkTopologyPackage.SUBNET__ROUTER:
				getRouter().clear();
				return;
			case NetworkTopologyPackage.SUBNET__NODE:
				getNode().clear();
				return;
			case NetworkTopologyPackage.SUBNET__LINK:
				getLink().clear();
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
			case NetworkTopologyPackage.SUBNET__FDIR:
				return fDIR != null;
			case NetworkTopologyPackage.SUBNET__TIMESLOT:
				return timeslot != null;
			case NetworkTopologyPackage.SUBNET__ROUTER:
				return router != null && !router.isEmpty();
			case NetworkTopologyPackage.SUBNET__NODE:
				return node != null && !node.isEmpty();
			case NetworkTopologyPackage.SUBNET__LINK:
				return link != null && !link.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubnetImpl
