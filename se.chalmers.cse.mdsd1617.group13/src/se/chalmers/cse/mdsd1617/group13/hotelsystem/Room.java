/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isOccupied <em>Occupied</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isBlocked <em>Blocked</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomId <em>Room Id</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends IAdminRoomProvides, IReceptionistRoomProvides {
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
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom_Occupied()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOccupied();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isOccupied <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupied</em>' attribute.
	 * @see #isOccupied()
	 * @generated
	 */
	void setOccupied(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(RoomType)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

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
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom_Blocked()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBlocked();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#isBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked</em>' attribute.
	 * @see #isBlocked()
	 * @generated
	 */
	void setBlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Id</em>' attribute.
	 * @see #setRoomId(int)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoom_RoomId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomId();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room#getRoomId <em>Room Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Id</em>' attribute.
	 * @see #getRoomId()
	 * @generated
	 */
	void setRoomId(int value);

} // Room
