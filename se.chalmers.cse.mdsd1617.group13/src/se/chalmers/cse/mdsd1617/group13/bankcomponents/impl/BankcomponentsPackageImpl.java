/**
 */
package se.chalmers.cse.mdsd1617.group13.bankcomponents.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;
import se.chalmers.cse.mdsd1617.group13.Group13Package;

import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankAdministrator;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsFactory;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.IAdministratorProvides;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.ICustomerProvides;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl;

import se.chalmers.cse.mdsd1617.group13.impl.Group13PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankcomponentsPackageImpl extends EPackageImpl implements BankcomponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankAdministratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAdministratorProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCustomerProvidesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BankcomponentsPackageImpl() {
		super(eNS_URI, BankcomponentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BankcomponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BankcomponentsPackage init() {
		if (isInited) return (BankcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BankcomponentsPackage.eNS_URI);

		// Obtain or create and register package
		BankcomponentsPackageImpl theBankcomponentsPackage = (BankcomponentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BankcomponentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BankcomponentsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Group13PackageImpl theGroup13Package = (Group13PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Group13Package.eNS_URI) instanceof Group13PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Group13Package.eNS_URI) : Group13Package.eINSTANCE);
		HotelsystemPackageImpl theHotelsystemPackage = (HotelsystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelsystemPackage.eNS_URI) instanceof HotelsystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelsystemPackage.eNS_URI) : HotelsystemPackage.eINSTANCE);

		// Create package meta-data objects
		theBankcomponentsPackage.createPackageContents();
		theGroup13Package.createPackageContents();
		theHotelsystemPackage.createPackageContents();

		// Initialize created meta-data
		theBankcomponentsPackage.initializePackageContents();
		theGroup13Package.initializePackageContents();
		theHotelsystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBankcomponentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BankcomponentsPackage.eNS_URI, theBankcomponentsPackage);
		return theBankcomponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBankAdministrator() {
		return bankAdministratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAdministratorProvides() {
		return iAdministratorProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double() {
		return iAdministratorProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAdministratorProvides__AddCreditCard__String_String_int_int_String_String() {
		return iAdministratorProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String() {
		return iAdministratorProvidesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAdministratorProvides__GetBalance__String_String_int_int_String_String() {
		return iAdministratorProvidesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICustomerProvides() {
		return iCustomerProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerProvides__MakePayment__String_String_int_int_String_String_double() {
		return iCustomerProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerProvides__IsCreditCardValid__String_String_int_int_String_String() {
		return iCustomerProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankcomponentsFactory getBankcomponentsFactory() {
		return (BankcomponentsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bankAdministratorEClass = createEClass(BANK_ADMINISTRATOR);

		iAdministratorProvidesEClass = createEClass(IADMINISTRATOR_PROVIDES);
		createEOperation(iAdministratorProvidesEClass, IADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE);
		createEOperation(iAdministratorProvidesEClass, IADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iAdministratorProvidesEClass, IADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iAdministratorProvidesEClass, IADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING);

		iCustomerProvidesEClass = createEClass(ICUSTOMER_PROVIDES);
		createEOperation(iCustomerProvidesEClass, ICUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE);
		createEOperation(iCustomerProvidesEClass, ICUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bankAdministratorEClass.getESuperTypes().add(this.getIAdministratorProvides());

		// Initialize classes, features, and operations; add parameters
		initEClass(bankAdministratorEClass, BankAdministrator.class, "BankAdministrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iAdministratorProvidesEClass, IAdministratorProvides.class, "IAdministratorProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double(), ecorePackage.getEDouble(), "makeDeposit", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "sum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIAdministratorProvides__AddCreditCard__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "addCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "removeCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIAdministratorProvides__GetBalance__String_String_int_int_String_String(), ecorePackage.getEDouble(), "getBalance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCustomerProvidesEClass, ICustomerProvides.class, "ICustomerProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getICustomerProvides__MakePayment__String_String_int_int_String_String_double(), ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "sum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerProvides__IsCreditCardValid__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "isCreditCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

} //BankcomponentsPackageImpl
