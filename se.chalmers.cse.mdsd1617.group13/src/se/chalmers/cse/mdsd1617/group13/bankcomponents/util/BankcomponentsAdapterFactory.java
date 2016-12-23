/**
 */
package se.chalmers.cse.mdsd1617.group13.bankcomponents.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankAdministrator;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.IAdministratorProvides;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.ICustomerProvides;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.bankcomponents.BankcomponentsPackage
 */
public class BankcomponentsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected static BankcomponentsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BankcomponentsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BankcomponentsPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BankcomponentsSwitch<Adapter> modelSwitch =
            new BankcomponentsSwitch<Adapter>() {
                @Override
                public Adapter caseBankAdministrator(BankAdministrator object) {
                    return createBankAdministratorAdapter();
                }

                @Override
                public Adapter caseIAdministratorProvides(IAdministratorProvides object) {
                    return createIAdministratorProvidesAdapter();
                }

                @Override
                public Adapter caseICustomerProvides(ICustomerProvides object) {
                    return createICustomerProvidesAdapter();
                }

                @Override
                public Adapter defaultCase(EObject object) {
                    return createEObjectAdapter();
                }
            };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }


    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.bankcomponents.BankAdministrator <em>Bank Administrator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.bankcomponents.BankAdministrator
     */
    public Adapter createBankAdministratorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.bankcomponents.IAdministratorProvides <em>IAdministrator Provides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.bankcomponents.IAdministratorProvides
     */
    public Adapter createIAdministratorProvidesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link se.chalmers.cse.mdsd1617.group13.bankcomponents.ICustomerProvides <em>ICustomer Provides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see se.chalmers.cse.mdsd1617.group13.bankcomponents.ICustomerProvides
     */
    public Adapter createICustomerProvidesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //BankcomponentsAdapterFactory
