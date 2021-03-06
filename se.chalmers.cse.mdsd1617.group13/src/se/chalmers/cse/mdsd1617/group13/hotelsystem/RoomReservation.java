/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomType <em>Room Type</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomExtras <em>Room Extras</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getStartDate <em>Start Date</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getEndDate <em>End Date</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoom <em>Room</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getCheckInDate <em>Check In Date</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getCheckOuDate <em>Check Ou Date</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation()
 */
public interface RoomReservation extends EObject {
    /**
     * Returns the value of the '<em><b>Room Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Type</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomType(RoomType)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_RoomType()
     */
    RoomType getRoomType();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoomType <em>Room Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Room Type</em>' reference.
     * @generated
     * @see #getRoomType()
     */
    void setRoomType(RoomType value);

    /**
     * Returns the value of the '<em><b>Room Extras</b></em>' reference list.
     * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtra}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Extras</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Extras</em>' reference list.
     * @model ordered="false"
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_RoomExtras()
     */
    EList<RoomExtra> getRoomExtras();

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
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_StartDate()
     */
    String getStartDate();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getStartDate <em>Start Date</em>}' attribute.
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
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_EndDate()
     */
    String getEndDate();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @generated
     * @see #getEndDate()
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
     *
     * @return the value of the '<em>Room</em>' reference.
     * @model ordered="false"
     * @generated
     * @see #setRoom(Room)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_Room()
     */
    Room getRoom();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getRoom <em>Room</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Room</em>' reference.
     * @generated
     * @see #getRoom()
     */
    void setRoom(Room value);

    /**
     * Returns the value of the '<em><b>Check In Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Check In Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Check In Date</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setCheckInDate(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_CheckInDate()
     */
    String getCheckInDate();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getCheckInDate <em>Check In Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Check In Date</em>' attribute.
     * @generated
     * @see #getCheckInDate()
     */
    void setCheckInDate(String value);

    /**
     * Returns the value of the '<em><b>Check Ou Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Check Ou Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Check Ou Date</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setCheckOuDate(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomReservation_CheckOuDate()
     */
    String getCheckOuDate();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation#getCheckOuDate <em>Check Ou Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Check Ou Date</em>' attribute.
     * @generated
     * @see #getCheckOuDate()
     */
    void setCheckOuDate(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     */
    void checkIn();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" nrOfNightsRequired="true" nrOfNightsOrdered="false"
     * @generated
     */
    double checkOut(int nrOfNights);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" dateRequired="true" dateOrdered="false"
     * @generated
     */
    Room getRoomIfOccupied(String date);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model kind="operation" required="true" ordered="false"
     * @generated
     */
    int getRoomId();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model extraRequired="true" extraOrdered="false"
     * @generated
     */
    void addExtra(RoomExtra extra);

} // RoomReservation
