/**
 */
package ClassDiagramPackage.hotelsystem.impl;

import ClassDiagramPackage.bankcomponents.ICustomerProvides;

import ClassDiagramPackage.hotelsystem.HotelsystemPackage;
import ClassDiagramPackage.hotelsystem.PaymentHandler;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.impl.PaymentHandlerImpl#getIcustomerprovides <em>Icustomerprovides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentHandlerImpl extends MinimalEObjectImpl.Container implements PaymentHandler {
	/**
	 * The cached value of the '{@link #getIcustomerprovides() <em>Icustomerprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcustomerprovides()
	 * @generated
	 * @ordered
	 */
	protected ICustomerProvides icustomerprovides;

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
	public ICustomerProvides getIcustomerprovides() {
		if (icustomerprovides != null && icustomerprovides.eIsProxy()) {
			InternalEObject oldIcustomerprovides = (InternalEObject)icustomerprovides;
			icustomerprovides = (ICustomerProvides)eResolveProxy(oldIcustomerprovides);
			if (icustomerprovides != oldIcustomerprovides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.PAYMENT_HANDLER__ICUSTOMERPROVIDES, oldIcustomerprovides, icustomerprovides));
			}
		}
		return icustomerprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomerProvides basicGetIcustomerprovides() {
		return icustomerprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcustomerprovides(ICustomerProvides newIcustomerprovides) {
		ICustomerProvides oldIcustomerprovides = icustomerprovides;
		icustomerprovides = newIcustomerprovides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.PAYMENT_HANDLER__ICUSTOMERPROVIDES, oldIcustomerprovides, icustomerprovides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payIfCardValid(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelsystemPackage.PAYMENT_HANDLER__ICUSTOMERPROVIDES:
				if (resolve) return getIcustomerprovides();
				return basicGetIcustomerprovides();
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
			case HotelsystemPackage.PAYMENT_HANDLER__ICUSTOMERPROVIDES:
				setIcustomerprovides((ICustomerProvides)newValue);
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
			case HotelsystemPackage.PAYMENT_HANDLER__ICUSTOMERPROVIDES:
				setIcustomerprovides((ICustomerProvides)null);
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
			case HotelsystemPackage.PAYMENT_HANDLER__ICUSTOMERPROVIDES:
				return icustomerprovides != null;
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
			case HotelsystemPackage.PAYMENT_HANDLER___PAY_IF_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING:
				payIfCardValid((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentHandlerImpl
