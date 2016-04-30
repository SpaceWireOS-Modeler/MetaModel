/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.impl;

import java.util.Collection;
import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage;
import jp.pizzafactory.model.spacewireos.networkTopology.Port;
import jp.pizzafactory.model.spacewireos.networkTopology.Router;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.RouterImpl#getPort <em>Port</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.RouterImpl#getNetworkPropagationDelay <em>Network Propagation Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouterImpl extends DeviceImpl implements Router {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkTopologyPackage.Literals.ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, NetworkTopologyPackage.ROUTER__PORT);
		}
		return port;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.ROUTER__NETWORK_PROPAGATION_DELAY, oldNetworkPropagationDelay, networkPropagationDelay, !oldNetworkPropagationDelayESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, NetworkTopologyPackage.ROUTER__NETWORK_PROPAGATION_DELAY, oldNetworkPropagationDelay, NETWORK_PROPAGATION_DELAY_EDEFAULT, oldNetworkPropagationDelayESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkTopologyPackage.ROUTER__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case NetworkTopologyPackage.ROUTER__PORT:
				return getPort();
			case NetworkTopologyPackage.ROUTER__NETWORK_PROPAGATION_DELAY:
				return getNetworkPropagationDelay();
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
			case NetworkTopologyPackage.ROUTER__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case NetworkTopologyPackage.ROUTER__NETWORK_PROPAGATION_DELAY:
				setNetworkPropagationDelay((Integer)newValue);
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
			case NetworkTopologyPackage.ROUTER__PORT:
				getPort().clear();
				return;
			case NetworkTopologyPackage.ROUTER__NETWORK_PROPAGATION_DELAY:
				unsetNetworkPropagationDelay();
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
			case NetworkTopologyPackage.ROUTER__PORT:
				return port != null && !port.isEmpty();
			case NetworkTopologyPackage.ROUTER__NETWORK_PROPAGATION_DELAY:
				return isSetNetworkPropagationDelay();
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
		result.append(" (networkPropagationDelay: "); //$NON-NLS-1$
		if (networkPropagationDelayESet) result.append(networkPropagationDelay); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //RouterImpl
