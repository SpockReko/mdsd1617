/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl#getReservationhandler <em>Reservationhandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelInitializerImpl extends MinimalEObjectImpl.Container implements HotelInitializer {
	/**
	 * The cached value of the '{@link #getRoomhandler() <em>Roomhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomhandler()
	 * @generated
	 * @ordered
	 */
	protected RoomHandler roomhandler;

	/**
	 * The cached value of the '{@link #getReservationhandler() <em>Reservationhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationhandler()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler reservationhandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelsystemPackage.Literals.HOTEL_INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler getRoomhandler() {
		if (roomhandler != null && roomhandler.eIsProxy()) {
			InternalEObject oldRoomhandler = (InternalEObject)roomhandler;
			roomhandler = (RoomHandler)eResolveProxy(oldRoomhandler);
			if (roomhandler != oldRoomhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.HOTEL_INITIALIZER__ROOMHANDLER, oldRoomhandler, roomhandler));
			}
		}
		return roomhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler basicGetRoomhandler() {
		return roomhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomhandler(RoomHandler newRoomhandler) {
		RoomHandler oldRoomhandler = roomhandler;
		roomhandler = newRoomhandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.HOTEL_INITIALIZER__ROOMHANDLER, oldRoomhandler, roomhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler getReservationhandler() {
		if (reservationhandler != null && reservationhandler.eIsProxy()) {
			InternalEObject oldReservationhandler = (InternalEObject)reservationhandler;
			reservationhandler = (BookingHandler)eResolveProxy(oldReservationhandler);
			if (reservationhandler != oldReservationhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.HOTEL_INITIALIZER__RESERVATIONHANDLER, oldReservationhandler, reservationhandler));
			}
		}
		return reservationhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler basicGetReservationhandler() {
		return reservationhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationhandler(BookingHandler newReservationhandler) {
		BookingHandler oldReservationhandler = reservationhandler;
		reservationhandler = newReservationhandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.HOTEL_INITIALIZER__RESERVATIONHANDLER, oldReservationhandler, reservationhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startup(int numRooms) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler getRoomHandler() {
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
			case HotelsystemPackage.HOTEL_INITIALIZER__ROOMHANDLER:
				if (resolve) return getRoomhandler();
				return basicGetRoomhandler();
			case HotelsystemPackage.HOTEL_INITIALIZER__RESERVATIONHANDLER:
				if (resolve) return getReservationhandler();
				return basicGetReservationhandler();
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
			case HotelsystemPackage.HOTEL_INITIALIZER__ROOMHANDLER:
				setRoomhandler((RoomHandler)newValue);
				return;
			case HotelsystemPackage.HOTEL_INITIALIZER__RESERVATIONHANDLER:
				setReservationhandler((BookingHandler)newValue);
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
			case HotelsystemPackage.HOTEL_INITIALIZER__ROOMHANDLER:
				setRoomhandler((RoomHandler)null);
				return;
			case HotelsystemPackage.HOTEL_INITIALIZER__RESERVATIONHANDLER:
				setReservationhandler((BookingHandler)null);
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
			case HotelsystemPackage.HOTEL_INITIALIZER__ROOMHANDLER:
				return roomhandler != null;
			case HotelsystemPackage.HOTEL_INITIALIZER__RESERVATIONHANDLER:
				return reservationhandler != null;
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
			case HotelsystemPackage.HOTEL_INITIALIZER___STARTUP__INT:
				startup((Integer)arguments.get(0));
				return null;
			case HotelsystemPackage.HOTEL_INITIALIZER___GET_ROOM_HANDLER:
				return getRoomHandler();
		}
		return super.eInvoke(operationID, arguments);
	}

} //HotelInitializerImpl
