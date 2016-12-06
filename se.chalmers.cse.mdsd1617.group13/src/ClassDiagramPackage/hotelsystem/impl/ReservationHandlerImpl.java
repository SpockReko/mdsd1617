/**
 */
package ClassDiagramPackage.hotelsystem.impl;

import ClassDiagramPackage.hotelsystem.HotelsystemPackage;
import ClassDiagramPackage.hotelsystem.IRoomHandler;
import ClassDiagramPackage.hotelsystem.PaymentHandler;
import ClassDiagramPackage.hotelsystem.Reservation;
import ClassDiagramPackage.hotelsystem.ReservationHandler;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.impl.ReservationHandlerImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.impl.ReservationHandlerImpl#getPaymenthandler <em>Paymenthandler</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.impl.ReservationHandlerImpl#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.impl.ReservationHandlerImpl#getCurrentReservationId <em>Current Reservation Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationHandlerImpl extends MinimalEObjectImpl.Container implements ReservationHandler {
	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> reservation;

	/**
	 * The cached value of the '{@link #getPaymenthandler() <em>Paymenthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymenthandler()
	 * @generated
	 * @ordered
	 */
	protected PaymentHandler paymenthandler;

	/**
	 * The cached value of the '{@link #getRoomhandler() <em>Roomhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomhandler()
	 * @generated
	 * @ordered
	 */
	protected IRoomHandler roomhandler;

	/**
	 * The default value of the '{@link #getCurrentReservationId() <em>Current Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentReservationId()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_RESERVATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentReservationId() <em>Current Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentReservationId()
	 * @generated
	 * @ordered
	 */
	protected int currentReservationId = CURRENT_RESERVATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelsystemPackage.Literals.RESERVATION_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getReservation() {
		if (reservation == null) {
			reservation = new EObjectResolvingEList<Reservation>(Reservation.class, this, HotelsystemPackage.RESERVATION_HANDLER__RESERVATION);
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler getPaymenthandler() {
		if (paymenthandler != null && paymenthandler.eIsProxy()) {
			InternalEObject oldPaymenthandler = (InternalEObject)paymenthandler;
			paymenthandler = (PaymentHandler)eResolveProxy(oldPaymenthandler);
			if (paymenthandler != oldPaymenthandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.RESERVATION_HANDLER__PAYMENTHANDLER, oldPaymenthandler, paymenthandler));
			}
		}
		return paymenthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler basicGetPaymenthandler() {
		return paymenthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymenthandler(PaymentHandler newPaymenthandler) {
		PaymentHandler oldPaymenthandler = paymenthandler;
		paymenthandler = newPaymenthandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.RESERVATION_HANDLER__PAYMENTHANDLER, oldPaymenthandler, paymenthandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomHandler getRoomhandler() {
		if (roomhandler != null && roomhandler.eIsProxy()) {
			InternalEObject oldRoomhandler = (InternalEObject)roomhandler;
			roomhandler = (IRoomHandler)eResolveProxy(oldRoomhandler);
			if (roomhandler != oldRoomhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.RESERVATION_HANDLER__ROOMHANDLER, oldRoomhandler, roomhandler));
			}
		}
		return roomhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomHandler basicGetRoomhandler() {
		return roomhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomhandler(IRoomHandler newRoomhandler) {
		IRoomHandler oldRoomhandler = roomhandler;
		roomhandler = newRoomhandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.RESERVATION_HANDLER__ROOMHANDLER, oldRoomhandler, roomhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentReservationId() {
		return currentReservationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentReservationId(int newCurrentReservationId) {
		int oldCurrentReservationId = currentReservationId;
		currentReservationId = newCurrentReservationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.RESERVATION_HANDLER__CURRENT_RESERVATION_ID, oldCurrentReservationId, currentReservationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editReservation(int reservationId, String firstName, String lastName, String startDate, String endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addRoomTypeToReservation(int reservationId, String roomType, int numberOfRoomsForType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeRoomTypeFromReservation(int reservationId, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean editRoomType(int reservationId, String roomType, int numberOfRoomsForType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void listFreeRooms(int reservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList checkIn(int reservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean cancelReservation(int reservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList listReservations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList listOccupiedRooms(String date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList listCheckins(String startDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList listCheckouts(String startDate, String endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addExtraToRoom(int reservationId, int roomNumber, String extraDescription, int price) {
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
			case HotelsystemPackage.RESERVATION_HANDLER__RESERVATION:
				return getReservation();
			case HotelsystemPackage.RESERVATION_HANDLER__PAYMENTHANDLER:
				if (resolve) return getPaymenthandler();
				return basicGetPaymenthandler();
			case HotelsystemPackage.RESERVATION_HANDLER__ROOMHANDLER:
				if (resolve) return getRoomhandler();
				return basicGetRoomhandler();
			case HotelsystemPackage.RESERVATION_HANDLER__CURRENT_RESERVATION_ID:
				return getCurrentReservationId();
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
			case HotelsystemPackage.RESERVATION_HANDLER__RESERVATION:
				getReservation().clear();
				getReservation().addAll((Collection<? extends Reservation>)newValue);
				return;
			case HotelsystemPackage.RESERVATION_HANDLER__PAYMENTHANDLER:
				setPaymenthandler((PaymentHandler)newValue);
				return;
			case HotelsystemPackage.RESERVATION_HANDLER__ROOMHANDLER:
				setRoomhandler((IRoomHandler)newValue);
				return;
			case HotelsystemPackage.RESERVATION_HANDLER__CURRENT_RESERVATION_ID:
				setCurrentReservationId((Integer)newValue);
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
			case HotelsystemPackage.RESERVATION_HANDLER__RESERVATION:
				getReservation().clear();
				return;
			case HotelsystemPackage.RESERVATION_HANDLER__PAYMENTHANDLER:
				setPaymenthandler((PaymentHandler)null);
				return;
			case HotelsystemPackage.RESERVATION_HANDLER__ROOMHANDLER:
				setRoomhandler((IRoomHandler)null);
				return;
			case HotelsystemPackage.RESERVATION_HANDLER__CURRENT_RESERVATION_ID:
				setCurrentReservationId(CURRENT_RESERVATION_ID_EDEFAULT);
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
			case HotelsystemPackage.RESERVATION_HANDLER__RESERVATION:
				return reservation != null && !reservation.isEmpty();
			case HotelsystemPackage.RESERVATION_HANDLER__PAYMENTHANDLER:
				return paymenthandler != null;
			case HotelsystemPackage.RESERVATION_HANDLER__ROOMHANDLER:
				return roomhandler != null;
			case HotelsystemPackage.RESERVATION_HANDLER__CURRENT_RESERVATION_ID:
				return currentReservationId != CURRENT_RESERVATION_ID_EDEFAULT;
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
			case HotelsystemPackage.RESERVATION_HANDLER___EDIT_RESERVATION__INT_STRING_STRING_STRING_STRING:
				editReservation((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
				return null;
			case HotelsystemPackage.RESERVATION_HANDLER___ADD_ROOM_TYPE_TO_RESERVATION__INT_STRING_INT:
				return addRoomTypeToReservation((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case HotelsystemPackage.RESERVATION_HANDLER___REMOVE_ROOM_TYPE_FROM_RESERVATION__INT_STRING:
				return removeRoomTypeFromReservation((Integer)arguments.get(0), (String)arguments.get(1));
			case HotelsystemPackage.RESERVATION_HANDLER___EDIT_ROOM_TYPE__INT_STRING_INT:
				return editRoomType((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case HotelsystemPackage.RESERVATION_HANDLER___LIST_FREE_ROOMS__INT:
				listFreeRooms((Integer)arguments.get(0));
				return null;
			case HotelsystemPackage.RESERVATION_HANDLER___CHECK_IN__INT:
				return checkIn((Integer)arguments.get(0));
			case HotelsystemPackage.RESERVATION_HANDLER___CANCEL_RESERVATION__INT:
				return cancelReservation((Integer)arguments.get(0));
			case HotelsystemPackage.RESERVATION_HANDLER___LIST_RESERVATIONS:
				return listReservations();
			case HotelsystemPackage.RESERVATION_HANDLER___LIST_OCCUPIED_ROOMS__STRING:
				return listOccupiedRooms((String)arguments.get(0));
			case HotelsystemPackage.RESERVATION_HANDLER___LIST_CHECKINS__STRING:
				return listCheckins((String)arguments.get(0));
			case HotelsystemPackage.RESERVATION_HANDLER___LIST_CHECKOUTS__STRING_STRING:
				return listCheckouts((String)arguments.get(0), (String)arguments.get(1));
			case HotelsystemPackage.RESERVATION_HANDLER___ADD_EXTRA_TO_ROOM__INT_INT_STRING_INT:
				return addExtraToRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
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
		result.append(" (currentReservationId: ");
		result.append(currentReservationId);
		result.append(')');
		return result.toString();
	}

} //ReservationHandlerImpl
