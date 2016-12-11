/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAdmin Room Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getIAdminRoomProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAdminRoomProvides extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean hasRoomType(RoomType room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getRoomId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" stateRequired="true" stateOrdered="false"
	 * @generated
	 */
	boolean setBlockedState(boolean state);
} // IAdminRoomProvides
