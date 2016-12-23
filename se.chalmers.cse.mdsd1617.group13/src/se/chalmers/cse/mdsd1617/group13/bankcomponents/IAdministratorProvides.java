/**
 */
package se.chalmers.cse.mdsd1617.group13.bankcomponents;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAdministrator Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage#getIAdministratorProvides()
 */
public interface IAdministratorProvides extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" sumRequired="true" sumOrdered="false"
     * @generated
     */
    double makeDeposit(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
     * @generated
     */
    boolean addCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
     * @generated
     */
    boolean removeCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
     * @generated
     */
    double getBalance(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

} // IAdministratorProvides
