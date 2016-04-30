/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.channelinfo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoFactory
 * @model kind="package"
 * @generated
 */
public interface ChannelInfoPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "channelinfo"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.pizzafactory.jp/SpaceWire/ChannelInfo"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cinfo"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChannelInfoPackage eINSTANCE = jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__PACKET = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__ID = 3;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.DestinationImpl <em>Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.DestinationImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getDestination()
	 * @generated
	 */
	int DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION__PATH = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION__REDUNDANCY = 2;

	/**
	 * The number of structural features of the '<em>Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.DocumentRootImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Space Wire Channel Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPACE_WIRE_CHANNEL_INFO = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.LinkImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl <em>Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getPacket()
	 * @generated
	 */
	int PACKET = 4;

	/**
	 * The feature id for the '<em><b>Timeslot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__TIMESLOT = 0;

	/**
	 * The feature id for the '<em><b>Cargosize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__CARGOSIZE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__ID = 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__PERIOD = 3;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__REPLY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.PathImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__LINK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ID = 1;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.SourceImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ID = 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.SpaceWireChannelInfoImpl <em>Space Wire Channel Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.SpaceWireChannelInfoImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getSpaceWireChannelInfo()
	 * @generated
	 */
	int SPACE_WIRE_CHANNEL_INFO = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_WIRE_CHANNEL_INFO__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_WIRE_CHANNEL_INFO__CHANNEL = 1;

	/**
	 * The number of structural features of the '<em>Space Wire Channel Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_WIRE_CHANNEL_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Space Wire Channel Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_WIRE_CHANNEL_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.TimeslotImpl <em>Timeslot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.TimeslotImpl
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getTimeslot()
	 * @generated
	 */
	int TIMESLOT = 8;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESLOT__NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Timeslot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESLOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timeslot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.PacketType <em>Packet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.PacketType
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getPacketType()
	 * @generated
	 */
	int PACKET_TYPE = 9;

	/**
	 * The meta object id for the '<em>Packet Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.PacketType
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getPacketTypeObject()
	 * @generated
	 */
	int PACKET_TYPE_OBJECT = 10;


	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Channel#getSource()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Source();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Channel#getDestination()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Destination();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packet</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Channel#getPacket()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Packet();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Channel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Channel#getId()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Id();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Destination
	 * @generated
	 */
	EClass getDestination();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Destination#getPath()
	 * @see #getDestination()
	 * @generated
	 */
	EReference getDestination_Path();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Destination#getId()
	 * @see #getDestination()
	 * @generated
	 */
	EAttribute getDestination_Id();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Destination#getRedundancy <em>Redundancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redundancy</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Destination#getRedundancy()
	 * @see #getDestination()
	 * @generated
	 */
	EAttribute getDestination_Redundancy();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot#getSpaceWireChannelInfo <em>Space Wire Channel Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Space Wire Channel Info</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.DocumentRoot#getSpaceWireChannelInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpaceWireChannelInfo();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Link#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Link#getId()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Id();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Packet
	 * @generated
	 */
	EClass getPacket();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getTimeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeslot</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Packet#getTimeslot()
	 * @see #getPacket()
	 * @generated
	 */
	EReference getPacket_Timeslot();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getCargosize <em>Cargosize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cargosize</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Packet#getCargosize()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Cargosize();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Packet#getId()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Id();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Packet#getPeriod()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Period();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#isReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reply</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Packet#isReply()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Reply();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Packet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Packet#getType()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Type();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.channelinfo.Path#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Path#getLink()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Link();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Path#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Path#getId()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Id();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Source#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Source#getId()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Id();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.SpaceWireChannelInfo <em>Space Wire Channel Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Wire Channel Info</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.SpaceWireChannelInfo
	 * @generated
	 */
	EClass getSpaceWireChannelInfo();

	/**
	 * Returns the meta object for the attribute list '{@link jp.pizzafactory.model.spacewireos.channelinfo.SpaceWireChannelInfo#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.SpaceWireChannelInfo#getGroup()
	 * @see #getSpaceWireChannelInfo()
	 * @generated
	 */
	EAttribute getSpaceWireChannelInfo_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.channelinfo.SpaceWireChannelInfo#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.SpaceWireChannelInfo#getChannel()
	 * @see #getSpaceWireChannelInfo()
	 * @generated
	 */
	EReference getSpaceWireChannelInfo_Channel();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.channelinfo.Timeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeslot</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Timeslot
	 * @generated
	 */
	EClass getTimeslot();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.channelinfo.Timeslot#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.Timeslot#getNumber()
	 * @see #getTimeslot()
	 * @generated
	 */
	EAttribute getTimeslot_Number();

	/**
	 * Returns the meta object for enum '{@link jp.pizzafactory.model.spacewireos.channelinfo.PacketType <em>Packet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Packet Type</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.PacketType
	 * @generated
	 */
	EEnum getPacketType();

	/**
	 * Returns the meta object for data type '{@link jp.pizzafactory.model.spacewireos.channelinfo.PacketType <em>Packet Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Packet Type Object</em>'.
	 * @see jp.pizzafactory.model.spacewireos.channelinfo.PacketType
	 * @model instanceClass="jp.pizzafactory.model.spacewireos.channelinfo.PacketType"
	 *        extendedMetaData="name='PacketType:Object' baseType='PacketType'"
	 * @generated
	 */
	EDataType getPacketTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChannelInfoFactory getChannelInfoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__SOURCE = eINSTANCE.getChannel_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__DESTINATION = eINSTANCE.getChannel_Destination();

		/**
		 * The meta object literal for the '<em><b>Packet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__PACKET = eINSTANCE.getChannel_Packet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__ID = eINSTANCE.getChannel_Id();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.DestinationImpl <em>Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.DestinationImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getDestination()
		 * @generated
		 */
		EClass DESTINATION = eINSTANCE.getDestination();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION__PATH = eINSTANCE.getDestination_Path();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTINATION__ID = eINSTANCE.getDestination_Id();

		/**
		 * The meta object literal for the '<em><b>Redundancy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTINATION__REDUNDANCY = eINSTANCE.getDestination_Redundancy();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.DocumentRootImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Space Wire Channel Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPACE_WIRE_CHANNEL_INFO = eINSTANCE.getDocumentRoot_SpaceWireChannelInfo();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.LinkImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ID = eINSTANCE.getLink_Id();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl <em>Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getPacket()
		 * @generated
		 */
		EClass PACKET = eINSTANCE.getPacket();

		/**
		 * The meta object literal for the '<em><b>Timeslot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET__TIMESLOT = eINSTANCE.getPacket_Timeslot();

		/**
		 * The meta object literal for the '<em><b>Cargosize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__CARGOSIZE = eINSTANCE.getPacket_Cargosize();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__ID = eINSTANCE.getPacket_Id();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__PERIOD = eINSTANCE.getPacket_Period();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__REPLY = eINSTANCE.getPacket_Reply();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__TYPE = eINSTANCE.getPacket_Type();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.PathImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__LINK = eINSTANCE.getPath_Link();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__ID = eINSTANCE.getPath_Id();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.SourceImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__ID = eINSTANCE.getSource_Id();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.SpaceWireChannelInfoImpl <em>Space Wire Channel Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.SpaceWireChannelInfoImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getSpaceWireChannelInfo()
		 * @generated
		 */
		EClass SPACE_WIRE_CHANNEL_INFO = eINSTANCE.getSpaceWireChannelInfo();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE_WIRE_CHANNEL_INFO__GROUP = eINSTANCE.getSpaceWireChannelInfo_Group();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_WIRE_CHANNEL_INFO__CHANNEL = eINSTANCE.getSpaceWireChannelInfo_Channel();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.TimeslotImpl <em>Timeslot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.TimeslotImpl
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getTimeslot()
		 * @generated
		 */
		EClass TIMESLOT = eINSTANCE.getTimeslot();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESLOT__NUMBER = eINSTANCE.getTimeslot_Number();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.channelinfo.PacketType <em>Packet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.PacketType
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getPacketType()
		 * @generated
		 */
		EEnum PACKET_TYPE = eINSTANCE.getPacketType();

		/**
		 * The meta object literal for the '<em>Packet Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.PacketType
		 * @see jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl#getPacketTypeObject()
		 * @generated
		 */
		EDataType PACKET_TYPE_OBJECT = eINSTANCE.getPacketTypeObject();

	}

} //ChannelInfoPackage
