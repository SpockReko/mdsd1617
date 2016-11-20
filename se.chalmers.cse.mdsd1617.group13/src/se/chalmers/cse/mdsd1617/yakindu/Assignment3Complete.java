package se.chalmers.cse.mdsd1617.yakindu;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;
	
	private final int MAX_ROOMS = 5;
	private boolean[] freeRooms = new boolean[MAX_ROOMS];

	
	public Assignment3Complete(){
		for(int i = 0; i < freeRooms.length; i++){
			freeRooms[i] = true;
		}
	}
	
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
	
	public long getCurrentReservationNumber(){
		return currentReservationNumber;
	}
	
	public long checkFreeRooms(){
		long i = 0;
		for(; i < freeRooms.length; i++){
			if(freeRooms[(int) i]){
				//freeRooms[(int) i] = false;
				return i;
			}
		} 
		return -1;
	}
	
	public void occupyRoom(long roomId){
		freeRooms[(int) roomId] = false;
	}
	
	public long checkOut(long roomId){
		freeRooms[(int)roomId] = true;
		return roomId;
	}
}
