/**
 */
package se.chalmers.cse.mdsd1617.group13.actor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import se.chalmers.cse.mdsd1617.group13.actor.ActorFactory;
import se.chalmers.cse.mdsd1617.group13.actor.ActorPackage;
import se.chalmers.cse.mdsd1617.group13.actor.Administrator;
import se.chalmers.cse.mdsd1617.group13.actor.Receptionist;
import se.chalmers.cse.mdsd1617.group13.actor.User;

import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage;

import se.chalmers.cse.mdsd1617.group13.bankcomponents.impl.BankcomponentsPackageImpl;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActorPackageImpl extends EPackageImpl implements ActorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administratorEClass = null;

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
	 * @see se.chalmers.cse.mdsd1617.group13.actor.ActorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActorPackageImpl() {
		super(eNS_URI, ActorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActorPackage init() {
		if (isInited) return (ActorPackage)EPackage.Registry.INSTANCE.getEPackage(ActorPackage.eNS_URI);

		// Obtain or create and register package
		ActorPackageImpl theActorPackage = (ActorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		HotelsystemPackageImpl theHotelsystemPackage = (HotelsystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelsystemPackage.eNS_URI) instanceof HotelsystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelsystemPackage.eNS_URI) : HotelsystemPackage.eINSTANCE);
		BankcomponentsPackageImpl theBankcomponentsPackage = (BankcomponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankcomponentsPackage.eNS_URI) instanceof BankcomponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankcomponentsPackage.eNS_URI) : BankcomponentsPackage.eINSTANCE);

		// Create package meta-data objects
		theActorPackage.createPackageContents();
		theHotelsystemPackage.createPackageContents();
		theBankcomponentsPackage.createPackageContents();

		// Initialize created meta-data
		theActorPackage.initializePackageContents();
		theHotelsystemPackage.initializePackageContents();
		theBankcomponentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActorPackage.eNS_URI, theActorPackage);
		return theActorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceptionist() {
		return receptionistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceptionist_Ireceptionistprovides() {
		return (EReference)receptionistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceptionist_Ihotelcustomerprovides() {
		return (EReference)receptionistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrator() {
		return administratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrator_Iadministratorprovides() {
		return (EReference)administratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrator_Ihotelstartupprovides() {
		return (EReference)administratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorFactory getActorFactory() {
		return (ActorFactory)getEFactoryInstance();
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
		userEClass = createEClass(USER);

		receptionistEClass = createEClass(RECEPTIONIST);
		createEReference(receptionistEClass, RECEPTIONIST__IRECEPTIONISTPROVIDES);
		createEReference(receptionistEClass, RECEPTIONIST__IHOTELCUSTOMERPROVIDES);

		administratorEClass = createEClass(ADMINISTRATOR);
		createEReference(administratorEClass, ADMINISTRATOR__IADMINISTRATORPROVIDES);
		createEReference(administratorEClass, ADMINISTRATOR__IHOTELSTARTUPPROVIDES);
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

		// Obtain other dependent packages
		HotelsystemPackage theHotelsystemPackage = (HotelsystemPackage)EPackage.Registry.INSTANCE.getEPackage(HotelsystemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		receptionistEClass.getESuperTypes().add(this.getUser());
		administratorEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receptionistEClass, Receptionist.class, "Receptionist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceptionist_Ireceptionistprovides(), theHotelsystemPackage.getIHotelReceptionistProvides(), null, "ireceptionistprovides", null, 1, 1, Receptionist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceptionist_Ihotelcustomerprovides(), theHotelsystemPackage.getIHotelCustomerProvides(), null, "ihotelcustomerprovides", null, 1, 1, Receptionist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(administratorEClass, Administrator.class, "Administrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdministrator_Iadministratorprovides(), theHotelsystemPackage.getIHotelAdministratorProvides(), null, "iadministratorprovides", null, 1, 1, Administrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdministrator_Ihotelstartupprovides(), theHotelsystemPackage.getIHotelStartupProvides(), null, "ihotelstartupprovides", null, 1, 1, Administrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ActorPackageImpl
