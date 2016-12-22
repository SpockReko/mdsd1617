/**
 */
package se.chalmers.cse.mdsd1617.group13.actor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.chalmers.cse.mdsd1617.group13.actor.ActorPackage;
import se.chalmers.cse.mdsd1617.group13.actor.Administrator;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelStartupProvides;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.actor.impl.AdministratorImpl#getIadministratorprovides <em>Iadministratorprovides</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.actor.impl.AdministratorImpl#getIhotelstartupprovides <em>Ihotelstartupprovides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministratorImpl extends UserImpl implements Administrator {
	/**
	 * The cached value of the '{@link #getIadministratorprovides() <em>Iadministratorprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIadministratorprovides()
	 * @generated
	 * @ordered
	 */
	protected IHotelAdministratorProvides iadministratorprovides;

	/**
	 * The cached value of the '{@link #getIhotelstartupprovides() <em>Ihotelstartupprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIhotelstartupprovides()
	 * @generated
	 * @ordered
	 */
	protected IHotelStartupProvides ihotelstartupprovides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActorPackage.Literals.ADMINISTRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelAdministratorProvides getIadministratorprovides() {
		if (iadministratorprovides != null && iadministratorprovides.eIsProxy()) {
			InternalEObject oldIadministratorprovides = (InternalEObject)iadministratorprovides;
			iadministratorprovides = (IHotelAdministratorProvides)eResolveProxy(oldIadministratorprovides);
			if (iadministratorprovides != oldIadministratorprovides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActorPackage.ADMINISTRATOR__IADMINISTRATORPROVIDES, oldIadministratorprovides, iadministratorprovides));
			}
		}
		return iadministratorprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelAdministratorProvides basicGetIadministratorprovides() {
		return iadministratorprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIadministratorprovides(IHotelAdministratorProvides newIadministratorprovides) {
		IHotelAdministratorProvides oldIadministratorprovides = iadministratorprovides;
		iadministratorprovides = newIadministratorprovides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorPackage.ADMINISTRATOR__IADMINISTRATORPROVIDES, oldIadministratorprovides, iadministratorprovides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelStartupProvides getIhotelstartupprovides() {
		if (ihotelstartupprovides != null && ihotelstartupprovides.eIsProxy()) {
			InternalEObject oldIhotelstartupprovides = (InternalEObject)ihotelstartupprovides;
			ihotelstartupprovides = (IHotelStartupProvides)eResolveProxy(oldIhotelstartupprovides);
			if (ihotelstartupprovides != oldIhotelstartupprovides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActorPackage.ADMINISTRATOR__IHOTELSTARTUPPROVIDES, oldIhotelstartupprovides, ihotelstartupprovides));
			}
		}
		return ihotelstartupprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHotelStartupProvides basicGetIhotelstartupprovides() {
		return ihotelstartupprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIhotelstartupprovides(IHotelStartupProvides newIhotelstartupprovides) {
		IHotelStartupProvides oldIhotelstartupprovides = ihotelstartupprovides;
		ihotelstartupprovides = newIhotelstartupprovides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorPackage.ADMINISTRATOR__IHOTELSTARTUPPROVIDES, oldIhotelstartupprovides, ihotelstartupprovides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActorPackage.ADMINISTRATOR__IADMINISTRATORPROVIDES:
				if (resolve) return getIadministratorprovides();
				return basicGetIadministratorprovides();
			case ActorPackage.ADMINISTRATOR__IHOTELSTARTUPPROVIDES:
				if (resolve) return getIhotelstartupprovides();
				return basicGetIhotelstartupprovides();
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
			case ActorPackage.ADMINISTRATOR__IADMINISTRATORPROVIDES:
				setIadministratorprovides((IHotelAdministratorProvides)newValue);
				return;
			case ActorPackage.ADMINISTRATOR__IHOTELSTARTUPPROVIDES:
				setIhotelstartupprovides((IHotelStartupProvides)newValue);
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
			case ActorPackage.ADMINISTRATOR__IADMINISTRATORPROVIDES:
				setIadministratorprovides((IHotelAdministratorProvides)null);
				return;
			case ActorPackage.ADMINISTRATOR__IHOTELSTARTUPPROVIDES:
				setIhotelstartupprovides((IHotelStartupProvides)null);
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
			case ActorPackage.ADMINISTRATOR__IADMINISTRATORPROVIDES:
				return iadministratorprovides != null;
			case ActorPackage.ADMINISTRATOR__IHOTELSTARTUPPROVIDES:
				return ihotelstartupprovides != null;
		}
		return super.eIsSet(featureID);
	}

} //AdministratorImpl
