/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @model kind="package"
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemFactory
 */
public interface HotelsystemPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "hotelsystem";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http:///se/chalmers/cse/mdsd1617/group13/hotelsystem.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "se.chalmers.cse.mdsd1617.group13.hotelsystem";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    HotelsystemPackage eINSTANCE = se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl.init();

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides <em>IHotel Receptionist Provides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelReceptionistProvides()
     */
    int IHOTEL_RECEPTIONIST_PROVIDES = 10;

    /**
     * The number of structural features of the '<em>IHotel Receptionist Provides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Edit Booking Time</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___EDIT_BOOKING_TIME__INT_STRING_STRING = 0;

    /**
     * The operation id for the '<em>Add Room Type To Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT = 1;

    /**
     * The operation id for the '<em>Remove Room Type From Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING_INT = 2;

    /**
     * The operation id for the '<em>List Free Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT = 3;

    /**
     * The operation id for the '<em>Check In</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___CHECK_IN__INT_INT = 4;

    /**
     * The operation id for the '<em>Cancel Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___CANCEL_BOOKING__INT = 5;

    /**
     * The operation id for the '<em>List Bookings</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___LIST_BOOKINGS = 6;

    /**
     * The operation id for the '<em>List Occupied Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING = 7;

    /**
     * The operation id for the '<em>List Checkins</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING_STRING = 8;

    /**
     * The operation id for the '<em>List Checkouts</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING = 9;

    /**
     * The operation id for the '<em>Add Extra To Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = 10;

    /**
     * The operation id for the '<em>Get Free Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES___GET_FREE_ROOM__ROOMTYPE_STRING_STRING = 11;

    /**
     * The number of operations of the '<em>IHotel Receptionist Provides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT = 12;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBookingHandler()
     */
    int BOOKING_HANDLER = 0;

    /**
     * The feature id for the '<em><b>Bookings</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER__BOOKINGS = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Payment Handler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER__PAYMENT_HANDLER = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Roomhandler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER__ROOMHANDLER = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Booking Currently Checking Out</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER__BOOKING_CURRENTLY_CHECKING_OUT = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Next Booking Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER__NEXT_BOOKING_ID = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Booking Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER_FEATURE_COUNT = IHOTEL_RECEPTIONIST_PROVIDES_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Edit Booking Time</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___EDIT_BOOKING_TIME__INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES___EDIT_BOOKING_TIME__INT_STRING_STRING;

    /**
     * The operation id for the '<em>Add Room Type To Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT;

    /**
     * The operation id for the '<em>Remove Room Type From Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING_INT;

    /**
     * The operation id for the '<em>List Free Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___LIST_FREE_ROOMS__INT = IHOTEL_RECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT;

    /**
     * The operation id for the '<em>Check In</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___CHECK_IN__INT_INT = IHOTEL_RECEPTIONIST_PROVIDES___CHECK_IN__INT_INT;

    /**
     * The operation id for the '<em>Cancel Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___CANCEL_BOOKING__INT = IHOTEL_RECEPTIONIST_PROVIDES___CANCEL_BOOKING__INT;

    /**
     * The operation id for the '<em>List Bookings</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___LIST_BOOKINGS = IHOTEL_RECEPTIONIST_PROVIDES___LIST_BOOKINGS;

    /**
     * The operation id for the '<em>List Occupied Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___LIST_OCCUPIED_ROOMS__STRING = IHOTEL_RECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING;

    /**
     * The operation id for the '<em>List Checkins</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___LIST_CHECKINS__STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING_STRING;

    /**
     * The operation id for the '<em>List Checkouts</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___LIST_CHECKOUTS__STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING;

    /**
     * The operation id for the '<em>Add Extra To Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT;

    /**
     * The operation id for the '<em>Get Free Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___GET_FREE_ROOM__ROOMTYPE_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES___GET_FREE_ROOM__ROOMTYPE_STRING_STRING;

    /**
     * The operation id for the '<em>Get Free Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___GET_FREE_ROOMS__INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Initiate Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___INITIATE_BOOKING__STRING_STRING_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Add Room To Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___ADD_ROOM_TO_BOOKING__STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Confirm Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___CONFIRM_BOOKING__INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Initiate Checkout</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___INITIATE_CHECKOUT__INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Pay During Checkout</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Initiate Room Checkout</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___INITIATE_ROOM_CHECKOUT__INT_INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Pay Room During Checkout</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Check In Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___CHECK_IN_ROOM__STRING_INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Get Booking By Id</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___GET_BOOKING_BY_ID__INT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Is Free</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER___IS_FREE__INT_STRING_STRING = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 10;

    /**
     * The number of operations of the '<em>Booking Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_HANDLER_OPERATION_COUNT = IHOTEL_RECEPTIONIST_PROVIDES_OPERATION_COUNT + 11;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl <em>Booking</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBooking()
     */
    int BOOKING = 1;

    /**
     * The feature id for the '<em><b>Customer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING__CUSTOMER = 0;

    /**
     * The feature id for the '<em><b>Room Reservations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING__ROOM_RESERVATIONS = 1;

    /**
     * The feature id for the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING__START_DATE = 2;

    /**
     * The feature id for the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING__END_DATE = 3;

    /**
     * The feature id for the '<em><b>Canceled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING__CANCELED = 4;

    /**
     * The feature id for the '<em><b>Booking Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING__BOOKING_ID = 5;

    /**
     * The feature id for the '<em><b>Bills</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING__BILLS = 6;

    /**
     * The feature id for the '<em><b>Confirmed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING__CONFIRMED = 7;

    /**
     * The number of structural features of the '<em>Booking</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_FEATURE_COUNT = 8;

    /**
     * The operation id for the '<em>Cancel</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___CANCEL = 0;

    /**
     * The operation id for the '<em>Get Occupied Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___GET_OCCUPIED_ROOMS__STRING = 1;

    /**
     * The operation id for the '<em>Check Out</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___CHECK_OUT = 2;

    /**
     * The operation id for the '<em>Nr Of Nights</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___NR_OF_NIGHTS = 3;

    /**
     * The operation id for the '<em>Is Checked In</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___IS_CHECKED_IN = 4;

    /**
     * The operation id for the '<em>Check In</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___CHECK_IN__ROOM = 5;

    /**
     * The operation id for the '<em>Get Booking Price</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___GET_BOOKING_PRICE = 6;

    /**
     * The operation id for the '<em>Get Room Price</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___GET_ROOM_PRICE__INT = 7;

    /**
     * The operation id for the '<em>Is Free</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___IS_FREE__INT_STRING_STRING = 8;

    /**
     * The operation id for the '<em>Add Extra</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___ADD_EXTRA__ROOMEXTRA_INT = 9;

    /**
     * The operation id for the '<em>Check Out Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING___CHECK_OUT_ROOM__INT = 10;

    /**
     * The number of operations of the '<em>Booking</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BOOKING_OPERATION_COUNT = 11;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.CustomerImpl <em>Customer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.CustomerImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getCustomer()
     */
    int CUSTOMER = 2;

    /**
     * The feature id for the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CUSTOMER__FIRST_NAME = 0;

    /**
     * The feature id for the '<em><b>Last Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CUSTOMER__LAST_NAME = 1;

    /**
     * The number of structural features of the '<em>Customer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CUSTOMER_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Customer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CUSTOMER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl <em>Room Reservation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomReservation()
     */
    int ROOM_RESERVATION = 3;

    /**
     * The feature id for the '<em><b>Room Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION__ROOM_TYPE = 0;

    /**
     * The feature id for the '<em><b>Room Extras</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION__ROOM_EXTRAS = 1;

    /**
     * The feature id for the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION__START_DATE = 2;

    /**
     * The feature id for the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION__END_DATE = 3;

    /**
     * The feature id for the '<em><b>Room</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION__ROOM = 4;

    /**
     * The feature id for the '<em><b>Check In Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION__CHECK_IN_DATE = 5;

    /**
     * The feature id for the '<em><b>Check Ou Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION__CHECK_OU_DATE = 6;

    /**
     * The number of structural features of the '<em>Room Reservation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION_FEATURE_COUNT = 7;

    /**
     * The operation id for the '<em>Check In</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION___CHECK_IN = 0;

    /**
     * The operation id for the '<em>Check Out</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION___CHECK_OUT__INT = 1;

    /**
     * The operation id for the '<em>Get Room If Occupied</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION___GET_ROOM_IF_OCCUPIED__STRING = 2;

    /**
     * The operation id for the '<em>Get Room Id</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION___GET_ROOM_ID = 3;

    /**
     * The operation id for the '<em>Add Extra</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION___ADD_EXTRA__ROOMEXTRA = 4;

    /**
     * The number of operations of the '<em>Room Reservation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_RESERVATION_OPERATION_COUNT = 5;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl <em>Room Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomType()
     */
    int ROOM_TYPE = 4;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_TYPE__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Num Beds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_TYPE__NUM_BEDS = 1;

    /**
     * The feature id for the '<em><b>Price Per Night</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_TYPE__PRICE_PER_NIGHT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_TYPE__NAME = 3;

    /**
     * The number of structural features of the '<em>Room Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_TYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Room Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomExtraImpl <em>Room Extra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomExtraImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomExtra()
     */
    int ROOM_EXTRA = 5;

    /**
     * The feature id for the '<em><b>Price</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_EXTRA__PRICE = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_EXTRA__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Room Extra</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_EXTRA_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Room Extra</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_EXTRA_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl <em>Bill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBill()
     */
    int BILL = 7;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getPaymentHandler()
     */
    int PAYMENT_HANDLER = 8;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler <em>IRoom Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIRoomHandler()
     */
    int IROOM_HANDLER = 9;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomHandler()
     */
    int ROOM_HANDLER = 13;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl <em>Room</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoom()
     */
    int ROOM = 6;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelCustomerProvides()
     */
    int IHOTEL_CUSTOMER_PROVIDES = 11;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.FreeRoomTypesDTOImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getFreeRoomTypesDTO()
     */
    int FREE_ROOM_TYPES_DTO = 12;

    /**
     * The feature id for the '<em><b>Occupied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM__OCCUPIED = 0;

    /**
     * The feature id for the '<em><b>Roomtype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM__ROOMTYPE = 1;

    /**
     * The feature id for the '<em><b>Blocked</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM__BLOCKED = 2;

    /**
     * The feature id for the '<em><b>Room Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM__ROOM_NUMBER = 3;

    /**
     * The number of structural features of the '<em>Room</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Room</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Roomreservation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BILL__ROOMRESERVATION = 0;

    /**
     * The feature id for the '<em><b>Price</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BILL__PRICE = 1;

    /**
     * The feature id for the '<em><b>Bill ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BILL__BILL_ID = 2;

    /**
     * The number of structural features of the '<em>Bill</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BILL_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Bill</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BILL_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Banking Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAYMENT_HANDLER__BANKING_COMPONENT = 0;

    /**
     * The number of structural features of the '<em>Payment Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAYMENT_HANDLER_FEATURE_COUNT = 1;

    /**
     * The operation id for the '<em>Pay If Card Valid</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAYMENT_HANDLER___PAY_IF_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

    /**
     * The number of operations of the '<em>Payment Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PAYMENT_HANDLER_OPERATION_COUNT = 1;

    /**
     * The number of structural features of the '<em>IRoom Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IROOM_HANDLER_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Get All Room Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IROOM_HANDLER___GET_ALL_ROOM_TYPES__INT = 0;

    /**
     * The operation id for the '<em>Get Free Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IROOM_HANDLER___GET_FREE_ROOMS = 1;

    /**
     * The operation id for the '<em>Get All Rooms By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IROOM_HANDLER___GET_ALL_ROOMS_BY_TYPE__ROOMTYPE = 2;

    /**
     * The operation id for the '<em>Get Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IROOM_HANDLER___GET_ROOM_TYPE__STRING = 3;

    /**
     * The operation id for the '<em>Get Free Room By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IROOM_HANDLER___GET_FREE_ROOM_BY_TYPE__STRING = 4;

    /**
     * The operation id for the '<em>Get All Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IROOM_HANDLER___GET_ALL_ROOMS = 5;

    /**
     * The number of operations of the '<em>IRoom Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IROOM_HANDLER_OPERATION_COUNT = 6;

    /**
     * The number of structural features of the '<em>IHotel Customer Provides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Get Free Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING = 0;

    /**
     * The operation id for the '<em>Initiate Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING = 1;

    /**
     * The operation id for the '<em>Add Room To Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT = 2;

    /**
     * The operation id for the '<em>Confirm Booking</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT = 3;

    /**
     * The operation id for the '<em>Initiate Checkout</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT = 4;

    /**
     * The operation id for the '<em>Pay During Checkout</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = 5;

    /**
     * The operation id for the '<em>Initiate Room Checkout</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT = 6;

    /**
     * The operation id for the '<em>Pay Room During Checkout</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = 7;

    /**
     * The operation id for the '<em>Check In Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT = 8;

    /**
     * The number of operations of the '<em>IHotel Customer Provides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_CUSTOMER_PROVIDES_OPERATION_COUNT = 9;

    /**
     * The feature id for the '<em><b>Room Type Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Num Beds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FREE_ROOM_TYPES_DTO__NUM_BEDS = 1;

    /**
     * The feature id for the '<em><b>Price Per Night</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT = 2;

    /**
     * The feature id for the '<em><b>Num Free Rooms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS = 3;

    /**
     * The number of structural features of the '<em>Free Room Types DTO</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FREE_ROOM_TYPES_DTO_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Free Room Types DTO</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FREE_ROOM_TYPES_DTO_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Room Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER__ROOM_TYPES = IROOM_HANDLER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Rooms</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER__ROOMS = IROOM_HANDLER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Room Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER_FEATURE_COUNT = IROOM_HANDLER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get All Room Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___GET_ALL_ROOM_TYPES__INT = IROOM_HANDLER___GET_ALL_ROOM_TYPES__INT;

    /**
     * The operation id for the '<em>Get Free Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___GET_FREE_ROOMS = IROOM_HANDLER___GET_FREE_ROOMS;

    /**
     * The operation id for the '<em>Get All Rooms By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___GET_ALL_ROOMS_BY_TYPE__ROOMTYPE = IROOM_HANDLER___GET_ALL_ROOMS_BY_TYPE__ROOMTYPE;

    /**
     * The operation id for the '<em>Get Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___GET_ROOM_TYPE__STRING = IROOM_HANDLER___GET_ROOM_TYPE__STRING;

    /**
     * The operation id for the '<em>Get Free Room By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___GET_FREE_ROOM_BY_TYPE__STRING = IROOM_HANDLER___GET_FREE_ROOM_BY_TYPE__STRING;

    /**
     * The operation id for the '<em>Get All Rooms</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___GET_ALL_ROOMS = IROOM_HANDLER___GET_ALL_ROOMS;

    /**
     * The operation id for the '<em>Add Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING = IROOM_HANDLER_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Edit Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING = IROOM_HANDLER_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Remove Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___REMOVE_ROOM_TYPE__STRING = IROOM_HANDLER_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Change Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING = IROOM_HANDLER_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Add Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___ADD_ROOM__INT_STRING = IROOM_HANDLER_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Remove Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___REMOVE_ROOM__INT = IROOM_HANDLER_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Block Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___BLOCK_ROOM__INT = IROOM_HANDLER_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Unblock Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___UNBLOCK_ROOM__INT = IROOM_HANDLER_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Get Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___GET_ROOM__INT = IROOM_HANDLER_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Initialize</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER___INITIALIZE__INT = IROOM_HANDLER_OPERATION_COUNT + 9;

    /**
     * The number of operations of the '<em>Room Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROOM_HANDLER_OPERATION_COUNT = IROOM_HANDLER_OPERATION_COUNT + 10;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelAdministratorProvides()
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES = 14;

    /**
     * The number of structural features of the '<em>IHotel Administrator Provides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Add Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING = 0;

    /**
     * The operation id for the '<em>Edit Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING = 1;

    /**
     * The operation id for the '<em>Remove Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM_TYPE__STRING = 2;

    /**
     * The operation id for the '<em>Change Room Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES___CHANGE_ROOM_TYPE__INT_STRING = 3;

    /**
     * The operation id for the '<em>Add Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM__INT_STRING = 4;

    /**
     * The operation id for the '<em>Remove Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM__INT = 5;

    /**
     * The operation id for the '<em>Block Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES___BLOCK_ROOM__INT = 6;

    /**
     * The operation id for the '<em>Unblock Room</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES___UNBLOCK_ROOM__INT = 7;

    /**
     * The number of operations of the '<em>IHotel Administrator Provides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_ADMINISTRATOR_PROVIDES_OPERATION_COUNT = 8;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelStartupProvides()
     */
    int IHOTEL_STARTUP_PROVIDES = 15;

    /**
     * The number of structural features of the '<em>IHotel Startup Provides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_STARTUP_PROVIDES_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Startup</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_STARTUP_PROVIDES___STARTUP__INT = 0;

    /**
     * The number of operations of the '<em>IHotel Startup Provides</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int IHOTEL_STARTUP_PROVIDES_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl <em>Hotel Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getHotelInitializer()
     */
    int HOTEL_INITIALIZER = 16;

    /**
     * The feature id for the '<em><b>Room Handler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int HOTEL_INITIALIZER__ROOM_HANDLER = IHOTEL_STARTUP_PROVIDES_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hotel Initializer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int HOTEL_INITIALIZER_FEATURE_COUNT = IHOTEL_STARTUP_PROVIDES_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Startup</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int HOTEL_INITIALIZER___STARTUP__INT = IHOTEL_STARTUP_PROVIDES___STARTUP__INT;

    /**
     * The number of operations of the '<em>Hotel Initializer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int HOTEL_INITIALIZER_OPERATION_COUNT = IHOTEL_STARTUP_PROVIDES_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler <em>Booking Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Booking Handler</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler
     */
    EClass getBookingHandler();

    /**
     * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookings <em>Bookings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Bookings</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookings()
     * @see #getBookingHandler()
     */
    EReference getBookingHandler_Bookings();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymentHandler <em>Payment Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Payment Handler</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymentHandler()
     * @see #getBookingHandler()
     */
    EReference getBookingHandler_PaymentHandler();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler <em>Roomhandler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Roomhandler</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler()
     * @see #getBookingHandler()
     */
    EReference getBookingHandler_Roomhandler();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookingCurrentlyCheckingOut <em>Booking Currently Checking Out</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Booking Currently Checking Out</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookingCurrentlyCheckingOut()
     * @see #getBookingHandler()
     */
    EAttribute getBookingHandler_BookingCurrentlyCheckingOut();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getNextBookingId <em>Next Booking Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Next Booking Id</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getNextBookingId()
     * @see #getBookingHandler()
     */
    EAttribute getBookingHandler_NextBookingId();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookingById(int) <em>Get Booking By Id</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Booking By Id</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookingById(int)
     */
    EOperation getBookingHandler__GetBookingById__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#isFree(int, java.lang.String, java.lang.String) <em>Is Free</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Is Free</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#isFree(int, java.lang.String, java.lang.String)
     */
    EOperation getBookingHandler__IsFree__int_String_String();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking <em>Booking</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Booking</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking
     */
    EClass getBooking();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getCustomer <em>Customer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Customer</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getCustomer()
     * @see #getBooking()
     */
    EReference getBooking_Customer();

    /**
     * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getRoomReservations <em>Room Reservations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Room Reservations</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getRoomReservations()
     * @see #getBooking()
     */
    EReference getBooking_RoomReservations();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getStartDate <em>Start Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Start Date</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getStartDate()
     * @see #getBooking()
     */
    EAttribute getBooking_StartDate();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getEndDate <em>End Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>End Date</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getEndDate()
     * @see #getBooking()
     */
    EAttribute getBooking_EndDate();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCanceled <em>Canceled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Canceled</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCanceled()
     * @see #getBooking()
     */
    EAttribute getBooking_Canceled();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingId <em>Booking Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Booking Id</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingId()
     * @see #getBooking()
     */
    EAttribute getBooking_BookingId();

    /**
     * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBills <em>Bills</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Bills</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBills()
     * @see #getBooking()
     */
    EReference getBooking_Bills();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isConfirmed <em>Confirmed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Confirmed</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isConfirmed()
     * @see #getBooking()
     */
    EAttribute getBooking_Confirmed();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#cancel() <em>Cancel</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Cancel</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#cancel()
     */
    EOperation getBooking__Cancel();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getOccupiedRooms(java.lang.String) <em>Get Occupied Rooms</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Occupied Rooms</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getOccupiedRooms(java.lang.String)
     */
    EOperation getBooking__GetOccupiedRooms__String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#checkOut() <em>Check Out</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Check Out</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#checkOut()
     */
    EOperation getBooking__CheckOut();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#nrOfNights() <em>Nr Of Nights</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Nr Of Nights</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#nrOfNights()
     */
    EOperation getBooking__NrOfNights();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCheckedIn() <em>Is Checked In</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Is Checked In</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCheckedIn()
     */
    EOperation getBooking__IsCheckedIn();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#checkIn(se.chalmers.cse.mdsd1617.group13.hotelsystem.Room) <em>Check In</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Check In</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#checkIn(se.chalmers.cse.mdsd1617.group13.hotelsystem.Room)
     */
    EOperation getBooking__CheckIn__Room();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingPrice() <em>Get Booking Price</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Booking Price</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingPrice()
     */
    EOperation getBooking__GetBookingPrice();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getRoomPrice(int) <em>Get Room Price</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Room Price</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getRoomPrice(int)
     */
    EOperation getBooking__GetRoomPrice__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isFree(int, java.lang.String, java.lang.String) <em>Is Free</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Is Free</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isFree(int, java.lang.String, java.lang.String)
     */
    EOperation getBooking__IsFree__int_String_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#addExtra(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra, int) <em>Add Extra</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Add Extra</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#addExtra(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra, int)
     */
    EOperation getBooking__AddExtra__RoomExtra_int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#checkOutRoom(int) <em>Check Out Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Check Out Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#checkOutRoom(int)
     */
    EOperation getBooking__CheckOutRoom__int();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer <em>Customer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Customer</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer
     */
    EClass getCustomer();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getFirstName <em>First Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>First Name</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getFirstName()
     * @see #getCustomer()
     */
    EAttribute getCustomer_FirstName();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getLastName <em>Last Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Last Name</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getLastName()
     * @see #getCustomer()
     */
    EAttribute getCustomer_LastName();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation <em>Room Reservation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Room Reservation</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation
     */
    EClass getRoomReservation();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomType <em>Room Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Room Type</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomType()
     * @see #getRoomReservation()
     */
    EReference getRoomReservation_RoomType();

    /**
     * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomExtras <em>Room Extras</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Room Extras</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomExtras()
     * @see #getRoomReservation()
     */
    EReference getRoomReservation_RoomExtras();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getStartDate <em>Start Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Start Date</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getStartDate()
     * @see #getRoomReservation()
     */
    EAttribute getRoomReservation_StartDate();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getEndDate <em>End Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>End Date</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getEndDate()
     * @see #getRoomReservation()
     */
    EAttribute getRoomReservation_EndDate();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoom <em>Room</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Room</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoom()
     * @see #getRoomReservation()
     */
    EReference getRoomReservation_Room();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getCheckInDate <em>Check In Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Check In Date</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getCheckInDate()
     * @see #getRoomReservation()
     */
    EAttribute getRoomReservation_CheckInDate();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getCheckOuDate <em>Check Ou Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Check Ou Date</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getCheckOuDate()
     * @see #getRoomReservation()
     */
    EAttribute getRoomReservation_CheckOuDate();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#checkIn() <em>Check In</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Check In</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#checkIn()
     */
    EOperation getRoomReservation__CheckIn();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#checkOut(int) <em>Check Out</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Check Out</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#checkOut(int)
     */
    EOperation getRoomReservation__CheckOut__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomIfOccupied(java.lang.String) <em>Get Room If Occupied</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Room If Occupied</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomIfOccupied(java.lang.String)
     */
    EOperation getRoomReservation__GetRoomIfOccupied__String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomId() <em>Get Room Id</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Room Id</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomId()
     */
    EOperation getRoomReservation__GetRoomId();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#addExtra(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra) <em>Add Extra</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Add Extra</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#addExtra(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra)
     */
    EOperation getRoomReservation__AddExtra__RoomExtra();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType <em>Room Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Room Type</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType
     */
    EClass getRoomType();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Description</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getDescription()
     * @see #getRoomType()
     */
    EAttribute getRoomType_Description();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getNumBeds <em>Num Beds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Num Beds</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getNumBeds()
     * @see #getRoomType()
     */
    EAttribute getRoomType_NumBeds();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getPricePerNight <em>Price Per Night</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Price Per Night</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getPricePerNight()
     * @see #getRoomType()
     */
    EAttribute getRoomType_PricePerNight();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Name</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getName()
     * @see #getRoomType()
     */
    EAttribute getRoomType_Name();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra <em>Room Extra</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Room Extra</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra
     */
    EClass getRoomExtra();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra#getPrice <em>Price</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Price</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra#getPrice()
     * @see #getRoomExtra()
     */
    EAttribute getRoomExtra_Price();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Description</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra#getDescription()
     * @see #getRoomExtra()
     */
    EAttribute getRoomExtra_Description();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill <em>Bill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Bill</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill
     */
    EClass getBill();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getRoomreservation <em>Roomreservation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Roomreservation</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getRoomreservation()
     * @see #getBill()
     */
    EReference getBill_Roomreservation();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getPrice <em>Price</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Price</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getPrice()
     * @see #getBill()
     */
    EAttribute getBill_Price();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getBillID <em>Bill ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Bill ID</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getBillID()
     * @see #getBill()
     */
    EAttribute getBill_BillID();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler <em>Payment Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Payment Handler</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler
     */
    EClass getPaymentHandler();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#getBankingComponent <em>Banking Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Banking Component</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#getBankingComponent()
     * @see #getPaymentHandler()
     */
    EReference getPaymentHandler_BankingComponent();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#payIfCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Pay If Card Valid</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Pay If Card Valid</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#payIfCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
     */
    EOperation getPaymentHandler__PayIfCardValid__String_String_int_int_String_String_double();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler <em>IRoom Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>IRoom Handler</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler
     */
    EClass getIRoomHandler();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getAllRoomTypes(int) <em>Get All Room Types</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get All Room Types</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getAllRoomTypes(int)
     */
    EOperation getIRoomHandler__GetAllRoomTypes__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getFreeRooms() <em>Get Free Rooms</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Free Rooms</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getFreeRooms()
     */
    EOperation getIRoomHandler__GetFreeRooms();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getAllRoomsByType(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType) <em>Get All Rooms By Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get All Rooms By Type</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getAllRoomsByType(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType)
     */
    EOperation getIRoomHandler__GetAllRoomsByType__RoomType();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getRoomType(java.lang.String) <em>Get Room Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Room Type</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getRoomType(java.lang.String)
     */
    EOperation getIRoomHandler__GetRoomType__String();


    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getFreeRoomByType(java.lang.String) <em>Get Free Room By Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Free Room By Type</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getFreeRoomByType(java.lang.String)
     */
    EOperation getIRoomHandler__GetFreeRoomByType__String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getAllRooms() <em>Get All Rooms</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get All Rooms</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler#getAllRooms()
     */
    EOperation getIRoomHandler__GetAllRooms();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler <em>Room Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Room Handler</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler
     */
    EClass getRoomHandler();

    /**
     * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRoomTypes <em>Room Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Room Types</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRoomTypes()
     * @see #getRoomHandler()
     */
    EReference getRoomHandler_RoomTypes();

    /**
     * Returns the meta object for the reference list '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRooms <em>Rooms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Rooms</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRooms()
     * @see #getRoomHandler()
     */
    EReference getRoomHandler_Rooms();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRoom(int) <em>Get Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRoom(int)
     */
    EOperation getRoomHandler__GetRoom__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#initialize(int) <em>Initialize</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Initialize</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#initialize(int)
     */
    EOperation getRoomHandler__Initialize__int();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room <em>Room</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Room</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room
     */
    EClass getRoom();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isOccupied <em>Occupied</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Occupied</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isOccupied()
     * @see #getRoom()
     */
    EAttribute getRoom_Occupied();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomtype <em>Roomtype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Roomtype</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomtype()
     * @see #getRoom()
     */
    EReference getRoom_Roomtype();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isBlocked <em>Blocked</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Blocked</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isBlocked()
     * @see #getRoom()
     */
    EAttribute getRoom_Blocked();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomNumber <em>Room Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Room Number</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomNumber()
     * @see #getRoom()
     */
    EAttribute getRoom_RoomNumber();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>IHotel Customer Provides</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides
     */
    EClass getIHotelCustomerProvides();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#getFreeRooms(int, java.lang.String, java.lang.String) <em>Get Free Rooms</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Free Rooms</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#getFreeRooms(int, java.lang.String, java.lang.String)
     */
    EOperation getIHotelCustomerProvides__GetFreeRooms__int_String_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Initiate Booking</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Initiate Booking</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    EOperation getIHotelCustomerProvides__InitiateBooking__String_String_String_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#addRoomToBooking(java.lang.String, int) <em>Add Room To Booking</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Add Room To Booking</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#addRoomToBooking(java.lang.String, int)
     */
    EOperation getIHotelCustomerProvides__AddRoomToBooking__String_int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#confirmBooking(int) <em>Confirm Booking</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Confirm Booking</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#confirmBooking(int)
     */
    EOperation getIHotelCustomerProvides__ConfirmBooking__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateCheckout(int) <em>Initiate Checkout</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Initiate Checkout</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateCheckout(int)
     */
    EOperation getIHotelCustomerProvides__InitiateCheckout__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#payDuringCheckout(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay During Checkout</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Pay During Checkout</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#payDuringCheckout(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
     */
    EOperation getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateRoomCheckout(int, int) <em>Initiate Room Checkout</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Initiate Room Checkout</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#initiateRoomCheckout(int, int)
     */
    EOperation getIHotelCustomerProvides__InitiateRoomCheckout__int_int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#payRoomDuringCheckout(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay Room During Checkout</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Pay Room During Checkout</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#payRoomDuringCheckout(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
     */
    EOperation getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#checkInRoom(java.lang.String, int) <em>Check In Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Check In Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides#checkInRoom(java.lang.String, int)
     */
    EOperation getIHotelCustomerProvides__CheckInRoom__String_int();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO <em>Free Room Types DTO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Free Room Types DTO</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO
     */
    EClass getFreeRoomTypesDTO();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Room Type Description</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription()
     * @see #getFreeRoomTypesDTO()
     */
    EAttribute getFreeRoomTypesDTO_RoomTypeDescription();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Num Beds</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumBeds()
     * @see #getFreeRoomTypesDTO()
     */
    EAttribute getFreeRoomTypesDTO_NumBeds();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Price Per Night</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getPricePerNight()
     * @see #getFreeRoomTypesDTO()
     */
    EAttribute getFreeRoomTypesDTO_PricePerNight();

    /**
     * Returns the meta object for the attribute '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Num Free Rooms</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms()
     * @see #getFreeRoomTypesDTO()
     */
    EAttribute getFreeRoomTypesDTO_NumFreeRooms();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>IHotel Administrator Provides</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides
     */
    EClass getIHotelAdministratorProvides();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#addRoomType(java.lang.String, double, int, java.lang.String) <em>Add Room Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Add Room Type</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#addRoomType(java.lang.String, double, int, java.lang.String)
     */
    EOperation getIHotelAdministratorProvides__AddRoomType__String_double_int_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#editRoomType(java.lang.String, double, int, java.lang.String) <em>Edit Room Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Edit Room Type</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#editRoomType(java.lang.String, double, int, java.lang.String)
     */
    EOperation getIHotelAdministratorProvides__EditRoomType__String_double_int_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#removeRoomType(java.lang.String) <em>Remove Room Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Remove Room Type</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#removeRoomType(java.lang.String)
     */
    EOperation getIHotelAdministratorProvides__RemoveRoomType__String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#changeRoomType(int, java.lang.String) <em>Change Room Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Change Room Type</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#changeRoomType(int, java.lang.String)
     */
    EOperation getIHotelAdministratorProvides__ChangeRoomType__int_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#addRoom(int, java.lang.String) <em>Add Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Add Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#addRoom(int, java.lang.String)
     */
    EOperation getIHotelAdministratorProvides__AddRoom__int_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#removeRoom(int) <em>Remove Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Remove Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#removeRoom(int)
     */
    EOperation getIHotelAdministratorProvides__RemoveRoom__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#blockRoom(int) <em>Block Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Block Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#blockRoom(int)
     */
    EOperation getIHotelAdministratorProvides__BlockRoom__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#unblockRoom(int) <em>Unblock Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Unblock Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides#unblockRoom(int)
     */
    EOperation getIHotelAdministratorProvides__UnblockRoom__int();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>IHotel Startup Provides</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides
     */
    EClass getIHotelStartupProvides();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides#startup(int) <em>Startup</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Startup</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides#startup(int)
     */
    EOperation getIHotelStartupProvides__Startup__int();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer <em>Hotel Initializer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Hotel Initializer</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer
     */
    EClass getHotelInitializer();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer#getRoomHandler <em>Room Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Room Handler</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer#getRoomHandler()
     * @see #getHotelInitializer()
     */
    EReference getHotelInitializer_RoomHandler();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides <em>IHotel Receptionist Provides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>IHotel Receptionist Provides</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides
     */
    EClass getIHotelReceptionistProvides();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#editBookingTime(int, java.lang.String, java.lang.String) <em>Edit Booking Time</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Edit Booking Time</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#editBookingTime(int, java.lang.String, java.lang.String)
     */
    EOperation getIHotelReceptionistProvides__EditBookingTime__int_String_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#addRoomTypeToBooking(int, java.lang.String, int) <em>Add Room Type To Booking</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Add Room Type To Booking</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#addRoomTypeToBooking(int, java.lang.String, int)
     */
    EOperation getIHotelReceptionistProvides__AddRoomTypeToBooking__int_String_int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#removeRoomTypeFromBooking(int, java.lang.String, int) <em>Remove Room Type From Booking</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Remove Room Type From Booking</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#removeRoomTypeFromBooking(int, java.lang.String, int)
     */
    EOperation getIHotelReceptionistProvides__RemoveRoomTypeFromBooking__int_String_int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listFreeRooms(int) <em>List Free Rooms</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>List Free Rooms</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listFreeRooms(int)
     */
    EOperation getIHotelReceptionistProvides__ListFreeRooms__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#checkIn(int, int) <em>Check In</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Check In</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#checkIn(int, int)
     */
    EOperation getIHotelReceptionistProvides__CheckIn__int_int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#cancelBooking(int) <em>Cancel Booking</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Cancel Booking</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#cancelBooking(int)
     */
    EOperation getIHotelReceptionistProvides__CancelBooking__int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listBookings() <em>List Bookings</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>List Bookings</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listBookings()
     */
    EOperation getIHotelReceptionistProvides__ListBookings();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listOccupiedRooms(java.lang.String) <em>List Occupied Rooms</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>List Occupied Rooms</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listOccupiedRooms(java.lang.String)
     */
    EOperation getIHotelReceptionistProvides__ListOccupiedRooms__String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listCheckins(java.lang.String, java.lang.String) <em>List Checkins</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>List Checkins</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listCheckins(java.lang.String, java.lang.String)
     */
    EOperation getIHotelReceptionistProvides__ListCheckins__String_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listCheckouts(java.lang.String, java.lang.String) <em>List Checkouts</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>List Checkouts</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#listCheckouts(java.lang.String, java.lang.String)
     */
    EOperation getIHotelReceptionistProvides__ListCheckouts__String_String();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#addExtraToRoom(int, int, java.lang.String, int) <em>Add Extra To Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Add Extra To Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#addExtraToRoom(int, int, java.lang.String, int)
     */
    EOperation getIHotelReceptionistProvides__AddExtraToRoom__int_int_String_int();

    /**
     * Returns the meta object for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#getFreeRoom(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType, java.lang.String, java.lang.String) <em>Get Free Room</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the '<em>Get Free Room</em>' operation.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides#getFreeRoom(se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType, java.lang.String, java.lang.String)
     */
    EOperation getIHotelReceptionistProvides__GetFreeRoom__RoomType_String_String();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    HotelsystemFactory getHotelsystemFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBookingHandler()
         */
        EClass BOOKING_HANDLER = eINSTANCE.getBookingHandler();

        /**
         * The meta object literal for the '<em><b>Bookings</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BOOKING_HANDLER__BOOKINGS = eINSTANCE.getBookingHandler_Bookings();

        /**
         * The meta object literal for the '<em><b>Payment Handler</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BOOKING_HANDLER__PAYMENT_HANDLER = eINSTANCE.getBookingHandler_PaymentHandler();

        /**
         * The meta object literal for the '<em><b>Roomhandler</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BOOKING_HANDLER__ROOMHANDLER = eINSTANCE.getBookingHandler_Roomhandler();

        /**
         * The meta object literal for the '<em><b>Booking Currently Checking Out</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BOOKING_HANDLER__BOOKING_CURRENTLY_CHECKING_OUT = eINSTANCE.getBookingHandler_BookingCurrentlyCheckingOut();

        /**
         * The meta object literal for the '<em><b>Next Booking Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BOOKING_HANDLER__NEXT_BOOKING_ID = eINSTANCE.getBookingHandler_NextBookingId();

        /**
         * The meta object literal for the '<em><b>Get Booking By Id</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING_HANDLER___GET_BOOKING_BY_ID__INT = eINSTANCE.getBookingHandler__GetBookingById__int();

        /**
         * The meta object literal for the '<em><b>Is Free</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING_HANDLER___IS_FREE__INT_STRING_STRING = eINSTANCE.getBookingHandler__IsFree__int_String_String();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl <em>Booking</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBooking()
         */
        EClass BOOKING = eINSTANCE.getBooking();

        /**
         * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

        /**
         * The meta object literal for the '<em><b>Room Reservations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BOOKING__ROOM_RESERVATIONS = eINSTANCE.getBooking_RoomReservations();

        /**
         * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

        /**
         * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

        /**
         * The meta object literal for the '<em><b>Canceled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BOOKING__CANCELED = eINSTANCE.getBooking_Canceled();

        /**
         * The meta object literal for the '<em><b>Booking Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingId();

        /**
         * The meta object literal for the '<em><b>Bills</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BOOKING__BILLS = eINSTANCE.getBooking_Bills();

        /**
         * The meta object literal for the '<em><b>Confirmed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BOOKING__CONFIRMED = eINSTANCE.getBooking_Confirmed();

        /**
         * The meta object literal for the '<em><b>Cancel</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___CANCEL = eINSTANCE.getBooking__Cancel();

        /**
         * The meta object literal for the '<em><b>Get Occupied Rooms</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___GET_OCCUPIED_ROOMS__STRING = eINSTANCE.getBooking__GetOccupiedRooms__String();

        /**
         * The meta object literal for the '<em><b>Check Out</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___CHECK_OUT = eINSTANCE.getBooking__CheckOut();

        /**
         * The meta object literal for the '<em><b>Nr Of Nights</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___NR_OF_NIGHTS = eINSTANCE.getBooking__NrOfNights();

        /**
         * The meta object literal for the '<em><b>Is Checked In</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___IS_CHECKED_IN = eINSTANCE.getBooking__IsCheckedIn();

        /**
         * The meta object literal for the '<em><b>Check In</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___CHECK_IN__ROOM = eINSTANCE.getBooking__CheckIn__Room();

        /**
         * The meta object literal for the '<em><b>Get Booking Price</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___GET_BOOKING_PRICE = eINSTANCE.getBooking__GetBookingPrice();

        /**
         * The meta object literal for the '<em><b>Get Room Price</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___GET_ROOM_PRICE__INT = eINSTANCE.getBooking__GetRoomPrice__int();

        /**
         * The meta object literal for the '<em><b>Is Free</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___IS_FREE__INT_STRING_STRING = eINSTANCE.getBooking__IsFree__int_String_String();

        /**
         * The meta object literal for the '<em><b>Add Extra</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___ADD_EXTRA__ROOMEXTRA_INT = eINSTANCE.getBooking__AddExtra__RoomExtra_int();

        /**
         * The meta object literal for the '<em><b>Check Out Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation BOOKING___CHECK_OUT_ROOM__INT = eINSTANCE.getBooking__CheckOutRoom__int();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.CustomerImpl <em>Customer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.CustomerImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getCustomer()
         */
        EClass CUSTOMER = eINSTANCE.getCustomer();

        /**
         * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

        /**
         * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_LastName();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl <em>Room Reservation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomReservationImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomReservation()
         */
        EClass ROOM_RESERVATION = eINSTANCE.getRoomReservation();

        /**
         * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROOM_RESERVATION__ROOM_TYPE = eINSTANCE.getRoomReservation_RoomType();

        /**
         * The meta object literal for the '<em><b>Room Extras</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROOM_RESERVATION__ROOM_EXTRAS = eINSTANCE.getRoomReservation_RoomExtras();

        /**
         * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_RESERVATION__START_DATE = eINSTANCE.getRoomReservation_StartDate();

        /**
         * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_RESERVATION__END_DATE = eINSTANCE.getRoomReservation_EndDate();

        /**
         * The meta object literal for the '<em><b>Room</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROOM_RESERVATION__ROOM = eINSTANCE.getRoomReservation_Room();

        /**
         * The meta object literal for the '<em><b>Check In Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_RESERVATION__CHECK_IN_DATE = eINSTANCE.getRoomReservation_CheckInDate();

        /**
         * The meta object literal for the '<em><b>Check Ou Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_RESERVATION__CHECK_OU_DATE = eINSTANCE.getRoomReservation_CheckOuDate();

        /**
         * The meta object literal for the '<em><b>Check In</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation ROOM_RESERVATION___CHECK_IN = eINSTANCE.getRoomReservation__CheckIn();

        /**
         * The meta object literal for the '<em><b>Check Out</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation ROOM_RESERVATION___CHECK_OUT__INT = eINSTANCE.getRoomReservation__CheckOut__int();

        /**
         * The meta object literal for the '<em><b>Get Room If Occupied</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation ROOM_RESERVATION___GET_ROOM_IF_OCCUPIED__STRING = eINSTANCE.getRoomReservation__GetRoomIfOccupied__String();

        /**
         * The meta object literal for the '<em><b>Get Room Id</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation ROOM_RESERVATION___GET_ROOM_ID = eINSTANCE.getRoomReservation__GetRoomId();

        /**
         * The meta object literal for the '<em><b>Add Extra</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation ROOM_RESERVATION___ADD_EXTRA__ROOMEXTRA = eINSTANCE.getRoomReservation__AddExtra__RoomExtra();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl <em>Room Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomType()
         */
        EClass ROOM_TYPE = eINSTANCE.getRoomType();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

        /**
         * The meta object literal for the '<em><b>Num Beds</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_TYPE__NUM_BEDS = eINSTANCE.getRoomType_NumBeds();

        /**
         * The meta object literal for the '<em><b>Price Per Night</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_TYPE__PRICE_PER_NIGHT = eINSTANCE.getRoomType_PricePerNight();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomExtraImpl <em>Room Extra</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomExtraImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomExtra()
         */
        EClass ROOM_EXTRA = eINSTANCE.getRoomExtra();

        /**
         * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_EXTRA__PRICE = eINSTANCE.getRoomExtra_Price();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM_EXTRA__DESCRIPTION = eINSTANCE.getRoomExtra_Description();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl <em>Bill</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getBill()
         */
        EClass BILL = eINSTANCE.getBill();

        /**
         * The meta object literal for the '<em><b>Roomreservation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BILL__ROOMRESERVATION = eINSTANCE.getBill_Roomreservation();

        /**
         * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BILL__PRICE = eINSTANCE.getBill_Price();

        /**
         * The meta object literal for the '<em><b>Bill ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BILL__BILL_ID = eINSTANCE.getBill_BillID();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getPaymentHandler()
         */
        EClass PAYMENT_HANDLER = eINSTANCE.getPaymentHandler();

        /**
         * The meta object literal for the '<em><b>Banking Component</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference PAYMENT_HANDLER__BANKING_COMPONENT = eINSTANCE.getPaymentHandler_BankingComponent();

        /**
         * The meta object literal for the '<em><b>Pay If Card Valid</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation PAYMENT_HANDLER___PAY_IF_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getPaymentHandler__PayIfCardValid__String_String_int_int_String_String_double();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler <em>IRoom Handler</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIRoomHandler()
         */
        EClass IROOM_HANDLER = eINSTANCE.getIRoomHandler();

        /**
         * The meta object literal for the '<em><b>Get All Room Types</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IROOM_HANDLER___GET_ALL_ROOM_TYPES__INT = eINSTANCE.getIRoomHandler__GetAllRoomTypes__int();

        /**
         * The meta object literal for the '<em><b>Get Free Rooms</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IROOM_HANDLER___GET_FREE_ROOMS = eINSTANCE.getIRoomHandler__GetFreeRooms();

        /**
         * The meta object literal for the '<em><b>Get All Rooms By Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IROOM_HANDLER___GET_ALL_ROOMS_BY_TYPE__ROOMTYPE = eINSTANCE.getIRoomHandler__GetAllRoomsByType__RoomType();

        /**
         * The meta object literal for the '<em><b>Get Room Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IROOM_HANDLER___GET_ROOM_TYPE__STRING = eINSTANCE.getIRoomHandler__GetRoomType__String();

        /**
         * The meta object literal for the '<em><b>Get Free Room By Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IROOM_HANDLER___GET_FREE_ROOM_BY_TYPE__STRING = eINSTANCE.getIRoomHandler__GetFreeRoomByType__String();

        /**
         * The meta object literal for the '<em><b>Get All Rooms</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IROOM_HANDLER___GET_ALL_ROOMS = eINSTANCE.getIRoomHandler__GetAllRooms();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoomHandler()
         */
        EClass ROOM_HANDLER = eINSTANCE.getRoomHandler();

        /**
         * The meta object literal for the '<em><b>Room Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROOM_HANDLER__ROOM_TYPES = eINSTANCE.getRoomHandler_RoomTypes();

        /**
         * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROOM_HANDLER__ROOMS = eINSTANCE.getRoomHandler_Rooms();

        /**
         * The meta object literal for the '<em><b>Get Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation ROOM_HANDLER___GET_ROOM__INT = eINSTANCE.getRoomHandler__GetRoom__int();

        /**
         * The meta object literal for the '<em><b>Initialize</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation ROOM_HANDLER___INITIALIZE__INT = eINSTANCE.getRoomHandler__Initialize__int();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl <em>Room</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getRoom()
         */
        EClass ROOM = eINSTANCE.getRoom();

        /**
         * The meta object literal for the '<em><b>Occupied</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM__OCCUPIED = eINSTANCE.getRoom_Occupied();

        /**
         * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROOM__ROOMTYPE = eINSTANCE.getRoom_Roomtype();

        /**
         * The meta object literal for the '<em><b>Blocked</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM__BLOCKED = eINSTANCE.getRoom_Blocked();

        /**
         * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute ROOM__ROOM_NUMBER = eINSTANCE.getRoom_RoomNumber();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelCustomerProvides()
         */
        EClass IHOTEL_CUSTOMER_PROVIDES = eINSTANCE.getIHotelCustomerProvides();

        /**
         * The meta object literal for the '<em><b>Get Free Rooms</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__GetFreeRooms__int_String_String();

        /**
         * The meta object literal for the '<em><b>Initiate Booking</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__InitiateBooking__String_String_String_String();

        /**
         * The meta object literal for the '<em><b>Add Room To Booking</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT = eINSTANCE.getIHotelCustomerProvides__AddRoomToBooking__String_int();

        /**
         * The meta object literal for the '<em><b>Confirm Booking</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT = eINSTANCE.getIHotelCustomerProvides__ConfirmBooking__int();

        /**
         * The meta object literal for the '<em><b>Initiate Checkout</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT = eINSTANCE.getIHotelCustomerProvides__InitiateCheckout__int();

        /**
         * The meta object literal for the '<em><b>Pay During Checkout</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String();

        /**
         * The meta object literal for the '<em><b>Initiate Room Checkout</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT = eINSTANCE.getIHotelCustomerProvides__InitiateRoomCheckout__int_int();

        /**
         * The meta object literal for the '<em><b>Pay Room During Checkout</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String();

        /**
         * The meta object literal for the '<em><b>Check In Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT = eINSTANCE.getIHotelCustomerProvides__CheckInRoom__String_int();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.FreeRoomTypesDTOImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getFreeRoomTypesDTO()
         */
        EClass FREE_ROOM_TYPES_DTO = eINSTANCE.getFreeRoomTypesDTO();

        /**
         * The meta object literal for the '<em><b>Room Type Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION = eINSTANCE.getFreeRoomTypesDTO_RoomTypeDescription();

        /**
         * The meta object literal for the '<em><b>Num Beds</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FREE_ROOM_TYPES_DTO__NUM_BEDS = eINSTANCE.getFreeRoomTypesDTO_NumBeds();

        /**
         * The meta object literal for the '<em><b>Price Per Night</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT = eINSTANCE.getFreeRoomTypesDTO_PricePerNight();

        /**
         * The meta object literal for the '<em><b>Num Free Rooms</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS = eINSTANCE.getFreeRoomTypesDTO_NumFreeRooms();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelAdministratorProvides()
         */
        EClass IHOTEL_ADMINISTRATOR_PROVIDES = eINSTANCE.getIHotelAdministratorProvides();

        /**
         * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING = eINSTANCE.getIHotelAdministratorProvides__AddRoomType__String_double_int_String();

        /**
         * The meta object literal for the '<em><b>Edit Room Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_ADMINISTRATOR_PROVIDES___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING = eINSTANCE.getIHotelAdministratorProvides__EditRoomType__String_double_int_String();

        /**
         * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM_TYPE__STRING = eINSTANCE.getIHotelAdministratorProvides__RemoveRoomType__String();

        /**
         * The meta object literal for the '<em><b>Change Room Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_ADMINISTRATOR_PROVIDES___CHANGE_ROOM_TYPE__INT_STRING = eINSTANCE.getIHotelAdministratorProvides__ChangeRoomType__int_String();

        /**
         * The meta object literal for the '<em><b>Add Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM__INT_STRING = eINSTANCE.getIHotelAdministratorProvides__AddRoom__int_String();

        /**
         * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM__INT = eINSTANCE.getIHotelAdministratorProvides__RemoveRoom__int();

        /**
         * The meta object literal for the '<em><b>Block Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_ADMINISTRATOR_PROVIDES___BLOCK_ROOM__INT = eINSTANCE.getIHotelAdministratorProvides__BlockRoom__int();

        /**
         * The meta object literal for the '<em><b>Unblock Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_ADMINISTRATOR_PROVIDES___UNBLOCK_ROOM__INT = eINSTANCE.getIHotelAdministratorProvides__UnblockRoom__int();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelStartupProvides()
         */
        EClass IHOTEL_STARTUP_PROVIDES = eINSTANCE.getIHotelStartupProvides();

        /**
         * The meta object literal for the '<em><b>Startup</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_STARTUP_PROVIDES___STARTUP__INT = eINSTANCE.getIHotelStartupProvides__Startup__int();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl <em>Hotel Initializer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelInitializerImpl
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getHotelInitializer()
         */
        EClass HOTEL_INITIALIZER = eINSTANCE.getHotelInitializer();

        /**
         * The meta object literal for the '<em><b>Room Handler</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference HOTEL_INITIALIZER__ROOM_HANDLER = eINSTANCE.getHotelInitializer_RoomHandler();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides <em>IHotel Receptionist Provides</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides
         * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl#getIHotelReceptionistProvides()
         */
        EClass IHOTEL_RECEPTIONIST_PROVIDES = eINSTANCE.getIHotelReceptionistProvides();

        /**
         * The meta object literal for the '<em><b>Edit Booking Time</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___EDIT_BOOKING_TIME__INT_STRING_STRING = eINSTANCE.getIHotelReceptionistProvides__EditBookingTime__int_String_String();

        /**
         * The meta object literal for the '<em><b>Add Room Type To Booking</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT = eINSTANCE.getIHotelReceptionistProvides__AddRoomTypeToBooking__int_String_int();

        /**
         * The meta object literal for the '<em><b>Remove Room Type From Booking</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING_INT = eINSTANCE.getIHotelReceptionistProvides__RemoveRoomTypeFromBooking__int_String_int();

        /**
         * The meta object literal for the '<em><b>List Free Rooms</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT = eINSTANCE.getIHotelReceptionistProvides__ListFreeRooms__int();

        /**
         * The meta object literal for the '<em><b>Check In</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___CHECK_IN__INT_INT = eINSTANCE.getIHotelReceptionistProvides__CheckIn__int_int();

        /**
         * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___CANCEL_BOOKING__INT = eINSTANCE.getIHotelReceptionistProvides__CancelBooking__int();

        /**
         * The meta object literal for the '<em><b>List Bookings</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_BOOKINGS = eINSTANCE.getIHotelReceptionistProvides__ListBookings();

        /**
         * The meta object literal for the '<em><b>List Occupied Rooms</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING = eINSTANCE.getIHotelReceptionistProvides__ListOccupiedRooms__String();

        /**
         * The meta object literal for the '<em><b>List Checkins</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING_STRING = eINSTANCE.getIHotelReceptionistProvides__ListCheckins__String_String();

        /**
         * The meta object literal for the '<em><b>List Checkouts</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING = eINSTANCE.getIHotelReceptionistProvides__ListCheckouts__String_String();

        /**
         * The meta object literal for the '<em><b>Add Extra To Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = eINSTANCE.getIHotelReceptionistProvides__AddExtraToRoom__int_int_String_int();

        /**
         * The meta object literal for the '<em><b>Get Free Room</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EOperation IHOTEL_RECEPTIONIST_PROVIDES___GET_FREE_ROOM__ROOMTYPE_STRING_STRING = eINSTANCE.getIHotelReceptionistProvides__GetFreeRoom__RoomType_String_String();

    }

} //HotelsystemPackage
