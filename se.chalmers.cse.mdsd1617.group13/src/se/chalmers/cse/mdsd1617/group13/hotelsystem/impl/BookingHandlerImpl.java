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
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;


import se.chalmers.cse.mdsd1617.group13.hotelsystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl#getPaymentHandler <em>Payment Handler</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl#getBookingCurrentlyCheckingOut <em>Booking Currently Checking Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingHandlerImpl extends MinimalEObjectImpl.Container implements BookingHandler {
	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookings;

	/**
	 * The cached value of the '{@link #getPaymentHandler() <em>Payment Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentHandler()
	 * @generated
	 * @ordered
	 */
	protected PaymentHandler paymentHandler;

	/**
	 * The cached value of the '{@link #getRoomhandler() <em>Roomhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomhandler()
	 * @generated
	 * @ordered
	 */
	protected IRoomHandler roomhandler;

	/**
	 * The default value of the '{@link #getBookingCurrentlyCheckingOut() <em>Booking Currently Checking Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingCurrentlyCheckingOut()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_CURRENTLY_CHECKING_OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingCurrentlyCheckingOut() <em>Booking Currently Checking Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingCurrentlyCheckingOut()
	 * @generated
	 * @ordered
	 */
	protected int bookingCurrentlyCheckingOut = BOOKING_CURRENTLY_CHECKING_OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelsystemPackage.Literals.BOOKING_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectResolvingEList<Booking>(Booking.class, this, HotelsystemPackage.BOOKING_HANDLER__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler getPaymentHandler() {
		if (paymentHandler != null && paymentHandler.eIsProxy()) {
			InternalEObject oldPaymentHandler = (InternalEObject)paymentHandler;
			paymentHandler = (PaymentHandler)eResolveProxy(oldPaymentHandler);
			if (paymentHandler != oldPaymentHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.BOOKING_HANDLER__PAYMENT_HANDLER, oldPaymentHandler, paymentHandler));
			}
		}
		return paymentHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler basicGetPaymentHandler() {
		return paymentHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentHandler(PaymentHandler newPaymentHandler) {
		PaymentHandler oldPaymentHandler = paymentHandler;
		paymentHandler = newPaymentHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BOOKING_HANDLER__PAYMENT_HANDLER, oldPaymentHandler, paymentHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomHandler getRoomhandler() {
		if (roomhandler != null && roomhandler.eIsProxy()) {
			InternalEObject oldRoomhandler = (InternalEObject)roomhandler;
			roomhandler = (IRoomHandler)eResolveProxy(oldRoomhandler);
			if (roomhandler != oldRoomhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.BOOKING_HANDLER__ROOMHANDLER, oldRoomhandler, roomhandler));
			}
		}
		return roomhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomHandler basicGetRoomhandler() {
		return roomhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomhandler(IRoomHandler newRoomhandler) {
		IRoomHandler oldRoomhandler = roomhandler;
		roomhandler = newRoomhandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BOOKING_HANDLER__ROOMHANDLER, oldRoomhandler, roomhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingCurrentlyCheckingOut() {
		return bookingCurrentlyCheckingOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingCurrentlyCheckingOut(int newBookingCurrentlyCheckingOut) {
		int oldBookingCurrentlyCheckingOut = bookingCurrentlyCheckingOut;
		bookingCurrentlyCheckingOut = newBookingCurrentlyCheckingOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BOOKING_HANDLER__BOOKING_CURRENTLY_CHECKING_OUT, oldBookingCurrentlyCheckingOut, bookingCurrentlyCheckingOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean editBookingTime(int reservationId, String startDate, String endDate) {
		Booking booking = getBookingById(reservationId);
		if(booking != null){
			//Needs to be checked first!
			booking.setStartDate(startDate);
			booking.setEndDate(endDate);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addRoomTypeToBooking(int bookingId, String roomType, int numberOfRoomsForType) {
		Booking booking = getBookingById(bookingId);
		RoomType rt = roomhandler.getRoomType(roomType);
		if(booking != null && rt != null){
			for(int i = 0; i < numberOfRoomsForType; i++){
				booking.getRoomReservation().add(new RoomReservationImpl());
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated  NOT
	 */
	public boolean removeRoomTypeFromBooking(int bookingId, String roomType, int nbrToRemove) {
		Booking booking = getBookingById(bookingId);
		RoomType rt = roomhandler.getRoomType(roomType);
		if(booking != null && rt != null){
			for(int i = 0; i < nbrToRemove; i++){
				EList<RoomReservation> bookings = booking.getRoomReservation();
				for(RoomReservation rr : bookings){
					if(rr != null && rr.getRoomType() == rt){
						bookings.remove(rr);
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> listFreeRooms(int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Integer> checkIn(int bookingId, int roomNumbers) {
		
		if(roomNumbers != 0) {
			this.getBookingById(bookingId).checkIn(roomNumbers);
		}
		
		return this.listFreeRooms(bookingId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean cancelBooking(int bookingId) {
		Booking bookingToCancel = getBookingById(bookingId);

		if (bookingToCancel == null) { // booking not found
			return false;
		}

		if (bookingToCancel.isCheckedIn()) { // cannot cancel a checked in booking
			return false;
		}

		// marks the room as free
		for (RoomReservation roomReservation : bookingToCancel.getRoomReservation()) {
			roomReservation.getRoom().setOccupied(false);
		}

		bookingToCancel.setCanceled(true);

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> listBookings() {
		for(Booking booking: bookings){
			booking.toString();
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map listOccupiedRooms(String date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Same as listCheckouts(), just a placeholder atm. 
	 * @generated NOT
	 */
	public EList<Booking> listCheckins(String startDate, String endDate) {
		DateFormat format = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
		Date sDate = null;
		Date eDate = null;
		try {
			sDate = format.parse(startDate);
			eDate = format.parse(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EList<Booking> bookingList = new BasicEList<Booking>();
		Date testDate = sDate;		
		for(Booking b : bookings) {
			for(RoomReservation r : b.getRoomReservation()){
				while(testDate.after(eDate)){
					if(r.getCheckIn().equals(testDate)){
						bookingList.add(b);
					}
					try{
						testDate = format.parse(addDay(testDate.toString()));
					}catch (ParseException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return bookingList;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Not sure if it should return a list of Bookings or RoomReservations
	 * @generated NOT
	 */
	public EList<Booking> listCheckouts(String startDate, String endDate) {
		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		Date sDate = null;
		Date eDate = null;
		try {
			sDate = format.parse(startDate);
			eDate = format.parse(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EList<Booking> bookingList = new BasicEList<Booking>();
		
		for(Booking b : bookings) {
			Date testDate = null;
			try {
				testDate = format.parse(b.getEndDate());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(!(testDate.before(sDate) || testDate.after(eDate))) {
				bookingList.add(b);
			}
		}
		
		return bookingList;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addExtraToRoom(int bookingId, int roomNumber, String extraDescription, int price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FreeRoomTypesDTO> getFreeRooms(int numBeds, String startDate, String endDate) {
		EList<FreeRoomTypesDTO> freeRooms = new BasicEList<FreeRoomTypesDTO>();
		int nrOfRoomFree = 0;
		EList<RoomType> roomtypes = roomhandler.getAllRoomTypes(numBeds);
		for (RoomType roomtype : roomtypes){
			//Get the list of all room of a given roomtype
			EList<Room> rooms = roomhandler.getAllRoomsByType(roomtype);
					
			for(Room room: rooms){
					//see if it is free in the given period.
					if(isFree(room.getRoomNumber(), startDate, endDate)){
						//Count if it is true
						nrOfRoomFree++;
					}
			}
					//Get all the nesseary information and save them.
					FreeRoomTypesDTO freeRoom = new FreeRoomTypesDTOImpl();
					freeRoom.setNumBeds(roomtype.getNumBeds());
					freeRoom.setNumFreeRooms(nrOfRoomFree);
					freeRoom.setPricePerNight(roomtype.getPricePerNight());
					freeRoom.setRoomTypeDescription(roomtype.getDescription());
					freeRooms.add(freeRoom);			
		}
		return freeRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int initiateBooking(String firstName, String startDate, String endDate, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoomToBooking(String roomTypeDescription, int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean confirmBooking(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double initiateCheckout(int bookingID) {
		Booking booking = getBookingById(bookingID);
		if(booking == null || this.bookingCurrentlyCheckingOut != 0) {
			return -1;
		}
		this.bookingCurrentlyCheckingOut = bookingID;
		return booking.checkOut();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean payDuringCheckout(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		Booking booking = bookings.get(this.bookingCurrentlyCheckingOut);
		if(booking == null) {
			return false;
		}
		double price = booking.getBookingPrice();
		if(price <= 0) {
			return false;
		}
		bookingCurrentlyCheckingOut = 0;
		return paymentHandler.payIfCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, price);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean initiateRoomCheckout(int roomNumber, int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean payRoomDuringCheckout(int roomNumber, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		boolean roomPaidAndCheckedOut = false;
		for (Booking booking: bookings){
			if(booking.getBookingId() == bookingCurrentlyCheckingOut){
				for (RoomReservation roomReservation: booking.getRoomReservation()){
					if(roomReservation.getRoomId() == roomNumber){
						paymentHandler.payIfCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, roomReservation.checkOut(booking.nrOfNights()));
					}
				}
				roomPaidAndCheckedOut = true;
			} else {
				roomPaidAndCheckedOut = false;
			}
		}
		return roomPaidAndCheckedOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int checkInRoom(String roomTypeDescription, int bookindId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BookingCheckin(String date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String addDay(String date) {
		// translate the date to ints
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(4,6));
		int day = Integer.parseInt(date.substring(6));
		// Get, set with our dates and add a day to a Calendar object.
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		cal.add(Calendar.DATE, 1);
		// Translate back the dates to Integers
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);
		//Translate the new date to String 
		String newDate = "" + year + month + day;
		return newDate;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBookingById(int bookingId) {
        for (Booking booking : bookings) {
            if(booking.getBookingId() == bookingId) {
                return booking;
            }
        }

        return null;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFree(int roomId, String startDate, String endDate) {
		Boolean free = true;
		for(Booking booking: bookings){
			if(!booking.isFree(roomId, startDate, endDate)){
				free = false;
			}
		}
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelsystemPackage.BOOKING_HANDLER__BOOKINGS:
				return getBookings();
			case HotelsystemPackage.BOOKING_HANDLER__PAYMENT_HANDLER:
				if (resolve) return getPaymentHandler();
				return basicGetPaymentHandler();
			case HotelsystemPackage.BOOKING_HANDLER__ROOMHANDLER:
				if (resolve) return getRoomhandler();
				return basicGetRoomhandler();
			case HotelsystemPackage.BOOKING_HANDLER__BOOKING_CURRENTLY_CHECKING_OUT:
				return getBookingCurrentlyCheckingOut();
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
			case HotelsystemPackage.BOOKING_HANDLER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends Booking>)newValue);
				return;
			case HotelsystemPackage.BOOKING_HANDLER__PAYMENT_HANDLER:
				setPaymentHandler((PaymentHandler)newValue);
				return;
			case HotelsystemPackage.BOOKING_HANDLER__ROOMHANDLER:
				setRoomhandler((IRoomHandler)newValue);
				return;
			case HotelsystemPackage.BOOKING_HANDLER__BOOKING_CURRENTLY_CHECKING_OUT:
				setBookingCurrentlyCheckingOut((Integer)newValue);
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
			case HotelsystemPackage.BOOKING_HANDLER__BOOKINGS:
				getBookings().clear();
				return;
			case HotelsystemPackage.BOOKING_HANDLER__PAYMENT_HANDLER:
				setPaymentHandler((PaymentHandler)null);
				return;
			case HotelsystemPackage.BOOKING_HANDLER__ROOMHANDLER:
				setRoomhandler((IRoomHandler)null);
				return;
			case HotelsystemPackage.BOOKING_HANDLER__BOOKING_CURRENTLY_CHECKING_OUT:
				setBookingCurrentlyCheckingOut(BOOKING_CURRENTLY_CHECKING_OUT_EDEFAULT);
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
			case HotelsystemPackage.BOOKING_HANDLER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case HotelsystemPackage.BOOKING_HANDLER__PAYMENT_HANDLER:
				return paymentHandler != null;
			case HotelsystemPackage.BOOKING_HANDLER__ROOMHANDLER:
				return roomhandler != null;
			case HotelsystemPackage.BOOKING_HANDLER__BOOKING_CURRENTLY_CHECKING_OUT:
				return bookingCurrentlyCheckingOut != BOOKING_CURRENTLY_CHECKING_OUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IHotelCustomerProvides.class) {
			switch (baseOperationID) {
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING: return HotelsystemPackage.BOOKING_HANDLER___GET_FREE_ROOMS__INT_STRING_STRING;
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING: return HotelsystemPackage.BOOKING_HANDLER___INITIATE_BOOKING__STRING_STRING_STRING_STRING;
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT: return HotelsystemPackage.BOOKING_HANDLER___ADD_ROOM_TO_BOOKING__STRING_INT;
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT: return HotelsystemPackage.BOOKING_HANDLER___CONFIRM_BOOKING__INT;
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT: return HotelsystemPackage.BOOKING_HANDLER___INITIATE_CHECKOUT__INT;
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING: return HotelsystemPackage.BOOKING_HANDLER___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING;
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT: return HotelsystemPackage.BOOKING_HANDLER___INITIATE_ROOM_CHECKOUT__INT_INT;
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING: return HotelsystemPackage.BOOKING_HANDLER___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING;
				case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT: return HotelsystemPackage.BOOKING_HANDLER___CHECK_IN_ROOM__STRING_INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelsystemPackage.BOOKING_HANDLER___EDIT_BOOKING_TIME__INT_STRING_STRING:
				return editBookingTime((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case HotelsystemPackage.BOOKING_HANDLER___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT:
				return addRoomTypeToBooking((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case HotelsystemPackage.BOOKING_HANDLER___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING_INT:
				return removeRoomTypeFromBooking((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case HotelsystemPackage.BOOKING_HANDLER___LIST_FREE_ROOMS__INT:
				return listFreeRooms((Integer)arguments.get(0));
			case HotelsystemPackage.BOOKING_HANDLER___CHECK_IN__INT_INT:
				return checkIn((Integer)arguments.get(0), (Integer)arguments.get(1));
			case HotelsystemPackage.BOOKING_HANDLER___CANCEL_BOOKING__INT:
				return cancelBooking((Integer)arguments.get(0));
			case HotelsystemPackage.BOOKING_HANDLER___LIST_BOOKINGS:
				return listBookings();
			case HotelsystemPackage.BOOKING_HANDLER___LIST_OCCUPIED_ROOMS__STRING:
				return listOccupiedRooms((String)arguments.get(0));
			case HotelsystemPackage.BOOKING_HANDLER___LIST_CHECKINS__STRING_STRING:
				return listCheckins((String)arguments.get(0), (String)arguments.get(1));
			case HotelsystemPackage.BOOKING_HANDLER___LIST_CHECKOUTS__STRING_STRING:
				return listCheckouts((String)arguments.get(0), (String)arguments.get(1));
			case HotelsystemPackage.BOOKING_HANDLER___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT:
				return addExtraToRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
			case HotelsystemPackage.BOOKING_HANDLER___GET_FREE_ROOMS__INT_STRING_STRING:
				return getFreeRooms((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case HotelsystemPackage.BOOKING_HANDLER___INITIATE_BOOKING__STRING_STRING_STRING_STRING:
				return initiateBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case HotelsystemPackage.BOOKING_HANDLER___ADD_ROOM_TO_BOOKING__STRING_INT:
				return addRoomToBooking((String)arguments.get(0), (Integer)arguments.get(1));
			case HotelsystemPackage.BOOKING_HANDLER___CONFIRM_BOOKING__INT:
				return confirmBooking((Integer)arguments.get(0));
			case HotelsystemPackage.BOOKING_HANDLER___INITIATE_CHECKOUT__INT:
				return initiateCheckout((Integer)arguments.get(0));
			case HotelsystemPackage.BOOKING_HANDLER___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING:
				return payDuringCheckout((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case HotelsystemPackage.BOOKING_HANDLER___INITIATE_ROOM_CHECKOUT__INT_INT:
				return initiateRoomCheckout((Integer)arguments.get(0), (Integer)arguments.get(1));
			case HotelsystemPackage.BOOKING_HANDLER___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING:
				return payRoomDuringCheckout((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
			case HotelsystemPackage.BOOKING_HANDLER___CHECK_IN_ROOM__STRING_INT:
				return checkInRoom((String)arguments.get(0), (Integer)arguments.get(1));
			case HotelsystemPackage.BOOKING_HANDLER___BOOKING_CHECKIN__STRING:
				return BookingCheckin((String)arguments.get(0));
			case HotelsystemPackage.BOOKING_HANDLER___ADD_DAY__STRING:
				return addDay((String)arguments.get(0));
			case HotelsystemPackage.BOOKING_HANDLER___GET_BOOKING_BY_ID__INT:
				return getBookingById((Integer)arguments.get(0));
			case HotelsystemPackage.BOOKING_HANDLER___IS_FREE__INT_STRING_STRING:
				return isFree((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
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
		result.append(" (bookingCurrentlyCheckingOut: ");
		result.append(bookingCurrentlyCheckingOut);
		result.append(')');
		return result.toString();
	}

} //BookingHandlerImpl
