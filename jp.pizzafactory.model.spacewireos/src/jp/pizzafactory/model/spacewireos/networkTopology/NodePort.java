/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.NodePort#getKey <em>Key</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.NodePort#getLogicalAddress <em>Logical Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getNodePort()
 * @model extendedMetaData="name='NodePort' kind='empty'"
 * @generated
 */
public interface NodePort extends Port {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(Object)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getNodePort_Key()
	 * @model dataType="jp.pizzafactory.model.spacewireos.networkTopology.HexInt"
	 *        extendedMetaData="kind='attribute' name='Key'"
	 * @generated
	 */
	Object getKey();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.NodePort#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Object value);

	/**
	 * Returns the value of the '<em><b>Logical Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Address</em>' attribute.
	 * @see #setLogicalAddress(Object)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getNodePort_LogicalAddress()
	 * @model dataType="jp.pizzafactory.model.spacewireos.networkTopology.HexInt"
	 *        extendedMetaData="kind='attribute' name='LogicalAddress'"
	 * @generated
	 */
	Object getLogicalAddress();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.NodePort#getLogicalAddress <em>Logical Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Address</em>' attribute.
	 * @see #getLogicalAddress()
	 * @generated
	 */
	void setLogicalAddress(Object value);

} // NodePort
