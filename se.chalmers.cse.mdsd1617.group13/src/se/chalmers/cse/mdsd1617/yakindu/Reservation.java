package se.chalmers.cse.mdsd1617.yakindu;

public class Reservation {

	private boolean checkedIn;
	private boolean checkedOut;
	private boolean payedFor;
	private long id;
	
	public Reservation(){
		
	}
	
	public Reservation(long id){
		this.id = id;
	}
	
	public boolean isCheckedIn(){
		return checkedIn;
	}
	
	public boolean isCheckedOut(){
		return checkedOut;
	}
	
	public void checkIn(){
		checkedIn = true;
	}
	
	public void checkOut(){
		checkedOut = true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isPayedFor() {
		return payedFor;
	}

	public void payFor() {
		this.payedFor = true;
	}
	
}
