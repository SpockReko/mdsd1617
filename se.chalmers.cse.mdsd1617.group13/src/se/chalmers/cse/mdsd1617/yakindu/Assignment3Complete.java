package se.chalmers.cse.mdsd1617.yakindu;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;

	private final int MAX_ROOMS = 3;
	
	private Room[] roomStatus = new Room[MAX_ROOMS];
	private enum Room{FREE,ASSIGNED,OCCUPIDE};
	
	private Booking[] bookingStatus = new Booking[MAX_ROOMS];
	private enum Booking{CONFIRMED,CHECKEDIN,CHECKEDOUT,PAYED};
	
	/***********************/
	/**** usr interface ****/
	/***********************/
	
	public long initiateBooking() {
		return ++currentBookingId;
	}

	public boolean addRoomToBooking(long bookingId) {
		if (bookingId < 1 || bookingId > currentBookingId) {
			return false;
		} else if (currentReservationNumber >= MAX_ROOMS-1) {
			return false;
		} else {
			++currentReservationNumber;
			return freeRoom((long) currentReservationNumber);
		}
	}
	
	// The methods from booking that triggers everything in the flow diagram.
	public boolean confirmBooking(long bookingId){
		bookingStatus[(int)bookingId] = Booking.CONFIRMED;
		return bookingStatus[(int)bookingId] == Booking.CONFIRMED;
	}
	
	
	public boolean checkInBooking(long bookingId){
		bookingStatus[(int)bookingId] = Booking.CHECKEDIN;
		return bookingStatus[(int)bookingId] == Booking.CHECKEDIN;
	
	}
	
	public boolean initiateCheckout(long bookingId){
		bookingStatus[(int)bookingId] = Booking.CHECKEDOUT;
		return bookingStatus[(int)bookingId] == Booking.CHECKEDOUT;
	}
	
	public boolean payDuringCheckout(long bookingId){
		bookingStatus[(int)bookingId] = Booking.PAYED;
		return bookingStatus[(int)bookingId] == Booking.PAYED;
	}
	
	
	/*************************/
	/**reservation interface**/
	/*************************/
	// Decrease the active reservation number.
	public boolean resolvReservation( long roomId){
		if(currentReservationNumber < 0){
			return false;
		}else{
			--currentReservationNumber;
			return true;
		}
	}
	
	
	// 2 methods that returns the index in the arrays.
	public long getBookingId(){
		return currentBookingId;
	}
	
	public long getRoomId(){
		return currentReservationNumber;
	}
	
	
	// 2 methods that returns the id's.
	public long getCurrentReservationNumber(){
		return currentReservationNumber;
	}
	
	public long getCurrentBookingNumber(){
		return currentBookingId;
	}
	
	
	// 3 methods that change the room state
	public boolean assignRoom(long roomIndex){
		int index = (int) roomIndex;
		roomStatus[index] = Room.ASSIGNED;
		return roomStatus[index] == Room.ASSIGNED;	
	}
	
	public boolean occupiRoom(long roomIndex){
		int index = (int) roomIndex;
		roomStatus[index] = Room.OCCUPIDE;
		return roomStatus[index] == Room.OCCUPIDE;	
	}
	
	public boolean freeRoom(long roomIndex){
		int index = (int) roomIndex;
		roomStatus[index] = Room.FREE;
		return roomStatus[index] == Room.FREE;	
	}
	
	
	// 4 method that checks if the bookings in the right state
	public boolean bookingConfirmed(long bookingId){
		int index = (int) bookingId;
		return bookingStatus[index] == Booking.CONFIRMED;
	}
	
	public boolean bookingCheckedin(long bookingId){
		int index = (int) bookingId;
		return bookingStatus[index] == Booking.CHECKEDIN;
	}
	
	public boolean bookingCheckedout(long bookingId){
		int index = (int) bookingId;
		return bookingStatus[index] == Booking.CHECKEDOUT;
	}
	
	public boolean bookingPayed(long bookingId){
		int index = (int) bookingId;
		return bookingStatus[index] == Booking.PAYED;
	}
	
	
	// 3 methods that checks if the rooms is in the right state
	public boolean checkFreeRoom(long roomId){ 
		int index = (int) roomId;
		return roomStatus[index] == Room.FREE;	
	}
	public boolean checkAssignedRoom(long roomId){
		int index = (int) roomId;
		return roomStatus[index] == Room.ASSIGNED;	
	
	}
	public boolean checkOccupideRoom(long roomId){
		int index = (int) roomId;
		return roomStatus[index] == Room.OCCUPIDE;	
	}
	
	
	/***********************/
	/**** room interface ***/
	/***********************/
	
	// 3 methods that checks the room status.
	public boolean roomAssigned(long roomIndex){	
		int index = (int) roomIndex;
		return roomStatus[index] == Room.ASSIGNED;	
	} 
	public boolean roomOccupide(long roomIndex){	
		int index = (int) roomIndex;
		return roomStatus[index] == Room.OCCUPIDE;	
	}
	public boolean roomFree(long roomIndex){
		int index = (int) roomIndex;
		return roomStatus[index] == Room.FREE;	
	}
	
	
	
}
