/**
 */
package se.chalmers.cse.mdsd1617.group13.z.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1617.group13.z.Bill;
import se.chalmers.cse.mdsd1617.group13.z.RoomReservation;
import se.chalmers.cse.mdsd1617.group13.z.ZPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.impl.BillImpl#getRoomreservation <em>Roomreservation</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.impl.BillImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.z.impl.BillImpl#getBillID <em>Bill ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
	/**
	 * The cached value of the '{@link #getRoomreservation() <em>Roomreservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomreservation()
	 * @generated
	 * @ordered
	 */
	protected RoomReservation roomreservation;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillID() <em>Bill ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillID()
	 * @generated
	 * @ordered
	 */
	protected static final int BILL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBillID() <em>Bill ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillID()
	 * @generated
	 * @ordered
	 */
	protected int billID = BILL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZPackage.Literals.BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservation getRoomreservation() {
		if (roomreservation != null && roomreservation.eIsProxy()) {
			InternalEObject oldRoomreservation = (InternalEObject)roomreservation;
			roomreservation = (RoomReservation)eResolveProxy(oldRoomreservation);
			if (roomreservation != oldRoomreservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZPackage.BILL__ROOMRESERVATION, oldRoomreservation, roomreservation));
			}
		}
		return roomreservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservation basicGetRoomreservation() {
		return roomreservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomreservation(RoomReservation newRoomreservation) {
		RoomReservation oldRoomreservation = roomreservation;
		roomreservation = newRoomreservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZPackage.BILL__ROOMRESERVATION, oldRoomreservation, roomreservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZPackage.BILL__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBillID() {
		return billID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillID(int newBillID) {
		int oldBillID = billID;
		billID = newBillID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZPackage.BILL__BILL_ID, oldBillID, billID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZPackage.BILL__ROOMRESERVATION:
				if (resolve) return getRoomreservation();
				return basicGetRoomreservation();
			case ZPackage.BILL__PRICE:
				return getPrice();
			case ZPackage.BILL__BILL_ID:
				return getBillID();
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
			case ZPackage.BILL__ROOMRESERVATION:
				setRoomreservation((RoomReservation)newValue);
				return;
			case ZPackage.BILL__PRICE:
				setPrice((Double)newValue);
				return;
			case ZPackage.BILL__BILL_ID:
				setBillID((Integer)newValue);
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
			case ZPackage.BILL__ROOMRESERVATION:
				setRoomreservation((RoomReservation)null);
				return;
			case ZPackage.BILL__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ZPackage.BILL__BILL_ID:
				setBillID(BILL_ID_EDEFAULT);
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
			case ZPackage.BILL__ROOMRESERVATION:
				return roomreservation != null;
			case ZPackage.BILL__PRICE:
				return price != PRICE_EDEFAULT;
			case ZPackage.BILL__BILL_ID:
				return billID != BILL_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
