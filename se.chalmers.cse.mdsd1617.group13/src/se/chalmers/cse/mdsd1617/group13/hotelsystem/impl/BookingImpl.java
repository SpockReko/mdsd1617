/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import se.chalmers.cse.mdsd1617.group13.hotelsystem.Bill;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Customer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Room;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl#getRoomReservation <em>Room Reservation</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl#isCanceled <em>Canceled</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingImpl#getBills <em>Bills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getRoomReservation() <em>Room Reservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomReservation()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomReservation> roomReservation;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanceled() <em>Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanceled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCELED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanceled() <em>Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanceled()
	 * @generated
	 * @ordered
	 */
	protected boolean canceled = CANCELED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected int bookingId = BOOKING_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBills() <em>Bills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBills()
	 * @generated
	 * @ordered
	 */
	protected EList<Bill> bills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelsystemPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelsystemPackage.BOOKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomReservation> getRoomReservation() {
		if (roomReservation == null) {
			roomReservation = new EObjectResolvingEList<RoomReservation>(RoomReservation.class, this, HotelsystemPackage.BOOKING__ROOM_RESERVATION);
		}
		return roomReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BOOKING__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BOOKING__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanceled() {
		return canceled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanceled(boolean newCanceled) {
		boolean oldCanceled = canceled;
		canceled = newCanceled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BOOKING__CANCELED, oldCanceled, canceled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingId(int newBookingId) {
		int oldBookingId = bookingId;
		bookingId = newBookingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelsystemPackage.BOOKING__BOOKING_ID, oldBookingId, bookingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bill> getBills() {
		if (bills == null) {
			bills = new EObjectResolvingEList<Bill>(Bill.class, this, HotelsystemPackage.BOOKING__BILLS);
		}
		return bills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getOccupiedRooms(String date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double checkOut() {
		double price = 0;
		for(RoomReservation roomReservation : this.roomReservation) {
			price += roomReservation.checkOut(nrOfNights());
		}
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int nrOfNights() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkIn(int roomNumber) {
		for (RoomReservation rr : roomReservation) {
			if (rr.getRoomId() == roomNumber) {
				rr.checkIn();
				return true;
			}
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBookingPrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRoomPrice(int roomNumber) {
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
			case HotelsystemPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case HotelsystemPackage.BOOKING__ROOM_RESERVATION:
				return getRoomReservation();
			case HotelsystemPackage.BOOKING__START_DATE:
				return getStartDate();
			case HotelsystemPackage.BOOKING__END_DATE:
				return getEndDate();
			case HotelsystemPackage.BOOKING__CANCELED:
				return isCanceled();
			case HotelsystemPackage.BOOKING__BOOKING_ID:
				return getBookingId();
			case HotelsystemPackage.BOOKING__BILLS:
				return getBills();
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
			case HotelsystemPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case HotelsystemPackage.BOOKING__ROOM_RESERVATION:
				getRoomReservation().clear();
				getRoomReservation().addAll((Collection<? extends RoomReservation>)newValue);
				return;
			case HotelsystemPackage.BOOKING__START_DATE:
				setStartDate((String)newValue);
				return;
			case HotelsystemPackage.BOOKING__END_DATE:
				setEndDate((String)newValue);
				return;
			case HotelsystemPackage.BOOKING__CANCELED:
				setCanceled((Boolean)newValue);
				return;
			case HotelsystemPackage.BOOKING__BOOKING_ID:
				setBookingId((Integer)newValue);
				return;
			case HotelsystemPackage.BOOKING__BILLS:
				getBills().clear();
				getBills().addAll((Collection<? extends Bill>)newValue);
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
			case HotelsystemPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case HotelsystemPackage.BOOKING__ROOM_RESERVATION:
				getRoomReservation().clear();
				return;
			case HotelsystemPackage.BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case HotelsystemPackage.BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case HotelsystemPackage.BOOKING__CANCELED:
				setCanceled(CANCELED_EDEFAULT);
				return;
			case HotelsystemPackage.BOOKING__BOOKING_ID:
				setBookingId(BOOKING_ID_EDEFAULT);
				return;
			case HotelsystemPackage.BOOKING__BILLS:
				getBills().clear();
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
			case HotelsystemPackage.BOOKING__CUSTOMER:
				return customer != null;
			case HotelsystemPackage.BOOKING__ROOM_RESERVATION:
				return roomReservation != null && !roomReservation.isEmpty();
			case HotelsystemPackage.BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case HotelsystemPackage.BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case HotelsystemPackage.BOOKING__CANCELED:
				return canceled != CANCELED_EDEFAULT;
			case HotelsystemPackage.BOOKING__BOOKING_ID:
				return bookingId != BOOKING_ID_EDEFAULT;
			case HotelsystemPackage.BOOKING__BILLS:
				return bills != null && !bills.isEmpty();
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
			case HotelsystemPackage.BOOKING___CANCEL:
				cancel();
				return null;
			case HotelsystemPackage.BOOKING___GET_OCCUPIED_ROOMS__STRING:
				return getOccupiedRooms((String)arguments.get(0));
			case HotelsystemPackage.BOOKING___CHECK_OUT:
				return checkOut();
			case HotelsystemPackage.BOOKING___NR_OF_NIGHTS:
				return nrOfNights();
			case HotelsystemPackage.BOOKING___IS_CHECKED_IN:
				return isCheckedIn();
			case HotelsystemPackage.BOOKING___CHECK_IN__INT:
				return checkIn((Integer)arguments.get(0));
			case HotelsystemPackage.BOOKING___GET_BOOKING_PRICE:
				return getBookingPrice();
			case HotelsystemPackage.BOOKING___GET_ROOM_PRICE__INT:
				return getRoomPrice((Integer)arguments.get(0));
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", canceled: ");
		result.append(canceled);
		result.append(", bookingId: ");
		result.append(bookingId);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
