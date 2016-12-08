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
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getReservation <em>Reservation</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymenthandler <em>Paymenthandler</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getCurrentReservationId <em>Current Reservation Id</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler()
 * @model
 * @generated
 */
public interface BookingHandler extends IReceptionistProvides {
	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_Reservation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getReservation();

	/**
	 * Returns the value of the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymenthandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymenthandler</em>' reference.
	 * @see #setPaymenthandler(PaymentHandler)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_Paymenthandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentHandler getPaymenthandler();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getPaymenthandler <em>Paymenthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymenthandler</em>' reference.
	 * @see #getPaymenthandler()
	 * @generated
	 */
	void setPaymenthandler(PaymentHandler value);

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
	 * Returns the value of the '<em><b>Current Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Reservation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Reservation Id</em>' attribute.
	 * @see #setCurrentReservationId(int)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBookingHandler_CurrentReservationId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCurrentReservationId();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler#getCurrentReservationId <em>Current Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Reservation Id</em>' attribute.
	 * @see #getCurrentReservationId()
	 * @generated
	 */
	void setCurrentReservationId(int value);

} // BookingHandler
