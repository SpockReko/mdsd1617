/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Room;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra;
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
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getRoomExtras <em>Room Extras</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getCheckInDate <em>Check In Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomReservationImpl extends MinimalEObjectImpl.Container implements RoomReservation {
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
	 * The cached value of the '{@link #getRoomExtras() <em>Room Extras</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomExtras()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomExtra> roomExtras;

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
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The default value of the '{@link #getCheckInDate() <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_IN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckInDate() <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected String checkInDate = CHECK_IN_DATE_EDEFAULT;

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
	public EList<RoomExtra> getRoomExtras() {
		if (roomExtras == null) {
			roomExtras = new EObjectResolvingEList<RoomExtra>(RoomExtra.class, this, HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS);
		}
		return roomExtras;
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
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
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
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_RESERVATION__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckInDate() {
		return checkInDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInDate(String newCheckInDate) {
		String oldCheckInDate = checkInDate;
		checkInDate = newCheckInDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_RESERVATION__CHECK_IN_DATE, oldCheckInDate, checkInDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn() {
		room.setOccupied(true);
		checkInDate = ( new SimpleDateFormat( "yyyyMMdd" ) ).format( Calendar.getInstance().getTime() );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double checkOut(int nrOfNights) {
		if(room != null && roomType != null && !room.isOccupied()) {
			return 0;
		}
		room.setOccupied(false);
		double price = nrOfNights * roomType.getPricePerNight();
		for(RoomExtra extra : roomExtras) {
			price += extra.getPrice();
		}
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room getRoomIfOccupied(String date) {
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date requestDate;
		Date checkOutDate;
		try{
			requestDate = format.parse(date);
			checkOutDate = format.parse(endDate);
		}catch (ParseException e) {
			return null;
		}
		
		/*
		 * Since the room is not occupied until it is checked in we cannot know if the room
		 * will be occupied in the future if it is not already checked in.
		*/
		if(room.isOccupied() && (requestDate.compareTo(checkOutDate)) < 0){
			return room;
		}else{
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getRoomId() {
		return room.getRoomNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addExtra(RoomExtra extra) {
		this.roomExtras.add(extra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS:
				return getRoomExtras();
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				return getStartDate();
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				return getEndDate();
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case HotelsystemPackage.ROOM_RESERVATION__CHECK_IN_DATE:
				return getCheckInDate();
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
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS:
				getRoomExtras().clear();
				getRoomExtras().addAll((Collection<? extends RoomExtra>)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				setStartDate((String)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				setEndDate((String)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				setRoom((Room)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__CHECK_IN_DATE:
				setCheckInDate((String)newValue);
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
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS:
				getRoomExtras().clear();
				return;
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				setRoom((Room)null);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__CHECK_IN_DATE:
				setCheckInDate(CHECK_IN_DATE_EDEFAULT);
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
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_TYPE:
				return roomType != null;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS:
				return roomExtras != null && !roomExtras.isEmpty();
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				return room != null;
			case HotelsystemPackage.ROOM_RESERVATION__CHECK_IN_DATE:
				return CHECK_IN_DATE_EDEFAULT == null ? checkInDate != null : !CHECK_IN_DATE_EDEFAULT.equals(checkInDate);
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
			case HotelsystemPackage.ROOM_RESERVATION___GET_ROOM_ID:
				return getRoomId();
			case HotelsystemPackage.ROOM_RESERVATION___ADD_EXTRA__ROOMEXTRA:
				addExtra((RoomExtra)arguments.get(0));
				return null;
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
		result.append(", checkInDate: ");
		result.append(checkInDate);
		result.append(')');
		return result.toString();
	}

} //RoomReservationImpl
