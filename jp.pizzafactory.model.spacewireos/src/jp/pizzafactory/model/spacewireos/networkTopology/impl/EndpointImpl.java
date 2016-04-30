/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot;
import jp.pizzafactory.model.spacewireos.networkTopology.Endpoint;
import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage;
import jp.pizzafactory.model.spacewireos.networkTopology.Node;
import jp.pizzafactory.model.spacewireos.networkTopology.Port;
import jp.pizzafactory.model.spacewireos.networkTopology.Router;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.EndpointImpl#getId <em>Id</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.EndpointImpl#getPort <em>Port</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.EndpointImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointImpl extends MinimalEObjectImpl.Container implements Endpoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

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
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * This is true if the Port attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portESet;

	/**
	 * The cached setting delegate for the '{@link #getConnector() <em>Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NetworkTopologyPackage.Literals.ENDPOINT__CONNECTOR).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkTopologyPackage.Literals.ENDPOINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.ENDPOINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		boolean oldPortESet = portESet;
		portESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.ENDPOINT__PORT, oldPort, port, !oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPort() {
		int oldPort = port;
		boolean oldPortESet = portESet;
		port = PORT_EDEFAULT;
		portESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NetworkTopologyPackage.ENDPOINT__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPort() {
		return portESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Port> getConnector() {
		return (EList<Port>)CONNECTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(final Node device) {
		id = device.getId(); port = device.getPort().get(0).getNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(final Router device) {
		id = device.getId(); port = device.getPort().get(0).getNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot getRootContainer() {
		return (DocumentRoot)EcoreUtil.getRootContainer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkTopologyPackage.ENDPOINT__ID:
				return getId();
			case NetworkTopologyPackage.ENDPOINT__PORT:
				return getPort();
			case NetworkTopologyPackage.ENDPOINT__CONNECTOR:
				return getConnector();
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
			case NetworkTopologyPackage.ENDPOINT__ID:
				setId((String)newValue);
				return;
			case NetworkTopologyPackage.ENDPOINT__PORT:
				setPort((Integer)newValue);
				return;
			case NetworkTopologyPackage.ENDPOINT__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends Port>)newValue);
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
			case NetworkTopologyPackage.ENDPOINT__ID:
				setId(ID_EDEFAULT);
				return;
			case NetworkTopologyPackage.ENDPOINT__PORT:
				unsetPort();
				return;
			case NetworkTopologyPackage.ENDPOINT__CONNECTOR:
				getConnector().clear();
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
			case NetworkTopologyPackage.ENDPOINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NetworkTopologyPackage.ENDPOINT__PORT:
				return isSetPort();
			case NetworkTopologyPackage.ENDPOINT__CONNECTOR:
				return CONNECTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case NetworkTopologyPackage.ENDPOINT___SET_DEVICE__NODE:
				setDevice((Node)arguments.get(0));
				return null;
			case NetworkTopologyPackage.ENDPOINT___SET_DEVICE__ROUTER:
				setDevice((Router)arguments.get(0));
				return null;
			case NetworkTopologyPackage.ENDPOINT___GET_ROOT_CONTAINER:
				return getRootContainer();
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", port: "); //$NON-NLS-1$
		if (portESet) result.append(port); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //EndpointImpl
