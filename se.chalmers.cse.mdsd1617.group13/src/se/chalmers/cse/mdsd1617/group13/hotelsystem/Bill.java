/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getRoomreservation <em>Roomreservation</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getPrice <em>Price</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getBillID <em>Bill ID</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBill()
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
     *
     * @return the value of the '<em>Roomreservation</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomreservation(RoomReservation)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBill_Roomreservation()
     */
    RoomReservation getRoomreservation();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getRoomreservation <em>Roomreservation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Roomreservation</em>' reference.
     * @generated
     * @see #getRoomreservation()
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
     *
     * @return the value of the '<em>Price</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setPrice(double)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBill_Price()
     */
    double getPrice();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getPrice <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Price</em>' attribute.
     * @generated
     * @see #getPrice()
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
     *
     * @return the value of the '<em>Bill ID</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setBillID(int)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getBill_BillID()
     */
    int getBillID();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill#getBillID <em>Bill ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bill ID</em>' attribute.
     * @generated
     * @see #getBillID()
     */
    void setBillID(int value);

} // Bill
