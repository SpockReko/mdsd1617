/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Room;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getExtras <em>Extras</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getBill <em>Bill</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomReservationImpl extends MinimalEObjectImpl.Container implements RoomReservation {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected IReceptionistRoomProvides room;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * The cached value of the '{@link #getExtras() <em>Extras</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtras()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomExtras> extras;

	/**
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected Bill bill;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelsystemPackage.Literals.ROOM_RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReceptionistRoomProvides getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (IReceptionistRoomProvides)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.ROOM_RESERVATION__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReceptionistRoomProvides basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(IReceptionistRoomProvides newRoom) {
		IReceptionistRoomProvides oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_RESERVATION__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomExtras> getExtras() {
		if (extras == null) {
			extras = new EObjectResolvingEList<RoomExtras>(RoomExtras.class, this, HotelsystemPackage.ROOM_RESERVATION__EXTRAS);
		}
		return extras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill getBill() {
		if (bill != null && bill.eIsProxy()) {
			InternalEObject oldBill = (InternalEObject)bill;
			bill = (Bill)eResolveProxy(oldBill);
			if (bill != oldBill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.ROOM_RESERVATION__BILL, oldBill, bill));
			}
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill basicGetBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill(Bill newBill) {
		Bill oldBill = bill;
		bill = newBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_RESERVATION__BILL, oldBill, bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_RESERVATION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_RESERVATION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double checkOut(int nrOfNights) {
		if(!room.roomIsOccupied()) {
			return 0;
		}
		double price = nrOfNights * roomType.getPricePerNight();
		for(RoomExtras extra : extras) {
			price += extra.getPrice();
		}
		room.setOccupied(false);
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoomIfOccupied(String date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case HotelsystemPackage.ROOM_RESERVATION__EXTRAS:
				return getExtras();
			case HotelsystemPackage.ROOM_RESERVATION__BILL:
				if (resolve) return getBill();
				return basicGetBill();
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				return getStartDate();
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				return getEndDate();
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
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				setRoom((IReceptionistRoomProvides)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__EXTRAS:
				getExtras().clear();
				getExtras().addAll((Collection<? extends RoomExtras>)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__BILL:
				setBill((Bill)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				setStartDate((String)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				setEndDate((String)newValue);
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
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				setRoom((IReceptionistRoomProvides)null);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__EXTRAS:
				getExtras().clear();
				return;
			case HotelsystemPackage.ROOM_RESERVATION__BILL:
				setBill((Bill)null);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				return room != null;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE:
				return roomType != null;
			case HotelsystemPackage.ROOM_RESERVATION__EXTRAS:
				return extras != null && !extras.isEmpty();
			case HotelsystemPackage.ROOM_RESERVATION__BILL:
				return bill != null;
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelsystemPackage.ROOM_RESERVATION___CHECK_IN:
				checkIn();
				return null;
			case HotelsystemPackage.ROOM_RESERVATION___CHECK_OUT__INT:
				return checkOut((Integer)arguments.get(0));
			case HotelsystemPackage.ROOM_RESERVATION___GET_ROOM_IF_OCCUPIED__STRING:
				return getRoomIfOccupied((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //RoomReservationImpl
