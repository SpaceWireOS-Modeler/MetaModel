/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface NetworkTopologyPackage extends EPackage {
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
	String eNAME = "networkTopology"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.pizzafactory.jp/SpaceWire/NetworkTopology"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ntopo"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkTopologyPackage eINSTANCE = jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.DeviceImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.DocumentRootImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Space Wire Network Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPACE_WIRE_NETWORK_TOPOLOGY = 3;

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
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.EndpointImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__PORT = 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__CONNECTOR = 2;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Set Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT___SET_DEVICE__NODE = 0;

	/**
	 * The operation id for the '<em>Set Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT___SET_DEVICE__ROUTER = 1;

	/**
	 * The operation id for the '<em>Get Root Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT___GET_ROOT_CONTAINER = 2;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.FDIRImpl <em>FDIR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.FDIRImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getFDIR()
	 * @generated
	 */
	int FDIR = 3;

	/**
	 * The feature id for the '<em><b>Interval Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDIR__INTERVAL_TIME = 0;

	/**
	 * The number of structural features of the '<em>FDIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDIR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FDIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 4;

	/**
	 * The feature id for the '<em><b>Endpoint1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ENDPOINT1 = 0;

	/**
	 * The feature id for the '<em><b>Endpoint2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ENDPOINT2 = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = 2;

	/**
	 * The feature id for the '<em><b>Network Propagation Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NETWORK_PROPAGATION_DELAY = 3;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SPEED = 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NodeImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.PortImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.NodePortImpl <em>Node Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NodePortImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getNodePort()
	 * @generated
	 */
	int NODE_PORT = 6;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PORT__NUMBER = PORT__NUMBER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PORT__KEY = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PORT__LOGICAL_ADDRESS = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.RouterImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ID = DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__PORT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Propagation Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NETWORK_PROPAGATION_DELAY = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SpaceWireNetworkTopologyImpl <em>Space Wire Network Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.SpaceWireNetworkTopologyImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getSpaceWireNetworkTopology()
	 * @generated
	 */
	int SPACE_WIRE_NETWORK_TOPOLOGY = 9;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_WIRE_NETWORK_TOPOLOGY__SUBNET = 0;

	/**
	 * The number of structural features of the '<em>Space Wire Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_WIRE_NETWORK_TOPOLOGY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Space Wire Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_WIRE_NETWORK_TOPOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 10;

	/**
	 * The feature id for the '<em><b>FDIR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__FDIR = 0;

	/**
	 * The feature id for the '<em><b>Timeslot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__TIMESLOT = 1;

	/**
	 * The feature id for the '<em><b>Router</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ROUTER = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__NODE = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__LINK = 4;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.TimeslotImpl <em>Timeslot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.TimeslotImpl
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getTimeslot()
	 * @generated
	 */
	int TIMESLOT = 11;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESLOT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Slot Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESLOT__SLOT_TIME = 1;

	/**
	 * The number of structural features of the '<em>Timeslot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESLOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Timeslot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Device Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getDeviceId()
	 * @generated
	 */
	int DEVICE_ID = 12;

	/**
	 * The meta object id for the '<em>Hex Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getHexInt()
	 * @generated
	 */
	int HEX_INT = 13;

	/**
	 * The meta object id for the '<em>Hex Int Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getHexIntMember1()
	 * @generated
	 */
	int HEX_INT_MEMBER1 = 14;

	/**
	 * The meta object id for the '<em>Port Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getPortId()
	 * @generated
	 */
	int PORT_ID = 15;

	/**
	 * The meta object id for the '<em>Port Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getPortNumber()
	 * @generated
	 */
	int PORT_NUMBER = 16;

	/**
	 * The meta object id for the '<em>Port Number Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getPortNumberObject()
	 * @generated
	 */
	int PORT_NUMBER_OBJECT = 17;


	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Device#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Device#getId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Id();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot#getSpaceWireNetworkTopology <em>Space Wire Network Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Space Wire Network Topology</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot#getSpaceWireNetworkTopology()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpaceWireNetworkTopology();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getId()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getPort()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Port();

	/**
	 * Returns the meta object for the reference list '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getConnector()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Connector();

	/**
	 * Returns the meta object for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#setDevice(jp.pizzafactory.model.spacewireos.networkTopology.Node) <em>Set Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Device</em>' operation.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#setDevice(jp.pizzafactory.model.spacewireos.networkTopology.Node)
	 * @generated
	 */
	EOperation getEndpoint__SetDevice__Node();

	/**
	 * Returns the meta object for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#setDevice(jp.pizzafactory.model.spacewireos.networkTopology.Router) <em>Set Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Device</em>' operation.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#setDevice(jp.pizzafactory.model.spacewireos.networkTopology.Router)
	 * @generated
	 */
	EOperation getEndpoint__SetDevice__Router();

	/**
	 * Returns the meta object for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getRootContainer() <em>Get Root Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Container</em>' operation.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Endpoint#getRootContainer()
	 * @generated
	 */
	EOperation getEndpoint__GetRootContainer();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.FDIR <em>FDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FDIR</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.FDIR
	 * @generated
	 */
	EClass getFDIR();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.FDIR#getIntervalTime <em>Interval Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Time</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.FDIR#getIntervalTime()
	 * @see #getFDIR()
	 * @generated
	 */
	EAttribute getFDIR_IntervalTime();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getEndpoint1 <em>Endpoint1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint1</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Link#getEndpoint1()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Endpoint1();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getEndpoint2 <em>Endpoint2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint2</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Link#getEndpoint2()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Endpoint2();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Link#getId()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Id();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getNetworkPropagationDelay <em>Network Propagation Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Propagation Delay</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Link#getNetworkPropagationDelay()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_NetworkPropagationDelay();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Link#getSpeed()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Speed();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.networkTopology.Node#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Node#getPort()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Port();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.NodePort <em>Node Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Port</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NodePort
	 * @generated
	 */
	EClass getNodePort();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.NodePort#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NodePort#getKey()
	 * @see #getNodePort()
	 * @generated
	 */
	EAttribute getNodePort_Key();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.NodePort#getLogicalAddress <em>Logical Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Address</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NodePort#getLogicalAddress()
	 * @see #getNodePort()
	 * @generated
	 */
	EAttribute getNodePort_LogicalAddress();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Port#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Port#getNumber()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Number();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.networkTopology.Router#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Router#getPort()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_Port();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Router#getNetworkPropagationDelay <em>Network Propagation Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Propagation Delay</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Router#getNetworkPropagationDelay()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_NetworkPropagationDelay();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology <em>Space Wire Network Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Wire Network Topology</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology
	 * @generated
	 */
	EClass getSpaceWireNetworkTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnet</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology#getSubnet()
	 * @see #getSpaceWireNetworkTopology()
	 * @generated
	 */
	EReference getSpaceWireNetworkTopology_Subnet();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getFDIR <em>FDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FDIR</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getFDIR()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_FDIR();

	/**
	 * Returns the meta object for the containment reference '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getTimeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeslot</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getTimeslot()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_Timeslot();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Router</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getRouter()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_Router();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getNode()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Subnet#getLink()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_Link();

	/**
	 * Returns the meta object for class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeslot</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Timeslot
	 * @generated
	 */
	EClass getTimeslot();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getNumber()
	 * @see #getTimeslot()
	 * @generated
	 */
	EAttribute getTimeslot_Number();

	/**
	 * Returns the meta object for the attribute '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getSlotTime <em>Slot Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot Time</em>'.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getSlotTime()
	 * @see #getTimeslot()
	 * @generated
	 */
	EAttribute getTimeslot_SlotTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Device Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DeviceId' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDeviceId();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Hex Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hex Int</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='HexInt' memberTypes='http://www.eclipse.org/emf/2003/XMLType#unsignedInt HexInt_._member_._1'"
	 * @generated
	 */
	EDataType getHexInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hex Int Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hex Int Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexInt_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='0x[0-9A-Fa-f]+'"
	 * @generated
	 */
	EDataType getHexIntMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Port Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PortId' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPortId();

	/**
	 * Returns the meta object for data type '<em>Port Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Number</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='PortNumber' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getPortNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Port Number Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Number Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='PortNumber:Object' baseType='PortNumber'"
	 * @generated
	 */
	EDataType getPortNumberObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkTopologyFactory getNetworkTopologyFactory();

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
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.DeviceImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ID = eINSTANCE.getDevice_Id();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.DocumentRootImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Space Wire Network Topology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPACE_WIRE_NETWORK_TOPOLOGY = eINSTANCE.getDocumentRoot_SpaceWireNetworkTopology();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.EndpointImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__ID = eINSTANCE.getEndpoint_Id();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__PORT = eINSTANCE.getEndpoint_Port();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__CONNECTOR = eINSTANCE.getEndpoint_Connector();

		/**
		 * The meta object literal for the '<em><b>Set Device</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENDPOINT___SET_DEVICE__NODE = eINSTANCE.getEndpoint__SetDevice__Node();

		/**
		 * The meta object literal for the '<em><b>Set Device</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENDPOINT___SET_DEVICE__ROUTER = eINSTANCE.getEndpoint__SetDevice__Router();

		/**
		 * The meta object literal for the '<em><b>Get Root Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENDPOINT___GET_ROOT_CONTAINER = eINSTANCE.getEndpoint__GetRootContainer();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.FDIRImpl <em>FDIR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.FDIRImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getFDIR()
		 * @generated
		 */
		EClass FDIR = eINSTANCE.getFDIR();

		/**
		 * The meta object literal for the '<em><b>Interval Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FDIR__INTERVAL_TIME = eINSTANCE.getFDIR_IntervalTime();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.LinkImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Endpoint1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ENDPOINT1 = eINSTANCE.getLink_Endpoint1();

		/**
		 * The meta object literal for the '<em><b>Endpoint2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ENDPOINT2 = eINSTANCE.getLink_Endpoint2();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ID = eINSTANCE.getLink_Id();

		/**
		 * The meta object literal for the '<em><b>Network Propagation Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NETWORK_PROPAGATION_DELAY = eINSTANCE.getLink_NetworkPropagationDelay();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SPEED = eINSTANCE.getLink_Speed();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NodeImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PORT = eINSTANCE.getNode_Port();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.NodePortImpl <em>Node Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NodePortImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getNodePort()
		 * @generated
		 */
		EClass NODE_PORT = eINSTANCE.getNodePort();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PORT__KEY = eINSTANCE.getNodePort_Key();

		/**
		 * The meta object literal for the '<em><b>Logical Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PORT__LOGICAL_ADDRESS = eINSTANCE.getNodePort_LogicalAddress();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.PortImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NUMBER = eINSTANCE.getPort_Number();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.RouterImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__PORT = eINSTANCE.getRouter_Port();

		/**
		 * The meta object literal for the '<em><b>Network Propagation Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__NETWORK_PROPAGATION_DELAY = eINSTANCE.getRouter_NetworkPropagationDelay();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SpaceWireNetworkTopologyImpl <em>Space Wire Network Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.SpaceWireNetworkTopologyImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getSpaceWireNetworkTopology()
		 * @generated
		 */
		EClass SPACE_WIRE_NETWORK_TOPOLOGY = eINSTANCE.getSpaceWireNetworkTopology();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_WIRE_NETWORK_TOPOLOGY__SUBNET = eINSTANCE.getSpaceWireNetworkTopology_Subnet();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.SubnetImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();

		/**
		 * The meta object literal for the '<em><b>FDIR</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__FDIR = eINSTANCE.getSubnet_FDIR();

		/**
		 * The meta object literal for the '<em><b>Timeslot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__TIMESLOT = eINSTANCE.getSubnet_Timeslot();

		/**
		 * The meta object literal for the '<em><b>Router</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__ROUTER = eINSTANCE.getSubnet_Router();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__NODE = eINSTANCE.getSubnet_Node();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__LINK = eINSTANCE.getSubnet_Link();

		/**
		 * The meta object literal for the '{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.TimeslotImpl <em>Timeslot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.TimeslotImpl
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getTimeslot()
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
		 * The meta object literal for the '<em><b>Slot Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESLOT__SLOT_TIME = eINSTANCE.getTimeslot_SlotTime();

		/**
		 * The meta object literal for the '<em>Device Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getDeviceId()
		 * @generated
		 */
		EDataType DEVICE_ID = eINSTANCE.getDeviceId();

		/**
		 * The meta object literal for the '<em>Hex Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getHexInt()
		 * @generated
		 */
		EDataType HEX_INT = eINSTANCE.getHexInt();

		/**
		 * The meta object literal for the '<em>Hex Int Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getHexIntMember1()
		 * @generated
		 */
		EDataType HEX_INT_MEMBER1 = eINSTANCE.getHexIntMember1();

		/**
		 * The meta object literal for the '<em>Port Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getPortId()
		 * @generated
		 */
		EDataType PORT_ID = eINSTANCE.getPortId();

		/**
		 * The meta object literal for the '<em>Port Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getPortNumber()
		 * @generated
		 */
		EDataType PORT_NUMBER = eINSTANCE.getPortNumber();

		/**
		 * The meta object literal for the '<em>Port Number Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see jp.pizzafactory.model.spacewireos.networkTopology.impl.NetworkTopologyPackageImpl#getPortNumberObject()
		 * @generated
		 */
		EDataType PORT_NUMBER_OBJECT = eINSTANCE.getPortNumberObject();

	}

} //NetworkTopologyPackage
