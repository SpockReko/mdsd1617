/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getCustomer <em>Customer</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getRoomReservations <em>Room Reservations</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getStartDate <em>Start Date</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getEndDate <em>End Date</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCanceled <em>Canceled</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingId <em>Booking Id</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBills <em>Bills</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isConfirmed <em>Confirmed</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking()
 */
public interface Booking extends EObject {
    /**
     * Returns the value of the '<em><b>Customer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Customer</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setCustomer(Customer)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_Customer()
     */
    Customer getCustomer();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Customer</em>' reference.
     * @generated
     * @see #getCustomer()
     */
    void setCustomer(Customer value);

    /**
     * Returns the value of the '<em><b>Room Reservations</b></em>' reference list.
     * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Reservations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Reservations</em>' reference list.
     * @model ordered="false"
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_RoomReservations()
     */
    EList<RoomReservation> getRoomReservations();

    /**
     * Returns the value of the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Start Date</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setStartDate(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_StartDate()
     */
    String getStartDate();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @generated
     * @see #getStartDate()
     */
    void setStartDate(String value);

    /**
     * Returns the value of the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>End Date</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setEndDate(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_EndDate()
     */
    String getEndDate();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @generated
     * @see #getEndDate()
     */
    void setEndDate(String value);

    /**
     * Returns the value of the '<em><b>Canceled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Canceled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Canceled</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setCanceled(boolean)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_Canceled()
     */
    boolean isCanceled();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCanceled <em>Canceled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Canceled</em>' attribute.
     * @generated
     * @see #isCanceled()
     */
    void setCanceled(boolean value);

    /**
     * Returns the value of the '<em><b>Booking Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Booking Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Booking Id</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setBookingId(int)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_BookingId()
     */
    int getBookingId();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingId <em>Booking Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Booking Id</em>' attribute.
     * @generated
     * @see #getBookingId()
     */
    void setBookingId(int value);

    /**
     * Returns the value of the '<em><b>Bills</b></em>' reference list.
     * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bills</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bills</em>' reference list.
     * @model ordered="false"
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_Bills()
     */
    EList<Bill> getBills();

    /**
     * Returns the value of the '<em><b>Confirmed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Confirmed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Confirmed</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setConfirmed(boolean)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_Confirmed()
     */
    boolean isConfirmed();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isConfirmed <em>Confirmed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Confirmed</em>' attribute.
     * @generated
     * @see #isConfirmed()
     */
    void setConfirmed(boolean value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     */
    void cancel();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model ordered="false" dateRequired="true" dateOrdered="false"
     * @generated
     */
    EList<Room> getOccupiedRooms(String date);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false"
     * @generated
     */
    double checkOut();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false"
     * @generated
     */
    int nrOfNights();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model kind="operation" required="true" ordered="false"
     * @generated
     */
    boolean isCheckedIn();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
     * annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='checkIn()'"
     * @generated
     */
    boolean checkIn(Room room);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model kind="operation" required="true" ordered="false"
     * @generated
     */
    double getBookingPrice();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
     * @generated
     */
    double getRoomPrice(int roomNumber);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomIdRequired="true" roomIdOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
     * @generated
     */
    boolean isFree(int roomId, String startDate, String endDate);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" extraRequired="true" extraOrdered="false" roomNbrRequired="true" roomNbrOrdered="false"
     * @generated
     */
    boolean addExtra(RoomExtra extra, int roomNbr);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
     * @generated
     */
    double checkOutRoom(int roomNumber);

} // Booking
