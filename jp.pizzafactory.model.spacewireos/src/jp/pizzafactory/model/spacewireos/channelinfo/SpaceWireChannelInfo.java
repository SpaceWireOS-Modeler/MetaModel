/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.channelinfo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space Wire Channel Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.SpaceWireChannelInfo#getGroup <em>Group</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.SpaceWireChannelInfo#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getSpaceWireChannelInfo()
 * @model extendedMetaData="name='SpaceWireChannelInfo' kind='elementOnly'"
 * @generated
 */
public interface SpaceWireChannelInfo extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getSpaceWireChannelInfo_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.channelinfo.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference list.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getSpaceWireChannelInfo_Channel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Channel' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Channel> getChannel();

} // SpaceWireChannelInfo
