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

import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Room;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl#isOccupied <em>Occupied</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl#isBlocked <em>Blocked</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomImpl#getRoomId <em>Room Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #isOccupied() <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccupied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OCCUPIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOccupied() <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccupied()
	 * @generated
	 * @ordered
	 */
	protected boolean occupied = OCCUPIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomtype;

	/**
	 * The default value of the '{@link #isBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean blocked = BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomId() <em>Room Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomId()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomId() <em>Room Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomId()
	 * @generated
	 * @ordered
	 */
	protected int roomId = ROOM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelsystemPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOccupied() {
		return occupied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupied(boolean newOccupied) {
		boolean oldOccupied = occupied;
		occupied = newOccupied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM__OCCUPIED, oldOccupied, occupied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomtype() {
		if (roomtype != null && roomtype.eIsProxy()) {
			InternalEObject oldRoomtype = (InternalEObject)roomtype;
			roomtype = (RoomType)eResolveProxy(oldRoomtype);
			if (roomtype != oldRoomtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.ROOM__ROOMTYPE, oldRoomtype, roomtype));
			}
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomtype() {
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtype(RoomType newRoomtype) {
		RoomType oldRoomtype = roomtype;
		roomtype = newRoomtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM__ROOMTYPE, oldRoomtype, roomtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlocked() {
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocked(boolean newBlocked) {
		boolean oldBlocked = blocked;
		blocked = newBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM__BLOCKED, oldBlocked, blocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomId(int newRoomId) {
		int oldRoomId = roomId;
		roomId = newRoomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.ROOM__ROOM_ID, oldRoomId, roomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasRoomType(RoomType room) {
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
			case HotelsystemPackage.ROOM__OCCUPIED:
				return isOccupied();
			case HotelsystemPackage.ROOM__ROOMTYPE:
				if (resolve) return getRoomtype();
				return basicGetRoomtype();
			case HotelsystemPackage.ROOM__BLOCKED:
				return isBlocked();
			case HotelsystemPackage.ROOM__ROOM_ID:
				return getRoomId();
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
			case HotelsystemPackage.ROOM__OCCUPIED:
				setOccupied((Boolean)newValue);
				return;
			case HotelsystemPackage.ROOM__ROOMTYPE:
				setRoomtype((RoomType)newValue);
				return;
			case HotelsystemPackage.ROOM__BLOCKED:
				setBlocked((Boolean)newValue);
				return;
			case HotelsystemPackage.ROOM__ROOM_ID:
				setRoomId((Integer)newValue);
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
			case HotelsystemPackage.ROOM__OCCUPIED:
				setOccupied(OCCUPIED_EDEFAULT);
				return;
			case HotelsystemPackage.ROOM__ROOMTYPE:
				setRoomtype((RoomType)null);
				return;
			case HotelsystemPackage.ROOM__BLOCKED:
				setBlocked(BLOCKED_EDEFAULT);
				return;
			case HotelsystemPackage.ROOM__ROOM_ID:
				setRoomId(ROOM_ID_EDEFAULT);
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
			case HotelsystemPackage.ROOM__OCCUPIED:
				return occupied != OCCUPIED_EDEFAULT;
			case HotelsystemPackage.ROOM__ROOMTYPE:
				return roomtype != null;
			case HotelsystemPackage.ROOM__BLOCKED:
				return blocked != BLOCKED_EDEFAULT;
			case HotelsystemPackage.ROOM__ROOM_ID:
				return roomId != ROOM_ID_EDEFAULT;
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
			case HotelsystemPackage.ROOM___HAS_ROOM_TYPE__ROOMTYPE:
				return hasRoomType((RoomType)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (occupied: ");
		result.append(occupied);
		result.append(", blocked: ");
		result.append(blocked);
		result.append(", roomId: ");
		result.append(roomId);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
