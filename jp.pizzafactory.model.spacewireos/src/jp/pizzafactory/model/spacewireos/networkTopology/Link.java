/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getEndpoint1 <em>Endpoint1</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getEndpoint2 <em>Endpoint2</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getId <em>Id</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getNetworkPropagationDelay <em>Network Propagation Delay</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getLink()
 * @model extendedMetaData="name='Link' kind='elementOnly'"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Endpoint1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint1</em>' containment reference.
	 * @see #setEndpoint1(Endpoint)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getLink_Endpoint1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Endpoint1' namespace='##targetNamespace'"
	 * @generated
	 */
	Endpoint getEndpoint1();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getEndpoint1 <em>Endpoint1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint1</em>' containment reference.
	 * @see #getEndpoint1()
	 * @generated
	 */
	void setEndpoint1(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Endpoint2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint2</em>' containment reference.
	 * @see #setEndpoint2(Endpoint)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getLink_Endpoint2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Endpoint2' namespace='##targetNamespace'"
	 * @generated
	 */
	Endpoint getEndpoint2();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getEndpoint2 <em>Endpoint2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint2</em>' containment reference.
	 * @see #getEndpoint2()
	 * @generated
	 */
	void setEndpoint2(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getLink_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getLink_NetworkPropagationDelay()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='NetworkPropagationDelay'"
	 * @generated
	 */
	int getNetworkPropagationDelay();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getNetworkPropagationDelay <em>Network Propagation Delay</em>}' attribute.
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
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getNetworkPropagationDelay <em>Network Propagation Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetworkPropagationDelay()
	 * @see #getNetworkPropagationDelay()
	 * @see #setNetworkPropagationDelay(int)
	 * @generated
	 */
	void unsetNetworkPropagationDelay();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getNetworkPropagationDelay <em>Network Propagation Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Network Propagation Delay</em>' attribute is set.
	 * @see #unsetNetworkPropagationDelay()
	 * @see #getNetworkPropagationDelay()
	 * @see #setNetworkPropagationDelay(int)
	 * @generated
	 */
	boolean isSetNetworkPropagationDelay();

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #isSetSpeed()
	 * @see #unsetSpeed()
	 * @see #setSpeed(int)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getLink_Speed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Speed'"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #isSetSpeed()
	 * @see #unsetSpeed()
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeed()
	 * @see #getSpeed()
	 * @see #setSpeed(int)
	 * @generated
	 */
	void unsetSpeed();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getSpeed <em>Speed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speed</em>' attribute is set.
	 * @see #unsetSpeed()
	 * @see #getSpeed()
	 * @see #setSpeed(int)
	 * @generated
	 */
	boolean isSetSpeed();

} // Link
