/**
 */
package ClassDiagramPackage.hotelsystem.impl;

import ClassDiagramPackage.hotelsystem.Bill;
import ClassDiagramPackage.hotelsystem.HotelsystemPackage;
import ClassDiagramPackage.hotelsystem.RoomReservation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.impl.BillImpl#getRoomreservation <em>Roomreservation</em>}</li>
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
		return HotelsystemPackage.Literals.BILL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.BILL__ROOMRESERVATION, oldRoomreservation, roomreservation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BILL__ROOMRESERVATION, oldRoomreservation, roomreservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelsystemPackage.BILL__ROOMRESERVATION:
				if (resolve) return getRoomreservation();
				return basicGetRoomreservation();
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
			case HotelsystemPackage.BILL__ROOMRESERVATION:
				setRoomreservation((RoomReservation)newValue);
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
			case HotelsystemPackage.BILL__ROOMRESERVATION:
				setRoomreservation((RoomReservation)null);
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
			case HotelsystemPackage.BILL__ROOMRESERVATION:
				return roomreservation != null;
		}
		return super.eIsSet(featureID);
	}

} //BillImpl
