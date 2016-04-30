/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.networkTopology.impl;

import jp.pizzafactory.model.spacewireos.networkTopology.FDIR;
import jp.pizzafactory.model.spacewireos.networkTopology.NetworkTopologyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FDIR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.networkTopology.impl.FDIRImpl#getIntervalTime <em>Interval Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FDIRImpl extends MinimalEObjectImpl.Container implements FDIR {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getIntervalTime() <em>Interval Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalTime()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntervalTime() <em>Interval Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalTime()
	 * @generated
	 * @ordered
	 */
	protected int intervalTime = INTERVAL_TIME_EDEFAULT;

	/**
	 * This is true if the Interval Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FDIRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkTopologyPackage.Literals.FDIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntervalTime() {
		return intervalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalTime(int newIntervalTime) {
		int oldIntervalTime = intervalTime;
		intervalTime = newIntervalTime;
		boolean oldIntervalTimeESet = intervalTimeESet;
		intervalTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkTopologyPackage.FDIR__INTERVAL_TIME, oldIntervalTime, intervalTime, !oldIntervalTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntervalTime() {
		int oldIntervalTime = intervalTime;
		boolean oldIntervalTimeESet = intervalTimeESet;
		intervalTime = INTERVAL_TIME_EDEFAULT;
		intervalTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NetworkTopologyPackage.FDIR__INTERVAL_TIME, oldIntervalTime, INTERVAL_TIME_EDEFAULT, oldIntervalTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntervalTime() {
		return intervalTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkTopologyPackage.FDIR__INTERVAL_TIME:
				return getIntervalTime();
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
			case NetworkTopologyPackage.FDIR__INTERVAL_TIME:
				setIntervalTime((Integer)newValue);
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
			case NetworkTopologyPackage.FDIR__INTERVAL_TIME:
				unsetIntervalTime();
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
			case NetworkTopologyPackage.FDIR__INTERVAL_TIME:
				return isSetIntervalTime();
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
		result.append(" (intervalTime: "); //$NON-NLS-1$
		if (intervalTimeESet) result.append(intervalTime); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //FDIRImpl
