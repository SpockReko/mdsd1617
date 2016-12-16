/**
 */
package se.chalmers.cse.mdsd1617.group13.z;

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
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.Bill#getRoomreservation <em>Roomreservation</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.Bill#getPrice <em>Price</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.Bill#getBillID <em>Bill ID</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getBill()
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
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getBill_Roomreservation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomReservation getRoomreservation();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.z.Bill#getRoomreservation <em>Roomreservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomreservation</em>' reference.
	 * @see #getRoomreservation()
	 * @generated
	 */
	void setRoomreservation(RoomReservation value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getBill_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.z.Bill#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Bill ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill ID</em>' attribute.
	 * @see #setBillID(int)
	 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getBill_BillID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBillID();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.z.Bill#getBillID <em>Bill ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill ID</em>' attribute.
	 * @see #getBillID()
	 * @generated
	 */
	void setBillID(int value);

} // Bill
