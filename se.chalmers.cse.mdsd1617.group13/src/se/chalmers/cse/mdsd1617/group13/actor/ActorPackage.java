/**
 */
package se.chalmers.cse.mdsd1617.group13.actor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @model kind="package"
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.actor.ActorFactory
 */
public interface ActorPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "actor";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http:///se/chalmers/cse/mdsd1617/group13/actor.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "se.chalmers.cse.mdsd1617.group13.actor";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    ActorPackage eINSTANCE = se.chalmers.cse.mdsd1617.group13.actor.impl.ActorPackageImpl.init();

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.actor.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.impl.UserImpl
     * @see se.chalmers.cse.mdsd1617.group13.actor.impl.ActorPackageImpl#getUser()
     */
    int USER = 0;

    /**
     * The number of structural features of the '<em>User</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>User</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.actor.impl.ReceptionistImpl <em>Receptionist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.impl.ReceptionistImpl
     * @see se.chalmers.cse.mdsd1617.group13.actor.impl.ActorPackageImpl#getReceptionist()
     */
    int RECEPTIONIST = 1;

    /**
     * The feature id for the '<em><b>Ireceptionistprovides</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RECEPTIONIST__IRECEPTIONISTPROVIDES = USER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ihotelcustomerprovides</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RECEPTIONIST__IHOTELCUSTOMERPROVIDES = USER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Receptionist</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RECEPTIONIST_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Receptionist</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RECEPTIONIST_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.actor.impl.AdministratorImpl <em>Administrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.impl.AdministratorImpl
     * @see se.chalmers.cse.mdsd1617.group13.actor.impl.ActorPackageImpl#getAdministrator()
     */
    int ADMINISTRATOR = 2;

    /**
     * The feature id for the '<em><b>Iadministratorprovides</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ADMINISTRATOR__IADMINISTRATORPROVIDES = USER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ihotelstartupprovides</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ADMINISTRATOR__IHOTELSTARTUPPROVIDES = USER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Administrator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ADMINISTRATOR_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Administrator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ADMINISTRATOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.actor.User <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>User</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.User
     */
    EClass getUser();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.actor.Receptionist <em>Receptionist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Receptionist</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.Receptionist
     */
    EClass getReceptionist();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.actor.Receptionist#getIreceptionistprovides <em>Ireceptionistprovides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Ireceptionistprovides</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.Receptionist#getIreceptionistprovides()
     * @see #getReceptionist()
     */
    EReference getReceptionist_Ireceptionistprovides();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.actor.Receptionist#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Ihotelcustomerprovides</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.Receptionist#getIhotelcustomerprovides()
     * @see #getReceptionist()
     */
    EReference getReceptionist_Ihotelcustomerprovides();

    /**
     * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.actor.Administrator <em>Administrator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Administrator</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.Administrator
     */
    EClass getAdministrator();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.actor.Administrator#getIadministratorprovides <em>Iadministratorprovides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Iadministratorprovides</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.Administrator#getIadministratorprovides()
     * @see #getAdministrator()
     */
    EReference getAdministrator_Iadministratorprovides();

    /**
     * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.actor.Administrator#getIhotelstartupprovides <em>Ihotelstartupprovides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Ihotelstartupprovides</em>'.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.actor.Administrator#getIhotelstartupprovides()
     * @see #getAdministrator()
     */
    EReference getAdministrator_Ihotelstartupprovides();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ActorFactory getActorFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.actor.impl.UserImpl <em>User</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.actor.impl.UserImpl
         * @see se.chalmers.cse.mdsd1617.group13.actor.impl.ActorPackageImpl#getUser()
         */
        EClass USER = eINSTANCE.getUser();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.actor.impl.ReceptionistImpl <em>Receptionist</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.actor.impl.ReceptionistImpl
         * @see se.chalmers.cse.mdsd1617.group13.actor.impl.ActorPackageImpl#getReceptionist()
         */
        EClass RECEPTIONIST = eINSTANCE.getReceptionist();

        /**
         * The meta object literal for the '<em><b>Ireceptionistprovides</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference RECEPTIONIST__IRECEPTIONISTPROVIDES = eINSTANCE.getReceptionist_Ireceptionistprovides();

        /**
         * The meta object literal for the '<em><b>Ihotelcustomerprovides</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference RECEPTIONIST__IHOTELCUSTOMERPROVIDES = eINSTANCE.getReceptionist_Ihotelcustomerprovides();

        /**
         * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.actor.impl.AdministratorImpl <em>Administrator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         * @see se.chalmers.cse.mdsd1617.group13.actor.impl.AdministratorImpl
         * @see se.chalmers.cse.mdsd1617.group13.actor.impl.ActorPackageImpl#getAdministrator()
         */
        EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

        /**
         * The meta object literal for the '<em><b>Iadministratorprovides</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ADMINISTRATOR__IADMINISTRATORPROVIDES = eINSTANCE.getAdministrator_Iadministratorprovides();

        /**
         * The meta object literal for the '<em><b>Ihotelstartupprovides</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ADMINISTRATOR__IHOTELSTARTUPPROVIDES = eINSTANCE.getAdministrator_Ihotelstartupprovides();

    }

} //ActorPackage
