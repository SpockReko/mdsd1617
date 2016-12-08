/**
 */
package se.chalmers.cse.mdsd1617.group13;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group13.Group13Factory
 * @model kind="package"
 * @generated
 */
public interface Group13Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "group13";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///se/chalmers/cse/mdsd1617/group13.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.chalmers.cse.mdsd1617.group13";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Group13Package eINSTANCE = se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl.init();

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.impl.UserImpl
	 * @see se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.impl.ReceptionistImpl <em>Receptionist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.impl.ReceptionistImpl
	 * @see se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl#getReceptionist()
	 * @generated
	 */
	int RECEPTIONIST = 1;

	/**
	 * The feature id for the '<em><b>Ireceptionistprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST__IRECEPTIONISTPROVIDES = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ihotelcustomerprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST__IHOTELCUSTOMERPROVIDES = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.chalmers.cse.mdsd1617.group13.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.cse.mdsd1617.group13.impl.AdministratorImpl
	 * @see se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 2;

	/**
	 * The feature id for the '<em><b>Iadministratorprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__IADMINISTRATORPROVIDES = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ihotelstartupprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__IHOTELSTARTUPPROVIDES = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.Receptionist <em>Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receptionist</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.Receptionist
	 * @generated
	 */
	EClass getReceptionist();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.Receptionist#getIreceptionistprovides <em>Ireceptionistprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ireceptionistprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.Receptionist#getIreceptionistprovides()
	 * @see #getReceptionist()
	 * @generated
	 */
	EReference getReceptionist_Ireceptionistprovides();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.Receptionist#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ihotelcustomerprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.Receptionist#getIhotelcustomerprovides()
	 * @see #getReceptionist()
	 * @generated
	 */
	EReference getReceptionist_Ihotelcustomerprovides();

	/**
	 * Returns the meta object for class '{@link se.chalmers.cse.mdsd1617.group13.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.Administrator#getIadministratorprovides <em>Iadministratorprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iadministratorprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.Administrator#getIadministratorprovides()
	 * @see #getAdministrator()
	 * @generated
	 */
	EReference getAdministrator_Iadministratorprovides();

	/**
	 * Returns the meta object for the reference '{@link se.chalmers.cse.mdsd1617.group13.Administrator#getIhotelstartupprovides <em>Ihotelstartupprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ihotelstartupprovides</em>'.
	 * @see se.chalmers.cse.mdsd1617.group13.Administrator#getIhotelstartupprovides()
	 * @see #getAdministrator()
	 * @generated
	 */
	EReference getAdministrator_Ihotelstartupprovides();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Group13Factory getGroup13Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.impl.UserImpl
		 * @see se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.impl.ReceptionistImpl <em>Receptionist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.impl.ReceptionistImpl
		 * @see se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl#getReceptionist()
		 * @generated
		 */
		EClass RECEPTIONIST = eINSTANCE.getReceptionist();

		/**
		 * The meta object literal for the '<em><b>Ireceptionistprovides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTIONIST__IRECEPTIONISTPROVIDES = eINSTANCE.getReceptionist_Ireceptionistprovides();

		/**
		 * The meta object literal for the '<em><b>Ihotelcustomerprovides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTIONIST__IHOTELCUSTOMERPROVIDES = eINSTANCE.getReceptionist_Ihotelcustomerprovides();

		/**
		 * The meta object literal for the '{@link se.chalmers.cse.mdsd1617.group13.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.cse.mdsd1617.group13.impl.AdministratorImpl
		 * @see se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '<em><b>Iadministratorprovides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATOR__IADMINISTRATORPROVIDES = eINSTANCE.getAdministrator_Iadministratorprovides();

		/**
		 * The meta object literal for the '<em><b>Ihotelstartupprovides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATOR__IHOTELSTARTUPPROVIDES = eINSTANCE.getAdministrator_Ihotelstartupprovides();

	}

} //Group13Package
