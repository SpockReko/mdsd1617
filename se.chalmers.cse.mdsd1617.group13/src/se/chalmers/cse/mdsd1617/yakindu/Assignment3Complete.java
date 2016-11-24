package se.chalmers.cse.mdsd1617.yakindu;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = -1;
	private long currentRoomId = -1;
	
	private long currentSelectedBookingId = -1;
	private long currentSelectedReservationId = -1;
	

	private final int MAX_ROOMS = 2;

	private Booking[] bookings = new Booking[MAX_ROOMS];

	public long initiateBooking() {
		++currentBookingId;
		bookings[(int) currentBookingId] = new Booking((int)MAX_ROOMS);
		return currentBookingId;
	}
	
	public boolean addRoomToBooking(long bookingId) {
		if (bookingId < 1 || bookingId > currentBookingId) {
			return false;
		} else if (currentReservationNumber >= MAX_ROOMS) {
			return false;
		} else {
			currentSelectedBookingId = bookingId;
			++currentReservationNumber;
			Reservation reservation = new Reservation(currentReservationNumber);
			bookings[(int)bookingId].addReservation(reservation);
			return true;
		}
	}
	
	public boolean addReservationToRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		++currentRoomId;
		return true;
	}
	
	public boolean confirmBooking(long bookingId) {
		currentSelectedBookingId = bookingId;
		return true;
	}
	
	public boolean checkInBooking(long bookingId) {
		currentSelectedBookingId = bookingId;
		return true;
	}
	
	public boolean initiateCheckout(long bookingId) {
		currentSelectedBookingId = bookingId;
		return true;
	}
	
	public boolean payDuringCheckout(long bookingId) {
		currentSelectedBookingId = bookingId;
		return true;
	}
	
	public boolean assignRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		return true;
	}
	
	public boolean occupiedRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		return true;
	}
	
	public boolean freeRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		return true;
	}
	
	public boolean endReservationRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		return true;
	}
	
	public long getCurrentSelectedBookingId() {
		return currentSelectedBookingId;
	}
	
	public long currentSelectedReservationId() {
		return currentSelectedReservationId;
	}
	
	public long getCurrentReservationNumber() {
		return currentReservationNumber;
	}
	
	public long getCurrentRoomId() {
		return currentRoomId;
	}
	
	public boolean checkInOneReservation(long bookingId) {
		currentSelectedReservationId = bookings[(int)bookingId].checkInReservation();
		return currentSelectedReservationId != (-1);
	}
	
	public boolean initiateCheckoutReservation(long bookingId) {
		currentSelectedReservationId = bookings[(int)bookingId].checkOutReservation();
		return currentSelectedReservationId != (-1);
	}
	
	public boolean payDuringCheckoutReservation(long bookingId) {
		currentSelectedReservationId = bookings[(int)bookingId].payForReservation();
		return currentSelectedReservationId != (-1);
	}
	
	
}
