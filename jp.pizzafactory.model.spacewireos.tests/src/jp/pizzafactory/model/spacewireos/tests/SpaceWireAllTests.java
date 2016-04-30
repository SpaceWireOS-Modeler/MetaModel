/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.tests;

import jp.pizzafactory.model.spacewireos.channelinfo.tests.ChannelInfoTests;
import jp.pizzafactory.model.spacewireos.networkTopology.tests.NetworkTopologyTests;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>SpaceWire</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceWireAllTests extends TestSuite {

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
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SpaceWireAllTests("SpaceWire Tests"); //$NON-NLS-1$
		suite.addTest(ChannelInfoTests.suite());
		suite.addTest(NetworkTopologyTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceWireAllTests(String name) {
		super(name);
	}

} //SpaceWireAllTests
