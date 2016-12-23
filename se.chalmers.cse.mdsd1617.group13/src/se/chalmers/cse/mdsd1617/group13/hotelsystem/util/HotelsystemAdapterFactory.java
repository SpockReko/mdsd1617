/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage
 */
public class HotelsystemAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected static HotelsystemPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public HotelsystemAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = HotelsystemPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected HotelsystemSwitch<Adapter> modelSwitch =
            new HotelsystemSwitch<Adapter>() {
                @Override
                public Adapter caseBookingHandler(BookingHandler object) {
                    return createBookingHandlerAdapter();
                }

                @Override
                public Adapter caseBooking(Booking object) {
                    return createBookingAdapter();
                }

                @Override
                public Adapter caseCustomer(Customer object) {
                    return createCustomerAdapter();
                }

                @Override
                public Adapter caseRoomReservation(RoomReservation object) {
                    return createRoomReservationAdapter();
                }

                @Override
                public Adapter caseRoomType(RoomType object) {
                    return createRoomTypeAdapter();
                }

                @Override
                public Adapter caseRoomExtra(RoomExtra object) {
                    return createRoomExtraAdapter();
                }

                @Override
                public Adapter caseRoom(Room object) {
                    return createRoomAdapter();
                }

                @Override
                public Adapter caseBill(Bill object) {
                    return createBillAdapter();
                }

                @Override
                public Adapter casePaymentHandler(PaymentHandler object) {
                    return createPaymentHandlerAdapter();
                }

                @Override
                public Adapter caseIRoomHandler(IRoomHandler object) {
                    return createIRoomHandlerAdapter();
                }

                @Override
                public Adapter caseIHotelReceptionistProvides(IHotelReceptionistProvides object) {
                    return createIHotelReceptionistProvidesAdapter();
                }

                @Override
                public Adapter caseIHotelCustomerProvides(IHotelCustomerProvides object) {
                    return createIHotelCustomerProvidesAdapter();
                }

                @Override
                public Adapter caseFreeRoomTypesDTO(FreeRoomTypesDTO object) {
                    return createFreeRoomTypesDTOAdapter();
                }

                @Override
                public Adapter caseRoomHandler(RoomHandler object) {
                    return createRoomHandlerAdapter();
                }

                @Override
                public Adapter caseIHotelAdministratorProvides(IHotelAdministratorProvides object) {
                    return createIHotelAdministratorProvidesAdapter();
                }

                @Override
                public Adapter caseIHotelStartupProvides(IHotelStartupProvides object) {
                    return createIHotelStartupProvidesAdapter();
                }

                @Override
                public Adapter caseHotelInitializer(HotelInitializer object) {
                    return createHotelInitializerAdapter();
                }

                @Override
                public Adapter defaultCase(EObject object) {
                    return createEObjectAdapter();
                }
            };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }


    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler <em>Booking Handler</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler
     */
    public Adapter createBookingHandlerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking <em>Booking</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking
     */
    public Adapter createBookingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer <em>Customer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer
     */
    public Adapter createCustomerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation <em>Room Reservation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation
     */
    public Adapter createRoomReservationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType <em>Room Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType
     */
    public Adapter createRoomTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra <em>Room Extra</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra
     */
    public Adapter createRoomExtraAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill <em>Bill</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill
     */
    public Adapter createBillAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler <em>Payment Handler</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler
     */
    public Adapter createPaymentHandlerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler <em>IRoom Handler</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IRoomHandler
     */
    public Adapter createIRoomHandlerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler <em>Room Handler</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler
     */
    public Adapter createRoomHandlerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room <em>Room</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.Room
     */
    public Adapter createRoomAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides <em>IHotel Customer Provides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides
     */
    public Adapter createIHotelCustomerProvidesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO <em>Free Room Types DTO</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO
     */
    public Adapter createFreeRoomTypesDTOAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides <em>IHotel Administrator Provides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides
     */
    public Adapter createIHotelAdministratorProvidesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides <em>IHotel Startup Provides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides
     */
    public Adapter createIHotelStartupProvidesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer <em>Hotel Initializer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer
     */
    public Adapter createHotelInitializerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides <em>IHotel Receptionist Provides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides
     */
    public Adapter createIHotelReceptionistProvidesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //HotelsystemAdapterFactory
