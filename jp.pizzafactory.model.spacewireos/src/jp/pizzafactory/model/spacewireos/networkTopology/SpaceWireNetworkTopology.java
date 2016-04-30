/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space Wire Network Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology#getSubnet <em>Subnet</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getSpaceWireNetworkTopology()
 * @model extendedMetaData="name='SpaceWireNetworkTopology' kind='elementOnly'"
 * @generated
 */
public interface SpaceWireNetworkTopology extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' containment reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' containment reference list.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getSpaceWireNetworkTopology_Subnet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subnet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Subnet> getSubnet();

} // SpaceWireNetworkTopology
