/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.channelinfo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getPath <em>Path</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getId <em>Id</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getRedundancy <em>Redundancy</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getDestination()
 * @model extendedMetaData="name='Destination' kind='elementOnly'"
 * @generated
 */
public interface Destination extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.channelinfo.Path}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getDestination_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Path> getPath();

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
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getDestination_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redundancy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redundancy</em>' attribute.
	 * @see #isSetRedundancy()
	 * @see #unsetRedundancy()
	 * @see #setRedundancy(int)
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getDestination_Redundancy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Redundancy'"
	 * @generated
	 */
	int getRedundancy();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getRedundancy <em>Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redundancy</em>' attribute.
	 * @see #isSetRedundancy()
	 * @see #unsetRedundancy()
	 * @see #getRedundancy()
	 * @generated
	 */
	void setRedundancy(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getRedundancy <em>Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRedundancy()
	 * @see #getRedundancy()
	 * @see #setRedundancy(int)
	 * @generated
	 */
	void unsetRedundancy();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getRedundancy <em>Redundancy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Redundancy</em>' attribute is set.
	 * @see #unsetRedundancy()
	 * @see #getRedundancy()
	 * @see #setRedundancy(int)
	 * @generated
	 */
	boolean isSetRedundancy();

} // Destination
