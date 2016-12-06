/**
 */
package ClassDiagramPackage.hotelsystem.impl;

import ClassDiagramPackage.hotelsystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelsystemFactoryImpl extends EFactoryImpl implements HotelsystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelsystemFactory init() {
		try {
			HotelsystemFactory theHotelsystemFactory = (HotelsystemFactory)EPackage.Registry.INSTANCE.getEFactory(HotelsystemPackage.eNS_URI);
			if (theHotelsystemFactory != null) {
				return theHotelsystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelsystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelsystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HotelsystemPackage.RESERVATION_HANDLER: return createReservationHandler();
			case HotelsystemPackage.RESERVATION: return createReservation();
			case HotelsystemPackage.CUSTOMER: return createCustomer();
			case HotelsystemPackage.ROOM_RESERVATION: return createRoomReservation();
			case HotelsystemPackage.ROOM_TYPE: return createRoomType();
			case HotelsystemPackage.ROOM_EXTRAS: return createRoomExtras();
			case HotelsystemPackage.BILL: return createBill();
			case HotelsystemPackage.PAYMENT_HANDLER: return createPaymentHandler();
			case HotelsystemPackage.ROOM_HANDLER: return createRoomHandler();
			case HotelsystemPackage.ROOM: return createRoom();
			case HotelsystemPackage.FREE_ROOM_TYPES_DTO: return createFreeRoomTypesDTO();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationHandler createReservationHandler() {
		ReservationHandlerImpl reservationHandler = new ReservationHandlerImpl();
		return reservationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation createReservation() {
		ReservationImpl reservation = new ReservationImpl();
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservation createRoomReservation() {
		RoomReservationImpl roomReservation = new RoomReservationImpl();
		return roomReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtras createRoomExtras() {
		RoomExtrasImpl roomExtras = new RoomExtrasImpl();
		return roomExtras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler createPaymentHandler() {
		PaymentHandlerImpl paymentHandler = new PaymentHandlerImpl();
		return paymentHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler createRoomHandler() {
		RoomHandlerImpl roomHandler = new RoomHandlerImpl();
		return roomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeRoomTypesDTO createFreeRoomTypesDTO() {
		FreeRoomTypesDTOImpl freeRoomTypesDTO = new FreeRoomTypesDTOImpl();
		return freeRoomTypesDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelsystemPackage getHotelsystemPackage() {
		return (HotelsystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelsystemPackage getPackage() {
		return HotelsystemPackage.eINSTANCE;
	}

} //HotelsystemFactoryImpl
