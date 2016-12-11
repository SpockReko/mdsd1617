/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IAdminRoomProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelAdministratorProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl#getIadminroomtypeprovides <em>Iadminroomtypeprovides</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomHandlerImpl extends MinimalEObjectImpl.Container implements RoomHandler {
	/**
	 * The cached value of the '{@link #getIadminroomtypeprovides() <em>Iadminroomtypeprovides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIadminroomtypeprovides()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> iadminroomtypeprovides;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<IAdminRoomProvides> rooms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelsystemPackage.Literals.ROOM_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getIadminroomtypeprovides() {
		if (iadminroomtypeprovides == null) {
			iadminroomtypeprovides = new EObjectResolvingEList<RoomType>(RoomType.class, this, HotelsystemPackage.ROOM_HANDLER__IADMINROOMTYPEPROVIDES);
		}
		return iadminroomtypeprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IAdminRoomProvides> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<IAdminRoomProvides>(IAdminRoomProvides.class, this, HotelsystemPackage.ROOM_HANDLER__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getAllRoomTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int countFreeRoom(RoomType roomtype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoomType(String roomType, double price, int nbrOfBeds, String features) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editRoomType(String roomType, double price, int nbrOfBeds, String features) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoomType(String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean changeRoomType(int roomNumber, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoom(int roomNumber, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean blockRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean unblockRoom(int roomNumber) {
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
			case HotelsystemPackage.ROOM_HANDLER__IADMINROOMTYPEPROVIDES:
				return getIadminroomtypeprovides();
			case HotelsystemPackage.ROOM_HANDLER__ROOMS:
				return getRooms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelsystemPackage.ROOM_HANDLER__IADMINROOMTYPEPROVIDES:
				getIadminroomtypeprovides().clear();
				getIadminroomtypeprovides().addAll((Collection<? extends RoomType>)newValue);
				return;
			case HotelsystemPackage.ROOM_HANDLER__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends IAdminRoomProvides>)newValue);
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
			case HotelsystemPackage.ROOM_HANDLER__IADMINROOMTYPEPROVIDES:
				getIadminroomtypeprovides().clear();
				return;
			case HotelsystemPackage.ROOM_HANDLER__ROOMS:
				getRooms().clear();
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
			case HotelsystemPackage.ROOM_HANDLER__IADMINROOMTYPEPROVIDES:
				return iadminroomtypeprovides != null && !iadminroomtypeprovides.isEmpty();
			case HotelsystemPackage.ROOM_HANDLER__ROOMS:
				return rooms != null && !rooms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IHotelAdministratorProvides.class) {
			switch (baseOperationID) {
				case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING: return HotelsystemPackage.ROOM_HANDLER___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING;
				case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING: return HotelsystemPackage.ROOM_HANDLER___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING;
				case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM_TYPE__STRING: return HotelsystemPackage.ROOM_HANDLER___REMOVE_ROOM_TYPE__STRING;
				case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___CHANGE_ROOM_TYPE__INT_STRING: return HotelsystemPackage.ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING;
				case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM__INT_STRING: return HotelsystemPackage.ROOM_HANDLER___ADD_ROOM__INT_STRING;
				case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM__INT: return HotelsystemPackage.ROOM_HANDLER___REMOVE_ROOM__INT;
				case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___BLOCK_ROOM__INT: return HotelsystemPackage.ROOM_HANDLER___BLOCK_ROOM__INT;
				case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___UNBLOCK_ROOM__INT: return HotelsystemPackage.ROOM_HANDLER___UNBLOCK_ROOM__INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelsystemPackage.ROOM_HANDLER___GET_ALL_ROOM_TYPES:
				return getAllRoomTypes();
			case HotelsystemPackage.ROOM_HANDLER___COUNT_FREE_ROOM__ROOMTYPE:
				return countFreeRoom((RoomType)arguments.get(0));
			case HotelsystemPackage.ROOM_HANDLER___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING:
				return addRoomType((String)arguments.get(0), (Double)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
			case HotelsystemPackage.ROOM_HANDLER___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING:
				return editRoomType((String)arguments.get(0), (Double)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
			case HotelsystemPackage.ROOM_HANDLER___REMOVE_ROOM_TYPE__STRING:
				return removeRoomType((String)arguments.get(0));
			case HotelsystemPackage.ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING:
				return changeRoomType((Integer)arguments.get(0), (String)arguments.get(1));
			case HotelsystemPackage.ROOM_HANDLER___ADD_ROOM__INT_STRING:
				return addRoom((Integer)arguments.get(0), (String)arguments.get(1));
			case HotelsystemPackage.ROOM_HANDLER___REMOVE_ROOM__INT:
				return removeRoom((Integer)arguments.get(0));
			case HotelsystemPackage.ROOM_HANDLER___BLOCK_ROOM__INT:
				return blockRoom((Integer)arguments.get(0));
			case HotelsystemPackage.ROOM_HANDLER___UNBLOCK_ROOM__INT:
				return unblockRoom((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomHandlerImpl
