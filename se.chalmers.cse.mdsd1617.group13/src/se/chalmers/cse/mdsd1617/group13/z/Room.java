/**
 */
package se.chalmers.cse.mdsd1617.group13.z;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.Room#isOccupied <em>Occupied</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.Room#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.Room#isBlocked <em>Blocked</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.Room#getRoomNumber <em>Room Number</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getRoom()
 * @model
 * @generated
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
	 * @return the value of the '<em>Occupied</em>' attribute.
	 * @see #setOccupied(boolean)
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getRoom_Occupied()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOccupied();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.z.Room#isOccupied <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupied</em>' attribute.
	 * @see #isOccupied()
	 * @generated
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
	 * @return the value of the '<em>Roomtype</em>' reference.
	 * @see #setRoomtype(RoomType)
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getRoom_Roomtype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.z.Room#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
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
	 * @return the value of the '<em>Blocked</em>' attribute.
	 * @see #setBlocked(boolean)
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getRoom_Blocked()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBlocked();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.z.Room#isBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked</em>' attribute.
	 * @see #isBlocked()
	 * @generated
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
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.z.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

} // Room
