/**
 */
package ClassDiagramPackage.bankcomponents.impl;

import ClassDiagramPackage.bankcomponents.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankcomponentsFactoryImpl extends EFactoryImpl implements BankcomponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BankcomponentsFactory init() {
		try {
			BankcomponentsFactory theBankcomponentsFactory = (BankcomponentsFactory)EPackage.Registry.INSTANCE.getEFactory(BankcomponentsPackage.eNS_URI);
			if (theBankcomponentsFactory != null) {
				return theBankcomponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BankcomponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankcomponentsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BankcomponentsPackage.BANK_ADMINISTRATOR: return createBankAdministrator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAdministrator createBankAdministrator() {
		BankAdministratorImpl bankAdministrator = new BankAdministratorImpl();
		return bankAdministrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankcomponentsPackage getBankcomponentsPackage() {
		return (BankcomponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BankcomponentsPackage getPackage() {
		return BankcomponentsPackage.eINSTANCE;
	}

} //BankcomponentsFactoryImpl
