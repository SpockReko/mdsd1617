/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage
 */
public interface HotelsystemFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    HotelsystemFactory eINSTANCE = se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Booking Handler</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Booking Handler</em>'.
     * @generated
     */
    BookingHandler createBookingHandler();

    /**
     * Returns a new object of class '<em>Booking</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Booking</em>'.
     * @generated
     */
    Booking createBooking();

    /**
     * Returns a new object of class '<em>Customer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Customer</em>'.
     * @generated
     */
    Customer createCustomer();

    /**
     * Returns a new object of class '<em>Room Reservation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Room Reservation</em>'.
     * @generated
     */
    RoomReservation createRoomReservation();

    /**
     * Returns a new object of class '<em>Room Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Room Type</em>'.
     * @generated
     */
    RoomType createRoomType();

    /**
     * Returns a new object of class '<em>Room Extra</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Room Extra</em>'.
     * @generated
     */
    RoomExtra createRoomExtra();

    /**
     * Returns a new object of class '<em>Bill</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Bill</em>'.
     * @generated
     */
    Bill createBill();

    /**
     * Returns a new object of class '<em>Payment Handler</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Payment Handler</em>'.
     * @generated
     */
    PaymentHandler createPaymentHandler();

    /**
     * Returns a new object of class '<em>Room Handler</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Room Handler</em>'.
     * @generated
     */
    RoomHandler createRoomHandler();

    /**
     * Returns a new object of class '<em>Room</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Room</em>'.
     * @generated
     */
    Room createRoom();

    /**
     * Returns a new object of class '<em>Free Room Types DTO</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Free Room Types DTO</em>'.
     * @generated
     */
    FreeRoomTypesDTO createFreeRoomTypesDTO();

    /**
     * Returns a new object of class '<em>Hotel Initializer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Hotel Initializer</em>'.
     * @generated
     */
    HotelInitializer createHotelInitializer();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    HotelsystemPackage getHotelsystemPackage();

} //HotelsystemFactory
