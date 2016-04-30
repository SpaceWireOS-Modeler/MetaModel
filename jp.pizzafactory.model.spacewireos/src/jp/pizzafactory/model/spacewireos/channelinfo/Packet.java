/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.channelinfo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getTimeslot <em>Timeslot</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getCargosize <em>Cargosize</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getId <em>Id</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getPeriod <em>Period</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#isReply <em>Reply</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getPacket()
 * @model extendedMetaData="name='Packet' kind='elementOnly'"
 * @generated
 */
public interface Packet extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Timeslot</b></em>' containment reference list.
	 * The list contents are of type {@link jp.pizzafactory.model.spacewireos.channelinfo.Timeslot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeslot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeslot</em>' containment reference list.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getPacket_Timeslot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Timeslot' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Timeslot> getTimeslot();

	/**
	 * Returns the value of the '<em><b>Cargosize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cargosize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargosize</em>' attribute.
	 * @see #isSetCargosize()
	 * @see #unsetCargosize()
	 * @see #setCargosize(int)
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getPacket_Cargosize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Cargosize'"
	 * @generated
	 */
	int getCargosize();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getCargosize <em>Cargosize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargosize</em>' attribute.
	 * @see #isSetCargosize()
	 * @see #unsetCargosize()
	 * @see #getCargosize()
	 * @generated
	 */
	void setCargosize(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getCargosize <em>Cargosize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCargosize()
	 * @see #getCargosize()
	 * @see #setCargosize(int)
	 * @generated
	 */
	void unsetCargosize();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getCargosize <em>Cargosize</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cargosize</em>' attribute is set.
	 * @see #unsetCargosize()
	 * @see #getCargosize()
	 * @see #setCargosize(int)
	 * @generated
	 */
	boolean isSetCargosize();

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
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getPacket_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(int)
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getPacket_Period()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Period'"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(int)
	 * @generated
	 */
	void unsetPeriod();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(int)
	 * @generated
	 */
	boolean isSetPeriod();

	/**
	 * Returns the value of the '<em><b>Reply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply</em>' attribute.
	 * @see #isSetReply()
	 * @see #unsetReply()
	 * @see #setReply(boolean)
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getPacket_Reply()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Reply'"
	 * @generated
	 */
	boolean isReply();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#isReply <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply</em>' attribute.
	 * @see #isSetReply()
	 * @see #unsetReply()
	 * @see #isReply()
	 * @generated
	 */
	void setReply(boolean value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#isReply <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReply()
	 * @see #isReply()
	 * @see #setReply(boolean)
	 * @generated
	 */
	void unsetReply();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#isReply <em>Reply</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reply</em>' attribute is set.
	 * @see #unsetReply()
	 * @see #isReply()
	 * @see #setReply(boolean)
	 * @generated
	 */
	boolean isSetReply();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jp.pizzafactory.model.spacewireos.channelinfo.PacketType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.PacketType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(PacketType)
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage#getPacket_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	PacketType getType();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.PacketType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(PacketType value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(PacketType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(PacketType)
	 * @generated
	 */
	boolean isSetType();

} // Packet
