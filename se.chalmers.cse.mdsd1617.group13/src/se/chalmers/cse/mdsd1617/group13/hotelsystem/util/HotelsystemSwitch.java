/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage
 * @generated
 */
public class HotelsystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelsystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelsystemSwitch() {
		if (modelPackage == null) {
			modelPackage = HotelsystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HotelsystemPackage.BOOKING_HANDLER: {
				BookingHandler bookingHandler = (BookingHandler)theEObject;
				T result = caseBookingHandler(bookingHandler);
				if (result == null) result = caseIHotelReceptionistProvides(bookingHandler);
				if (result == null) result = caseIHotelCustomerProvides(bookingHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				T result = caseBooking(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				T result = caseCustomer(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.ROOM_RESERVATION: {
				RoomReservation roomReservation = (RoomReservation)theEObject;
				T result = caseRoomReservation(roomReservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				T result = caseRoomType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.ROOM_EXTRA: {
				RoomExtra roomExtra = (RoomExtra)theEObject;
				T result = caseRoomExtra(roomExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.BILL: {
				Bill bill = (Bill)theEObject;
				T result = caseBill(bill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.PAYMENT_HANDLER: {
				PaymentHandler paymentHandler = (PaymentHandler)theEObject;
				T result = casePaymentHandler(paymentHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.IROOM_HANDLER: {
				IRoomHandler iRoomHandler = (IRoomHandler)theEObject;
				T result = caseIRoomHandler(iRoomHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.IHOTEL_RECEPTIONIST_PROVIDES: {
				IHotelReceptionistProvides iHotelReceptionistProvides = (IHotelReceptionistProvides)theEObject;
				T result = caseIHotelReceptionistProvides(iHotelReceptionistProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.IHOTEL_CUSTOMER_PROVIDES: {
				IHotelCustomerProvides iHotelCustomerProvides = (IHotelCustomerProvides)theEObject;
				T result = caseIHotelCustomerProvides(iHotelCustomerProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.FREE_ROOM_TYPES_DTO: {
				FreeRoomTypesDTO freeRoomTypesDTO = (FreeRoomTypesDTO)theEObject;
				T result = caseFreeRoomTypesDTO(freeRoomTypesDTO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.ROOM_HANDLER: {
				RoomHandler roomHandler = (RoomHandler)theEObject;
				T result = caseRoomHandler(roomHandler);
				if (result == null) result = caseIRoomHandler(roomHandler);
				if (result == null) result = caseIHotelAdministratorProvides(roomHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES: {
				IHotelAdministratorProvides iHotelAdministratorProvides = (IHotelAdministratorProvides)theEObject;
				T result = caseIHotelAdministratorProvides(iHotelAdministratorProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.IHOTEL_STARTUP_PROVIDES: {
				IHotelStartupProvides iHotelStartupProvides = (IHotelStartupProvides)theEObject;
				T result = caseIHotelStartupProvides(iHotelStartupProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelsystemPackage.HOTEL_INITIALIZER: {
				HotelInitializer hotelInitializer = (HotelInitializer)theEObject;
				T result = caseHotelInitializer(hotelInitializer);
				if (result == null) result = caseIHotelStartupProvides(hotelInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingHandler(BookingHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Reservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomReservation(RoomReservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomExtra(RoomExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBill(Bill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentHandler(PaymentHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomHandler(IRoomHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomHandler(RoomHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHotel Customer Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHotel Customer Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHotelCustomerProvides(IHotelCustomerProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Room Types DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Room Types DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeRoomTypesDTO(FreeRoomTypesDTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHotel Administrator Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHotel Administrator Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHotelAdministratorProvides(IHotelAdministratorProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHotel Startup Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHotel Startup Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHotelStartupProvides(IHotelStartupProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelInitializer(HotelInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHotel Receptionist Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHotel Receptionist Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHotelReceptionistProvides(IHotelReceptionistProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HotelsystemSwitch
