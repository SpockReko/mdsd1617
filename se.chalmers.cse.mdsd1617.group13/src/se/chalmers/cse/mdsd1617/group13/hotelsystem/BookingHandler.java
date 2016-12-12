/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookings <em>Bookings</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymentHandler <em>Payment Handler</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookingCurrentlyCheckingOut <em>Booking Currently Checking Out</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler()
 * @model
 * @generated
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
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_Bookings()
	 * @model ordered="false"
	 * @generated
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
	 * @return the value of the '<em>Payment Handler</em>' reference.
	 * @see #setPaymentHandler(PaymentHandler)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_PaymentHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentHandler getPaymentHandler();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymentHandler <em>Payment Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Handler</em>' reference.
	 * @see #getPaymentHandler()
	 * @generated
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
	 * @return the value of the '<em>Roomhandler</em>' reference.
	 * @see #setRoomhandler(IRoomHandler)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_Roomhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IRoomHandler getRoomhandler();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler <em>Roomhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomhandler</em>' reference.
	 * @see #getRoomhandler()
	 * @generated
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
	 * @return the value of the '<em>Booking Currently Checking Out</em>' attribute.
	 * @see #setBookingCurrentlyCheckingOut(int)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_BookingCurrentlyCheckingOut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBookingCurrentlyCheckingOut();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getBookingCurrentlyCheckingOut <em>Booking Currently Checking Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Currently Checking Out</em>' attribute.
	 * @see #getBookingCurrentlyCheckingOut()
	 * @generated
	 */
	void setBookingCurrentlyCheckingOut(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	boolean BookingCheckin(String date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	String addDay(String date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	Booking getBookingById(int bookingId);

} // BookingHandler
