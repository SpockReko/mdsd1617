/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IReceptionist Room Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getIReceptionistRoomProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IReceptionistRoomProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model occupiedRequired="true" occupiedOrdered="false"
	 * @generated
	 */
	void setOccupied(boolean occupied);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean roomIsOccupied();

} // IReceptionistRoomProvides
