/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getIRoomHandler()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomHandler extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<RoomType> getAllRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomtypeRequired="true" roomtypeOrdered="false"
	 * @generated
	 */
	int countFreeRoom(RoomType roomtype);

} // IRoomHandler
