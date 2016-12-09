/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemFactory
 * @model kind="package"
 * @generated
 */
public interface HotelsystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hotelsystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///se/chalmers/cse/mdsd1617/group13/hotelsystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.chalmers.cse.mdsd1617.group13.hotelsystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelsystemPackage eINSTANCE = se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides <em>IHotel Receptionist Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelReceptionistProvides()
	 * @generated
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES = 18;

	/**
	 * The number of structural features of the '<em>IHotel Receptionist Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Edit Booking Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___EDIT_BOOKING_TIME__INT_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Add Room Type To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT = 1;

	/**
	 * The operation id for the '<em>Remove Room Type From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING = 2;

	/**
	 * The operation id for the '<em>List Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT = 3;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___CHECK_IN__INT_INT = 4;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___CANCEL_BOOKING__INT = 5;

	/**
	 * The operation id for the '<em>List Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___LIST_BOOKINGS = 6;

	/**
	 * The operation id for the '<em>List Occupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING = 7;

	/**
	 * The operation id for the '<em>List Checkins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>List Checkouts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING = 9;

	/**
	 * The operation id for the '<em>Add Extra To Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = 10;

	/**
	 * The number of operations of the '<em>IHotel Receptionist Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBookingHandler()
	 * @generated
	 */
	int BOOKING_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__RESERVATION = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__PAYMENTHANDLER = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roomhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__ROOMHANDLER = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__CURRENT_RESERVATION_ID = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_FEATURE_COUNT = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Edit Booking Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___EDIT_BOOKING_TIME__INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES___EDIT_BOOKING_TIME__INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Add Room Type To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT;

	/**
	 * The operation id for the '<em>Remove Room Type From Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING = IHOTEL_RECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING;

	/**
	 * The operation id for the '<em>List Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___LIST_FREE_ROOMS__INT = IHOTEL_RECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CHECK_IN__INT_INT = IHOTEL_RECEPTIONIST_PROVIDES___CHECK_IN__INT_INT;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CANCEL_BOOKING__INT = IHOTEL_RECEPTIONIST_PROVIDES___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>List Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___LIST_BOOKINGS = IHOTEL_RECEPTIONIST_PROVIDES___LIST_BOOKINGS;

	/**
	 * The operation id for the '<em>List Occupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___LIST_OCCUPIED_ROOMS__STRING = IHOTEL_RECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING;

	/**
	 * The operation id for the '<em>List Checkins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___LIST_CHECKINS__STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING_STRING;

	/**
	 * The operation id for the '<em>List Checkouts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___LIST_CHECKOUTS__STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Extra To Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT;

	/**
	 * The operation id for the '<em>Get Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___GET_FREE_ROOMS__INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Initiate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___INITIATE_BOOKING__STRING_STRING_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Room To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___ADD_ROOM_TO_BOOKING__STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Confirm Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CONFIRM_BOOKING__INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Initiate Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___INITIATE_CHECKOUT__INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pay During Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Initiate Room Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___INITIATE_ROOM_CHECKOUT__INT_INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pay Room During Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Check In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___CHECK_IN_ROOM__STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Booking Checkin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___BOOKING_CHECKIN__STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Add Day</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___ADD_DAY__STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_OPERATION_COUNT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Roomreservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOMRESERVATION = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CANCELED = 4;

	/**
	 * The feature id for the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 5;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CANCEL = 0;

	/**
	 * The operation id for the '<em>Get Occupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_OCCUPIED_ROOMS__STRING = 1;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.CustomerImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = 1;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___CUSTOMER__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl <em>Room Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomReservation()
	 * @generated
	 */
	int ROOM_RESERVATION = 3;

	/**
	 * The feature id for the '<em><b>Ireceptionistroomprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__IRECEPTIONISTROOMPROVIDES = 0;

	/**
	 * The feature id for the '<em><b>Ireceptionistroomtypeprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__ = 2;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__BILL = 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__START_DATE = 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION__END_DATE = 5;

	/**
	 * The number of structural features of the '<em>Room Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION___CHECK_IN = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION___CHECK_OUT = 1;

	/**
	 * The operation id for the '<em>Get Room If Occupied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION___GET_ROOM_IF_OCCUPIED__STRING = 2;

	/**
	 * The number of operations of the '<em>Room Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides <em>IReceptionist Room Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIReceptionistRoomProvides()
	 * @generated
	 */
	int IRECEPTIONIST_ROOM_PROVIDES = 4;

	/**
	 * The number of structural features of the '<em>IReceptionist Room Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_ROOM_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Set Occupied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_ROOM_PROVIDES___SET_OCCUPIED__BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>IReceptionist Room Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_ROOM_PROVIDES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Num Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NUM_BEDS = 1;

	/**
	 * The feature id for the '<em><b>Price Per Night</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE_PER_NIGHT = 2;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomExtrasImpl <em>Room Extras</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomExtrasImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomExtras()
	 * @generated
	 */
	int ROOM_EXTRAS = 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRAS__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRAS__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Room Extras</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRAS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room Extras</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 7;

	/**
	 * The feature id for the '<em><b>Roomreservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ROOMRESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getPaymentHandler()
	 * @generated
	 */
	int PAYMENT_HANDLER = 10;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler <em>IRoom Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIRoomHandler()
	 * @generated
	 */
	int IROOM_HANDLER = 11;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomHandler()
	 * @generated
	 */
	int ROOM_HANDLER = 14;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides <em>IAdmin Room Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIAdminRoomProvides()
	 * @generated
	 */
	int IADMIN_ROOM_PROVIDES = 9;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 8;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelCustomerProvides()
	 * @generated
	 */
	int IHOTEL_CUSTOMER_PROVIDES = 12;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.FreeRoomTypesDTOImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getFreeRoomTypesDTO()
	 * @generated
	 */
	int FREE_ROOM_TYPES_DTO = 13;

	/**
	 * The number of structural features of the '<em>IAdmin Room Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADMIN_ROOM_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Has Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADMIN_ROOM_PROVIDES___HAS_ROOM_TYPE__ROOMTYPE = 0;

	/**
	 * The number of operations of the '<em>IAdmin Room Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADMIN_ROOM_PROVIDES_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__OCCUPIED = IADMIN_ROOM_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMTYPE = IADMIN_ROOM_PROVIDES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BLOCKED = IADMIN_ROOM_PROVIDES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Room Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_ID = IADMIN_ROOM_PROVIDES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = IADMIN_ROOM_PROVIDES_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___HAS_ROOM_TYPE__ROOMTYPE = IADMIN_ROOM_PROVIDES___HAS_ROOM_TYPE__ROOMTYPE;

	/**
	 * The operation id for the '<em>Set Occupied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___SET_OCCUPIED__BOOLEAN = IADMIN_ROOM_PROVIDES_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = IADMIN_ROOM_PROVIDES_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icustomerprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER__ICUSTOMERPROVIDES = 0;

	/**
	 * The number of structural features of the '<em>Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Pay If Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER___PAY_IF_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER_OPERATION_COUNT = 1;

	/**
	 * The number of structural features of the '<em>IRoom Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_HANDLER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_HANDLER___GET_ALL_ROOM_TYPES = 0;

	/**
	 * The operation id for the '<em>Count Free Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_HANDLER___COUNT_FREE_ROOM__ROOMTYPE = 1;

	/**
	 * The number of operations of the '<em>IRoom Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_HANDLER_OPERATION_COUNT = 2;

	/**
	 * The number of structural features of the '<em>IHotel Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Initiate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Add Room To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT = 2;

	/**
	 * The operation id for the '<em>Confirm Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT = 3;

	/**
	 * The operation id for the '<em>Initiate Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT = 4;

	/**
	 * The operation id for the '<em>Pay During Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Initiate Room Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT = 6;

	/**
	 * The operation id for the '<em>Pay Room During Checkout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Check In Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT = 8;

	/**
	 * The number of operations of the '<em>IHotel Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Room Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Num Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO__NUM_BEDS = 1;

	/**
	 * The feature id for the '<em><b>Price Per Night</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT = 2;

	/**
	 * The feature id for the '<em><b>Num Free Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS = 3;

	/**
	 * The number of structural features of the '<em>Free Room Types DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Free Room Types DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ROOM_TYPES_DTO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Iadminroomtypeprovides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER__IADMINROOMTYPEPROVIDES = IROOM_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iadminroomprovides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER__IADMINROOMPROVIDES = IROOM_HANDLER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_FEATURE_COUNT = IROOM_HANDLER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___GET_ALL_ROOM_TYPES = IROOM_HANDLER___GET_ALL_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Count Free Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___COUNT_FREE_ROOM__ROOMTYPE = IROOM_HANDLER___COUNT_FREE_ROOM__ROOMTYPE;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING = IROOM_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING = IROOM_HANDLER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___REMOVE_ROOM_TYPE__STRING = IROOM_HANDLER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Change Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING = IROOM_HANDLER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___ADD_ROOM__INT_STRING = IROOM_HANDLER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___REMOVE_ROOM__INT = IROOM_HANDLER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Block Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___BLOCK_ROOM__INT = IROOM_HANDLER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Unblock Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___UNBLOCK_ROOM__INT = IROOM_HANDLER_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_OPERATION_COUNT = IROOM_HANDLER_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelAdministratorProvides()
	 * @generated
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES = 15;

	/**
	 * The number of structural features of the '<em>IHotel Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM_TYPE__STRING = 2;

	/**
	 * The operation id for the '<em>Change Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES___CHANGE_ROOM_TYPE__INT_STRING = 3;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM__INT_STRING = 4;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM__INT = 5;

	/**
	 * The operation id for the '<em>Block Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES___BLOCK_ROOM__INT = 6;

	/**
	 * The operation id for the '<em>Unblock Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES___UNBLOCK_ROOM__INT = 7;

	/**
	 * The number of operations of the '<em>IHotel Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATOR_PROVIDES_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelStartupProvides()
	 * @generated
	 */
	int IHOTEL_STARTUP_PROVIDES = 16;

	/**
	 * The number of structural features of the '<em>IHotel Startup Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_STARTUP_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Startup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_STARTUP_PROVIDES___STARTUP__INT = 0;

	/**
	 * The operation id for the '<em>Get Room Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_STARTUP_PROVIDES___GET_ROOM_HANDLER = 1;

	/**
	 * The number of operations of the '<em>IHotel Startup Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_STARTUP_PROVIDES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl <em>Hotel Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getHotelInitializer()
	 * @generated
	 */
	int HOTEL_INITIALIZER = 17;

	/**
	 * The feature id for the '<em><b>Roomhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER__ROOMHANDLER = IHOTEL_STARTUP_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reservationhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER__RESERVATIONHANDLER = IHOTEL_STARTUP_PROVIDES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hotel Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER_FEATURE_COUNT = IHOTEL_STARTUP_PROVIDES_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Startup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER___STARTUP__INT = IHOTEL_STARTUP_PROVIDES___STARTUP__INT;

	/**
	 * The operation id for the '<em>Get Room Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER___GET_ROOM_HANDLER = IHOTEL_STARTUP_PROVIDES___GET_ROOM_HANDLER;

	/**
	 * The number of operations of the '<em>Hotel Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER_OPERATION_COUNT = IHOTEL_STARTUP_PROVIDES_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Handler</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler
	 * @generated
	 */
	EClass getBookingHandler();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservation</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getReservation()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Reservation();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymenthandler <em>Paymenthandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymenthandler</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymenthandler()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Paymenthandler();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler <em>Roomhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomhandler</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_Roomhandler();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getCurrentReservationId <em>Current Reservation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Reservation Id</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getCurrentReservationId()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EAttribute getBookingHandler_CurrentReservationId();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#BookingCheckin(java.lang.String) <em>Booking Checkin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking Checkin</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#BookingCheckin(java.lang.String)
	 * @generated
	 */
	EOperation getBookingHandler__BookingCheckin__String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#addDay(java.lang.String) <em>Add Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Day</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#addDay(java.lang.String)
	 * @generated
	 */
	EOperation getBookingHandler__AddDay__String();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Customer();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getRoomreservation <em>Roomreservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomreservation</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getRoomreservation()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Roomreservation();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCanceled <em>Canceled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canceled</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCanceled()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Canceled();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingId <em>Booking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Id</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingId();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#cancel()
	 * @generated
	 */
	EOperation getBooking__Cancel();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getOccupiedRooms(java.lang.String) <em>Get Occupied Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Occupied Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getOccupiedRooms(java.lang.String)
	 * @generated
	 */
	EOperation getBooking__GetOccupiedRooms__String();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getLastName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LastName();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#Customer(java.lang.String, java.lang.String) <em>Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Customer</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#Customer(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomer__Customer__String_String();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation <em>Room Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Reservation</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation
	 * @generated
	 */
	EClass getRoomReservation();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getIreceptionistroomprovides <em>Ireceptionistroomprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ireceptionistroomprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getIreceptionistroomprovides()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_Ireceptionistroomprovides();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getIreceptionistroomtypeprovides <em>Ireceptionistroomtypeprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ireceptionistroomtypeprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getIreceptionistroomtypeprovides()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_Ireceptionistroomtypeprovides();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em></em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#get_()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation__();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getBill()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_Bill();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getStartDate()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getEndDate()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_EndDate();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#checkIn() <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#checkIn()
	 * @generated
	 */
	EOperation getRoomReservation__CheckIn();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#checkOut() <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#checkOut()
	 * @generated
	 */
	EOperation getRoomReservation__CheckOut();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomIfOccupied(java.lang.String) <em>Get Room If Occupied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room If Occupied</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomIfOccupied(java.lang.String)
	 * @generated
	 */
	EOperation getRoomReservation__GetRoomIfOccupied__String();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides <em>IReceptionist Room Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReceptionist Room Provides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides
	 * @generated
	 */
	EClass getIReceptionistRoomProvides();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides#setOccupied(boolean) <em>Set Occupied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Occupied</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides#setOccupied(boolean)
	 * @generated
	 */
	EOperation getIReceptionistRoomProvides__SetOccupied__boolean();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getNumBeds <em>Num Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Beds</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getNumBeds()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_NumBeds();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getPricePerNight <em>Price Per Night</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Night</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getPricePerNight()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_PricePerNight();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras <em>Room Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Extras</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras
	 * @generated
	 */
	EClass getRoomExtras();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras#getPrice()
	 * @see #getRoomExtras()
	 * @generated
	 */
	EAttribute getRoomExtras_Price();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras#getDescription()
	 * @see #getRoomExtras()
	 * @generated
	 */
	EAttribute getRoomExtras_Description();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getRoomreservation <em>Roomreservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomreservation</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getRoomreservation()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Roomreservation();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getPrice()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Price();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler <em>Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Handler</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler
	 * @generated
	 */
	EClass getPaymentHandler();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#getIcustomerprovides <em>Icustomerprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Icustomerprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#getIcustomerprovides()
	 * @see #getPaymentHandler()
	 * @generated
	 */
	EReference getPaymentHandler_Icustomerprovides();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#payIfCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay If Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay If Card Valid</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#payIfCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentHandler__PayIfCardValid__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler <em>IRoom Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Handler</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler
	 * @generated
	 */
	EClass getIRoomHandler();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getAllRoomTypes() <em>Get All Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Room Types</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getAllRoomTypes()
	 * @generated
	 */
	EOperation getIRoomHandler__GetAllRoomTypes();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#countFreeRoom(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType) <em>Count Free Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Free Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#countFreeRoom(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType)
	 * @generated
	 */
	EOperation getIRoomHandler__CountFreeRoom__RoomType();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler <em>Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Handler</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler
	 * @generated
	 */
	EClass getRoomHandler();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getIadminroomtypeprovides <em>Iadminroomtypeprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iadminroomtypeprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getIadminroomtypeprovides()
	 * @see #getRoomHandler()
	 * @generated
	 */
	EReference getRoomHandler_Iadminroomtypeprovides();

	/**
	 * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getIadminroomprovides <em>Iadminroomprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iadminroomprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getIadminroomprovides()
	 * @see #getRoomHandler()
	 * @generated
	 */
	EReference getRoomHandler_Iadminroomprovides();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides <em>IAdmin Room Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAdmin Room Provides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides
	 * @generated
	 */
	EClass getIAdminRoomProvides();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides#hasRoomType(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType) <em>Has Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides#hasRoomType(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType)
	 * @generated
	 */
	EOperation getIAdminRoomProvides__HasRoomType__RoomType();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isOccupied <em>Occupied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupied</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isOccupied()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Occupied();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomtype()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomtype();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isBlocked()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomId <em>Room Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Id</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomId()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomId();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Customer Provides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides
	 * @generated
	 */
	EClass getIHotelCustomerProvides();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#getFreeRooms(int, java.lang.String, java.lang.String) <em>Get Free Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Free Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#getFreeRooms(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__GetFreeRooms__int_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Initiate Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateBooking__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#addRoomToBooking(java.lang.String, int) <em>Add Room To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room To Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#addRoomToBooking(java.lang.String, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__AddRoomToBooking__String_int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#confirmBooking(int) <em>Confirm Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#confirmBooking(int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__ConfirmBooking__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateCheckout(int) <em>Initiate Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Checkout</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateCheckout(int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateCheckout__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#payDuringCheckout(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay During Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay During Checkout</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#payDuringCheckout(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateRoomCheckout(int, int) <em>Initiate Room Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Room Checkout</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateRoomCheckout(int, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateRoomCheckout__int_int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#payRoomDuringCheckout(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay Room During Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Room During Checkout</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#payRoomDuringCheckout(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#checkInRoom(java.lang.String, int) <em>Check In Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#checkInRoom(java.lang.String, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__CheckInRoom__String_int();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO <em>Free Room Types DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Room Types DTO</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO
	 * @generated
	 */
	EClass getFreeRoomTypesDTO();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Description</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_RoomTypeDescription();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Beds</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumBeds()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_NumBeds();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Night</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getPricePerNight()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_PricePerNight();

	/**
	 * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Free Rooms</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_NumFreeRooms();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Administrator Provides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides
	 * @generated
	 */
	EClass getIHotelAdministratorProvides();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#addRoomType(java.lang.String, double, int, java.lang.String) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#addRoomType(java.lang.String, double, int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__AddRoomType__String_double_int_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#editRoomType(java.lang.String, double, int, java.lang.String) <em>Edit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#editRoomType(java.lang.String, double, int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__EditRoomType__String_double_int_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#removeRoomType(java.lang.String) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#removeRoomType(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__RemoveRoomType__String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#changeRoomType(int, java.lang.String) <em>Change Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Type</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#changeRoomType(int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__ChangeRoomType__int_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#addRoom(int, java.lang.String) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#addRoom(int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__AddRoom__int_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#removeRoom(int)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#blockRoom(int) <em>Block Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Block Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#blockRoom(int)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__BlockRoom__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#unblockRoom(int) <em>Unblock Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unblock Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#unblockRoom(int)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__UnblockRoom__int();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Startup Provides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides
	 * @generated
	 */
	EClass getIHotelStartupProvides();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides#startup(int) <em>Startup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Startup</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides#startup(int)
	 * @generated
	 */
	EOperation getIHotelStartupProvides__Startup__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides#getRoomHandler() <em>Get Room Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Handler</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides#getRoomHandler()
	 * @generated
	 */
	EOperation getIHotelStartupProvides__GetRoomHandler();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer <em>Hotel Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Initializer</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer
	 * @generated
	 */
	EClass getHotelInitializer();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer#getRoomhandler <em>Roomhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomhandler</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer#getRoomhandler()
	 * @see #getHotelInitializer()
	 * @generated
	 */
	EReference getHotelInitializer_Roomhandler();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer#getReservationhandler <em>Reservationhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservationhandler</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer#getReservationhandler()
	 * @see #getHotelInitializer()
	 * @generated
	 */
	EReference getHotelInitializer_Reservationhandler();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides <em>IHotel Receptionist Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Receptionist Provides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides
	 * @generated
	 */
	EClass getIHotelReceptionistProvides();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#editBookingTime(int, java.lang.String, java.lang.String) <em>Edit Booking Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking Time</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#editBookingTime(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__EditBookingTime__int_String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#addRoomTypeToBooking(int, java.lang.String, int) <em>Add Room Type To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type To Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#addRoomTypeToBooking(int, java.lang.String, int)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__AddRoomTypeToBooking__int_String_int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#removeRoomTypeFromBooking(int, java.lang.String) <em>Remove Room Type From Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type From Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#removeRoomTypeFromBooking(int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__RemoveRoomTypeFromBooking__int_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listFreeRooms(int) <em>List Free Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Free Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listFreeRooms(int)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__ListFreeRooms__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#checkIn(int, int) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#checkIn(int, int)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__CheckIn__int_int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#cancelBooking(int) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#cancelBooking(int)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__CancelBooking__int();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listBookings() <em>List Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Bookings</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listBookings()
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__ListBookings();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listOccupiedRooms(java.lang.String) <em>List Occupied Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Occupied Rooms</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listOccupiedRooms(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__ListOccupiedRooms__String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listCheckins(java.lang.String, java.lang.String) <em>List Checkins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Checkins</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listCheckins(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__ListCheckins__String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listCheckouts(java.lang.String, java.lang.String) <em>List Checkouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Checkouts</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listCheckouts(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__ListCheckouts__String_String();

	/**
	 * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#addExtraToRoom(int, int, java.lang.String, int) <em>Add Extra To Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Extra To Room</em>' operation.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#addExtraToRoom(int, int, java.lang.String, int)
	 * @generated
	 */
	EOperation getIHotelReceptionistProvides__AddExtraToRoom__int_int_String_int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelsystemFactory getHotelsystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBookingHandler()
		 * @generated
		 */
		EClass BOOKING_HANDLER = eINSTANCE.getBookingHandler();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__RESERVATION = eINSTANCE.getBookingHandler_Reservation();

		/**
		 * The meta object literal for the '<em><b>Paymenthandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__PAYMENTHANDLER = eINSTANCE.getBookingHandler_Paymenthandler();

		/**
		 * The meta object literal for the '<em><b>Roomhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__ROOMHANDLER = eINSTANCE.getBookingHandler_Roomhandler();

		/**
		 * The meta object literal for the '<em><b>Current Reservation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_HANDLER__CURRENT_RESERVATION_ID = eINSTANCE.getBookingHandler_CurrentReservationId();

		/**
		 * The meta object literal for the '<em><b>Booking Checkin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___BOOKING_CHECKIN__STRING = eINSTANCE.getBookingHandler__BookingCheckin__String();

		/**
		 * The meta object literal for the '<em><b>Add Day</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___ADD_DAY__STRING = eINSTANCE.getBookingHandler__AddDay__String();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>Roomreservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOMRESERVATION = eINSTANCE.getBooking_Roomreservation();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Canceled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CANCELED = eINSTANCE.getBooking_Canceled();

		/**
		 * The meta object literal for the '<em><b>Booking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingId();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CANCEL = eINSTANCE.getBooking__Cancel();

		/**
		 * The meta object literal for the '<em><b>Get Occupied Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_OCCUPIED_ROOMS__STRING = eINSTANCE.getBooking__GetOccupiedRooms__String();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.CustomerImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_LastName();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___CUSTOMER__STRING_STRING = eINSTANCE.getCustomer__Customer__String_String();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl <em>Room Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomReservation()
		 * @generated
		 */
		EClass ROOM_RESERVATION = eINSTANCE.getRoomReservation();

		/**
		 * The meta object literal for the '<em><b>Ireceptionistroomprovides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RESERVATION__IRECEPTIONISTROOMPROVIDES = eINSTANCE.getRoomReservation_Ireceptionistroomprovides();

		/**
		 * The meta object literal for the '<em><b>Ireceptionistroomtypeprovides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES = eINSTANCE.getRoomReservation_Ireceptionistroomtypeprovides();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RESERVATION__ = eINSTANCE.getRoomReservation__();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_RESERVATION__BILL = eINSTANCE.getRoomReservation_Bill();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESERVATION__START_DATE = eINSTANCE.getRoomReservation_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESERVATION__END_DATE = eINSTANCE.getRoomReservation_EndDate();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_RESERVATION___CHECK_IN = eINSTANCE.getRoomReservation__CheckIn();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_RESERVATION___CHECK_OUT = eINSTANCE.getRoomReservation__CheckOut();

		/**
		 * The meta object literal for the '<em><b>Get Room If Occupied</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_RESERVATION___GET_ROOM_IF_OCCUPIED__STRING = eINSTANCE.getRoomReservation__GetRoomIfOccupied__String();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides <em>IReceptionist Room Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIReceptionistRoomProvides()
		 * @generated
		 */
		EClass IRECEPTIONIST_ROOM_PROVIDES = eINSTANCE.getIReceptionistRoomProvides();

		/**
		 * The meta object literal for the '<em><b>Set Occupied</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_ROOM_PROVIDES___SET_OCCUPIED__BOOLEAN = eINSTANCE.getIReceptionistRoomProvides__SetOccupied__boolean();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

		/**
		 * The meta object literal for the '<em><b>Num Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NUM_BEDS = eINSTANCE.getRoomType_NumBeds();

		/**
		 * The meta object literal for the '<em><b>Price Per Night</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE_PER_NIGHT = eINSTANCE.getRoomType_PricePerNight();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomExtrasImpl <em>Room Extras</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomExtrasImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomExtras()
		 * @generated
		 */
		EClass ROOM_EXTRAS = eINSTANCE.getRoomExtras();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EXTRAS__PRICE = eINSTANCE.getRoomExtras_Price();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EXTRAS__DESCRIPTION = eINSTANCE.getRoomExtras_Description();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Roomreservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__ROOMRESERVATION = eINSTANCE.getBill_Roomreservation();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__PRICE = eINSTANCE.getBill_Price();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getPaymentHandler()
		 * @generated
		 */
		EClass PAYMENT_HANDLER = eINSTANCE.getPaymentHandler();

		/**
		 * The meta object literal for the '<em><b>Icustomerprovides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_HANDLER__ICUSTOMERPROVIDES = eINSTANCE.getPaymentHandler_Icustomerprovides();

		/**
		 * The meta object literal for the '<em><b>Pay If Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_HANDLER___PAY_IF_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getPaymentHandler__PayIfCardValid__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler <em>IRoom Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIRoomHandler()
		 * @generated
		 */
		EClass IROOM_HANDLER = eINSTANCE.getIRoomHandler();

		/**
		 * The meta object literal for the '<em><b>Get All Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_HANDLER___GET_ALL_ROOM_TYPES = eINSTANCE.getIRoomHandler__GetAllRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Count Free Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_HANDLER___COUNT_FREE_ROOM__ROOMTYPE = eINSTANCE.getIRoomHandler__CountFreeRoom__RoomType();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomHandler()
		 * @generated
		 */
		EClass ROOM_HANDLER = eINSTANCE.getRoomHandler();

		/**
		 * The meta object literal for the '<em><b>Iadminroomtypeprovides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_HANDLER__IADMINROOMTYPEPROVIDES = eINSTANCE.getRoomHandler_Iadminroomtypeprovides();

		/**
		 * The meta object literal for the '<em><b>Iadminroomprovides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_HANDLER__IADMINROOMPROVIDES = eINSTANCE.getRoomHandler_Iadminroomprovides();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides <em>IAdmin Room Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIAdminRoomProvides()
		 * @generated
		 */
		EClass IADMIN_ROOM_PROVIDES = eINSTANCE.getIAdminRoomProvides();

		/**
		 * The meta object literal for the '<em><b>Has Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IADMIN_ROOM_PROVIDES___HAS_ROOM_TYPE__ROOMTYPE = eINSTANCE.getIAdminRoomProvides__HasRoomType__RoomType();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Occupied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__OCCUPIED = eINSTANCE.getRoom_Occupied();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMTYPE = eINSTANCE.getRoom_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__BLOCKED = eINSTANCE.getRoom_Blocked();

		/**
		 * The meta object literal for the '<em><b>Room Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_ID = eINSTANCE.getRoom_RoomId();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelCustomerProvides()
		 * @generated
		 */
		EClass IHOTEL_CUSTOMER_PROVIDES = eINSTANCE.getIHotelCustomerProvides();

		/**
		 * The meta object literal for the '<em><b>Get Free Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__GetFreeRooms__int_String_String();

		/**
		 * The meta object literal for the '<em><b>Initiate Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__InitiateBooking__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT = eINSTANCE.getIHotelCustomerProvides__AddRoomToBooking__String_int();

		/**
		 * The meta object literal for the '<em><b>Confirm Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT = eINSTANCE.getIHotelCustomerProvides__ConfirmBooking__int();

		/**
		 * The meta object literal for the '<em><b>Initiate Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT = eINSTANCE.getIHotelCustomerProvides__InitiateCheckout__int();

		/**
		 * The meta object literal for the '<em><b>Pay During Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Initiate Room Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT = eINSTANCE.getIHotelCustomerProvides__InitiateRoomCheckout__int_int();

		/**
		 * The meta object literal for the '<em><b>Pay Room During Checkout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Check In Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT = eINSTANCE.getIHotelCustomerProvides__CheckInRoom__String_int();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.FreeRoomTypesDTOImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getFreeRoomTypesDTO()
		 * @generated
		 */
		EClass FREE_ROOM_TYPES_DTO = eINSTANCE.getFreeRoomTypesDTO();

		/**
		 * The meta object literal for the '<em><b>Room Type Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION = eINSTANCE.getFreeRoomTypesDTO_RoomTypeDescription();

		/**
		 * The meta object literal for the '<em><b>Num Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ROOM_TYPES_DTO__NUM_BEDS = eINSTANCE.getFreeRoomTypesDTO_NumBeds();

		/**
		 * The meta object literal for the '<em><b>Price Per Night</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT = eINSTANCE.getFreeRoomTypesDTO_PricePerNight();

		/**
		 * The meta object literal for the '<em><b>Num Free Rooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS = eINSTANCE.getFreeRoomTypesDTO_NumFreeRooms();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelAdministratorProvides()
		 * @generated
		 */
		EClass IHOTEL_ADMINISTRATOR_PROVIDES = eINSTANCE.getIHotelAdministratorProvides();

		/**
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING = eINSTANCE.getIHotelAdministratorProvides__AddRoomType__String_double_int_String();

		/**
		 * The meta object literal for the '<em><b>Edit Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATOR_PROVIDES___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING = eINSTANCE.getIHotelAdministratorProvides__EditRoomType__String_double_int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM_TYPE__STRING = eINSTANCE.getIHotelAdministratorProvides__RemoveRoomType__String();

		/**
		 * The meta object literal for the '<em><b>Change Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATOR_PROVIDES___CHANGE_ROOM_TYPE__INT_STRING = eINSTANCE.getIHotelAdministratorProvides__ChangeRoomType__int_String();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM__INT_STRING = eINSTANCE.getIHotelAdministratorProvides__AddRoom__int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM__INT = eINSTANCE.getIHotelAdministratorProvides__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Block Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATOR_PROVIDES___BLOCK_ROOM__INT = eINSTANCE.getIHotelAdministratorProvides__BlockRoom__int();

		/**
		 * The meta object literal for the '<em><b>Unblock Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATOR_PROVIDES___UNBLOCK_ROOM__INT = eINSTANCE.getIHotelAdministratorProvides__UnblockRoom__int();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelStartupProvides()
		 * @generated
		 */
		EClass IHOTEL_STARTUP_PROVIDES = eINSTANCE.getIHotelStartupProvides();

		/**
		 * The meta object literal for the '<em><b>Startup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_STARTUP_PROVIDES___STARTUP__INT = eINSTANCE.getIHotelStartupProvides__Startup__int();

		/**
		 * The meta object literal for the '<em><b>Get Room Handler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_STARTUP_PROVIDES___GET_ROOM_HANDLER = eINSTANCE.getIHotelStartupProvides__GetRoomHandler();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl <em>Hotel Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getHotelInitializer()
		 * @generated
		 */
		EClass HOTEL_INITIALIZER = eINSTANCE.getHotelInitializer();

		/**
		 * The meta object literal for the '<em><b>Roomhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_INITIALIZER__ROOMHANDLER = eINSTANCE.getHotelInitializer_Roomhandler();

		/**
		 * The meta object literal for the '<em><b>Reservationhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_INITIALIZER__RESERVATIONHANDLER = eINSTANCE.getHotelInitializer_Reservationhandler();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides <em>IHotel Receptionist Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides
		 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelReceptionistProvides()
		 * @generated
		 */
		EClass IHOTEL_RECEPTIONIST_PROVIDES = eINSTANCE.getIHotelReceptionistProvides();

		/**
		 * The meta object literal for the '<em><b>Edit Booking Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___EDIT_BOOKING_TIME__INT_STRING_STRING = eINSTANCE.getIHotelReceptionistProvides__EditBookingTime__int_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room Type To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT = eINSTANCE.getIHotelReceptionistProvides__AddRoomTypeToBooking__int_String_int();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type From Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING = eINSTANCE.getIHotelReceptionistProvides__RemoveRoomTypeFromBooking__int_String();

		/**
		 * The meta object literal for the '<em><b>List Free Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT = eINSTANCE.getIHotelReceptionistProvides__ListFreeRooms__int();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___CHECK_IN__INT_INT = eINSTANCE.getIHotelReceptionistProvides__CheckIn__int_int();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___CANCEL_BOOKING__INT = eINSTANCE.getIHotelReceptionistProvides__CancelBooking__int();

		/**
		 * The meta object literal for the '<em><b>List Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_BOOKINGS = eINSTANCE.getIHotelReceptionistProvides__ListBookings();

		/**
		 * The meta object literal for the '<em><b>List Occupied Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING = eINSTANCE.getIHotelReceptionistProvides__ListOccupiedRooms__String();

		/**
		 * The meta object literal for the '<em><b>List Checkins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING_STRING = eINSTANCE.getIHotelReceptionistProvides__ListCheckins__String_String();

		/**
		 * The meta object literal for the '<em><b>List Checkouts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING = eINSTANCE.getIHotelReceptionistProvides__ListCheckouts__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Extra To Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_RECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = eINSTANCE.getIHotelReceptionistProvides__AddExtraToRoom__int_int_String_int();

	}

} //HotelsystemPackage
