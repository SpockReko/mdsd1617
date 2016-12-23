/**
 */
package se.chalmers.cse.mdsd1617.group13.actor;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receptionist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.actor.Receptionist#getIreceptionistprovides <em>Ireceptionistprovides</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.actor.Receptionist#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.actor.ActorPackage#getReceptionist()
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
     *
     * @return the value of the '<em>Ireceptionistprovides</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setIreceptionistprovides(IHotelReceptionistProvides)
     * @see se.chalmers.cse.mdsd1617.group13.actor.ActorPackage#getReceptionist_Ireceptionistprovides()
     */
    IHotelReceptionistProvides getIreceptionistprovides();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.actor.Receptionist#getIreceptionistprovides <em>Ireceptionistprovides</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Ireceptionistprovides</em>' reference.
     * @generated
     * @see #getIreceptionistprovides()
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
     *
     * @return the value of the '<em>Ihotelcustomerprovides</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setIhotelcustomerprovides(IHotelCustomerProvides)
     * @see se.chalmers.cse.mdsd1617.group13.actor.ActorPackage#getReceptionist_Ihotelcustomerprovides()
     */
    IHotelCustomerProvides getIhotelcustomerprovides();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.actor.Receptionist#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Ihotelcustomerprovides</em>' reference.
     * @generated
     * @see #getIhotelcustomerprovides()
     */
    void setIhotelcustomerprovides(IHotelCustomerProvides value);

} // Receptionist
