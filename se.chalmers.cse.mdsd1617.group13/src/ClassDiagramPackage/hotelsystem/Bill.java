/**
 */
package ClassDiagramPackage.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.Bill#getRoomreservation <em>Roomreservation</em>}</li>
 * </ul>
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends EObject {
	/**
	 * Returns the value of the '<em><b>Roomreservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomreservation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomreservation</em>' reference.
	 * @see #setRoomreservation(RoomReservation)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getBill_Roomreservation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomReservation getRoomreservation();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.Bill#getRoomreservation <em>Roomreservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomreservation</em>' reference.
	 * @see #getRoomreservation()
	 * @generated
	 */
	void setRoomreservation(RoomReservation value);

} // Bill
