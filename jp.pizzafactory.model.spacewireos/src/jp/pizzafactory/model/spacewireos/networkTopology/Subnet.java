/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getFDIR <em>FDIR</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getTimeslot <em>Timeslot</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getRouter <em>Router</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getNode <em>Node</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getSubnet()
 * @model extendedMetaData="name='Subnet' kind='elementOnly'"
 * @generated
 */
public interface Subnet extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>FDIR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FDIR</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FDIR</em>' containment reference.
	 * @see #setFDIR(FDIR)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getSubnet_FDIR()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FDIR' namespace='##targetNamespace'"
	 * @generated
	 */
	FDIR getFDIR();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getFDIR <em>FDIR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FDIR</em>' containment reference.
	 * @see #getFDIR()
	 * @generated
	 */
	void setFDIR(FDIR value);

	/**
	 * Returns the value of the '<em><b>Timeslot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeslot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeslot</em>' containment reference.
	 * @see #setTimeslot(Timeslot)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getSubnet_Timeslot()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Timeslot' namespace='##targetNamespace'"
	 * @generated
	 */
	Timeslot getTimeslot();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getTimeslot <em>Timeslot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeslot</em>' containment reference.
	 * @see #getTimeslot()
	 * @generated
	 */
	void setTimeslot(Timeslot value);

	/**
	 * Returns the value of the '<em><b>Router</b></em>' containment reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.networkTopology.Router}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router</em>' containment reference list.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getSubnet_Router()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Router' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Router> getRouter();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.networkTopology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getSubnet_Node()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Node' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.networkTopology.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getSubnet_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Link> getLink();

} // Subnet
