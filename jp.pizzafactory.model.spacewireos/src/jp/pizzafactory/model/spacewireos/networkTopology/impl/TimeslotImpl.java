/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.impl;

import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage;
import jp.pizzafactory.model.spacewireos.networkTopology.Timeslot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timeslot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.TimeslotImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.TimeslotImpl#getSlotTime <em>Slot Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeslotImpl extends MinimalEObjectImpl.Container implements Timeslot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * This is true if the Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberESet;

	/**
	 * The default value of the '{@link #getSlotTime() <em>Slot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SLOT_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSlotTime() <em>Slot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotTime()
	 * @generated
	 * @ordered
	 */
	protected int slotTime = SLOT_TIME_EDEFAULT;

	/**
	 * This is true if the Slot Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slotTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeslotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkTopologyPackage.Literals.TIMESLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		boolean oldNumberESet = numberESet;
		numberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.TIMESLOT__NUMBER, oldNumber, number, !oldNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumber() {
		int oldNumber = number;
		boolean oldNumberESet = numberESet;
		number = NUMBER_EDEFAULT;
		numberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NetworkTopologyPackage.TIMESLOT__NUMBER, oldNumber, NUMBER_EDEFAULT, oldNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumber() {
		return numberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSlotTime() {
		return slotTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlotTime(int newSlotTime) {
		int oldSlotTime = slotTime;
		slotTime = newSlotTime;
		boolean oldSlotTimeESet = slotTimeESet;
		slotTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.TIMESLOT__SLOT_TIME, oldSlotTime, slotTime, !oldSlotTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlotTime() {
		int oldSlotTime = slotTime;
		boolean oldSlotTimeESet = slotTimeESet;
		slotTime = SLOT_TIME_EDEFAULT;
		slotTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NetworkTopologyPackage.TIMESLOT__SLOT_TIME, oldSlotTime, SLOT_TIME_EDEFAULT, oldSlotTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlotTime() {
		return slotTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkTopologyPackage.TIMESLOT__NUMBER:
				return getNumber();
			case NetworkTopologyPackage.TIMESLOT__SLOT_TIME:
				return getSlotTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NetworkTopologyPackage.TIMESLOT__NUMBER:
				setNumber((Integer)newValue);
				return;
			case NetworkTopologyPackage.TIMESLOT__SLOT_TIME:
				setSlotTime((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NetworkTopologyPackage.TIMESLOT__NUMBER:
				unsetNumber();
				return;
			case NetworkTopologyPackage.TIMESLOT__SLOT_TIME:
				unsetSlotTime();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NetworkTopologyPackage.TIMESLOT__NUMBER:
				return isSetNumber();
			case NetworkTopologyPackage.TIMESLOT__SLOT_TIME:
				return isSetSlotTime();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (number: "); //$NON-NLS-1$
		if (numberESet) result.append(number); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", slotTime: "); //$NON-NLS-1$
		if (slotTimeESet) result.append(slotTime); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //TimeslotImpl
