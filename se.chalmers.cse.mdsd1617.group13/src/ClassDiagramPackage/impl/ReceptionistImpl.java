/**
 */
package ClassDiagramPackage.impl;

import ClassDiagramPackage.ClassDiagramPackagePackage;
import ClassDiagramPackage.Receptionist;

import ClassDiagramPackage.hotelsystem.IHotelCustomerProvides;
import ClassDiagramPackage.hotelsystem.IReceptionistProvides;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receptionist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.impl.ReceptionistImpl#getIreceptionistprovides <em>Ireceptionistprovides</em>}</li>
 *   <li>{@link ClassDiagramPackage.impl.ReceptionistImpl#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceptionistImpl extends UserImpl implements Receptionist {
	/**
	 * The cached value of the '{@link #getIreceptionistprovides() <em>Ireceptionistprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIreceptionistprovides()
	 * @generated
	 * @ordered
	 */
	protected IReceptionistProvides ireceptionistprovides;

	/**
	 * The cached value of the '{@link #getIhotelcustomerprovides() <em>Ihotelcustomerprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIhotelcustomerprovides()
	 * @generated
	 * @ordered
	 */
	protected IHotelCustomerProvides ihotelcustomerprovides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptionistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackagePackage.Literals.RECEPTIONIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReceptionistProvides getIreceptionistprovides() {
		if (ireceptionistprovides != null && ireceptionistprovides.eIsProxy()) {
			InternalEObject oldIreceptionistprovides = (InternalEObject)ireceptionistprovides;
			ireceptionistprovides = (IReceptionistProvides)eResolveProxy(oldIreceptionistprovides);
			if (ireceptionistprovides != oldIreceptionistprovides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackagePackage.RECEPTIONIST__IRECEPTIONISTPROVIDES, oldIreceptionistprovides, ireceptionistprovides));
			}
		}
		return ireceptionistprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReceptionistProvides basicGetIreceptionistprovides() {
		return ireceptionistprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIreceptionistprovides(IReceptionistProvides newIreceptionistprovides) {
		IReceptionistProvides oldIreceptionistprovides = ireceptionistprovides;
		ireceptionistprovides = newIreceptionistprovides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackagePackage.RECEPTIONIST__IRECEPTIONISTPROVIDES, oldIreceptionistprovides, ireceptionistprovides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelCustomerProvides getIhotelcustomerprovides() {
		if (ihotelcustomerprovides != null && ihotelcustomerprovides.eIsProxy()) {
			InternalEObject oldIhotelcustomerprovides = (InternalEObject)ihotelcustomerprovides;
			ihotelcustomerprovides = (IHotelCustomerProvides)eResolveProxy(oldIhotelcustomerprovides);
			if (ihotelcustomerprovides != oldIhotelcustomerprovides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackagePackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES, oldIhotelcustomerprovides, ihotelcustomerprovides));
			}
		}
		return ihotelcustomerprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelCustomerProvides basicGetIhotelcustomerprovides() {
		return ihotelcustomerprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIhotelcustomerprovides(IHotelCustomerProvides newIhotelcustomerprovides) {
		IHotelCustomerProvides oldIhotelcustomerprovides = ihotelcustomerprovides;
		ihotelcustomerprovides = newIhotelcustomerprovides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackagePackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES, oldIhotelcustomerprovides, ihotelcustomerprovides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackagePackage.RECEPTIONIST__IRECEPTIONISTPROVIDES:
				if (resolve) return getIreceptionistprovides();
				return basicGetIreceptionistprovides();
			case ClassDiagramPackagePackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES:
				if (resolve) return getIhotelcustomerprovides();
				return basicGetIhotelcustomerprovides();
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
			case ClassDiagramPackagePackage.RECEPTIONIST__IRECEPTIONISTPROVIDES:
				setIreceptionistprovides((IReceptionistProvides)newValue);
				return;
			case ClassDiagramPackagePackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES:
				setIhotelcustomerprovides((IHotelCustomerProvides)newValue);
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
			case ClassDiagramPackagePackage.RECEPTIONIST__IRECEPTIONISTPROVIDES:
				setIreceptionistprovides((IReceptionistProvides)null);
				return;
			case ClassDiagramPackagePackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES:
				setIhotelcustomerprovides((IHotelCustomerProvides)null);
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
			case ClassDiagramPackagePackage.RECEPTIONIST__IRECEPTIONISTPROVIDES:
				return ireceptionistprovides != null;
			case ClassDiagramPackagePackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES:
				return ihotelcustomerprovides != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceptionistImpl
