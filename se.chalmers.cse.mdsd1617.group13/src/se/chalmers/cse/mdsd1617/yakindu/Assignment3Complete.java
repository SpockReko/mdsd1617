package se.chalmers.cse.mdsd1617.yakindu;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = -1;
	private long currentRoomId = -1;
	
	private long currentSelectedBookingId = -1;
	private long currentSelectedReservationId = -1;

	private final int MAX_ROOMS = 2;

	public long initiateBooking() {
		return ++currentBookingId;
	}
	
	// Add a reservation to the booking.
	// Returns false if the reservations exceeds the current max rooms
	public boolean addRoomToBooking(long bookingId) {
		if (bookingId < 1 || bookingId > currentBookingId) {
			return false;
		} else if (currentReservationNumber >= (MAX_ROOMS-1)) {
			return false;
		} else {
			currentSelectedBookingId = bookingId;
			++currentReservationNumber;
			return true;
		}
	}
	
	// Marks what the current reservation is
	// Helps to connect a reservation to a room
	public boolean addReservationToRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		++currentRoomId;
		return true;
	}
	
	// Confirms the booking
	// TO-DO: return false if there is no added room to the booking
	public boolean confirmBooking(long bookingId) {
		currentSelectedBookingId = bookingId;
		return true;
	}
	
	// Checks in the booking
	public boolean checkInBooking(long bookingId) {
		currentSelectedBookingId = bookingId;
		return true;
	}
	
	// Initiate a checkout of the room (booking)
	public boolean initiateCheckout(long bookingId) {
		currentSelectedBookingId = bookingId;
		return true;
	}
	
	// The finish state that end the booking with payment 
	public boolean payDuringCheckout(long bookingId) {
		currentSelectedBookingId = bookingId;
		return true;
	}
	
	// Assign a room to its reservation
	public boolean assignRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		return true;
	}
	
	// Mark the room as occupied. Happens when you checks in the booking
	public boolean occupiedRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		return true;
	}
	
	// Mark the room as free. Happens when you check out the booking
	public boolean freeRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		return true;
	}
	
	// Mark the room as free. Happens when pay during checkout
	public boolean endReservationRoom(long reservationId) {
		currentSelectedReservationId = reservationId;
		return true;
	}
	
	// Get the current selected bookingId
	public long getCurrentSelectedBookingId() {
		return currentSelectedBookingId;
	}
	
	// Get the current selected reservationId
	public long currentSelectedReservationId() {
		return currentSelectedReservationId;
	}
	
	// Get the up-most reservationId
	public long getCurrentReservationNumber() {
		return currentReservationNumber;
	}
	
	// Get the up-most roomId
	public long getCurrentRoomId() {
		return currentRoomId;
	}
	
}
