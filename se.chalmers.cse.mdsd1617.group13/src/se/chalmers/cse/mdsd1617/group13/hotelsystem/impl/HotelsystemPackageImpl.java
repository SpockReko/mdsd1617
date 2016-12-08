/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.chalmers.cse.mdsd1617.group13.Group13Package;

import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage;

import se.chalmers.cse.mdsd1617.group13.bankcomponents.impl.BankcomponentsPackageImpl;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemFactory;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IReceptionistRoomProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Reservation;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.ReservationHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Room;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras;
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
	private EClass reservationHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationEClass = null;

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
	private EClass iReceptionistRoomProvidesEClass = null;

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
	private EClass roomExtrasEClass = null;

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
	private EClass iAdminRoomProvidesEClass = null;

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
	private EClass iReceptionistProvidesEClass = null;

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
	public EClass getReservationHandler() {
		return reservationHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationHandler_Reservation() {
		return (EReference)reservationHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationHandler_Paymenthandler() {
		return (EReference)reservationHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationHandler_Roomhandler() {
		return (EReference)reservationHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationHandler_CurrentReservationId() {
		return (EAttribute)reservationHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservation() {
		return reservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Customer() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Roomreservation() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_StartDate() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_EndDate() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__Reservation__String_String_String_String_int() {
		return reservationEClass.getEOperations().get(0);
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
	public EOperation getCustomer__Customer__String_String() {
		return customerEClass.getEOperations().get(0);
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
	public EReference getRoomReservation_Ireceptionistroomprovides() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_Ireceptionistroomtypeprovides() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation__() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_Bill() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_StartDate() {
		return (EAttribute)roomReservationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_EndDate() {
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
	public EClass getIReceptionistRoomProvides() {
		return iReceptionistRoomProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistRoomProvides__SetOccupied__boolean() {
		return iReceptionistRoomProvidesEClass.getEOperations().get(0);
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
	public EClass getRoomExtras() {
		return roomExtrasEClass;
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
	public EClass getPaymentHandler() {
		return paymentHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentHandler_Icustomerprovides() {
		return (EReference)paymentHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentHandler__PayIfCardValid__String_String_int_int_String_String() {
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
	public EOperation getIRoomHandler__GetAllRoomTypes() {
		return iRoomHandlerEClass.getEOperations().get(0);
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
	public EReference getRoomHandler_Iadminroomtypeprovides() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomHandler_Iadminroomprovides() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAdminRoomProvides() {
		return iAdminRoomProvidesEClass;
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
	public EReference getHotelInitializer_Roomhandler() {
		return (EReference)hotelInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotelInitializer_Reservationhandler() {
		return (EReference)hotelInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIReceptionistProvides() {
		return iReceptionistProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__EditReservation__int_String_String_String_String() {
		return iReceptionistProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__AddRoomTypeToReservation__int_String_int() {
		return iReceptionistProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__RemoveRoomTypeFromReservation__int_String() {
		return iReceptionistProvidesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__EditRoomType__int_String_int() {
		return iReceptionistProvidesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__ListFreeRooms__int() {
		return iReceptionistProvidesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__CheckIn__int() {
		return iReceptionistProvidesEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__CancelReservation__int() {
		return iReceptionistProvidesEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__ListReservations() {
		return iReceptionistProvidesEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__ListOccupiedRooms__String() {
		return iReceptionistProvidesEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__ListCheckins__String() {
		return iReceptionistProvidesEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__ListCheckouts__String_String() {
		return iReceptionistProvidesEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReceptionistProvides__AddExtraToRoom__int_int_String_int() {
		return iReceptionistProvidesEClass.getEOperations().get(11);
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
		reservationHandlerEClass = createEClass(RESERVATION_HANDLER);
		createEReference(reservationHandlerEClass, RESERVATION_HANDLER__RESERVATION);
		createEReference(reservationHandlerEClass, RESERVATION_HANDLER__PAYMENTHANDLER);
		createEReference(reservationHandlerEClass, RESERVATION_HANDLER__ROOMHANDLER);
		createEAttribute(reservationHandlerEClass, RESERVATION_HANDLER__CURRENT_RESERVATION_ID);

		reservationEClass = createEClass(RESERVATION);
		createEReference(reservationEClass, RESERVATION__CUSTOMER);
		createEReference(reservationEClass, RESERVATION__ROOMRESERVATION);
		createEAttribute(reservationEClass, RESERVATION__START_DATE);
		createEAttribute(reservationEClass, RESERVATION__END_DATE);
		createEOperation(reservationEClass, RESERVATION___RESERVATION__STRING_STRING_STRING_STRING_INT);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__FIRST_NAME);
		createEAttribute(customerEClass, CUSTOMER__LAST_NAME);
		createEOperation(customerEClass, CUSTOMER___CUSTOMER__STRING_STRING);

		roomReservationEClass = createEClass(ROOM_RESERVATION);
		createEReference(roomReservationEClass, ROOM_RESERVATION__IRECEPTIONISTROOMPROVIDES);
		createEReference(roomReservationEClass, ROOM_RESERVATION__IRECEPTIONISTROOMTYPEPROVIDES);
		createEReference(roomReservationEClass, ROOM_RESERVATION__);
		createEReference(roomReservationEClass, ROOM_RESERVATION__BILL);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__START_DATE);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__END_DATE);
		createEOperation(roomReservationEClass, ROOM_RESERVATION___CHECK_IN);

		iReceptionistRoomProvidesEClass = createEClass(IRECEPTIONIST_ROOM_PROVIDES);
		createEOperation(iReceptionistRoomProvidesEClass, IRECEPTIONIST_ROOM_PROVIDES___SET_OCCUPIED__BOOLEAN);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__DESCRIPTION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NUM_BEDS);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE_PER_NIGHT);

		roomExtrasEClass = createEClass(ROOM_EXTRAS);

		billEClass = createEClass(BILL);
		createEReference(billEClass, BILL__ROOMRESERVATION);

		paymentHandlerEClass = createEClass(PAYMENT_HANDLER);
		createEReference(paymentHandlerEClass, PAYMENT_HANDLER__ICUSTOMERPROVIDES);
		createEOperation(paymentHandlerEClass, PAYMENT_HANDLER___PAY_IF_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING);

		iRoomHandlerEClass = createEClass(IROOM_HANDLER);
		createEOperation(iRoomHandlerEClass, IROOM_HANDLER___GET_ALL_ROOM_TYPES);

		roomHandlerEClass = createEClass(ROOM_HANDLER);
		createEReference(roomHandlerEClass, ROOM_HANDLER__IADMINROOMTYPEPROVIDES);
		createEReference(roomHandlerEClass, ROOM_HANDLER__IADMINROOMPROVIDES);

		iAdminRoomProvidesEClass = createEClass(IADMIN_ROOM_PROVIDES);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__OCCUPIED);

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
		createEReference(hotelInitializerEClass, HOTEL_INITIALIZER__ROOMHANDLER);
		createEReference(hotelInitializerEClass, HOTEL_INITIALIZER__RESERVATIONHANDLER);

		iReceptionistProvidesEClass = createEClass(IRECEPTIONIST_PROVIDES);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___EDIT_RESERVATION__INT_STRING_STRING_STRING_STRING);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___ADD_ROOM_TYPE_TO_RESERVATION__INT_STRING_INT);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___REMOVE_ROOM_TYPE_FROM_RESERVATION__INT_STRING);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___EDIT_ROOM_TYPE__INT_STRING_INT);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___LIST_FREE_ROOMS__INT);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___CHECK_IN__INT);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___CANCEL_RESERVATION__INT);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___LIST_RESERVATIONS);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___LIST_OCCUPIED_ROOMS__STRING);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___LIST_CHECKINS__STRING);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___LIST_CHECKOUTS__STRING_STRING);
		createEOperation(iReceptionistProvidesEClass, IRECEPTIONIST_PROVIDES___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT);
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
		BankcomponentsPackage theBankcomponentsPackage = (BankcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BankcomponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reservationHandlerEClass.getESuperTypes().add(this.getIReceptionistProvides());
		roomHandlerEClass.getESuperTypes().add(this.getIRoomHandler());
		roomEClass.getESuperTypes().add(this.getIAdminRoomProvides());
		roomEClass.getESuperTypes().add(this.getIReceptionistRoomProvides());

		// Initialize classes, features, and operations; add parameters
		initEClass(reservationHandlerEClass, ReservationHandler.class, "ReservationHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservationHandler_Reservation(), this.getReservation(), null, "reservation", null, 0, -1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservationHandler_Paymenthandler(), this.getPaymentHandler(), null, "paymenthandler", null, 1, 1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservationHandler_Roomhandler(), this.getIRoomHandler(), null, "roomhandler", null, 1, 1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservationHandler_CurrentReservationId(), ecorePackage.getEInt(), "currentReservationId", null, 1, 1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservation_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_Roomreservation(), this.getRoomReservation(), null, "roomreservation", null, 0, -1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_StartDate(), ecorePackage.getEString(), "startDate", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_EndDate(), ecorePackage.getEString(), "endDate", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getReservation__Reservation__String_String_String_String_int(), this.getReservation(), "Reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCustomer__Customer__String_String(), this.getCustomer(), "Customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomReservationEClass, RoomReservation.class, "RoomReservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomReservation_Ireceptionistroomprovides(), this.getIReceptionistRoomProvides(), null, "ireceptionistroomprovides", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation_Ireceptionistroomtypeprovides(), this.getRoomType(), null, "ireceptionistroomtypeprovides", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation__(), this.getRoomExtras(), null, "_", null, 0, -1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation_Bill(), this.getBill(), null, "bill", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservation_StartDate(), ecorePackage.getEString(), "startDate", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservation_EndDate(), ecorePackage.getEString(), "endDate", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRoomReservation__CheckIn(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iReceptionistRoomProvidesEClass, IReceptionistRoomProvides.class, "IReceptionistRoomProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIReceptionistRoomProvides__SetOccupied__boolean(), null, "setOccupied", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "occupied", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Description(), ecorePackage.getEString(), "description", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_NumBeds(), ecorePackage.getEInt(), "numBeds", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_PricePerNight(), ecorePackage.getEDouble(), "pricePerNight", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomExtrasEClass, RoomExtras.class, "RoomExtras", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBill_Roomreservation(), this.getRoomReservation(), null, "roomreservation", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paymentHandlerEClass, PaymentHandler.class, "PaymentHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentHandler_Icustomerprovides(), theBankcomponentsPackage.getICustomerProvides(), null, "icustomerprovides", null, 1, 1, PaymentHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPaymentHandler__PayIfCardValid__String_String_int_int_String_String(), null, "payIfCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomHandlerEClass, IRoomHandler.class, "IRoomHandler", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRoomHandler__GetAllRoomTypes(), this.getRoomType(), "getAllRoomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomHandlerEClass, RoomHandler.class, "RoomHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomHandler_Iadminroomtypeprovides(), this.getRoomType(), null, "iadminroomtypeprovides", null, 0, -1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomHandler_Iadminroomprovides(), this.getIAdminRoomProvides(), null, "iadminroomprovides", null, 0, -1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iAdminRoomProvidesEClass, IAdminRoomProvides.class, "IAdminRoomProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Occupied(), ecorePackage.getEBoolean(), "occupied", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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

		op = initEOperation(getIHotelCustomerProvides__InitiateRoomCheckout__int_int(), ecorePackage.getEBoolean(), "initiateRoomCheckout", 1, 1, IS_UNIQUE, !IS_ORDERED);
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
		initEReference(getHotelInitializer_Roomhandler(), this.getRoomHandler(), null, "roomhandler", null, 1, 1, HotelInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotelInitializer_Reservationhandler(), this.getReservationHandler(), null, "reservationhandler", null, 1, 1, HotelInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iReceptionistProvidesEClass, IReceptionistProvides.class, "IReceptionistProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIReceptionistProvides__EditReservation__int_String_String_String_String(), null, "editReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__AddRoomTypeToReservation__int_String_int(), ecorePackage.getEBoolean(), "addRoomTypeToReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfRoomsForType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__RemoveRoomTypeFromReservation__int_String(), ecorePackage.getEBoolean(), "removeRoomTypeFromReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__EditRoomType__int_String_int(), ecorePackage.getEBoolean(), "editRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfRoomsForType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__ListFreeRooms__int(), null, "listFreeRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__CheckIn__int(), ecorePackage.getEEList(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__CancelReservation__int(), ecorePackage.getEBoolean(), "cancelReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIReceptionistProvides__ListReservations(), ecorePackage.getEEList(), "listReservations", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__ListOccupiedRooms__String(), ecorePackage.getEEList(), "listOccupiedRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__ListCheckins__String(), ecorePackage.getEEList(), "listCheckins", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__ListCheckouts__String_String(), ecorePackage.getEEList(), "listCheckouts", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReceptionistProvides__AddExtraToRoom__int_int_String_int(), ecorePackage.getEBoolean(), "addExtraToRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "extraDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

} //HotelsystemPackageImpl
