package statediagram;

import java.util.ArrayList;
import java.util.List;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;
	private long currentReservation = 0;
	private final int MAX_ROOMS = 2;
	
	private List<Booking> bookings = new ArrayList<>();
	private Booking currentBooking;
	
	private List<Room> rooms = new ArrayList<>();
	
	public Assignment3Complete(){
		long l = 0;
		for(int i = 0; i <= MAX_ROOMS; i++){
			rooms.add(new Room(l));
			l = l+1;
		}
	}
	
	public long initiateBooking() {
		bookings.add(new Booking(++currentBookingId));
		return currentBookingId;
	}
	
	public boolean activateBooking(long bookingId){
		for(Booking b : bookings){
			if(b.getBookingId() == bookingId){
				currentBooking = b;
				return true;
			}
		}
		return false;
	}

	public boolean addRoomToBooking(long bookingId) {
		if (bookingId < 1 || bookingId > currentBookingId) {
			return false;
		} else if (currentReservationNumber >= MAX_ROOMS) {
			return false;
		} else {
			for(Booking b : bookings){
				if(b.getBookingId() == bookingId){
					currentBooking = b;
					currentBooking.getReservations().add(new Reservation(currentReservationNumber++));
					return true;
				}
			}
			return false;
		}
	}
	
	public boolean initializeReservation(long reservationId){
		for(Reservation r : currentBooking.getReservations()){
			if(r.getReservationId() == reservationId){
				return true;
			}
		}
		return false;
	}
	
	public boolean confirmBooking(long bookingId){
		activateBooking(bookingId);
		try {
			currentBooking.getReservations().get(0);
		} catch (Exception e){
			return false;
		}
			return true;
	}
	
	public boolean confirmReservation(long reservationId){
		for(Reservation r : currentBooking.getReservations()){
			if(r.getReservationId() == reservationId){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkInBooking(long bookingId){
		activateBooking(bookingId);
		Reservation r = currentBooking.getCheckIn();
		if(r == null){
			return false;
		} else if (r.isWaiting()){
			r.readyToCheckIn();
			return true;
		}
		return false;
	}
	
	public boolean checkInReservation(long reservationId){
		for(Reservation r : currentBooking.getReservations()){
			if((r.getReservationId() == reservationId) && r.isReadyToCheckIn()){
				for(Room rm : rooms){
					if(rm.isFree()){
						r.checkedIn();
						r.occupyRoom(rm);
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean checkInRoom(long roomId){
		for(Reservation r : currentBooking.getReservations()){
			Room room = r.getRoom();
			if(room != null && room.getRoomId() == roomId) {
				return true;
			} 
		}
		return false;
	}
	
	public boolean initiateCheckout(long bookingId){
		activateBooking(bookingId);
		for(Reservation r : currentBooking.getReservations()){
			if(r.isWaiting()){
				return false;
			}
		}
		for(Reservation r : currentBooking.getReservations()){
			if(r.getReservationId() == currentReservation && r.isCheckedIn()){
				r.readyToCheckOut();
				return true;
			}
		}
		Reservation r = currentBooking.getCheckOut();
		if(r == null){
			return false;
		} else if (r.isCheckedIn()){
			r.readyToCheckOut();
			return true;
		} return false;
	}
	
	public boolean checkOutReservation(long reservationId){
		for(Reservation r : currentBooking.getReservations()){
			if(r.getReservationId() == reservationId && r.isReadyToCheckOut()){
				return true;
			}
		} return false;
	}
	
	public boolean checkOutRoom(long roomId){
		for(Reservation r : currentBooking.getReservations()){
			Room room = r.getRoom();
			if(room != null && room.getRoomId() == roomId && r.isReadyToCheckOut()){
				r.freeRoom(room);
				r.checkedOut();
				//r = null;
				return true;
			}
		} return false;
	}
	
	public boolean payCheckedOuts(long bookingId){
		activateBooking(bookingId);
		for(Reservation r : currentBooking.getReservations()){
			if(r.isCheckedOut()){
				r.payReservation();
			}
		}
		return true;
	}
		
	public boolean payAllCheckedOuts(long bookingId){
		activateBooking(bookingId);
		for(Reservation r : currentBooking.getReservations()){
			if(!r.isPaidReservation()){
				return false;
			}
		}
		return true;
	}

	public boolean checkInWholeBooking(long bookingId){
		activateBooking(bookingId);
		for(Reservation r : currentBooking.getReservations()){
			if(r.isWaiting()){
				r.readyToCheckIn();
			}
		}
		return true;
	}
	
	public boolean checkOutWholeBooking(long bookingId){
		activateBooking(bookingId);
		for(Reservation r : currentBooking.getReservations()){
			if(!r.isCheckedIn()){
				return false;
			}
		}
		for(Reservation r : currentBooking.getReservations()){
			if(r.isCheckedIn()){
				r.readyToCheckOut();
			}
		}
		return true;
	}
	
	public boolean nextRoom(){
		currentReservation = (currentReservation + 1) % MAX_ROOMS;
		return true;
	}
}
