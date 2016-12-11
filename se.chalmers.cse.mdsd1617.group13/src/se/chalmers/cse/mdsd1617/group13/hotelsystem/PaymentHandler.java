/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

import se.chalmers.cse.mdsd1617.group13.bankcomponents.ICustomerProvides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#getIcustomerprovides <em>Icustomerprovides</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getPaymentHandler()
 * @model
 * @generated
 */
public interface PaymentHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Icustomerprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icustomerprovides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icustomerprovides</em>' reference.
	 * @see #setIcustomerprovides(ICustomerProvides)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getPaymentHandler_Icustomerprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ICustomerProvides getIcustomerprovides();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler#getIcustomerprovides <em>Icustomerprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icustomerprovides</em>' reference.
	 * @see #getIcustomerprovides()
	 * @generated
	 */
	void setIcustomerprovides(ICustomerProvides value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ccNumberRequired="true" ccNumberOrdered="false" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" sumRequired="true" sumOrdered="false"
	 * @generated
	 */
	void payIfCardValid(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum);

} // PaymentHandler
