/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.impl;

import jp.pizzafactory.model.spacewireos.networkTopology.Endpoint;
import jp.pizzafactory.model.spacewireos.networkTopology.Link;
import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl#getEndpoint1 <em>Endpoint1</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl#getEndpoint2 <em>Endpoint2</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl#getNetworkPropagationDelay <em>Network Propagation Delay</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getEndpoint1() <em>Endpoint1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint1()
	 * @generated
	 * @ordered
	 */
	protected Endpoint endpoint1;

	/**
	 * The cached value of the '{@link #getEndpoint2() <em>Endpoint2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint2()
	 * @generated
	 * @ordered
	 */
	protected Endpoint endpoint2;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkPropagationDelay() <em>Network Propagation Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPropagationDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int NETWORK_PROPAGATION_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNetworkPropagationDelay() <em>Network Propagation Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPropagationDelay()
	 * @generated
	 * @ordered
	 */
	protected int networkPropagationDelay = NETWORK_PROPAGATION_DELAY_EDEFAULT;

	/**
	 * This is true if the Network Propagation Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean networkPropagationDelayESet;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected int speed = SPEED_EDEFAULT;

	/**
	 * This is true if the Speed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkTopologyPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getEndpoint1() {
		return endpoint1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint1(Endpoint newEndpoint1, NotificationChain msgs) {
		Endpoint oldEndpoint1 = endpoint1;
		endpoint1 = newEndpoint1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.LINK__ENDPOINT1, oldEndpoint1, newEndpoint1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint1(Endpoint newEndpoint1) {
		if (newEndpoint1 != endpoint1) {
			NotificationChain msgs = null;
			if (endpoint1 != null)
				msgs = ((InternalEObject)endpoint1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkTopologyPackage.LINK__ENDPOINT1, null, msgs);
			if (newEndpoint1 != null)
				msgs = ((InternalEObject)newEndpoint1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkTopologyPackage.LINK__ENDPOINT1, null, msgs);
			msgs = basicSetEndpoint1(newEndpoint1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.LINK__ENDPOINT1, newEndpoint1, newEndpoint1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getEndpoint2() {
		return endpoint2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint2(Endpoint newEndpoint2, NotificationChain msgs) {
		Endpoint oldEndpoint2 = endpoint2;
		endpoint2 = newEndpoint2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.LINK__ENDPOINT2, oldEndpoint2, newEndpoint2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint2(Endpoint newEndpoint2) {
		if (newEndpoint2 != endpoint2) {
			NotificationChain msgs = null;
			if (endpoint2 != null)
				msgs = ((InternalEObject)endpoint2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkTopologyPackage.LINK__ENDPOINT2, null, msgs);
			if (newEndpoint2 != null)
				msgs = ((InternalEObject)newEndpoint2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkTopologyPackage.LINK__ENDPOINT2, null, msgs);
			msgs = basicSetEndpoint2(newEndpoint2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.LINK__ENDPOINT2, newEndpoint2, newEndpoint2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNetworkPropagationDelay() {
		return networkPropagationDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkPropagationDelay(int newNetworkPropagationDelay) {
		int oldNetworkPropagationDelay = networkPropagationDelay;
		networkPropagationDelay = newNetworkPropagationDelay;
		boolean oldNetworkPropagationDelayESet = networkPropagationDelayESet;
		networkPropagationDelayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.LINK__NETWORK_PROPAGATION_DELAY, oldNetworkPropagationDelay, networkPropagationDelay, !oldNetworkPropagationDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNetworkPropagationDelay() {
		int oldNetworkPropagationDelay = networkPropagationDelay;
		boolean oldNetworkPropagationDelayESet = networkPropagationDelayESet;
		networkPropagationDelay = NETWORK_PROPAGATION_DELAY_EDEFAULT;
		networkPropagationDelayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NetworkTopologyPackage.LINK__NETWORK_PROPAGATION_DELAY, oldNetworkPropagationDelay, NETWORK_PROPAGATION_DELAY_EDEFAULT, oldNetworkPropagationDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNetworkPropagationDelay() {
		return networkPropagationDelayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(int newSpeed) {
		int oldSpeed = speed;
		speed = newSpeed;
		boolean oldSpeedESet = speedESet;
		speedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.LINK__SPEED, oldSpeed, speed, !oldSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpeed() {
		int oldSpeed = speed;
		boolean oldSpeedESet = speedESet;
		speed = SPEED_EDEFAULT;
		speedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NetworkTopologyPackage.LINK__SPEED, oldSpeed, SPEED_EDEFAULT, oldSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpeed() {
		return speedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkTopologyPackage.LINK__ENDPOINT1:
				return basicSetEndpoint1(null, msgs);
			case NetworkTopologyPackage.LINK__ENDPOINT2:
				return basicSetEndpoint2(null, msgs);
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
			case NetworkTopologyPackage.LINK__ENDPOINT1:
				return getEndpoint1();
			case NetworkTopologyPackage.LINK__ENDPOINT2:
				return getEndpoint2();
			case NetworkTopologyPackage.LINK__ID:
				return getId();
			case NetworkTopologyPackage.LINK__NETWORK_PROPAGATION_DELAY:
				return getNetworkPropagationDelay();
			case NetworkTopologyPackage.LINK__SPEED:
				return getSpeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NetworkTopologyPackage.LINK__ENDPOINT1:
				setEndpoint1((Endpoint)newValue);
				return;
			case NetworkTopologyPackage.LINK__ENDPOINT2:
				setEndpoint2((Endpoint)newValue);
				return;
			case NetworkTopologyPackage.LINK__ID:
				setId((String)newValue);
				return;
			case NetworkTopologyPackage.LINK__NETWORK_PROPAGATION_DELAY:
				setNetworkPropagationDelay((Integer)newValue);
				return;
			case NetworkTopologyPackage.LINK__SPEED:
				setSpeed((Integer)newValue);
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
			case NetworkTopologyPackage.LINK__ENDPOINT1:
				setEndpoint1((Endpoint)null);
				return;
			case NetworkTopologyPackage.LINK__ENDPOINT2:
				setEndpoint2((Endpoint)null);
				return;
			case NetworkTopologyPackage.LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case NetworkTopologyPackage.LINK__NETWORK_PROPAGATION_DELAY:
				unsetNetworkPropagationDelay();
				return;
			case NetworkTopologyPackage.LINK__SPEED:
				unsetSpeed();
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
			case NetworkTopologyPackage.LINK__ENDPOINT1:
				return endpoint1 != null;
			case NetworkTopologyPackage.LINK__ENDPOINT2:
				return endpoint2 != null;
			case NetworkTopologyPackage.LINK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NetworkTopologyPackage.LINK__NETWORK_PROPAGATION_DELAY:
				return isSetNetworkPropagationDelay();
			case NetworkTopologyPackage.LINK__SPEED:
				return isSetSpeed();
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", networkPropagationDelay: "); //$NON-NLS-1$
		if (networkPropagationDelayESet) result.append(networkPropagationDelay); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", speed: "); //$NON-NLS-1$
		if (speedESet) result.append(speed); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //LinkImpl
