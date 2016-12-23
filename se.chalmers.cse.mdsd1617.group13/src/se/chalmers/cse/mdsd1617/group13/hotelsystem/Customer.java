/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getFirstName <em>First Name</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getLastName <em>Last Name</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getCustomer()
 */
public interface Customer extends EObject {
    /**
     * Returns the value of the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>First Name</em>' attribute.
     * @model unique="false" required="true" ordered="false"
     * @generated
     * @see #setFirstName(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getCustomer_FirstName()
     */
    String getFirstName();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getFirstName <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>First Name</em>' attribute.
     * @generated
     * @see #getFirstName()
     */
    void setFirstName(String value);

    /**
     * Returns the value of the '<em><b>Last Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Last Name</em>' attribute.
     * @model unique="false" required="true" ordered="false"
     * @generated
     * @see #setLastName(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getCustomer_LastName()
     */
    String getLastName();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer#getLastName <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Last Name</em>' attribute.
     * @generated
     * @see #getLastName()
     */
    void setLastName(String value);

} // Customer
