/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.tests;

import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyFactory;
import jp.pizzafactory.model.spacewireos.networkTopology.SpaceWireNetworkTopology;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Space Wire Network Topology</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceWireNetworkTopologyTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The fixture for this Space Wire Network Topology test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceWireNetworkTopology fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpaceWireNetworkTopologyTest.class);
	}

	/**
	 * Constructs a new Space Wire Network Topology test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceWireNetworkTopologyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Space Wire Network Topology test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SpaceWireNetworkTopology fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Space Wire Network Topology test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceWireNetworkTopology getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetworkTopologyFactory.eINSTANCE.createSpaceWireNetworkTopology());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SpaceWireNetworkTopologyTest
