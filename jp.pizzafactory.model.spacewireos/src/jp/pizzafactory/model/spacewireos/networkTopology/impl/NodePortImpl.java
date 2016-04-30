/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.impl;

import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage;
import jp.pizzafactory.model.spacewireos.networkTopology.NodePort;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.NodePortImpl#getKey <em>Key</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.NodePortImpl#getLogicalAddress <em>Logical Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodePortImpl extends PortImpl implements NodePort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Object key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalAddress() <em>Logical Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOGICAL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalAddress() <em>Logical Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalAddress()
	 * @generated
	 * @ordered
	 */
	protected Object logicalAddress = LOGICAL_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkTopologyPackage.Literals.NODE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Object newKey) {
		Object oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.NODE_PORT__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLogicalAddress() {
		return logicalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalAddress(Object newLogicalAddress) {
		Object oldLogicalAddress = logicalAddress;
		logicalAddress = newLogicalAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.NODE_PORT__LOGICAL_ADDRESS, oldLogicalAddress, logicalAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkTopologyPackage.NODE_PORT__KEY:
				return getKey();
			case NetworkTopologyPackage.NODE_PORT__LOGICAL_ADDRESS:
				return getLogicalAddress();
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
			case NetworkTopologyPackage.NODE_PORT__KEY:
				setKey(newValue);
				return;
			case NetworkTopologyPackage.NODE_PORT__LOGICAL_ADDRESS:
				setLogicalAddress(newValue);
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
			case NetworkTopologyPackage.NODE_PORT__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case NetworkTopologyPackage.NODE_PORT__LOGICAL_ADDRESS:
				setLogicalAddress(LOGICAL_ADDRESS_EDEFAULT);
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
			case NetworkTopologyPackage.NODE_PORT__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case NetworkTopologyPackage.NODE_PORT__LOGICAL_ADDRESS:
				return LOGICAL_ADDRESS_EDEFAULT == null ? logicalAddress != null : !LOGICAL_ADDRESS_EDEFAULT.equals(logicalAddress);
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
		result.append(" (key: "); //$NON-NLS-1$
		result.append(key);
		result.append(", logicalAddress: "); //$NON-NLS-1$
		result.append(logicalAddress);
		result.append(')');
		return result.toString();
	}

} //NodePortImpl
