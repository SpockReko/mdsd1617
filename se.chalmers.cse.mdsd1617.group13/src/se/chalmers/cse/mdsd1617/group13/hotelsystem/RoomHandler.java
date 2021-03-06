/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRoomTypes <em>Room Types</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomHandler()
 */
public interface RoomHandler extends IRoomHandler, IHotelAdministratorProvides {
    /**
     * Returns the value of the '<em><b>Room Types</b></em>' reference list.
     * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Types</em>' reference list.
     * @model ordered="false"
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomHandler_RoomTypes()
     */
    EList<RoomType> getRoomTypes();

    /**
     * Returns the value of the '<em><b>Rooms</b></em>' reference list.
     * The list contents are of type {@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Room}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rooms</em>' reference list.
     * @model ordered="false"
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomHandler_Rooms()
     */
    EList<Room> getRooms();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
     * @generated
     */
    Room getRoom(int roomNumber);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model numberOfRoomsRequired="true" numberOfRoomsOrdered="false"
     * @generated
     */
    void initialize(int numberOfRooms);

} // RoomHandler
