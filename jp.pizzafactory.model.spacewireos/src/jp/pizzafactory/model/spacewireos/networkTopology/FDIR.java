/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FDIR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.FDIR#getIntervalTime <em>Interval Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getFDIR()
 * @model extendedMetaData="name='FDIR' kind='empty'"
 * @generated
 */
public interface FDIR extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Interval Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Time</em>' attribute.
	 * @see #isSetIntervalTime()
	 * @see #unsetIntervalTime()
	 * @see #setIntervalTime(int)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getFDIR_IntervalTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='IntervalTime'"
	 * @generated
	 */
	int getIntervalTime();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.FDIR#getIntervalTime <em>Interval Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Time</em>' attribute.
	 * @see #isSetIntervalTime()
	 * @see #unsetIntervalTime()
	 * @see #getIntervalTime()
	 * @generated
	 */
	void setIntervalTime(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.FDIR#getIntervalTime <em>Interval Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntervalTime()
	 * @see #getIntervalTime()
	 * @see #setIntervalTime(int)
	 * @generated
	 */
	void unsetIntervalTime();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.FDIR#getIntervalTime <em>Interval Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interval Time</em>' attribute is set.
	 * @see #unsetIntervalTime()
	 * @see #getIntervalTime()
	 * @see #setIntervalTime(int)
	 * @generated
	 */
	boolean isSetIntervalTime();

} // FDIR
