/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package jp.pizzafactory.model.spacewireos.channelinfo.impl;

import java.util.Collection;

import jp.pizzafactory.model.spacewireos.channelinfo.ChannelInfoPackage;
import jp.pizzafactory.model.spacewireos.channelinfo.Packet;
import jp.pizzafactory.model.spacewireos.channelinfo.PacketType;
import jp.pizzafactory.model.spacewireos.channelinfo.Timeslot;

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
 * An implementation of the model object '<em><b>Packet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl#getTimeslot <em>Timeslot</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl#getCargosize <em>Cargosize</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl#getId <em>Id</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl#isReply <em>Reply</em>}</li>
 *   <li>{@link jp.pizzafactory.model.spacewireos.channelinfo.impl.PacketImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PacketImpl extends MinimalEObjectImpl.Container implements Packet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTimeslot() <em>Timeslot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeslot()
	 * @generated
	 * @ordered
	 */
	protected EList<Timeslot> timeslot;

	/**
	 * The default value of the '{@link #getCargosize() <em>Cargosize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargosize()
	 * @generated
	 * @ordered
	 */
	protected static final int CARGOSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCargosize() <em>Cargosize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargosize()
	 * @generated
	 * @ordered
	 */
	protected int cargosize = CARGOSIZE_EDEFAULT;

	/**
	 * This is true if the Cargosize attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cargosizeESet;

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
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * This is true if the Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean periodESet;

	/**
	 * The default value of the '{@link #isReply() <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReply() <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReply()
	 * @generated
	 * @ordered
	 */
	protected boolean reply = REPLY_EDEFAULT;

	/**
	 * This is true if the Reply attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replyESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PacketType TYPE_EDEFAULT = PacketType.RMAPW;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PacketType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChannelInfoPackage.Literals.PACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timeslot> getTimeslot() {
		if (timeslot == null) {
			timeslot = new EObjectContainmentEList<Timeslot>(Timeslot.class, this, ChannelInfoPackage.PACKET__TIMESLOT);
		}
		return timeslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCargosize() {
		return cargosize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCargosize(int newCargosize) {
		int oldCargosize = cargosize;
		cargosize = newCargosize;
		boolean oldCargosizeESet = cargosizeESet;
		cargosizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChannelInfoPackage.PACKET__CARGOSIZE, oldCargosize, cargosize, !oldCargosizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCargosize() {
		int oldCargosize = cargosize;
		boolean oldCargosizeESet = cargosizeESet;
		cargosize = CARGOSIZE_EDEFAULT;
		cargosizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChannelInfoPackage.PACKET__CARGOSIZE, oldCargosize, CARGOSIZE_EDEFAULT, oldCargosizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCargosize() {
		return cargosizeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChannelInfoPackage.PACKET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		boolean oldPeriodESet = periodESet;
		periodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChannelInfoPackage.PACKET__PERIOD, oldPeriod, period, !oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeriod() {
		int oldPeriod = period;
		boolean oldPeriodESet = periodESet;
		period = PERIOD_EDEFAULT;
		periodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChannelInfoPackage.PACKET__PERIOD, oldPeriod, PERIOD_EDEFAULT, oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeriod() {
		return periodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReply() {
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReply(boolean newReply) {
		boolean oldReply = reply;
		reply = newReply;
		boolean oldReplyESet = replyESet;
		replyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChannelInfoPackage.PACKET__REPLY, oldReply, reply, !oldReplyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReply() {
		boolean oldReply = reply;
		boolean oldReplyESet = replyESet;
		reply = REPLY_EDEFAULT;
		replyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChannelInfoPackage.PACKET__REPLY, oldReply, REPLY_EDEFAULT, oldReplyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReply() {
		return replyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PacketType newType) {
		PacketType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChannelInfoPackage.PACKET__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		PacketType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChannelInfoPackage.PACKET__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChannelInfoPackage.PACKET__TIMESLOT:
				return ((InternalEList<?>)getTimeslot()).basicRemove(otherEnd, msgs);
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
			case ChannelInfoPackage.PACKET__TIMESLOT:
				return getTimeslot();
			case ChannelInfoPackage.PACKET__CARGOSIZE:
				return getCargosize();
			case ChannelInfoPackage.PACKET__ID:
				return getId();
			case ChannelInfoPackage.PACKET__PERIOD:
				return getPeriod();
			case ChannelInfoPackage.PACKET__REPLY:
				return isReply();
			case ChannelInfoPackage.PACKET__TYPE:
				return getType();
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
			case ChannelInfoPackage.PACKET__TIMESLOT:
				getTimeslot().clear();
				getTimeslot().addAll((Collection<? extends Timeslot>)newValue);
				return;
			case ChannelInfoPackage.PACKET__CARGOSIZE:
				setCargosize((Integer)newValue);
				return;
			case ChannelInfoPackage.PACKET__ID:
				setId((String)newValue);
				return;
			case ChannelInfoPackage.PACKET__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case ChannelInfoPackage.PACKET__REPLY:
				setReply((Boolean)newValue);
				return;
			case ChannelInfoPackage.PACKET__TYPE:
				setType((PacketType)newValue);
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
			case ChannelInfoPackage.PACKET__TIMESLOT:
				getTimeslot().clear();
				return;
			case ChannelInfoPackage.PACKET__CARGOSIZE:
				unsetCargosize();
				return;
			case ChannelInfoPackage.PACKET__ID:
				setId(ID_EDEFAULT);
				return;
			case ChannelInfoPackage.PACKET__PERIOD:
				unsetPeriod();
				return;
			case ChannelInfoPackage.PACKET__REPLY:
				unsetReply();
				return;
			case ChannelInfoPackage.PACKET__TYPE:
				unsetType();
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
			case ChannelInfoPackage.PACKET__TIMESLOT:
				return timeslot != null && !timeslot.isEmpty();
			case ChannelInfoPackage.PACKET__CARGOSIZE:
				return isSetCargosize();
			case ChannelInfoPackage.PACKET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ChannelInfoPackage.PACKET__PERIOD:
				return isSetPeriod();
			case ChannelInfoPackage.PACKET__REPLY:
				return isSetReply();
			case ChannelInfoPackage.PACKET__TYPE:
				return isSetType();
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
		result.append(" (cargosize: "); //$NON-NLS-1$
		if (cargosizeESet) result.append(cargosize); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", period: "); //$NON-NLS-1$
		if (periodESet) result.append(period); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", reply: "); //$NON-NLS-1$
		if (replyESet) result.append(reply); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", type: "); //$NON-NLS-1$
		if (typeESet) result.append(type); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //PacketImpl
