/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl#getRoomreservation <em>Roomreservation</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl#getPrice <em>Price</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BillImpl#getBillID <em>Bill ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
    /**
     * The cached value of the '{@link #getRoomreservation() <em>Roomreservation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getRoomreservation()
     */
    protected RoomReservation roomreservation;

    /**
     * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPrice()
     */
    protected static final double PRICE_EDEFAULT = 0.0;
    /**
     * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPrice()
     */
    protected double price = PRICE_EDEFAULT;

    /**
     * The default value of the '{@link #getBillID() <em>Bill ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getBillID()
     */
    protected static final int BILL_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getBillID() <em>Bill ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getBillID()
     */
    protected int billID = BILL_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BillImpl() {
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
        return HotelsystemPackage.Literals.BILL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public RoomReservation getRoomreservation() {
        if (roomreservation != null && roomreservation.eIsProxy()) {
            InternalEObject oldRoomreservation = (InternalEObject) roomreservation;
            roomreservation = (RoomReservation) eResolveProxy(oldRoomreservation);
            if (roomreservation != oldRoomreservation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.BILL__ROOMRESERVATION,
                            oldRoomreservation, roomreservation));
            }
        }
        return roomreservation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public RoomReservation basicGetRoomreservation() {
        return roomreservation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setRoomreservation(RoomReservation newRoomreservation) {
        RoomReservation oldRoomreservation = roomreservation;
        roomreservation = newRoomreservation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BILL__ROOMRESERVATION,
                    oldRoomreservation, roomreservation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public double getPrice() {
        return price;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setPrice(double newPrice) {
        double oldPrice = price;
        price = newPrice;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BILL__PRICE, oldPrice, price));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getBillID() {
        return billID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setBillID(int newBillID) {
        int oldBillID = billID;
        billID = newBillID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BILL__BILL_ID, oldBillID, billID));
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
            case HotelsystemPackage.BILL__ROOMRESERVATION:
                if (resolve) return getRoomreservation();
                return basicGetRoomreservation();
            case HotelsystemPackage.BILL__PRICE:
                return getPrice();
            case HotelsystemPackage.BILL__BILL_ID:
                return getBillID();
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
            case HotelsystemPackage.BILL__ROOMRESERVATION:
                setRoomreservation((RoomReservation) newValue);
                return;
            case HotelsystemPackage.BILL__PRICE:
                setPrice((Double) newValue);
                return;
            case HotelsystemPackage.BILL__BILL_ID:
                setBillID((Integer) newValue);
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
            case HotelsystemPackage.BILL__ROOMRESERVATION:
                setRoomreservation((RoomReservation) null);
                return;
            case HotelsystemPackage.BILL__PRICE:
                setPrice(PRICE_EDEFAULT);
                return;
            case HotelsystemPackage.BILL__BILL_ID:
                setBillID(BILL_ID_EDEFAULT);
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
            case HotelsystemPackage.BILL__ROOMRESERVATION:
                return roomreservation != null;
            case HotelsystemPackage.BILL__PRICE:
                return price != PRICE_EDEFAULT;
            case HotelsystemPackage.BILL__BILL_ID:
                return billID != BILL_ID_EDEFAULT;
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
        result.append(" (price: ");
        result.append(price);
        result.append(", billID: ");
        result.append(billID);
        result.append(')');
        return result.toString();
    }

} //BillImpl
