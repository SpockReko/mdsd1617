package se.chalmers.cse.mdsd1617.yakindu;

public class Booking {

	private long id;
	private Reservation[] reservations;
	
	public Booking(int maxNbrOfReservations){
		reservations = new Reservation[maxNbrOfReservations];
	}
	
	public void addReservation(Reservation reservation){
		reservations[(int)reservation.getId()] = reservation;
	}
	
	public long checkInReservation(){
		for(int i = 0; i<reservations.length;i++){
			if(reservations[i] == null){
				continue;
			}
			if(!reservations[i].isCheckedIn()){
				reservations[i].checkIn();
				return reservations[i].getId();
			}
		}
		return -1;
	}
	
	public long checkOutReservation(){
		for(int i = 0; i<reservations.length;i++){
			if(reservations[i] == null){
				continue;
			}
			if(reservations[i].isCheckedIn() && !reservations[i].isCheckedOut()){
				reservations[i].checkOut();
				return reservations[i].getId();
			}
		}
		return -1;
	}
	
	public long payForReservation(){
		for(int i = 0; i<reservations.length;i++){
			if(reservations[i] == null){
				continue;
			}
			if(reservations[i].isCheckedIn() && reservations[i].isCheckedOut() && !reservations[i].isPayedFor()){
				reservations[i].payFor();
				return reservations[i].getId();
			}
		}
		return -1;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
