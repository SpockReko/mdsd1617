/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isOccupied <em>Occupied</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomtype <em>Roomtype</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isBlocked <em>Blocked</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomNumber <em>Room Number</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom()
 */
public interface Room extends EObject {
    /**
     * Returns the value of the '<em><b>Occupied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Occupied</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Occupied</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setOccupied(boolean)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom_Occupied()
     */
    boolean isOccupied();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isOccupied <em>Occupied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Occupied</em>' attribute.
     * @generated
     * @see #isOccupied()
     */
    void setOccupied(boolean value);

    /**
     * Returns the value of the '<em><b>Roomtype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roomtype</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Roomtype</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomtype(RoomType)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom_Roomtype()
     */
    RoomType getRoomtype();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomtype <em>Roomtype</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Roomtype</em>' reference.
     * @generated
     * @see #getRoomtype()
     */
    void setRoomtype(RoomType value);

    /**
     * Returns the value of the '<em><b>Blocked</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Blocked</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Blocked</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setBlocked(boolean)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom_Blocked()
     */
    boolean isBlocked();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isBlocked <em>Blocked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Blocked</em>' attribute.
     * @generated
     * @see #isBlocked()
     */
    void setBlocked(boolean value);

    /**
     * Returns the value of the '<em><b>Room Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Number</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomNumber(int)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom_RoomNumber()
     */
    int getRoomNumber();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomNumber <em>Room Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Room Number</em>' attribute.
     * @generated
     * @see #getRoomNumber()
     */
    void setRoomNumber(int value);

} // Room
