/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timeslot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getNumber <em>Number</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getSlotTime <em>Slot Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getTimeslot()
 * @model extendedMetaData="name='Timeslot' kind='empty'"
 * @generated
 */
public interface Timeslot extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #isSetNumber()
	 * @see #unsetNumber()
	 * @see #setNumber(int)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getTimeslot_Number()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Number'"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #isSetNumber()
	 * @see #unsetNumber()
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumber()
	 * @see #getNumber()
	 * @see #setNumber(int)
	 * @generated
	 */
	void unsetNumber();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getNumber <em>Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number</em>' attribute is set.
	 * @see #unsetNumber()
	 * @see #getNumber()
	 * @see #setNumber(int)
	 * @generated
	 */
	boolean isSetNumber();

	/**
	 * Returns the value of the '<em><b>Slot Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Time</em>' attribute.
	 * @see #isSetSlotTime()
	 * @see #unsetSlotTime()
	 * @see #setSlotTime(int)
	 * @see jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage#getTimeslot_SlotTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='SlotTime'"
	 * @generated
	 */
	int getSlotTime();

	/**
	 * Sets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getSlotTime <em>Slot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Time</em>' attribute.
	 * @see #isSetSlotTime()
	 * @see #unsetSlotTime()
	 * @see #getSlotTime()
	 * @generated
	 */
	void setSlotTime(int value);

	/**
	 * Unsets the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getSlotTime <em>Slot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlotTime()
	 * @see #getSlotTime()
	 * @see #setSlotTime(int)
	 * @generated
	 */
	void unsetSlotTime();

	/**
	 * Returns whether the value of the '{@link jp.pizzafactory.model.spacewireos.networkTopology.Timeslot#getSlotTime <em>Slot Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slot Time</em>' attribute is set.
	 * @see #unsetSlotTime()
	 * @see #getSlotTime()
	 * @see #setSlotTime(int)
	 * @generated
	 */
	boolean isSetSlotTime();

} // Timeslot
