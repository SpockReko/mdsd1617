/**
 */
package se.chalmers.cse.mdsd1617.group13.actor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import se.chalmers.cse.mdsd1617.group13.actor.ActorPackage;
import se.chalmers.cse.mdsd1617.group13.actor.Receptionist;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receptionist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.actor.impl.ReceptionistImpl#getIreceptionistprovides <em>Ireceptionistprovides</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.actor.impl.ReceptionistImpl#getIhotelcustomerprovides <em>Ihotelcustomerprovides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceptionistImpl extends UserImpl implements Receptionist {
    /**
     * The cached value of the '{@link #getIreceptionistprovides() <em>Ireceptionistprovides</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getIreceptionistprovides()
     */
    protected IHotelReceptionistProvides ireceptionistprovides;

    /**
     * The cached value of the '{@link #getIhotelcustomerprovides() <em>Ihotelcustomerprovides</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getIhotelcustomerprovides()
     */
    protected IHotelCustomerProvides ihotelcustomerprovides;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected ReceptionistImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActorPackage.Literals.RECEPTIONIST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public IHotelReceptionistProvides getIreceptionistprovides() {
        if (ireceptionistprovides != null && ireceptionistprovides.eIsProxy()) {
            InternalEObject oldIreceptionistprovides = (InternalEObject) ireceptionistprovides;
            ireceptionistprovides = (IHotelReceptionistProvides) eResolveProxy(oldIreceptionistprovides);
            if (ireceptionistprovides != oldIreceptionistprovides) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ActorPackage.RECEPTIONIST__IRECEPTIONISTPROVIDES, oldIreceptionistprovides,
                            ireceptionistprovides));
            }
        }
        return ireceptionistprovides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public IHotelReceptionistProvides basicGetIreceptionistprovides() {
        return ireceptionistprovides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setIreceptionistprovides(IHotelReceptionistProvides newIreceptionistprovides) {
        IHotelReceptionistProvides oldIreceptionistprovides = ireceptionistprovides;
        ireceptionistprovides = newIreceptionistprovides;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActorPackage.RECEPTIONIST__IRECEPTIONISTPROVIDES,
                    oldIreceptionistprovides, ireceptionistprovides));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public IHotelCustomerProvides getIhotelcustomerprovides() {
        if (ihotelcustomerprovides != null && ihotelcustomerprovides.eIsProxy()) {
            InternalEObject oldIhotelcustomerprovides = (InternalEObject) ihotelcustomerprovides;
            ihotelcustomerprovides = (IHotelCustomerProvides) eResolveProxy(oldIhotelcustomerprovides);
            if (ihotelcustomerprovides != oldIhotelcustomerprovides) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ActorPackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES, oldIhotelcustomerprovides,
                            ihotelcustomerprovides));
            }
        }
        return ihotelcustomerprovides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public IHotelCustomerProvides basicGetIhotelcustomerprovides() {
        return ihotelcustomerprovides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setIhotelcustomerprovides(IHotelCustomerProvides newIhotelcustomerprovides) {
        IHotelCustomerProvides oldIhotelcustomerprovides = ihotelcustomerprovides;
        ihotelcustomerprovides = newIhotelcustomerprovides;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActorPackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES,
                    oldIhotelcustomerprovides, ihotelcustomerprovides));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ActorPackage.RECEPTIONIST__IRECEPTIONISTPROVIDES:
                if (resolve) return getIreceptionistprovides();
                return basicGetIreceptionistprovides();
            case ActorPackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES:
                if (resolve) return getIhotelcustomerprovides();
                return basicGetIhotelcustomerprovides();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ActorPackage.RECEPTIONIST__IRECEPTIONISTPROVIDES:
                setIreceptionistprovides((IHotelReceptionistProvides) newValue);
                return;
            case ActorPackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES:
                setIhotelcustomerprovides((IHotelCustomerProvides) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ActorPackage.RECEPTIONIST__IRECEPTIONISTPROVIDES:
                setIreceptionistprovides((IHotelReceptionistProvides) null);
                return;
            case ActorPackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES:
                setIhotelcustomerprovides((IHotelCustomerProvides) null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ActorPackage.RECEPTIONIST__IRECEPTIONISTPROVIDES:
                return ireceptionistprovides != null;
            case ActorPackage.RECEPTIONIST__IHOTELCUSTOMERPROVIDES:
                return ihotelcustomerprovides != null;
        }
        return super.eIsSet(featureID);
    }

} //ReceptionistImpl
