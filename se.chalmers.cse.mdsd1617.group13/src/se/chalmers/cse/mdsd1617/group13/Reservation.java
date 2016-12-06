package se.chalmers.cse.mdsd1617.group13;

public class Reservation {
	
	private long reservationId;
	private Room room;
	private enum ReservationStatus{WAITING, RCHECKIN, CHECKEDIN, RCHECKOUT, CHECKEDOUT, PAID};
	ReservationStatus resStatus;
	
	public Reservation(long reservationId){
		this.reservationId = reservationId;
		this.resStatus = ReservationStatus.WAITING;
	}
	
	public long getReservationId() {
		return reservationId;
	}
	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}

	public Room getRoom() {
		return room;
	}
	
	public void occupyRoom(Room room){
		this.room = room;
		room.occupy();
	}
	
	public void freeRoom(Room room){
		room.freeUp();
		this.room = null;
	}
	
	public void readyToCheckIn(){
		resStatus = ReservationStatus.RCHECKIN;
	}
	
	public boolean isReadyToCheckIn(){
		return resStatus == ReservationStatus.RCHECKIN;
	}
	
	public void checkedIn(){
		resStatus = ReservationStatus.CHECKEDIN;
	}
	
	public boolean isCheckedIn(){
		return this.resStatus == ReservationStatus.CHECKEDIN;
	}
	
	public void readyToCheckOut(){
		resStatus = ReservationStatus.RCHECKOUT;
	}
	
	public boolean isReadyToCheckOut(){
		return resStatus == ReservationStatus.RCHECKOUT;
	}
	
	public void checkedOut(){
		resStatus = ReservationStatus.CHECKEDOUT;
	}
	
	public boolean isCheckedOut(){
		return resStatus == ReservationStatus.CHECKEDOUT;
	}
	
	public boolean isWaiting(){
		return resStatus == ReservationStatus.WAITING;
	}
	
	public void freeReservation(){
		resStatus = ReservationStatus.WAITING;
	}
	
	public void payReservation(){
		resStatus = ReservationStatus.PAID;
	}
	
	public boolean isPaidReservation(){
		return resStatus == ReservationStatus.PAID;
	}
}
