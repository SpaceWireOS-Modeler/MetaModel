/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.channelinfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getSource <em>Source</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getDestination <em>Destination</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getPacket <em>Packet</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getChannel()
 * @model extendedMetaData="name='Channel' kind='elementOnly'"
 * @generated
 */
public interface Channel extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getChannel_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Source' namespace='##targetNamespace'"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Destination)
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getChannel_Destination()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Destination' namespace='##targetNamespace'"
	 * @generated
	 */
	Destination getDestination();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Destination value);

	/**
	 * Returns the value of the '<em><b>Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet</em>' containment reference.
	 * @see #setPacket(Packet)
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getChannel_Packet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Packet' namespace='##targetNamespace'"
	 * @generated
	 */
	Packet getPacket();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getPacket <em>Packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet</em>' containment reference.
	 * @see #getPacket()
	 * @generated
	 */
	void setPacket(Packet value);

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
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getChannel_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Channel
