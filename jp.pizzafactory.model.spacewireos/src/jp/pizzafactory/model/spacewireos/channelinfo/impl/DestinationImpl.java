/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.channelinfo.impl;

import java.util.Collection;

import jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage;
import jp.pizzafactory.model.spacewireos.channelinfo.Destination;
import jp.pizzafactory.model.spacewireos.channelinfo.Path;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.DestinationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.DestinationImpl#getId <em>Id</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.DestinationImpl#getRedundancy <em>Redundancy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DestinationImpl extends MinimalEObjectImpl.Container implements Destination {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> path;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedundancy() <em>Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final int REDUNDANCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRedundancy() <em>Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundancy()
	 * @generated
	 * @ordered
	 */
	protected int redundancy = REDUNDANCY_EDEFAULT;

	/**
	 * This is true if the Redundancy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean redundancyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChannelInfoPackage.Literals.DESTINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Path> getPath() {
		if (path == null) {
			path = new EObjectContainmentEList<Path>(Path.class, this, ChannelInfoPackage.DESTINATION__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChannelInfoPackage.DESTINATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRedundancy() {
		return redundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedundancy(int newRedundancy) {
		int oldRedundancy = redundancy;
		redundancy = newRedundancy;
		boolean oldRedundancyESet = redundancyESet;
		redundancyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChannelInfoPackage.DESTINATION__REDUNDANCY, oldRedundancy, redundancy, !oldRedundancyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRedundancy() {
		int oldRedundancy = redundancy;
		boolean oldRedundancyESet = redundancyESet;
		redundancy = REDUNDANCY_EDEFAULT;
		redundancyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChannelInfoPackage.DESTINATION__REDUNDANCY, oldRedundancy, REDUNDANCY_EDEFAULT, oldRedundancyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedundancy() {
		return redundancyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChannelInfoPackage.DESTINATION__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChannelInfoPackage.DESTINATION__PATH:
				return getPath();
			case ChannelInfoPackage.DESTINATION__ID:
				return getId();
			case ChannelInfoPackage.DESTINATION__REDUNDANCY:
				return getRedundancy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChannelInfoPackage.DESTINATION__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends Path>)newValue);
				return;
			case ChannelInfoPackage.DESTINATION__ID:
				setId((String)newValue);
				return;
			case ChannelInfoPackage.DESTINATION__REDUNDANCY:
				setRedundancy((Integer)newValue);
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
			case ChannelInfoPackage.DESTINATION__PATH:
				getPath().clear();
				return;
			case ChannelInfoPackage.DESTINATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ChannelInfoPackage.DESTINATION__REDUNDANCY:
				unsetRedundancy();
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
			case ChannelInfoPackage.DESTINATION__PATH:
				return path != null && !path.isEmpty();
			case ChannelInfoPackage.DESTINATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ChannelInfoPackage.DESTINATION__REDUNDANCY:
				return isSetRedundancy();
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", redundancy: "); //$NON-NLS-1$
		if (redundancyESet) result.append(redundancy); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //DestinationImpl
