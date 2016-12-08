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
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl#getIadminroomprovides <em>Iadminroomprovides</em>}</li>
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
	 * The cached value of the '{@link #getIadminroomprovides() <em>Iadminroomprovides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIadminroomprovides()
	 * @generated
	 * @ordered
	 */
	protected EList<IAdminRoomProvides> iadminroomprovides;

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
	public EList<IAdminRoomProvides> getIadminroomprovides() {
		if (iadminroomprovides == null) {
			iadminroomprovides = new EObjectResolvingEList<IAdminRoomProvides>(IAdminRoomProvides.class, this, HotelsystemPackage.ROOM_HANDLER__IADMINROOMPROVIDES);
		}
		return iadminroomprovides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getAllRoomTypes() {
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
			case HotelsystemPackage.ROOM_HANDLER__IADMINROOMPROVIDES:
				return getIadminroomprovides();
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
			case HotelsystemPackage.ROOM_HANDLER__IADMINROOMPROVIDES:
				getIadminroomprovides().clear();
				getIadminroomprovides().addAll((Collection<? extends IAdminRoomProvides>)newValue);
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
			case HotelsystemPackage.ROOM_HANDLER__IADMINROOMPROVIDES:
				getIadminroomprovides().clear();
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
			case HotelsystemPackage.ROOM_HANDLER__IADMINROOMPROVIDES:
				return iadminroomprovides != null && !iadminroomprovides.isEmpty();
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
			case HotelsystemPackage.ROOM_HANDLER___GET_ALL_ROOM_TYPES:
				return getAllRoomTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomHandlerImpl
