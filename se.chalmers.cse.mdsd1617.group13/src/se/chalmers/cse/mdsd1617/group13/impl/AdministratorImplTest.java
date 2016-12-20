package se.chalmers.cse.mdsd1617.group13.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import se.chalmers.cse.mdsd1617.group13.Administrator;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Room;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;

import org.junit.Before;
import org.junit.Assert;
import org.junit.BeforeClass;

public class AdministratorImplTest {
	
	static Administrator admin = new Group13FactoryImpl().createAdministrator();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	static RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
	

	@BeforeClass
	public static void setUpClass() throws Exception{
		admin.setIhotelstartupprovides(hotelInitializer);
		admin.setIadministratorprovides(roomHandler);
		admin.getIhotelstartupprovides().startup(10);
		roomHandler.addRoomType("New", 1, 1, "Test");
	}

	@Test
	public void testChangeRoomTypeValid() {
		Room room = roomHandler.getRooms().get(0);
		RoomType oldRT = room.getRoomtype();
		RoomType newRT = roomHandler.getRoomTypes().get(1);
		assertTrue(admin.getIadministratorprovides().changeRoomType(room.getRoomNumber(), newRT.getName()));
		boolean result = room.getRoomtype().equals(newRT) && !oldRT.equals(room.getRoomtype());
		assertTrue(result);
	}
	
	@Test
	public void testChangeRoomTypeInvalidRoomId() {
		int invalidId = -1;
		assertFalse(admin.getIadministratorprovides().changeRoomType(invalidId, roomHandler.getRoomTypes().get(1).getName()));
	}
	
	@Test
	public void testChangeRoomTypeInvalidRoomType() {
		String invalidRoomTypeName = "Non";
		Room room = roomHandler.getRooms().get(0);
		RoomType oldRT = room.getRoomtype();
		assertFalse(admin.getIadministratorprovides().changeRoomType(room.getRoomNumber(), "Non"));
		boolean result = room.getRoomtype().equals(oldRT);
		assertTrue(result);	
	}
}


