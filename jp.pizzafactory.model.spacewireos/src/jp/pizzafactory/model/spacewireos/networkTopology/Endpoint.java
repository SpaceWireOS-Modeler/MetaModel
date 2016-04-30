/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getId <em>Id</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getPort <em>Port</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getEndpoint()
 * @model extendedMetaData="name='Endpoint' kind='empty'"
 * @generated
 */
public interface Endpoint extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

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
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getEndpoint_Id()
	 * @model dataType="jp.pizzafactory.model.spacewireos.networkTopology.DeviceId" required="true"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #setPort(int)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getEndpoint_Port()
	 * @model unsettable="true" dataType="jp.pizzafactory.model.spacewireos.networkTopology.PortNumber" required="true"
	 *        extendedMetaData="kind='attribute' name='Port'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	void unsetPort();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getPort <em>Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port</em>' attribute is set.
	 * @see #unsetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	boolean isSetPort();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.networkTopology.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference list.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getEndpoint_Connector()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.getRootContainer().spaceWireNetworkTopology.subnet.node->select(i : Node | i.id = self.id).port->select(i | i.number = self.port).oclAsType(Port)->union(self.getRootContainer().spaceWireNetworkTopology.subnet.router->select(i : Router | i.id = self.id).port->select(i | i.number = self.port))->asBag()'"
	 * @generated
	 */
	EList<Port> getConnector();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model deviceRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='id = device.getId(); port = device.getPort().get(0).getNumber();'"
	 * @generated
	 */
	void setDevice(Node device);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model deviceRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='id = device.getId(); port = device.getPort().get(0).getNumber();'"
	 * @generated
	 */
	void setDevice(Router device);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (DocumentRoot)EcoreUtil.getRootContainer(this);'"
	 * @generated
	 */
	DocumentRoot getRootContainer();

} // Endpoint
