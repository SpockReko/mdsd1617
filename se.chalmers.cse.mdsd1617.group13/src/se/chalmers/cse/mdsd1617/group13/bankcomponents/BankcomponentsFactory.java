/**
 */
package se.chalmers.cse.mdsd1617.group13.bankcomponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage
 */
public interface BankcomponentsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    BankcomponentsFactory eINSTANCE = se.chalmers.cse.mdsd1617.group13.bankcomponents.impl.BankcomponentsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Bank Administrator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Bank Administrator</em>'.
     * @generated
     */
    BankAdministrator createBankAdministrator();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    BankcomponentsPackage getBankcomponentsPackage();

} //BankcomponentsFactory
