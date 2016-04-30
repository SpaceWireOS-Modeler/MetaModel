/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.impl;

import jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage;
import jp.pizzafactory.model.spacewireos.channelinfo.impl.ChannelInfoPackageImpl;
import jp.pizzafactory.model.spacewireos.networkTopology.Device;
import jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot;
import jp.pizzafactory.model.spacewireos.networkTopology.Endpoint;
import jp.pizzafactory.model.spacewireos.networkTopology.Link;
import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyFactory;
import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage;
import jp.pizzafactory.model.spacewireos.networkTopology.Node;
import jp.pizzafactory.model.spacewireos.networkTopology.NodePort;
import jp.pizzafactory.model.spacewireos.networkTopology.Port;
import jp.pizzafactory.model.spacewireos.networkTopology.Router;
import jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology;
import jp.pizzafactory.model.spacewireos.networkTopology.Subnet;
import jp.pizzafactory.model.spacewireos.networkTopology.Timeslot;
import jp.pizzafactory.model.spacewireos.networkTopology.util.NetworkTopologyValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkTopologyPackageImpl extends EPackageImpl implements NetworkTopologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fdirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceWireNetworkTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeslotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hexIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hexIntMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portNumberObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NetworkTopologyPackageImpl() {
		super(eNS_URI, NetworkTopologyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NetworkTopologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NetworkTopologyPackage init() {
		if (isInited) return (NetworkTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkTopologyPackage.eNS_URI);

		// Obtain or create and register package
		NetworkTopologyPackageImpl theNetworkTopologyPackage = (NetworkTopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NetworkTopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NetworkTopologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ChannelInfoPackageImpl theChannelInfoPackage = (ChannelInfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChannelInfoPackage.eNS_URI) instanceof ChannelInfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChannelInfoPackage.eNS_URI) : ChannelInfoPackage.eINSTANCE);

		// Create package meta-data objects
		theNetworkTopologyPackage.createPackageContents();
		theChannelInfoPackage.createPackageContents();

		// Initialize created meta-data
		theNetworkTopologyPackage.initializePackageContents();
		theChannelInfoPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theNetworkTopologyPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return NetworkTopologyValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theNetworkTopologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NetworkTopologyPackage.eNS_URI, theNetworkTopologyPackage);
		return theNetworkTopologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Id() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpaceWireNetworkTopology() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoint() {
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Id() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Port() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Connector() {
		return (EReference)endpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndpoint__SetDevice__Node() {
		return endpointEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndpoint__SetDevice__Router() {
		return endpointEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndpoint__GetRootContainer() {
		return endpointEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFDIR() {
		return fdirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFDIR_IntervalTime() {
		return (EAttribute)fdirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Endpoint1() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Endpoint2() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Id() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_NetworkPropagationDelay() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Speed() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Port() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodePort() {
		return nodePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePort_Key() {
		return (EAttribute)nodePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePort_LogicalAddress() {
		return (EAttribute)nodePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Number() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouter() {
		return routerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouter_Port() {
		return (EReference)routerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_NetworkPropagationDelay() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpaceWireNetworkTopology() {
		return spaceWireNetworkTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceWireNetworkTopology_Subnet() {
		return (EReference)spaceWireNetworkTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubnet() {
		return subnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubnet_FDIR() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubnet_Timeslot() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubnet_Router() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubnet_Node() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubnet_Link() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeslot() {
		return timeslotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeslot_Number() {
		return (EAttribute)timeslotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeslot_SlotTime() {
		return (EAttribute)timeslotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceId() {
		return deviceIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHexInt() {
		return hexIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHexIntMember1() {
		return hexIntMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortId() {
		return portIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortNumber() {
		return portNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortNumberObject() {
		return portNumberObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkTopologyFactory getNetworkTopologyFactory() {
		return (NetworkTopologyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPACE_WIRE_NETWORK_TOPOLOGY);

		endpointEClass = createEClass(ENDPOINT);
		createEAttribute(endpointEClass, ENDPOINT__ID);
		createEAttribute(endpointEClass, ENDPOINT__PORT);
		createEReference(endpointEClass, ENDPOINT__CONNECTOR);
		createEOperation(endpointEClass, ENDPOINT___SET_DEVICE__NODE);
		createEOperation(endpointEClass, ENDPOINT___SET_DEVICE__ROUTER);
		createEOperation(endpointEClass, ENDPOINT___GET_ROOT_CONTAINER);

		fdirEClass = createEClass(FDIR);
		createEAttribute(fdirEClass, FDIR__INTERVAL_TIME);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__ENDPOINT1);
		createEReference(linkEClass, LINK__ENDPOINT2);
		createEAttribute(linkEClass, LINK__ID);
		createEAttribute(linkEClass, LINK__NETWORK_PROPAGATION_DELAY);
		createEAttribute(linkEClass, LINK__SPEED);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__PORT);

		nodePortEClass = createEClass(NODE_PORT);
		createEAttribute(nodePortEClass, NODE_PORT__KEY);
		createEAttribute(nodePortEClass, NODE_PORT__LOGICAL_ADDRESS);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NUMBER);

		routerEClass = createEClass(ROUTER);
		createEReference(routerEClass, ROUTER__PORT);
		createEAttribute(routerEClass, ROUTER__NETWORK_PROPAGATION_DELAY);

		spaceWireNetworkTopologyEClass = createEClass(SPACE_WIRE_NETWORK_TOPOLOGY);
		createEReference(spaceWireNetworkTopologyEClass, SPACE_WIRE_NETWORK_TOPOLOGY__SUBNET);

		subnetEClass = createEClass(SUBNET);
		createEReference(subnetEClass, SUBNET__FDIR);
		createEReference(subnetEClass, SUBNET__TIMESLOT);
		createEReference(subnetEClass, SUBNET__ROUTER);
		createEReference(subnetEClass, SUBNET__NODE);
		createEReference(subnetEClass, SUBNET__LINK);

		timeslotEClass = createEClass(TIMESLOT);
		createEAttribute(timeslotEClass, TIMESLOT__NUMBER);
		createEAttribute(timeslotEClass, TIMESLOT__SLOT_TIME);

		// Create data types
		deviceIdEDataType = createEDataType(DEVICE_ID);
		hexIntEDataType = createEDataType(HEX_INT);
		hexIntMember1EDataType = createEDataType(HEX_INT_MEMBER1);
		portIdEDataType = createEDataType(PORT_ID);
		portNumberEDataType = createEDataType(PORT_NUMBER);
		portNumberObjectEDataType = createEDataType(PORT_NUMBER_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(this.getDevice());
		nodePortEClass.getESuperTypes().add(this.getPort());
		routerEClass.getESuperTypes().add(this.getDevice());

		// Initialize classes, features, and operations; add parameters
		initEClass(deviceEClass, Device.class, "Device", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDevice_Id(), this.getDeviceId(), "id", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentRoot_SpaceWireNetworkTopology(), this.getSpaceWireNetworkTopology(), null, "spaceWireNetworkTopology", null, 0, 1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEndpoint_Id(), this.getDeviceId(), "id", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEndpoint_Port(), this.getPortNumber(), "port", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEndpoint_Connector(), this.getPort(), null, "connector", null, 0, -1, Endpoint.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getEndpoint__SetDevice__Node(), null, "setDevice", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getNode(), "device", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getEndpoint__SetDevice__Router(), null, "setDevice", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getRouter(), "device", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getEndpoint__GetRootContainer(), this.getDocumentRoot(), "getRootContainer", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(fdirEClass, jp.pizzafactory.model.spacewireos.networkTopology.FDIR.class, "FDIR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFDIR_IntervalTime(), theXMLTypePackage.getInt(), "intervalTime", null, 0, 1, jp.pizzafactory.model.spacewireos.networkTopology.FDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLink_Endpoint1(), this.getEndpoint(), null, "endpoint1", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLink_Endpoint2(), this.getEndpoint(), null, "endpoint2", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLink_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLink_NetworkPropagationDelay(), theXMLTypePackage.getInt(), "networkPropagationDelay", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLink_Speed(), theXMLTypePackage.getInt(), "speed", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNode_Port(), this.getNodePort(), null, "port", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(nodePortEClass, NodePort.class, "NodePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNodePort_Key(), this.getHexInt(), "key", null, 0, 1, NodePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getNodePort_LogicalAddress(), this.getHexInt(), "logicalAddress", null, 0, 1, NodePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPort_Number(), this.getPortNumber(), "number", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRouter_Port(), this.getPort(), null, "port", null, 0, -1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRouter_NetworkPropagationDelay(), theXMLTypePackage.getInt(), "networkPropagationDelay", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(spaceWireNetworkTopologyEClass, SpaceWireNetworkTopology.class, "SpaceWireNetworkTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSpaceWireNetworkTopology_Subnet(), this.getSubnet(), null, "subnet", null, 0, -1, SpaceWireNetworkTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(subnetEClass, Subnet.class, "Subnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSubnet_FDIR(), this.getFDIR(), null, "fDIR", null, 1, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSubnet_Timeslot(), this.getTimeslot(), null, "timeslot", null, 1, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSubnet_Router(), this.getRouter(), null, "router", null, 0, -1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSubnet_Node(), this.getNode(), null, "node", null, 0, -1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSubnet_Link(), this.getLink(), null, "link", null, 0, -1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(timeslotEClass, Timeslot.class, "Timeslot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTimeslot_Number(), theXMLTypePackage.getInt(), "number", null, 0, 1, Timeslot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTimeslot_SlotTime(), theXMLTypePackage.getInt(), "slotTime", null, 0, 1, Timeslot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize data types
		initEDataType(deviceIdEDataType, String.class, "DeviceId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(hexIntEDataType, Object.class, "HexInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(hexIntMember1EDataType, String.class, "HexIntMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(portIdEDataType, String.class, "PortId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(portNumberEDataType, int.class, "PortNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(portNumberObjectEDataType, Integer.class, "PortNumberObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore", //$NON-NLS-1$ //$NON-NLS-2$
			 "ecore.xml.type", "http://www.eclipse.org/emf/2003/XMLType" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$ //$NON-NLS-2$
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", //$NON-NLS-1$ //$NON-NLS-2$
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$	
		addAnnotation
		  (deviceEClass, 
		   source, 
		   new String[] {
			 "name", "Device", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getDevice_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Id" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (deviceIdEDataType, 
		   source, 
		   new String[] {
			 "name", "DeviceId", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "mixed" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", ":mixed" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "xmlns:prefix" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "xsi:schemaLocation" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getDocumentRoot_SpaceWireNetworkTopology(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "SpaceWireNetworkTopology", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (endpointEClass, 
		   source, 
		   new String[] {
			 "name", "Endpoint", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getEndpoint_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Id" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getEndpoint_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Port" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (fdirEClass, 
		   source, 
		   new String[] {
			 "name", "FDIR", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getFDIR_IntervalTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "IntervalTime" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (hexIntEDataType, 
		   source, 
		   new String[] {
			 "name", "HexInt", //$NON-NLS-1$ //$NON-NLS-2$
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#unsignedInt HexInt_._member_._1" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (hexIntMember1EDataType, 
		   source, 
		   new String[] {
			 "name", "HexInt_._member_._1", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
			 "pattern", "0x[0-9A-Fa-f]+" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "name", "Link", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLink_Endpoint1(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Endpoint1", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLink_Endpoint2(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Endpoint2", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLink_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Id" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLink_NetworkPropagationDelay(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "NetworkPropagationDelay" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLink_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Speed" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "name", "Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getNode_Port(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Port", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (nodePortEClass, 
		   source, 
		   new String[] {
			 "name", "NodePort", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getNodePort_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Key" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getNodePort_LogicalAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "LogicalAddress" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "name", "Port", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getPort_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Number" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (portIdEDataType, 
		   source, 
		   new String[] {
			 "name", "PortId", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (portNumberEDataType, 
		   source, 
		   new String[] {
			 "name", "PortNumber", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (portNumberObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PortNumber:Object", //$NON-NLS-1$ //$NON-NLS-2$
			 "baseType", "PortNumber" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (routerEClass, 
		   source, 
		   new String[] {
			 "name", "Router", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRouter_Port(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Port", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRouter_NetworkPropagationDelay(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "NetworkPropagationDelay" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (spaceWireNetworkTopologyEClass, 
		   source, 
		   new String[] {
			 "name", "SpaceWireNetworkTopology", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSpaceWireNetworkTopology_Subnet(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Subnet", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (subnetEClass, 
		   source, 
		   new String[] {
			 "name", "Subnet", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSubnet_FDIR(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "FDIR", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSubnet_Timeslot(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Timeslot", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSubnet_Router(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Router", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSubnet_Node(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSubnet_Link(), 
		   source, 
		   new String[] {
			 "kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Link", //$NON-NLS-1$ //$NON-NLS-2$
			 "namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (timeslotEClass, 
		   source, 
		   new String[] {
			 "name", "Timeslot", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "empty" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getTimeslot_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "Number" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getTimeslot_SlotTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
			 "name", "SlotTime" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"; //$NON-NLS-1$	
		addAnnotation
		  (getEndpoint_Connector(), 
		   source, 
		   new String[] {
			 "derivation", "self.getRootContainer().spaceWireNetworkTopology.subnet.node->select(i : Node | i.id = self.id).port->select(i | i.number = self.port).oclAsType(Port)->union(self.getRootContainer().spaceWireNetworkTopology.subnet.router->select(i : Router | i.id = self.id).port->select(i | i.number = self.port))->asBag()" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //NetworkTopologyPackageImpl
