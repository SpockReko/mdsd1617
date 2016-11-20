package se.chalmers.cse.mdsd1617.yakindu;

import java.util.*;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;
	private long currentRoomNumber = 0;
	private final int MAX_ROOMS = 2;
	private boolean[] occupiedRooms = new boolean[MAX_ROOMS];
	private Map<Long,boolean[]> bookingReservations = new HashMap<>();
	
	public long initiateBooking() {
		long newBookingId = ++currentBookingId;
		bookingReservations.put(newBookingId, new boolean[MAX_ROOMS]);
		return newBookingId;
	}

	public boolean addRoomToBooking(long bookingId) {
		if (bookingId < 1 || bookingId > currentBookingId) {
			return false;
		} else if (currentReservationNumber >= MAX_ROOMS) {
			return false;
		}else if(currentReservationNumber > Integer.MAX_VALUE){
			return false;
		} else{
			bookingReservations.get(bookingId)[(int) currentReservationNumber] = true;
			++currentReservationNumber;
			return true;
		}
	}
	
	public long getCurrentReservationNumber(){
		return currentReservationNumber;
	}
	
	public long getFreeRoomNumber(){
		int firstFreeRoomNbr = 0;
		//Raise room number if rooms are occupied. Stop if room is free.
		while(firstFreeRoomNbr < occupiedRooms.length && occupiedRooms[firstFreeRoomNbr]){
			firstFreeRoomNbr++;
		}
		occupiedRooms[firstFreeRoomNbr] = true;
		return firstFreeRoomNbr;
	}
	

	public void setCurrentRoomNumber(long roomNumber){
		this.currentRoomNumber = roomNumber;
	}
	
	public long getCurrentRoomNumber(){
		return currentRoomNumber;
	}
	
	public boolean reservationInBooking(long bookingId, long reservationId){
		
		boolean[] reservations = bookingReservations.get(bookingId);
		if(reservationId > Integer.MAX_VALUE){
			return false;
		}
		return reservations[(int) reservationId];
	}
	
	public void makeRoomAvailable(long roomNumber){
		occupiedRooms[(int) roomNumber] = false;
	}
	
}
