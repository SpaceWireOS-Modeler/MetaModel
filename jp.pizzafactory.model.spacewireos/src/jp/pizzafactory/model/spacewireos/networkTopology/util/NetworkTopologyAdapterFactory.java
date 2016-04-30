/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.util;

import jp.pizzafactory.model.spacewireos.networkTopology.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage
 * @generated
 */
public class NetworkTopologyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NetworkTopologyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkTopologyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NetworkTopologyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkTopologySwitch<Adapter> modelSwitch =
		new NetworkTopologySwitch<Adapter>() {
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEndpoint(Endpoint object) {
				return createEndpointAdapter();
			}
			@Override
			public Adapter caseFDIR(FDIR object) {
				return createFDIRAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNodePort(NodePort object) {
				return createNodePortAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseRouter(Router object) {
				return createRouterAdapter();
			}
			@Override
			public Adapter caseSpaceWireNetworkTopology(SpaceWireNetworkTopology object) {
				return createSpaceWireNetworkTopologyAdapter();
			}
			@Override
			public Adapter caseSubnet(Subnet object) {
				return createSubnetAdapter();
			}
			@Override
			public Adapter caseTimeslot(Timeslot object) {
				return createTimeslotAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.FDIR <em>FDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.FDIR
	 * @generated
	 */
	public Adapter createFDIRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.NodePort <em>Node Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NodePort
	 * @generated
	 */
	public Adapter createNodePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Router
	 * @generated
	 */
	public Adapter createRouterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology <em>Space Wire Network Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology
	 * @generated
	 */
	public Adapter createSpaceWireNetworkTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Subnet
	 * @generated
	 */
	public Adapter createSubnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.Timeslot
	 * @generated
	 */
	public Adapter createTimeslotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NetworkTopologyAdapterFactory
