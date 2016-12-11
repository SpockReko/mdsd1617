/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

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
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getIadminroomtypeprovides <em>Iadminroomtypeprovides</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomHandler()
 * @model
 * @generated
 */
public interface RoomHandler extends IRoomHandler, IHotelAdministratorProvides {
	/**
	 * Returns the value of the '<em><b>Iadminroomtypeprovides</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iadminroomtypeprovides</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iadminroomtypeprovides</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomHandler_Iadminroomtypeprovides()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomType> getIadminroomtypeprovides();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomHandler_Rooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IAdminRoomProvides> getRooms();

} // RoomHandler
