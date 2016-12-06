/**
 */
package ClassDiagramPackage;

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
 * @see ClassDiagramPackage.ClassDiagramPackageFactory
 * @model kind="package"
 * @generated
 */
public interface ClassDiagramPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ClassDiagramPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ClassDiagramPackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ClassDiagramPackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassDiagramPackagePackage eINSTANCE = ClassDiagramPackage.impl.ClassDiagramPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link ClassDiagramPackage.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.impl.UserImpl
	 * @see ClassDiagramPackage.impl.ClassDiagramPackagePackageImpl#getUser()
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
	 * The meta object id for the '{@link ClassDiagramPackage.impl.ReceptionistImpl <em>Receptionist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.impl.ReceptionistImpl
	 * @see ClassDiagramPackage.impl.ClassDiagramPackagePackageImpl#getReceptionist()
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
	 * The meta object id for the '{@link ClassDiagramPackage.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagramPackage.impl.AdministratorImpl
	 * @see ClassDiagramPackage.impl.ClassDiagramPackagePackageImpl#getAdministrator()
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
	 * Returns the meta object for class '{@link ClassDiagramPackage.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ClassDiagramPackage.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.Receptionist <em>Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receptionist</em>'.
	 * @see ClassDiagramPackage.Receptionist
	 * @generated
	 */
	EClass getReceptionist();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.Receptionist#getIreceptionistprovides <em>Ireceptionistprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ireceptionistprovides</em>'.
	 * @see ClassDiagramPackage.Receptionist#getIreceptionistprovides()
	 * @see #getReceptionist()
	 * @generated
	 */
	EReference getReceptionist_Ireceptionistprovides();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.Receptionist#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ihotelcustomerprovides</em>'.
	 * @see ClassDiagramPackage.Receptionist#getIhotelcustomerprovides()
	 * @see #getReceptionist()
	 * @generated
	 */
	EReference getReceptionist_Ihotelcustomerprovides();

	/**
	 * Returns the meta object for class '{@link ClassDiagramPackage.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see ClassDiagramPackage.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.Administrator#getIadministratorprovides <em>Iadministratorprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iadministratorprovides</em>'.
	 * @see ClassDiagramPackage.Administrator#getIadministratorprovides()
	 * @see #getAdministrator()
	 * @generated
	 */
	EReference getAdministrator_Iadministratorprovides();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagramPackage.Administrator#getIhotelstartupprovides <em>Ihotelstartupprovides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ihotelstartupprovides</em>'.
	 * @see ClassDiagramPackage.Administrator#getIhotelstartupprovides()
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
	ClassDiagramPackageFactory getClassDiagramPackageFactory();

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
		 * The meta object literal for the '{@link ClassDiagramPackage.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.impl.UserImpl
		 * @see ClassDiagramPackage.impl.ClassDiagramPackagePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link ClassDiagramPackage.impl.ReceptionistImpl <em>Receptionist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.impl.ReceptionistImpl
		 * @see ClassDiagramPackage.impl.ClassDiagramPackagePackageImpl#getReceptionist()
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
		 * The meta object literal for the '{@link ClassDiagramPackage.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagramPackage.impl.AdministratorImpl
		 * @see ClassDiagramPackage.impl.ClassDiagramPackagePackageImpl#getAdministrator()
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

} //ClassDiagramPackagePackage
