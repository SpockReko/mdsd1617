/**
 */
package se.chalmers.cse.mdsd1617.group13.bankcomponents.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankAdministrator;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.IAdministratorProvides;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.ICustomerProvides;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage
 */
public class BankcomponentsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected static BankcomponentsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BankcomponentsSwitch() {
        if (modelPackage == null) {
            modelPackage = BankcomponentsPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case BankcomponentsPackage.BANK_ADMINISTRATOR: {
                BankAdministrator bankAdministrator = (BankAdministrator) theEObject;
                T result = caseBankAdministrator(bankAdministrator);
                if (result == null) result = caseIAdministratorProvides(bankAdministrator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BankcomponentsPackage.IADMINISTRATOR_PROVIDES: {
                IAdministratorProvides iAdministratorProvides = (IAdministratorProvides) theEObject;
                T result = caseIAdministratorProvides(iAdministratorProvides);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BankcomponentsPackage.ICUSTOMER_PROVIDES: {
                ICustomerProvides iCustomerProvides = (ICustomerProvides) theEObject;
                T result = caseICustomerProvides(iCustomerProvides);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default:
                return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bank Administrator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bank Administrator</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public T caseBankAdministrator(BankAdministrator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IAdministrator Provides</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IAdministrator Provides</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public T caseIAdministratorProvides(IAdministratorProvides object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ICustomer Provides</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ICustomer Provides</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     */
    public T caseICustomerProvides(ICustomerProvides object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @generated
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //BankcomponentsSwitch
