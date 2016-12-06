package se.chalmers.cse.mdsd1617.group13;

public class Room {
	private long roomId;
	private enum RoomStatus{FREE, OCCUPIED};
	RoomStatus roomStatus;
	
	public Room(long roomId){
		this.roomId = roomId;
		this.roomStatus = RoomStatus.FREE;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	
	public boolean isFree(){
		return this.roomStatus == RoomStatus.FREE;
	}
	
	public void occupy(){
		roomStatus = RoomStatus.OCCUPIED;
	}
	
	public boolean isOccupied(){
		return roomStatus == RoomStatus.OCCUPIED;
	}
	
	public void freeUp(){
		roomStatus = RoomStatus.FREE;
	}
}
