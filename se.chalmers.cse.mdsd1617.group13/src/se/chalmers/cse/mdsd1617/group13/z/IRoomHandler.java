/**
 */
package se.chalmers.cse.mdsd1617.group13.z;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getIRoomHandler()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomHandler extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" nrOfBedsRequired="true" nrOfBedsOrdered="false"
	 * @generated
	 */
	EList<RoomType> getAllRoomTypes(int nrOfBeds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Integer> getFreeRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	EList<Room> getAllRoomsByType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false"
	 * @generated
	 */
	RoomType getRoomType(String roomTypeName);

} // IRoomHandler
