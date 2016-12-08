package statediagram;

import java.util.ArrayList;
import java.util.List;

public class Booking {

	private List<RoomReservation> reservations = new ArrayList<>();
	private long bookingId;
	private int index = 0;
	private int checkouts = 0;
	
	public Booking(long bookingId){
		this.bookingId = bookingId;
	}

	public List<RoomReservation> getReservations() {
		return reservations;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public RoomReservation getCheckIn(){
		if(index >= reservations.size()){
			return null;
		} else {
			return reservations.get(index++);
		}
	}
	
	public RoomReservation getCheckOut(){
		if(index > reservations.size() || checkouts == index){
			return null;
		} else {
			return reservations.get(checkouts++);
		}
	}

}
