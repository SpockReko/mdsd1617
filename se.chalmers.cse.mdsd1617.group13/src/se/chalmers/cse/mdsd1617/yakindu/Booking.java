package se.chalmers.cse.mdsd1617.yakindu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class Booking {

	private List<Reservation> reservations = new ArrayList<>();
	private long bookingId;
	private ListIterator<Reservation> resIt = reservations.listIterator();
	private int index = 0;
	private int checkouts = 0;
	
	public Booking(long bookingId){
		this.bookingId = bookingId;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public Reservation getCheckIn(){
		if(index > reservations.size()){
			return null;
		} else {
			return reservations.get(index++);
		}
		/*
		if(resIt.hasNext()){
			return resIt.next();
		}
		else {
			return null;
		}
		*/
	}
	
	public Reservation getCheckOut(){
		if(index > reservations.size() || checkouts == index){
			return null;
		} else {
			return reservations.get(checkouts++);
		}
	}

}
