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
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl#getRoomHandler <em>Room Handler</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl#getBookingHandler <em>Booking Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelInitializerImpl extends MinimalEObjectImpl.Container implements HotelInitializer {
	/**
	 * The cached value of the '{@link #getRoomHandler() <em>Room Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomHandler()
	 * @generated
	 * @ordered
	 */
	protected RoomHandler roomHandler;

	/**
	 * The cached value of the '{@link #getBookingHandler() <em>Booking Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingHandler()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler bookingHandler;

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
	 * @generated NOT
	 */
	public void startup(int numRooms) {
		HotelsystemFactoryImpl factory = new HotelsystemFactoryImpl();
		roomHandler = factory.createRoomHandler();
		roomHandler.initialize(numRooms);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler getRoomHandler() {
		if (roomHandler != null && roomHandler.eIsProxy()) {
			InternalEObject oldRoomHandler = (InternalEObject)roomHandler;
			roomHandler = (RoomHandler)eResolveProxy(oldRoomHandler);
			if (roomHandler != oldRoomHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.HOTEL_INITIALIZER__ROOM_HANDLER, oldRoomHandler, roomHandler));
			}
		}
		return roomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler basicGetRoomHandler() {
		return roomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomHandler(RoomHandler newRoomHandler) {
		RoomHandler oldRoomHandler = roomHandler;
		roomHandler = newRoomHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.HOTEL_INITIALIZER__ROOM_HANDLER, oldRoomHandler, roomHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler getBookingHandler() {
		if (bookingHandler != null && bookingHandler.eIsProxy()) {
			InternalEObject oldBookingHandler = (InternalEObject)bookingHandler;
			bookingHandler = (BookingHandler)eResolveProxy(oldBookingHandler);
			if (bookingHandler != oldBookingHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.HOTEL_INITIALIZER__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
			}
		}
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler basicGetBookingHandler() {
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingHandler(BookingHandler newBookingHandler) {
		BookingHandler oldBookingHandler = bookingHandler;
		bookingHandler = newBookingHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.HOTEL_INITIALIZER__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelsystemPackage.HOTEL_INITIALIZER__ROOM_HANDLER:
				if (resolve) return getRoomHandler();
				return basicGetRoomHandler();
			case HotelsystemPackage.HOTEL_INITIALIZER__BOOKING_HANDLER:
				if (resolve) return getBookingHandler();
				return basicGetBookingHandler();
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
			case HotelsystemPackage.HOTEL_INITIALIZER__ROOM_HANDLER:
				setRoomHandler((RoomHandler)newValue);
				return;
			case HotelsystemPackage.HOTEL_INITIALIZER__BOOKING_HANDLER:
				setBookingHandler((BookingHandler)newValue);
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
			case HotelsystemPackage.HOTEL_INITIALIZER__ROOM_HANDLER:
				setRoomHandler((RoomHandler)null);
				return;
			case HotelsystemPackage.HOTEL_INITIALIZER__BOOKING_HANDLER:
				setBookingHandler((BookingHandler)null);
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
			case HotelsystemPackage.HOTEL_INITIALIZER__ROOM_HANDLER:
				return roomHandler != null;
			case HotelsystemPackage.HOTEL_INITIALIZER__BOOKING_HANDLER:
				return bookingHandler != null;
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //HotelInitializerImpl
