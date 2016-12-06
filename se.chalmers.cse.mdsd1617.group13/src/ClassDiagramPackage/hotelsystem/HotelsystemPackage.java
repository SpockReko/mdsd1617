/**
 */
package ClassDiagramPackage.hotelsystem;

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
 * @see ClassDiagramPackage.hotelsystem.HotelsystemFactory
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
	String eNS_URI = "http:///ClassDiagramPackage/hotelsystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ClassDiagramPackage.hotelsystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelsystemPackage eINSTANCE = ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides <em>IReceptionist Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIReceptionistProvides()
	 * @generated
	 */
	int IRECEPTIONIST_PROVIDES = 18;

	/**
	 * The number of structural features of the '<em>IReceptionist Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Edit Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___EDIT_RESERVATION__INT_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Add Room Type To Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_RESERVATION__INT_STRING_INT = 1;

	/**
	 * The operation id for the '<em>Remove Room Type From Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_RESERVATION__INT_STRING = 2;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___EDIT_ROOM_TYPE__INT_STRING_INT = 3;

	/**
	 * The operation id for the '<em>List Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT = 4;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___CHECK_IN__INT = 5;

	/**
	 * The operation id for the '<em>Cancel Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___CANCEL_RESERVATION__INT = 6;

	/**
	 * The operation id for the '<em>List Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___LIST_RESERVATIONS = 7;

	/**
	 * The operation id for the '<em>List Occupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING = 8;

	/**
	 * The operation id for the '<em>List Checkins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING = 9;

	/**
	 * The operation id for the '<em>List Checkouts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING = 10;

	/**
	 * The operation id for the '<em>Add Extra To Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = 11;

	/**
	 * The number of operations of the '<em>IReceptionist Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRECEPTIONIST_PROVIDES_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.ReservationHandlerImpl <em>Reservation Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.ReservationHandlerImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getReservationHandler()
	 * @generated
	 */
	int RESERVATION_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__RESERVATION = IRECEPTIONIST_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__PAYMENTHANDLER = IRECEPTIONIST_PROVIDES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roomhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__ROOMHANDLER = IRECEPTIONIST_PROVIDES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__CURRENT_RESERVATION_ID = IRECEPTIONIST_PROVIDES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reservation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER_FEATURE_COUNT = IRECEPTIONIST_PROVIDES_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Edit Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___EDIT_RESERVATION__INT_STRING_STRING_STRING_STRING = IRECEPTIONIST_PROVIDES___EDIT_RESERVATION__INT_STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Add Room Type To Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___ADD_ROOM_TYPE_TO_RESERVATION__INT_STRING_INT = IRECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_RESERVATION__INT_STRING_INT;

	/**
	 * The operation id for the '<em>Remove Room Type From Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___REMOVE_ROOM_TYPE_FROM_RESERVATION__INT_STRING = IRECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_RESERVATION__INT_STRING;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___EDIT_ROOM_TYPE__INT_STRING_INT = IRECEPTIONIST_PROVIDES___EDIT_ROOM_TYPE__INT_STRING_INT;

	/**
	 * The operation id for the '<em>List Free Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___LIST_FREE_ROOMS__INT = IRECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___CHECK_IN__INT = IRECEPTIONIST_PROVIDES___CHECK_IN__INT;

	/**
	 * The operation id for the '<em>Cancel Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___CANCEL_RESERVATION__INT = IRECEPTIONIST_PROVIDES___CANCEL_RESERVATION__INT;

	/**
	 * The operation id for the '<em>List Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___LIST_RESERVATIONS = IRECEPTIONIST_PROVIDES___LIST_RESERVATIONS;

	/**
	 * The operation id for the '<em>List Occupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___LIST_OCCUPIED_ROOMS__STRING = IRECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING;

	/**
	 * The operation id for the '<em>List Checkins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___LIST_CHECKINS__STRING = IRECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING;

	/**
	 * The operation id for the '<em>List Checkouts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___LIST_CHECKOUTS__STRING_STRING = IRECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Extra To Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = IRECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT;

	/**
	 * The number of operations of the '<em>Reservation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER_OPERATION_COUNT = IRECEPTIONIST_PROVIDES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.ReservationImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Roomreservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ROOMRESERVATION = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__END_DATE = 3;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___RESERVATION__STRING_STRING_STRING_STRING_INT = 0;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.CustomerImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getCustomer()
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
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomReservationImpl <em>Room Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.RoomReservationImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoomReservation()
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
	 * The number of operations of the '<em>Room Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESERVATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistRoomProvides <em>IReceptionist Room Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistRoomProvides
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIReceptionistRoomProvides()
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
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.RoomTypeImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoomType()
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
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomExtrasImpl <em>Room Extras</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.RoomExtrasImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoomExtras()
	 * @generated
	 */
	int ROOM_EXTRAS = 6;

	/**
	 * The number of structural features of the '<em>Room Extras</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRAS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Room Extras</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTRAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.BillImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getBill()
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
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.PaymentHandlerImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getPaymentHandler()
	 * @generated
	 */
	int PAYMENT_HANDLER = 8;

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
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.IRoomHandler <em>IRoom Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.IRoomHandler
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIRoomHandler()
	 * @generated
	 */
	int IROOM_HANDLER = 9;

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
	 * The number of operations of the '<em>IRoom Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_HANDLER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.IHotelStartupProvides
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIHotelStartupProvides()
	 * @generated
	 */
	int IHOTEL_STARTUP_PROVIDES = 16;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.HotelInitializerImpl <em>Hotel Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelInitializerImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getHotelInitializer()
	 * @generated
	 */
	int HOTEL_INITIALIZER = 17;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.RoomHandlerImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoomHandler()
	 * @generated
	 */
	int ROOM_HANDLER = 10;

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
	 * The number of operations of the '<em>Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_OPERATION_COUNT = IROOM_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.IAdminRoomProvides <em>IAdmin Room Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.IAdminRoomProvides
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIAdminRoomProvides()
	 * @generated
	 */
	int IADMIN_ROOM_PROVIDES = 11;

	/**
	 * The number of structural features of the '<em>IAdmin Room Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADMIN_ROOM_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IAdmin Room Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IADMIN_ROOM_PROVIDES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.RoomImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 12;

	/**
	 * The feature id for the '<em><b>Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__OCCUPIED = IADMIN_ROOM_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = IADMIN_ROOM_PROVIDES_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIHotelCustomerProvides()
	 * @generated
	 */
	int IHOTEL_CUSTOMER_PROVIDES = 13;

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
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.impl.FreeRoomTypesDTOImpl
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getFreeRoomTypesDTO()
	 * @generated
	 */
	int FREE_ROOM_TYPES_DTO = 14;

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
	 * The meta object id for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides
	 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIHotelAdministratorProvides()
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
	 * The feature id for the '<em><b>Roomhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER__ROOMHANDLER = 0;

	/**
	 * The feature id for the '<em><b>Reservationhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER__RESERVATIONHANDLER = 1;

	/**
	 * The number of structural features of the '<em>Hotel Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hotel Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_INITIALIZER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.ReservationHandler <em>Reservation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Handler</em>'.
	 * @see ClassDiagramPackage.hotelsystem.ReservationHandler
	 * @generated
	 */
	EClass getReservationHandler();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservation</em>'.
	 * @see ClassDiagramPackage.hotelsystem.ReservationHandler#getReservation()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EReference getReservationHandler_Reservation();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getPaymenthandler <em>Paymenthandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymenthandler</em>'.
	 * @see ClassDiagramPackage.hotelsystem.ReservationHandler#getPaymenthandler()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EReference getReservationHandler_Paymenthandler();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getRoomhandler <em>Roomhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomhandler</em>'.
	 * @see ClassDiagramPackage.hotelsystem.ReservationHandler#getRoomhandler()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EReference getReservationHandler_Roomhandler();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getCurrentReservationId <em>Current Reservation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Reservation Id</em>'.
	 * @see ClassDiagramPackage.hotelsystem.ReservationHandler#getCurrentReservationId()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EAttribute getReservationHandler_CurrentReservationId();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.Reservation#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Reservation#getCustomer()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Customer();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagramPackage.hotelsystem.Reservation#getRoomreservation <em>Roomreservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomreservation</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Reservation#getRoomreservation()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Roomreservation();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.Reservation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Reservation#getStartDate()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.Reservation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Reservation#getEndDate()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_EndDate();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.Reservation#Reservation(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) <em>Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reservation</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.Reservation#Reservation(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getReservation__Reservation__String_String_String_String_int();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.Customer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Customer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.Customer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Customer#getLastName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LastName();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.Customer#Customer(java.lang.String, java.lang.String) <em>Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Customer</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.Customer#Customer(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomer__Customer__String_String();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.RoomReservation <em>Room Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Reservation</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomReservation
	 * @generated
	 */
	EClass getRoomReservation();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.RoomReservation#getIreceptionistroomprovides <em>Ireceptionistroomprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ireceptionistroomprovides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomReservation#getIreceptionistroomprovides()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_Ireceptionistroomprovides();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.RoomReservation#getIreceptionistroomtypeprovides <em>Ireceptionistroomtypeprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ireceptionistroomtypeprovides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomReservation#getIreceptionistroomtypeprovides()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_Ireceptionistroomtypeprovides();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagramPackage.hotelsystem.RoomReservation#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em></em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomReservation#get_()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation__();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.RoomReservation#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomReservation#getBill()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EReference getRoomReservation_Bill();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.RoomReservation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomReservation#getStartDate()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.RoomReservation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomReservation#getEndDate()
	 * @see #getRoomReservation()
	 * @generated
	 */
	EAttribute getRoomReservation_EndDate();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.RoomReservation#checkIn() <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.RoomReservation#checkIn()
	 * @generated
	 */
	EOperation getRoomReservation__CheckIn();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.IReceptionistRoomProvides <em>IReceptionist Room Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReceptionist Room Provides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistRoomProvides
	 * @generated
	 */
	EClass getIReceptionistRoomProvides();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistRoomProvides#setOccupied(boolean) <em>Set Occupied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Occupied</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistRoomProvides#setOccupied(boolean)
	 * @generated
	 */
	EOperation getIReceptionistRoomProvides__SetOccupied__boolean();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.RoomType#getNumBeds <em>Num Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Beds</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomType#getNumBeds()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_NumBeds();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.RoomType#getPricePerNight <em>Price Per Night</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Night</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomType#getPricePerNight()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_PricePerNight();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.RoomExtras <em>Room Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Extras</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomExtras
	 * @generated
	 */
	EClass getRoomExtras();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.Bill#getRoomreservation <em>Roomreservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomreservation</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Bill#getRoomreservation()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Roomreservation();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.PaymentHandler <em>Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Handler</em>'.
	 * @see ClassDiagramPackage.hotelsystem.PaymentHandler
	 * @generated
	 */
	EClass getPaymentHandler();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.PaymentHandler#getIcustomerprovides <em>Icustomerprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Icustomerprovides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.PaymentHandler#getIcustomerprovides()
	 * @see #getPaymentHandler()
	 * @generated
	 */
	EReference getPaymentHandler_Icustomerprovides();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.PaymentHandler#payIfCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay If Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay If Card Valid</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.PaymentHandler#payIfCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPaymentHandler__PayIfCardValid__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.IRoomHandler <em>IRoom Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Handler</em>'.
	 * @see ClassDiagramPackage.hotelsystem.IRoomHandler
	 * @generated
	 */
	EClass getIRoomHandler();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IRoomHandler#getAllRoomTypes() <em>Get All Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Room Types</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IRoomHandler#getAllRoomTypes()
	 * @generated
	 */
	EOperation getIRoomHandler__GetAllRoomTypes();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.RoomHandler <em>Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Handler</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomHandler
	 * @generated
	 */
	EClass getRoomHandler();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagramPackage.hotelsystem.RoomHandler#getIadminroomtypeprovides <em>Iadminroomtypeprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iadminroomtypeprovides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomHandler#getIadminroomtypeprovides()
	 * @see #getRoomHandler()
	 * @generated
	 */
	EReference getRoomHandler_Iadminroomtypeprovides();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagramPackage.hotelsystem.RoomHandler#getIadminroomprovides <em>Iadminroomprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iadminroomprovides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.RoomHandler#getIadminroomprovides()
	 * @see #getRoomHandler()
	 * @generated
	 */
	EReference getRoomHandler_Iadminroomprovides();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.IAdminRoomProvides <em>IAdmin Room Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAdmin Room Provides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.IAdminRoomProvides
	 * @generated
	 */
	EClass getIAdminRoomProvides();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Startup Provides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.IHotelStartupProvides
	 * @generated
	 */
	EClass getIHotelStartupProvides();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelStartupProvides#startup(int) <em>Startup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Startup</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelStartupProvides#startup(int)
	 * @generated
	 */
	EOperation getIHotelStartupProvides__Startup__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelStartupProvides#getRoomHandler() <em>Get Room Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Handler</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelStartupProvides#getRoomHandler()
	 * @generated
	 */
	EOperation getIHotelStartupProvides__GetRoomHandler();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.HotelInitializer <em>Hotel Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Initializer</em>'.
	 * @see ClassDiagramPackage.hotelsystem.HotelInitializer
	 * @generated
	 */
	EClass getHotelInitializer();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.HotelInitializer#getRoomhandler <em>Roomhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomhandler</em>'.
	 * @see ClassDiagramPackage.hotelsystem.HotelInitializer#getRoomhandler()
	 * @see #getHotelInitializer()
	 * @generated
	 */
	EReference getHotelInitializer_Roomhandler();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.hotelsystem.HotelInitializer#getReservationhandler <em>Reservationhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservationhandler</em>'.
	 * @see ClassDiagramPackage.hotelsystem.HotelInitializer#getReservationhandler()
	 * @see #getHotelInitializer()
	 * @generated
	 */
	EReference getHotelInitializer_Reservationhandler();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.Room#isOccupied <em>Occupied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupied</em>'.
	 * @see ClassDiagramPackage.hotelsystem.Room#isOccupied()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Occupied();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Customer Provides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides
	 * @generated
	 */
	EClass getIHotelCustomerProvides();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#getFreeRooms(int, java.lang.String, java.lang.String) <em>Get Free Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Free Rooms</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#getFreeRooms(int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__GetFreeRooms__int_String_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#initiateBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Initiate Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Booking</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#initiateBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateBooking__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#addRoomToBooking(java.lang.String, int) <em>Add Room To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room To Booking</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#addRoomToBooking(java.lang.String, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__AddRoomToBooking__String_int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#confirmBooking(int) <em>Confirm Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Booking</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#confirmBooking(int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__ConfirmBooking__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#initiateCheckout(int) <em>Initiate Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Checkout</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#initiateCheckout(int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateCheckout__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#payDuringCheckout(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay During Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay During Checkout</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#payDuringCheckout(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#initiateRoomCheckout(int, int) <em>Initiate Room Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initiate Room Checkout</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#initiateRoomCheckout(int, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__InitiateRoomCheckout__int_int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#payRoomDuringCheckout(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay Room During Checkout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Room During Checkout</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#payRoomDuringCheckout(int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#checkInRoom(java.lang.String, int) <em>Check In Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Room</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides#checkInRoom(java.lang.String, int)
	 * @generated
	 */
	EOperation getIHotelCustomerProvides__CheckInRoom__String_int();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO <em>Free Room Types DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Room Types DTO</em>'.
	 * @see ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO
	 * @generated
	 */
	EClass getFreeRoomTypesDTO();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Description</em>'.
	 * @see ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_RoomTypeDescription();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Beds</em>'.
	 * @see ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO#getNumBeds()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_NumBeds();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Night</em>'.
	 * @see ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO#getPricePerNight()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_PricePerNight();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Free Rooms</em>'.
	 * @see ClassDiagramPackage.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms()
	 * @see #getFreeRoomTypesDTO()
	 * @generated
	 */
	EAttribute getFreeRoomTypesDTO_NumFreeRooms();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Administrator Provides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides
	 * @generated
	 */
	EClass getIHotelAdministratorProvides();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#addRoomType(java.lang.String, double, int, java.lang.String) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#addRoomType(java.lang.String, double, int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__AddRoomType__String_double_int_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#editRoomType(java.lang.String, double, int, java.lang.String) <em>Edit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Type</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#editRoomType(java.lang.String, double, int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__EditRoomType__String_double_int_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#removeRoomType(java.lang.String) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#removeRoomType(java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__RemoveRoomType__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#changeRoomType(int, java.lang.String) <em>Change Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Type</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#changeRoomType(int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__ChangeRoomType__int_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#addRoom(int, java.lang.String) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#addRoom(int, java.lang.String)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__AddRoom__int_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#removeRoom(int)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#blockRoom(int) <em>Block Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Block Room</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#blockRoom(int)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__BlockRoom__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#unblockRoom(int) <em>Unblock Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unblock Room</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides#unblockRoom(int)
	 * @generated
	 */
	EOperation getIHotelAdministratorProvides__UnblockRoom__int();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides <em>IReceptionist Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReceptionist Provides</em>'.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides
	 * @generated
	 */
	EClass getIReceptionistProvides();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#editReservation(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Edit Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Reservation</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#editReservation(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIReceptionistProvides__EditReservation__int_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#addRoomTypeToReservation(int, java.lang.String, int) <em>Add Room Type To Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type To Reservation</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#addRoomTypeToReservation(int, java.lang.String, int)
	 * @generated
	 */
	EOperation getIReceptionistProvides__AddRoomTypeToReservation__int_String_int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#removeRoomTypeFromReservation(int, java.lang.String) <em>Remove Room Type From Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type From Reservation</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#removeRoomTypeFromReservation(int, java.lang.String)
	 * @generated
	 */
	EOperation getIReceptionistProvides__RemoveRoomTypeFromReservation__int_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#editRoomType(int, java.lang.String, int) <em>Edit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Type</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#editRoomType(int, java.lang.String, int)
	 * @generated
	 */
	EOperation getIReceptionistProvides__EditRoomType__int_String_int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#listFreeRooms(int) <em>List Free Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Free Rooms</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#listFreeRooms(int)
	 * @generated
	 */
	EOperation getIReceptionistProvides__ListFreeRooms__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#checkIn(int) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#checkIn(int)
	 * @generated
	 */
	EOperation getIReceptionistProvides__CheckIn__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#cancelReservation(int) <em>Cancel Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Reservation</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#cancelReservation(int)
	 * @generated
	 */
	EOperation getIReceptionistProvides__CancelReservation__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#listReservations() <em>List Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Reservations</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#listReservations()
	 * @generated
	 */
	EOperation getIReceptionistProvides__ListReservations();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#listOccupiedRooms(java.lang.String) <em>List Occupied Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Occupied Rooms</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#listOccupiedRooms(java.lang.String)
	 * @generated
	 */
	EOperation getIReceptionistProvides__ListOccupiedRooms__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#listCheckins(java.lang.String) <em>List Checkins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Checkins</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#listCheckins(java.lang.String)
	 * @generated
	 */
	EOperation getIReceptionistProvides__ListCheckins__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#listCheckouts(java.lang.String, java.lang.String) <em>List Checkouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Checkouts</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#listCheckouts(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIReceptionistProvides__ListCheckouts__String_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides#addExtraToRoom(int, int, java.lang.String, int) <em>Add Extra To Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Extra To Room</em>' operation.
	 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides#addExtraToRoom(int, int, java.lang.String, int)
	 * @generated
	 */
	EOperation getIReceptionistProvides__AddExtraToRoom__int_int_String_int();

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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.ReservationHandlerImpl <em>Reservation Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.ReservationHandlerImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getReservationHandler()
		 * @generated
		 */
		EClass RESERVATION_HANDLER = eINSTANCE.getReservationHandler();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_HANDLER__RESERVATION = eINSTANCE.getReservationHandler_Reservation();

		/**
		 * The meta object literal for the '<em><b>Paymenthandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_HANDLER__PAYMENTHANDLER = eINSTANCE.getReservationHandler_Paymenthandler();

		/**
		 * The meta object literal for the '<em><b>Roomhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_HANDLER__ROOMHANDLER = eINSTANCE.getReservationHandler_Roomhandler();

		/**
		 * The meta object literal for the '<em><b>Current Reservation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_HANDLER__CURRENT_RESERVATION_ID = eINSTANCE.getReservationHandler_CurrentReservationId();

		/**
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.ReservationImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__CUSTOMER = eINSTANCE.getReservation_Customer();

		/**
		 * The meta object literal for the '<em><b>Roomreservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__ROOMRESERVATION = eINSTANCE.getReservation_Roomreservation();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__START_DATE = eINSTANCE.getReservation_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__END_DATE = eINSTANCE.getReservation_EndDate();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___RESERVATION__STRING_STRING_STRING_STRING_INT = eINSTANCE.getReservation__Reservation__String_String_String_String_int();

		/**
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.CustomerImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getCustomer()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomReservationImpl <em>Room Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.RoomReservationImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoomReservation()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistRoomProvides <em>IReceptionist Room Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.IReceptionistRoomProvides
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIReceptionistRoomProvides()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.RoomTypeImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoomType()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomExtrasImpl <em>Room Extras</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.RoomExtrasImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoomExtras()
		 * @generated
		 */
		EClass ROOM_EXTRAS = eINSTANCE.getRoomExtras();

		/**
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.BillImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getBill()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.PaymentHandlerImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getPaymentHandler()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.IRoomHandler <em>IRoom Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.IRoomHandler
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIRoomHandler()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.RoomHandlerImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoomHandler()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.IAdminRoomProvides <em>IAdmin Room Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.IAdminRoomProvides
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIAdminRoomProvides()
		 * @generated
		 */
		EClass IADMIN_ROOM_PROVIDES = eINSTANCE.getIAdminRoomProvides();

		/**
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.IHotelStartupProvides
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIHotelStartupProvides()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.HotelInitializerImpl <em>Hotel Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelInitializerImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getHotelInitializer()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.RoomImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getRoom()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.IHotelCustomerProvides
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIHotelCustomerProvides()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.impl.FreeRoomTypesDTOImpl <em>Free Room Types DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.impl.FreeRoomTypesDTOImpl
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getFreeRoomTypesDTO()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIHotelAdministratorProvides()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.hotelsystem.IReceptionistProvides <em>IReceptionist Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.hotelsystem.IReceptionistProvides
		 * @see ClassDiagramPackage.hotelsystem.impl.HotelsystemPackageImpl#getIReceptionistProvides()
		 * @generated
		 */
		EClass IRECEPTIONIST_PROVIDES = eINSTANCE.getIReceptionistProvides();

		/**
		 * The meta object literal for the '<em><b>Edit Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___EDIT_RESERVATION__INT_STRING_STRING_STRING_STRING = eINSTANCE.getIReceptionistProvides__EditReservation__int_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Room Type To Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_RESERVATION__INT_STRING_INT = eINSTANCE.getIReceptionistProvides__AddRoomTypeToReservation__int_String_int();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type From Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_RESERVATION__INT_STRING = eINSTANCE.getIReceptionistProvides__RemoveRoomTypeFromReservation__int_String();

		/**
		 * The meta object literal for the '<em><b>Edit Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___EDIT_ROOM_TYPE__INT_STRING_INT = eINSTANCE.getIReceptionistProvides__EditRoomType__int_String_int();

		/**
		 * The meta object literal for the '<em><b>List Free Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT = eINSTANCE.getIReceptionistProvides__ListFreeRooms__int();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___CHECK_IN__INT = eINSTANCE.getIReceptionistProvides__CheckIn__int();

		/**
		 * The meta object literal for the '<em><b>Cancel Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___CANCEL_RESERVATION__INT = eINSTANCE.getIReceptionistProvides__CancelReservation__int();

		/**
		 * The meta object literal for the '<em><b>List Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___LIST_RESERVATIONS = eINSTANCE.getIReceptionistProvides__ListReservations();

		/**
		 * The meta object literal for the '<em><b>List Occupied Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING = eINSTANCE.getIReceptionistProvides__ListOccupiedRooms__String();

		/**
		 * The meta object literal for the '<em><b>List Checkins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING = eINSTANCE.getIReceptionistProvides__ListCheckins__String();

		/**
		 * The meta object literal for the '<em><b>List Checkouts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING = eINSTANCE.getIReceptionistProvides__ListCheckouts__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Extra To Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT = eINSTANCE.getIReceptionistProvides__AddExtraToRoom__int_int_String_int();

	}

} //HotelsystemPackage
