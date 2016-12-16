/**
 */
package se.chalmers.cse.mdsd1617.group13.z;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.RoomHandler#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.RoomHandler#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getRoomHandler()
 * @model
 * @generated
 */
public interface RoomHandler extends IRoomHandler, IHotelAdministratorProvides {
	/**
	 * Returns the value of the '<em><b>Room Types</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.z.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Types</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getRoomHandler_RoomTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomTypes();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.z.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getRoomHandler_Rooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	Room getRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberOfRoomsRequired="true" numberOfRoomsOrdered="false"
	 * @generated
	 */
	void initialize(int numberOfRooms);

} // RoomHandler
