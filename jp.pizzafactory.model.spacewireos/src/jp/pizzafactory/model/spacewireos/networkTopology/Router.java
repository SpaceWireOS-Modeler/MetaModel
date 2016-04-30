/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Router#getPort <em>Port</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Router#getNetworkPropagationDelay <em>Network Propagation Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getRouter()
 * @model extendedMetaData="name='Router' kind='elementOnly'"
 * @generated
 */
public interface Router extends Device {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.networkTopology.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getRouter_Port()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Port' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Network Propagation Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Propagation Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Propagation Delay</em>' attribute.
	 * @see #isSetNetworkPropagationDelay()
	 * @see #unsetNetworkPropagationDelay()
	 * @see #setNetworkPropagationDelay(int)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getRouter_NetworkPropagationDelay()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='NetworkPropagationDelay'"
	 * @generated
	 */
	int getNetworkPropagationDelay();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Router#getNetworkPropagationDelay <em>Network Propagation Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Propagation Delay</em>' attribute.
	 * @see #isSetNetworkPropagationDelay()
	 * @see #unsetNetworkPropagationDelay()
	 * @see #getNetworkPropagationDelay()
	 * @generated
	 */
	void setNetworkPropagationDelay(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Router#getNetworkPropagationDelay <em>Network Propagation Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkPropagationDelay()
	 * @see #getNetworkPropagationDelay()
	 * @see #setNetworkPropagationDelay(int)
	 * @generated
	 */
	void unsetNetworkPropagationDelay();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Router#getNetworkPropagationDelay <em>Network Propagation Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Network Propagation Delay</em>' attribute is set.
	 * @see #unsetNetworkPropagationDelay()
	 * @see #getNetworkPropagationDelay()
	 * @see #setNetworkPropagationDelay(int)
	 * @generated
	 */
	boolean isSetNetworkPropagationDelay();

} // Router
