/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getIreceptionistroomtypeprovides <em>Ireceptionistroomtypeprovides</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomExtras <em>Room Extras</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getEndDate <em>End Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation()
 * @model
 * @generated
 */
public interface RoomReservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Ireceptionistroomtypeprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ireceptionistroomtypeprovides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ireceptionistroomtypeprovides</em>' reference.
	 * @see #setIreceptionistroomtypeprovides(RoomType)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_Ireceptionistroomtypeprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getIreceptionistroomtypeprovides();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getIreceptionistroomtypeprovides <em>Ireceptionistroomtypeprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ireceptionistroomtypeprovides</em>' reference.
	 * @see #getIreceptionistroomtypeprovides()
	 * @generated
	 */
	void setIreceptionistroomtypeprovides(RoomType value);

	/**
	 * Returns the value of the '<em><b>Room Extras</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Extras</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Extras</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_RoomExtras()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomExtras> getRoomExtras();

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
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_Room()
	 * @model ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkIn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nrOfNightsRequired="true" nrOfNightsOrdered="false"
	 * @generated
	 */
	double checkOut(int nrOfNights);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	Room getRoomIfOccupied(String date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getRoomId();

} // RoomReservation
