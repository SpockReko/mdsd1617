package se.chalmers.cse.mdsd1617.yakindu;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;

	private final int MAX_ROOMS = 2;
	
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
		} else if (currentReservationNumber >= MAX_ROOMS) {
			return false;
		} else {
			++currentReservationNumber;
			return true;
		}
	}
	
	
	
	public boolean confirmBooking(long bookingId){
		bookingStatus[(int)bookingId] = Booking.CONFIRMED;
		return bookingStatus[(int)bookingId] == Booking.CONFIRMED;
	}
	
	/*
	public boolean checkInBooking(long bookingId){
		return false;
	}
	
	public boolean initiateCheckout(long bookingId){
		return false;
	}
	
	public boolean payDurningCheckout(long bookingId){
		return false;
	}
	
	*/
	/*************************/
	/**reservation interface**/
	/*************************/
	
	public long getBookingId(){
		return currentBookingId;
	}
	
	public long getCurrentReservationNumber(){
		return currentReservationNumber;
	}
	
	
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
	
	/***********************/
	/**** room interface ***/
	/***********************/
	
	public boolean roomAssigned(long roomIndex){return false;} 
	public boolean roomOccupide(long roomIndex){return false;}
	public boolean roomFree(long roomIndex){return false;}
	
	
}
