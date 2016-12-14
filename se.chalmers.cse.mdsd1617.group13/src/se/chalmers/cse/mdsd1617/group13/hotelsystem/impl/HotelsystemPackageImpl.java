/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;
import se.chalmers.cse.mdsd1617.group13.Group13Package;

import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage;

import se.chalmers.cse.mdsd1617.group13.bankcomponents.impl.BankcomponentsPackageImpl;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemFactory;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Room;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType;

import se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelsystemPackageImpl extends EPackageImpl implements HotelsystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomReservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelCustomerProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeRoomTypesDTOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelAdministratorProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelStartupProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelReceptionistProvidesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelsystemPackageImpl() {
		super(eNS_URI, HotelsystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HotelsystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelsystemPackage init() {
		if (isInited) return (HotelsystemPackage)EPackage.Registry.INSTANCE.getEPackage(HotelsystemPackage.eNS_URI);

		// Obtain or create and register package
		HotelsystemPackageImpl theHotelsystemPackage = (HotelsystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HotelsystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HotelsystemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Group13PackageImpl theGroup13Package = (Group13PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Group13Package.eNS_URI) instanceof Group13PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Group13Package.eNS_URI) : Group13Package.eINSTANCE);
		BankcomponentsPackageImpl theBankcomponentsPackage = (BankcomponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankcomponentsPackage.eNS_URI) instanceof BankcomponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankcomponentsPackage.eNS_URI) : BankcomponentsPackage.eINSTANCE);

		// Create package meta-data objects
		theHotelsystemPackage.createPackageContents();
		theGroup13Package.createPackageContents();
		theBankcomponentsPackage.createPackageContents();

		// Initialize created meta-data
		theHotelsystemPackage.initializePackageContents();
		theGroup13Package.initializePackageContents();
		theBankcomponentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHotelsystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelsystemPackage.eNS_URI, theHotelsystemPackage);
		return theHotelsystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingHandler() {
		return bookingHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_Bookings() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_PaymentHandler() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_Roomhandler() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingHandler_BookingCurrentlyCheckingOut() {
		return (EAttribute)bookingHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__BookingCheckin__String() {
		return bookingHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__AddDay__String() {
		return bookingHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__GetBookingById__int() {
		return bookingHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__IsFree__int_String_String() {
		return bookingHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Customer() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomReservation() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_StartDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_EndDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Canceled() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingId() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Bills() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Confirmed() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__Cancel() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetOccupiedRooms__String() {
		return bookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckOut() {
		return bookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__NrOfNights() {
		return bookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__IsCheckedIn() {
		return bookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckIn__int() {
		return bookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetBookingPrice() {
		return bookingEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetRoomPrice__int() {
		return bookingEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__IsFree__int_String_String() {
		return bookingEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckedInDate__String() {
		return bookingEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__AddExtra__RoomExtra_int() {
		return bookingEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_FirstName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_LastName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomReservation() {
		return roomReservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_RoomType() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_RoomExtras() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_StartDate() {
		return (EAttribute)roomReservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_EndDate() {
		return (EAttribute)roomReservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_Room() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_CheckInDate() {
		return (EAttribute)roomReservationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomReservation__CheckIn() {
		return roomReservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomReservation__CheckOut__int() {
		return roomReservationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomReservation__GetRoomIfOccupied__String() {
		return roomReservationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomReservation__GetRoomId() {
		return roomReservationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomReservation__AddExtra__RoomExtra() {
		return roomReservationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Description() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_NumBeds() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_PricePerNight() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Name() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomExtra() {
		return roomExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomExtra_Price() {
		return (EAttribute)roomExtraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomExtra_Description() {
		return (EAttribute)roomExtraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Roomreservation() {
		return (EReference)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Price() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_BillID() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentHandler() {
		return paymentHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentHandler_BankingComponent() {
		return (EReference)paymentHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentHandler__PayIfCardValid__String_String_int_int_String_String_double() {
		return paymentHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomHandler() {
		return iRoomHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomHandler__GetAllRoomTypes__int() {
		return iRoomHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomHandler__CountFreeRoom__RoomType() {
		return iRoomHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomHandler__GetAllRoomsByType__RoomType() {
		return iRoomHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomHandler__GetRoomType__String() {
		return iRoomHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomHandler() {
		return roomHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomHandler_RoomTypes() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomHandler_Rooms() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandler__GetRoom__int() {
		return roomHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandler__Initialize__int() {
		return roomHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Occupied() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Roomtype() {
		return (EReference)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Blocked() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomNumber() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelCustomerProvides() {
		return iHotelCustomerProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__GetFreeRooms__int_String_String() {
		return iHotelCustomerProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__InitiateBooking__String_String_String_String() {
		return iHotelCustomerProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__AddRoomToBooking__String_int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__ConfirmBooking__int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__InitiateCheckout__int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String() {
		return iHotelCustomerProvidesEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__InitiateRoomCheckout__int_int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String() {
		return iHotelCustomerProvidesEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelCustomerProvides__CheckInRoom__String_int() {
		return iHotelCustomerProvidesEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeRoomTypesDTO() {
		return freeRoomTypesDTOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeRoomTypesDTO_RoomTypeDescription() {
		return (EAttribute)freeRoomTypesDTOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeRoomTypesDTO_NumBeds() {
		return (EAttribute)freeRoomTypesDTOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeRoomTypesDTO_PricePerNight() {
		return (EAttribute)freeRoomTypesDTOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeRoomTypesDTO_NumFreeRooms() {
		return (EAttribute)freeRoomTypesDTOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelAdministratorProvides() {
		return iHotelAdministratorProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministratorProvides__AddRoomType__String_double_int_String() {
		return iHotelAdministratorProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministratorProvides__EditRoomType__String_double_int_String() {
		return iHotelAdministratorProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministratorProvides__RemoveRoomType__String() {
		return iHotelAdministratorProvidesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministratorProvides__ChangeRoomType__int_String() {
		return iHotelAdministratorProvidesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministratorProvides__AddRoom__int_String() {
		return iHotelAdministratorProvidesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministratorProvides__RemoveRoom__int() {
		return iHotelAdministratorProvidesEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministratorProvides__BlockRoom__int() {
		return iHotelAdministratorProvidesEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministratorProvides__UnblockRoom__int() {
		return iHotelAdministratorProvidesEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelStartupProvides() {
		return iHotelStartupProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelStartupProvides__Startup__int() {
		return iHotelStartupProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelStartupProvides__GetRoomHandler() {
		return iHotelStartupProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelInitializer() {
		return hotelInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotelInitializer_RoomHandler() {
		return (EReference)hotelInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotelInitializer_BookingHandler() {
		return (EReference)hotelInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelReceptionistProvides() {
		return iHotelReceptionistProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__EditBookingTime__int_String_String() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__AddRoomTypeToBooking__int_String_int() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__RemoveRoomTypeFromBooking__int_String_int() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__ListFreeRooms__int() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__CheckIn__int_int() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__CancelBooking__int() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__ListBookings() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__ListOccupiedRooms__String() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__ListCheckins__String_String() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__ListCheckouts__String_String() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelReceptionistProvides__AddExtraToRoom__int_int_String_int() {
		return iHotelReceptionistProvidesEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelsystemFactory getHotelsystemFactory() {
		return (HotelsystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bookingHandlerEClass = createEClass(BOOKING_HANDLER);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__BOOKINGS);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__PAYMENT_HANDLER);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__ROOMHANDLER);
		createEAttribute(bookingHandlerEClass, BOOKING_HANDLER__BOOKING_CURRENTLY_CHECKING_OUT);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___BOOKING_CHECKIN__STRING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___ADD_DAY__STRING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___GET_BOOKING_BY_ID__INT);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___IS_FREE__INT_STRING_STRING);

		bookingEClass = createEClass(BOOKING);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEReference(bookingEClass, BOOKING__ROOM_RESERVATION);
		createEAttribute(bookingEClass, BOOKING__START_DATE);
		createEAttribute(bookingEClass, BOOKING__END_DATE);
		createEAttribute(bookingEClass, BOOKING__CANCELED);
		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
		createEReference(bookingEClass, BOOKING__BILLS);
		createEAttribute(bookingEClass, BOOKING__CONFIRMED);
		createEOperation(bookingEClass, BOOKING___CANCEL);
		createEOperation(bookingEClass, BOOKING___GET_OCCUPIED_ROOMS__STRING);
		createEOperation(bookingEClass, BOOKING___CHECK_OUT);
		createEOperation(bookingEClass, BOOKING___NR_OF_NIGHTS);
		createEOperation(bookingEClass, BOOKING___IS_CHECKED_IN);
		createEOperation(bookingEClass, BOOKING___CHECK_IN__INT);
		createEOperation(bookingEClass, BOOKING___GET_BOOKING_PRICE);
		createEOperation(bookingEClass, BOOKING___GET_ROOM_PRICE__INT);
		createEOperation(bookingEClass, BOOKING___IS_FREE__INT_STRING_STRING);
		createEOperation(bookingEClass, BOOKING___CHECKED_IN_DATE__STRING);
		createEOperation(bookingEClass, BOOKING___ADD_EXTRA__ROOMEXTRA_INT);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__FIRST_NAME);
		createEAttribute(customerEClass, CUSTOMER__LAST_NAME);

		roomReservationEClass = createEClass(ROOM_RESERVATION);
		createEReference(roomReservationEClass, ROOM_RESERVATION__ROOM_TYPE);
		createEReference(roomReservationEClass, ROOM_RESERVATION__ROOM_EXTRAS);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__START_DATE);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__END_DATE);
		createEReference(roomReservationEClass, ROOM_RESERVATION__ROOM);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__CHECK_IN_DATE);
		createEOperation(roomReservationEClass, ROOM_RESERVATION___CHECK_IN);
		createEOperation(roomReservationEClass, ROOM_RESERVATION___CHECK_OUT__INT);
		createEOperation(roomReservationEClass, ROOM_RESERVATION___GET_ROOM_IF_OCCUPIED__STRING);
		createEOperation(roomReservationEClass, ROOM_RESERVATION___GET_ROOM_ID);
		createEOperation(roomReservationEClass, ROOM_RESERVATION___ADD_EXTRA__ROOMEXTRA);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__DESCRIPTION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NUM_BEDS);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE_PER_NIGHT);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);

		roomExtraEClass = createEClass(ROOM_EXTRA);
		createEAttribute(roomExtraEClass, ROOM_EXTRA__PRICE);
		createEAttribute(roomExtraEClass, ROOM_EXTRA__DESCRIPTION);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__OCCUPIED);
		createEReference(roomEClass, ROOM__ROOMTYPE);
		createEAttribute(roomEClass, ROOM__BLOCKED);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);

		billEClass = createEClass(BILL);
		createEReference(billEClass, BILL__ROOMRESERVATION);
		createEAttribute(billEClass, BILL__PRICE);
		createEAttribute(billEClass, BILL__BILL_ID);

		paymentHandlerEClass = createEClass(PAYMENT_HANDLER);
		createEReference(paymentHandlerEClass, PAYMENT_HANDLER__BANKING_COMPONENT);
		createEOperation(paymentHandlerEClass, PAYMENT_HANDLER___PAY_IF_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING_DOUBLE);

		iRoomHandlerEClass = createEClass(IROOM_HANDLER);
		createEOperation(iRoomHandlerEClass, IROOM_HANDLER___GET_ALL_ROOM_TYPES__INT);
		createEOperation(iRoomHandlerEClass, IROOM_HANDLER___COUNT_FREE_ROOM__ROOMTYPE);
		createEOperation(iRoomHandlerEClass, IROOM_HANDLER___GET_ALL_ROOMS_BY_TYPE__ROOMTYPE);
		createEOperation(iRoomHandlerEClass, IROOM_HANDLER___GET_ROOM_TYPE__STRING);

		iHotelCustomerProvidesEClass = createEClass(IHOTEL_CUSTOMER_PROVIDES);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___GET_FREE_ROOMS__INT_STRING_STRING);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___INITIATE_BOOKING__STRING_STRING_STRING_STRING);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___ADD_ROOM_TO_BOOKING__STRING_INT);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___CONFIRM_BOOKING__INT);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___INITIATE_CHECKOUT__INT);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___PAY_DURING_CHECKOUT__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___INITIATE_ROOM_CHECKOUT__INT_INT);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___PAY_ROOM_DURING_CHECKOUT__INT_STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iHotelCustomerProvidesEClass, IHOTEL_CUSTOMER_PROVIDES___CHECK_IN_ROOM__STRING_INT);

		freeRoomTypesDTOEClass = createEClass(FREE_ROOM_TYPES_DTO);
		createEAttribute(freeRoomTypesDTOEClass, FREE_ROOM_TYPES_DTO__ROOM_TYPE_DESCRIPTION);
		createEAttribute(freeRoomTypesDTOEClass, FREE_ROOM_TYPES_DTO__NUM_BEDS);
		createEAttribute(freeRoomTypesDTOEClass, FREE_ROOM_TYPES_DTO__PRICE_PER_NIGHT);
		createEAttribute(freeRoomTypesDTOEClass, FREE_ROOM_TYPES_DTO__NUM_FREE_ROOMS);

		roomHandlerEClass = createEClass(ROOM_HANDLER);
		createEReference(roomHandlerEClass, ROOM_HANDLER__ROOM_TYPES);
		createEReference(roomHandlerEClass, ROOM_HANDLER__ROOMS);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___GET_ROOM__INT);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___INITIALIZE__INT);

		iHotelAdministratorProvidesEClass = createEClass(IHOTEL_ADMINISTRATOR_PROVIDES);
		createEOperation(iHotelAdministratorProvidesEClass, IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING);
		createEOperation(iHotelAdministratorProvidesEClass, IHOTEL_ADMINISTRATOR_PROVIDES___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING);
		createEOperation(iHotelAdministratorProvidesEClass, IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM_TYPE__STRING);
		createEOperation(iHotelAdministratorProvidesEClass, IHOTEL_ADMINISTRATOR_PROVIDES___CHANGE_ROOM_TYPE__INT_STRING);
		createEOperation(iHotelAdministratorProvidesEClass, IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM__INT_STRING);
		createEOperation(iHotelAdministratorProvidesEClass, IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM__INT);
		createEOperation(iHotelAdministratorProvidesEClass, IHOTEL_ADMINISTRATOR_PROVIDES___BLOCK_ROOM__INT);
		createEOperation(iHotelAdministratorProvidesEClass, IHOTEL_ADMINISTRATOR_PROVIDES___UNBLOCK_ROOM__INT);

		iHotelStartupProvidesEClass = createEClass(IHOTEL_STARTUP_PROVIDES);
		createEOperation(iHotelStartupProvidesEClass, IHOTEL_STARTUP_PROVIDES___STARTUP__INT);
		createEOperation(iHotelStartupProvidesEClass, IHOTEL_STARTUP_PROVIDES___GET_ROOM_HANDLER);

		hotelInitializerEClass = createEClass(HOTEL_INITIALIZER);
		createEReference(hotelInitializerEClass, HOTEL_INITIALIZER__ROOM_HANDLER);
		createEReference(hotelInitializerEClass, HOTEL_INITIALIZER__BOOKING_HANDLER);

		iHotelReceptionistProvidesEClass = createEClass(IHOTEL_RECEPTIONIST_PROVIDES);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___EDIT_BOOKING_TIME__INT_STRING_STRING);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_BOOKING__INT_STRING_INT);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_BOOKING__INT_STRING_INT);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___CHECK_IN__INT_INT);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___CANCEL_BOOKING__INT);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___LIST_BOOKINGS);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING_STRING);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING);
		createEOperation(iHotelReceptionistProvidesEClass, IHOTEL_RECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		BankcomponentsPackage theBankcomponentsPackage = (BankcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BankcomponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bookingHandlerEClass.getESuperTypes().add(this.getIHotelReceptionistProvides());
		bookingHandlerEClass.getESuperTypes().add(this.getIHotelCustomerProvides());
		roomHandlerEClass.getESuperTypes().add(this.getIRoomHandler());
		roomHandlerEClass.getESuperTypes().add(this.getIHotelAdministratorProvides());
		hotelInitializerEClass.getESuperTypes().add(this.getIHotelStartupProvides());

		// Initialize classes, features, and operations; add parameters
		initEClass(bookingHandlerEClass, BookingHandler.class, "BookingHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingHandler_Bookings(), this.getBooking(), null, "bookings", null, 0, -1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingHandler_PaymentHandler(), this.getPaymentHandler(), null, "paymentHandler", null, 1, 1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingHandler_Roomhandler(), this.getIRoomHandler(), null, "roomhandler", null, 1, 1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookingHandler_BookingCurrentlyCheckingOut(), ecorePackage.getEInt(), "bookingCurrentlyCheckingOut", null, 1, 1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getBookingHandler__BookingCheckin__String(), theTypesPackage.getBoolean(), "bookingCheckin", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__AddDay__String(), ecorePackage.getEString(), "addDay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__GetBookingById__int(), this.getBooking(), "getBookingById", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__IsFree__int_String_String(), ecorePackage.getEBoolean(), "isFree", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomReservation(), this.getRoomReservation(), null, "roomReservation", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_StartDate(), ecorePackage.getEString(), "startDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_EndDate(), ecorePackage.getEString(), "endDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Canceled(), ecorePackage.getEBoolean(), "canceled", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_BookingId(), ecorePackage.getEInt(), "bookingId", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Bills(), this.getBill(), null, "bills", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Confirmed(), ecorePackage.getEBoolean(), "confirmed", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBooking__Cancel(), null, "cancel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__GetOccupiedRooms__String(), this.getRoom(), "getOccupiedRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__CheckOut(), ecorePackage.getEDouble(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__NrOfNights(), ecorePackage.getEInt(), "nrOfNights", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__IsCheckedIn(), ecorePackage.getEBoolean(), "isCheckedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__CheckIn__int(), ecorePackage.getEBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__GetBookingPrice(), ecorePackage.getEDouble(), "getBookingPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__GetRoomPrice__int(), ecorePackage.getEDouble(), "getRoomPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__IsFree__int_String_String(), ecorePackage.getEBoolean(), "isFree", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__CheckedInDate__String(), ecorePackage.getEBoolean(), "CheckedInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "indexDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__AddExtra__RoomExtra_int(), ecorePackage.getEBoolean(), "addExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomExtra(), "extra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomReservationEClass, RoomReservation.class, "RoomReservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomReservation_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation_RoomExtras(), this.getRoomExtra(), null, "roomExtras", null, 0, -1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservation_StartDate(), ecorePackage.getEString(), "startDate", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservation_EndDate(), ecorePackage.getEString(), "endDate", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation_Room(), this.getRoom(), null, "room", null, 0, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservation_CheckInDate(), ecorePackage.getEString(), "checkInDate", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRoomReservation__CheckIn(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomReservation__CheckOut__int(), ecorePackage.getEDouble(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfNights", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomReservation__GetRoomIfOccupied__String(), this.getRoom(), "getRoomIfOccupied", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomReservation__GetRoomId(), ecorePackage.getEInt(), "getRoomId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomReservation__AddExtra__RoomExtra(), null, "addExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomExtra(), "extra", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Description(), ecorePackage.getEString(), "description", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_NumBeds(), ecorePackage.getEInt(), "numBeds", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_PricePerNight(), ecorePackage.getEDouble(), "pricePerNight", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomExtraEClass, RoomExtra.class, "RoomExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomExtra_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, RoomExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomExtra_Description(), ecorePackage.getEString(), "description", null, 1, 1, RoomExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Occupied(), ecorePackage.getEBoolean(), "occupied", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Roomtype(), this.getRoomType(), null, "roomtype", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Blocked(), ecorePackage.getEBoolean(), "blocked", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBill_Roomreservation(), this.getRoomReservation(), null, "roomreservation", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_BillID(), ecorePackage.getEInt(), "billID", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paymentHandlerEClass, PaymentHandler.class, "PaymentHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentHandler_BankingComponent(), theBankcomponentsPackage.getICustomerProvides(), null, "bankingComponent", null, 1, 1, PaymentHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPaymentHandler__PayIfCardValid__String_String_int_int_String_String_double(), ecorePackage.getEBoolean(), "payIfCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "sum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomHandlerEClass, IRoomHandler.class, "IRoomHandler", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIRoomHandler__GetAllRoomTypes__int(), this.getRoomType(), "getAllRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomHandler__CountFreeRoom__RoomType(), ecorePackage.getEInt(), "countFreeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomHandler__GetAllRoomsByType__RoomType(), this.getRoom(), "getAllRoomsByType", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomHandler__GetRoomType__String(), this.getRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelCustomerProvidesEClass, IHotelCustomerProvides.class, "IHotelCustomerProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelCustomerProvides__GetFreeRooms__int_String_String(), this.getFreeRoomTypesDTO(), "getFreeRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__InitiateBooking__String_String_String_String(), ecorePackage.getEInt(), "initiateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__AddRoomToBooking__String_int(), ecorePackage.getEBoolean(), "addRoomToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomTypeDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__ConfirmBooking__int(), ecorePackage.getEBoolean(), "confirmBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__InitiateCheckout__int(), ecorePackage.getEDouble(), "initiateCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__PayDuringCheckout__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "payDuringCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__InitiateRoomCheckout__int_int(), ecorePackage.getEDouble(), "initiateRoomCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__PayRoomDuringCheckout__int_String_String_int_int_String_String(), ecorePackage.getEBoolean(), "payRoomDuringCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelCustomerProvides__CheckInRoom__String_int(), ecorePackage.getEInt(), "checkInRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomTypeDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookindId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(freeRoomTypesDTOEClass, FreeRoomTypesDTO.class, "FreeRoomTypesDTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeRoomTypesDTO_RoomTypeDescription(), ecorePackage.getEString(), "roomTypeDescription", null, 1, 1, FreeRoomTypesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFreeRoomTypesDTO_NumBeds(), ecorePackage.getEInt(), "numBeds", null, 1, 1, FreeRoomTypesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFreeRoomTypesDTO_PricePerNight(), ecorePackage.getEDouble(), "pricePerNight", null, 1, 1, FreeRoomTypesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFreeRoomTypesDTO_NumFreeRooms(), ecorePackage.getEInt(), "numFreeRooms", null, 1, 1, FreeRoomTypesDTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomHandlerEClass, RoomHandler.class, "RoomHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomHandler_RoomTypes(), this.getRoomType(), null, "roomTypes", null, 0, -1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomHandler_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomHandler__GetRoom__int(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandler__Initialize__int(), null, "initialize", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelAdministratorProvidesEClass, IHotelAdministratorProvides.class, "IHotelAdministratorProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelAdministratorProvides__AddRoomType__String_double_int_String(), ecorePackage.getEBoolean(), "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nbrOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "features", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelAdministratorProvides__EditRoomType__String_double_int_String(), ecorePackage.getEBoolean(), "editRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nbrOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "features", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelAdministratorProvides__RemoveRoomType__String(), ecorePackage.getEBoolean(), "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelAdministratorProvides__ChangeRoomType__int_String(), ecorePackage.getEBoolean(), "changeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelAdministratorProvides__AddRoom__int_String(), ecorePackage.getEBoolean(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelAdministratorProvides__RemoveRoom__int(), ecorePackage.getEBoolean(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelAdministratorProvides__BlockRoom__int(), ecorePackage.getEBoolean(), "blockRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelAdministratorProvides__UnblockRoom__int(), ecorePackage.getEBoolean(), "unblockRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelStartupProvidesEClass, IHotelStartupProvides.class, "IHotelStartupProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelStartupProvides__Startup__int(), null, "startup", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIHotelStartupProvides__GetRoomHandler(), this.getRoomHandler(), "getRoomHandler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotelInitializerEClass, HotelInitializer.class, "HotelInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotelInitializer_RoomHandler(), this.getRoomHandler(), null, "roomHandler", null, 1, 1, HotelInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotelInitializer_BookingHandler(), this.getBookingHandler(), null, "bookingHandler", null, 1, 1, HotelInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iHotelReceptionistProvidesEClass, IHotelReceptionistProvides.class, "IHotelReceptionistProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIHotelReceptionistProvides__EditBookingTime__int_String_String(), ecorePackage.getEBoolean(), "editBookingTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__AddRoomTypeToBooking__int_String_int(), ecorePackage.getEBoolean(), "addRoomTypeToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfRoomsForType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__RemoveRoomTypeFromBooking__int_String_int(), ecorePackage.getEBoolean(), "removeRoomTypeFromBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nbrToRemove", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__ListFreeRooms__int(), ecorePackage.getEInt(), "listFreeRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__CheckIn__int_int(), ecorePackage.getEEList(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumbers", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__CancelBooking__int(), ecorePackage.getEBoolean(), "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIHotelReceptionistProvides__ListBookings(), this.getBooking(), "listBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__ListOccupiedRooms__String(), ecorePackage.getEMap(), "listOccupiedRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__ListCheckins__String_String(), ecorePackage.getEEList(), "listCheckins", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__ListCheckouts__String_String(), ecorePackage.getEEList(), "listCheckouts", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIHotelReceptionistProvides__AddExtraToRoom__int_int_String_int(), ecorePackage.getEBoolean(), "addExtraToRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "extraDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (getBooking__CheckIn__int(), 
		   source, 
		   new String[] {
			 "originalName", "checkIn()"
		   });
	}

} //HotelsystemPackageImpl
