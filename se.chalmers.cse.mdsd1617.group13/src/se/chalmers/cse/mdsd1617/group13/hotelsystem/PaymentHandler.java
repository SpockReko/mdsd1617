/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.ICustomerProvides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#getBankingComponent <em>Banking Component</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getPaymentHandler()
 */
public interface PaymentHandler extends EObject {
    /**
     * Returns the value of the '<em><b>Banking Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Banking Component</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Banking Component</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setBankingComponent(ICustomerProvides)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getPaymentHandler_BankingComponent()
     */
    ICustomerProvides getBankingComponent();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#getBankingComponent <em>Banking Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Banking Component</em>' reference.
     * @generated
     * @see #getBankingComponent()
     */
    void setBankingComponent(ICustomerProvides value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" sumRequired="true" sumOrdered="false"
     * @generated
     */
    boolean payIfCardValid(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum);

} // PaymentHandler
