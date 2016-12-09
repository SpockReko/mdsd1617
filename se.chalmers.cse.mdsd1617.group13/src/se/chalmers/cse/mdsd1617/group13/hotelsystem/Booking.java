/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getRoomreservation <em>Roomreservation</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCanceled <em>Canceled</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingId <em>Booking Id</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking()
 * @model
 * @generated
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
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Roomreservation</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomreservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomreservation</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_Roomreservation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomReservation> getRoomreservation();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
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
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
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
	 * @return the value of the '<em>Canceled</em>' attribute.
	 * @see #setCanceled(boolean)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_Canceled()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCanceled();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#isCanceled <em>Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canceled</em>' attribute.
	 * @see #isCanceled()
	 * @generated
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
	 * @return the value of the '<em>Booking Id</em>' attribute.
	 * @see #setBookingId(int)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBooking_BookingId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBookingId();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking#getBookingId <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Id</em>' attribute.
	 * @see #getBookingId()
	 * @generated
	 */
	void setBookingId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	EList<Room> getOccupiedRooms(String date);

} // Booking
