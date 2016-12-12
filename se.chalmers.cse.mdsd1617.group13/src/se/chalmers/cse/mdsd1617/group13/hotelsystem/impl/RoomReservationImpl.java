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
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
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
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getIreceptionistroomtypeprovides <em>Ireceptionistroomtypeprovides</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getRoomExtras <em>Room Extras</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomReservationImpl extends MinimalEObjectImpl.Container implements RoomReservation {
	/**
	 * The cached value of the '{@link #getIreceptionistroomtypeprovides() <em>Ireceptionistroomtypeprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIreceptionistroomtypeprovides()
	 * @generated
	 * @ordered
	 */
	protected RoomType ireceptionistroomtypeprovides;

	/**
	 * The cached value of the '{@link #getRoomExtras() <em>Room Extras</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomExtras()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomExtras> roomExtras;

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
	public RoomType getIreceptionistroomtypeprovides() {
		if (ireceptionistroomtypeprovides != null && ireceptionistroomtypeprovides.eIsProxy()) {
			InternalEObject oldIreceptionistroomtypeprovides = (InternalEObject)ireceptionistroomtypeprovides;
			ireceptionistroomtypeprovides = (RoomType)eResolveProxy(oldIreceptionistroomtypeprovides);
			if (ireceptionistroomtypeprovides != oldIreceptionistroomtypeprovides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES, oldIreceptionistroomtypeprovides, ireceptionistroomtypeprovides));
			}
		}
		return ireceptionistroomtypeprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetIreceptionistroomtypeprovides() {
		return ireceptionistroomtypeprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIreceptionistroomtypeprovides(RoomType newIreceptionistroomtypeprovides) {
		RoomType oldIreceptionistroomtypeprovides = ireceptionistroomtypeprovides;
		ireceptionistroomtypeprovides = newIreceptionistroomtypeprovides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES, oldIreceptionistroomtypeprovides, ireceptionistroomtypeprovides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomExtras> getRoomExtras() {
		if (roomExtras == null) {
			roomExtras = new EObjectResolvingEList<RoomExtras>(RoomExtras.class, this, HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS);
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
	public void checkIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double checkOut(int nrOfNights) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public int getRoomId() {
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
			case HotelsystemPackage.ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES:
				if (resolve) return getIreceptionistroomtypeprovides();
				return basicGetIreceptionistroomtypeprovides();
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS:
				return getRoomExtras();
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				return getStartDate();
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				return getEndDate();
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
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
			case HotelsystemPackage.ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES:
				setIreceptionistroomtypeprovides((RoomType)newValue);
				return;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS:
				getRoomExtras().clear();
				getRoomExtras().addAll((Collection<? extends RoomExtras>)newValue);
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
			case HotelsystemPackage.ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES:
				setIreceptionistroomtypeprovides((RoomType)null);
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
			case HotelsystemPackage.ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES:
				return ireceptionistroomtypeprovides != null;
			case HotelsystemPackage.ROOM_RESERVATION__ROOM_EXTRAS:
				return roomExtras != null && !roomExtras.isEmpty();
			case HotelsystemPackage.ROOM_RESERVATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case HotelsystemPackage.ROOM_RESERVATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case HotelsystemPackage.ROOM_RESERVATION__ROOM:
				return room != null;
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
