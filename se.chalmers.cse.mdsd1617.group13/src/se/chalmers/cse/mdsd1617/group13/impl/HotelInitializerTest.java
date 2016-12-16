package se.chalmers.cse.mdsd1617.group13.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.chalmers.cse.mdsd1617.group13.Administrator;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;

public class HotelInitializerTest {

	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
	static Administrator admin = new Group13FactoryImpl().createAdministrator();

	@BeforeClass
	public static void setUpClass(){
		admin.setIhotelstartupprovides(hotelInitializer);
		admin.getIhotelstartupprovides().startup(10);

	}
	
	
	@Test
	public void testStartUp() {
		//hotelInitializer.startup(10);
		boolean actual = roomHandler.getRooms().isEmpty();
		assertEquals(false, actual);
	}
	
	@Test
	public void testStartUpRoomAdded(){
		int totalRooms = roomHandler.getRooms().size();
		assertEquals(10, totalRooms);
	}

}
