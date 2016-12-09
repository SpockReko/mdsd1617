/**
 */
package se.chalmers.cse.mdsd1617.group13;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receptionist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.Receptionist#getIreceptionistprovides <em>Ireceptionistprovides</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.Receptionist#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.Group13Package#getReceptionist()
 * @model
 * @generated
 */
public interface Receptionist extends User {
	/**
	 * Returns the value of the '<em><b>Ireceptionistprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ireceptionistprovides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ireceptionistprovides</em>' reference.
	 * @see #setIreceptionistprovides(IHotelReceptionistProvides)
	 * @see se.chalmers.cse.mdsd1617.group13.Group13Package#getReceptionist_Ireceptionistprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IHotelReceptionistProvides getIreceptionistprovides();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.Receptionist#getIreceptionistprovides <em>Ireceptionistprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ireceptionistprovides</em>' reference.
	 * @see #getIreceptionistprovides()
	 * @generated
	 */
	void setIreceptionistprovides(IHotelReceptionistProvides value);

	/**
	 * Returns the value of the '<em><b>Ihotelcustomerprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ihotelcustomerprovides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ihotelcustomerprovides</em>' reference.
	 * @see #setIhotelcustomerprovides(IHotelCustomerProvides)
	 * @see se.chalmers.cse.mdsd1617.group13.Group13Package#getReceptionist_Ihotelcustomerprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IHotelCustomerProvides getIhotelcustomerprovides();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.Receptionist#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ihotelcustomerprovides</em>' reference.
	 * @see #getIhotelcustomerprovides()
	 * @generated
	 */
	void setIhotelcustomerprovides(IHotelCustomerProvides value);

} // Receptionist
