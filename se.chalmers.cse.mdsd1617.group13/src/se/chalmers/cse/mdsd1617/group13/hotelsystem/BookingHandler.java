/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookings <em>Bookings</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymentHandler <em>Payment Handler</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler <em>Roomhandler</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookingCurrentlyCheckingOut <em>Booking Currently Checking Out</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getNextBookingId <em>Next Booking Id</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler()
 */
public interface BookingHandler extends IHotelReceptionistProvides, IHotelCustomerProvides {
    /**
     * Returns the value of the '<em><b>Bookings</b></em>' reference list.
     * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bookings</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bookings</em>' reference list.
     * @model ordered="false"
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_Bookings()
     */
    EList<Booking> getBookings();

    /**
     * Returns the value of the '<em><b>Payment Handler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Payment Handler</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Payment Handler</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setPaymentHandler(PaymentHandler)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_PaymentHandler()
     */
    PaymentHandler getPaymentHandler();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymentHandler <em>Payment Handler</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Payment Handler</em>' reference.
     * @generated
     * @see #getPaymentHandler()
     */
    void setPaymentHandler(PaymentHandler value);

    /**
     * Returns the value of the '<em><b>Roomhandler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roomhandler</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Roomhandler</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomhandler(IRoomHandler)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_Roomhandler()
     */
    IRoomHandler getRoomhandler();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler <em>Roomhandler</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Roomhandler</em>' reference.
     * @generated
     * @see #getRoomhandler()
     */
    void setRoomhandler(IRoomHandler value);

    /**
     * Returns the value of the '<em><b>Booking Currently Checking Out</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Booking Currently Checking Out</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Booking Currently Checking Out</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setBookingCurrentlyCheckingOut(int)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_BookingCurrentlyCheckingOut()
     */
    int getBookingCurrentlyCheckingOut();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookingCurrentlyCheckingOut <em>Booking Currently Checking Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Booking Currently Checking Out</em>' attribute.
     * @generated
     * @see #getBookingCurrentlyCheckingOut()
     */
    void setBookingCurrentlyCheckingOut(int value);

    /**
     * Returns the value of the '<em><b>Next Booking Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next Booking Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Next Booking Id</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setNextBookingId(int)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_NextBookingId()
     */
    int getNextBookingId();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getNextBookingId <em>Next Booking Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Next Booking Id</em>' attribute.
     * @generated
     * @see #getNextBookingId()
     */
    void setNextBookingId(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
     * @generated
     */
    Booking getBookingById(int bookingId);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomIdRequired="true" roomIdOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
     * @generated
     */
    boolean isFree(int roomId, String startDate, String endDate);

} // BookingHandler
