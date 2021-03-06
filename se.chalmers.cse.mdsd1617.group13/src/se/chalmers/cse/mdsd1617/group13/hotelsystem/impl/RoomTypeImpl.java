/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl#getDescription <em>Description</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl#getNumBeds <em>Num Beds</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl#getPricePerNight <em>Price Per Night</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getDescription()
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getDescription()
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getNumBeds() <em>Num Beds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getNumBeds()
     */
    protected static final int NUM_BEDS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumBeds() <em>Num Beds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getNumBeds()
     */
    protected int numBeds = NUM_BEDS_EDEFAULT;

    /**
     * The default value of the '{@link #getPricePerNight() <em>Price Per Night</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPricePerNight()
     */
    protected static final double PRICE_PER_NIGHT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPricePerNight() <em>Price Per Night</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPricePerNight()
     */
    protected double pricePerNight = PRICE_PER_NIGHT_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getName()
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getName()
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected RoomTypeImpl() {
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
        return HotelsystemPackage.Literals.ROOM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_TYPE__DESCRIPTION,
                    oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getNumBeds() {
        return numBeds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setNumBeds(int newNumBeds) {
        int oldNumBeds = numBeds;
        numBeds = newNumBeds;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_TYPE__NUM_BEDS, oldNumBeds,
                    numBeds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public double getPricePerNight() {
        return pricePerNight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setPricePerNight(double newPricePerNight) {
        double oldPricePerNight = pricePerNight;
        pricePerNight = newPricePerNight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_TYPE__PRICE_PER_NIGHT,
                    oldPricePerNight, pricePerNight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM_TYPE__NAME, oldName, name));
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
            case HotelsystemPackage.ROOM_TYPE__DESCRIPTION:
                return getDescription();
            case HotelsystemPackage.ROOM_TYPE__NUM_BEDS:
                return getNumBeds();
            case HotelsystemPackage.ROOM_TYPE__PRICE_PER_NIGHT:
                return getPricePerNight();
            case HotelsystemPackage.ROOM_TYPE__NAME:
                return getName();
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
            case HotelsystemPackage.ROOM_TYPE__DESCRIPTION:
                setDescription((String) newValue);
                return;
            case HotelsystemPackage.ROOM_TYPE__NUM_BEDS:
                setNumBeds((Integer) newValue);
                return;
            case HotelsystemPackage.ROOM_TYPE__PRICE_PER_NIGHT:
                setPricePerNight((Double) newValue);
                return;
            case HotelsystemPackage.ROOM_TYPE__NAME:
                setName((String) newValue);
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
            case HotelsystemPackage.ROOM_TYPE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case HotelsystemPackage.ROOM_TYPE__NUM_BEDS:
                setNumBeds(NUM_BEDS_EDEFAULT);
                return;
            case HotelsystemPackage.ROOM_TYPE__PRICE_PER_NIGHT:
                setPricePerNight(PRICE_PER_NIGHT_EDEFAULT);
                return;
            case HotelsystemPackage.ROOM_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case HotelsystemPackage.ROOM_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case HotelsystemPackage.ROOM_TYPE__NUM_BEDS:
                return numBeds != NUM_BEDS_EDEFAULT;
            case HotelsystemPackage.ROOM_TYPE__PRICE_PER_NIGHT:
                return pricePerNight != PRICE_PER_NIGHT_EDEFAULT;
            case HotelsystemPackage.ROOM_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (description: ");
        result.append(description);
        result.append(", numBeds: ");
        result.append(numBeds);
        result.append(", pricePerNight: ");
        result.append(pricePerNight);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //RoomTypeImpl
