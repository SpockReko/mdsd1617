/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import se.chalmers.cse.mdsd1617.group13.bankcomponents.ICustomerProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.PaymentHandlerImpl#getBankingComponent <em>Banking Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentHandlerImpl extends MinimalEObjectImpl.Container implements PaymentHandler {
	/**
	 * The cached value of the '{@link #getBankingComponent() <em>Banking Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankingComponent()
	 * @generated
	 * @ordered
	 */
	protected ICustomerProvides bankingComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelsystemPackage.Literals.PAYMENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomerProvides getBankingComponent() {
		if (bankingComponent != null && bankingComponent.eIsProxy()) {
			InternalEObject oldBankingComponent = (InternalEObject)bankingComponent;
			bankingComponent = (ICustomerProvides)eResolveProxy(oldBankingComponent);
			if (bankingComponent != oldBankingComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.PAYMENT_HANDLER__BANKING_COMPONENT, oldBankingComponent, bankingComponent));
			}
		}
		return bankingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomerProvides basicGetBankingComponent() {
		return bankingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankingComponent(ICustomerProvides newBankingComponent) {
		ICustomerProvides oldBankingComponent = bankingComponent;
		bankingComponent = newBankingComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.PAYMENT_HANDLER__BANKING_COMPONENT, oldBankingComponent, bankingComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean payIfCardValid(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum) {
        if (this.getBankingComponent().isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)){
            if (this.getBankingComponent().makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, sum)){
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelsystemPackage.PAYMENT_HANDLER__BANKING_COMPONENT:
				if (resolve) return getBankingComponent();
				return basicGetBankingComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelsystemPackage.PAYMENT_HANDLER__BANKING_COMPONENT:
				setBankingComponent((ICustomerProvides)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HotelsystemPackage.PAYMENT_HANDLER__BANKING_COMPONENT:
				setBankingComponent((ICustomerProvides)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HotelsystemPackage.PAYMENT_HANDLER__BANKING_COMPONENT:
				return bankingComponent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelsystemPackage.PAYMENT_HANDLER___PAY_IF_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING_DOUBLE:
				return payIfCardValid((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Double)arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentHandlerImpl
