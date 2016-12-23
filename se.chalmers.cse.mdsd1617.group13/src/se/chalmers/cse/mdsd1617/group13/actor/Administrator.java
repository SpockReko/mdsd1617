/**
 */
package se.chalmers.cse.mdsd1617.group13.actor;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.actor.Administrator#getIadministratorprovides <em>Iadministratorprovides</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.actor.Administrator#getIhotelstartupprovides <em>Ihotelstartupprovides</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.actor.ActorPackage#getAdministrator()
 */
public interface Administrator extends User {
    /**
     * Returns the value of the '<em><b>Iadministratorprovides</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Iadministratorprovides</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Iadministratorprovides</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setIadministratorprovides(IHotelAdministratorProvides)
     * @see se.chalmers.cse.mdsd1617.group13.actor.ActorPackage#getAdministrator_Iadministratorprovides()
     */
    IHotelAdministratorProvides getIadministratorprovides();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.actor.Administrator#getIadministratorprovides <em>Iadministratorprovides</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Iadministratorprovides</em>' reference.
     * @generated
     * @see #getIadministratorprovides()
     */
    void setIadministratorprovides(IHotelAdministratorProvides value);

    /**
     * Returns the value of the '<em><b>Ihotelstartupprovides</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ihotelstartupprovides</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Ihotelstartupprovides</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setIhotelstartupprovides(IHotelStartupProvides)
     * @see se.chalmers.cse.mdsd1617.group13.actor.ActorPackage#getAdministrator_Ihotelstartupprovides()
     */
    IHotelStartupProvides getIhotelstartupprovides();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.actor.Administrator#getIhotelstartupprovides <em>Ihotelstartupprovides</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Ihotelstartupprovides</em>' reference.
     * @generated
     * @see #getIhotelstartupprovides()
     */
    void setIhotelstartupprovides(IHotelStartupProvides value);

} // Administrator
