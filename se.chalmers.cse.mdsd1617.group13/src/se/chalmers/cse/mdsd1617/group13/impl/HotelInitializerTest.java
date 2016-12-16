package se.chalmers.cse.mdsd1617.group13.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import se.chalmers.cse.mdsd1617.group13.Administrator;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;

public class HotelInitializerTest {

	HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
	Administrator admin = new Group13FactoryImpl().createAdministrator();


	@Test
	public void testStartUp() {
		admin.setIhotelstartupprovides(hotelInitializer);
		admin.getIhotelstartupprovides().startup(10);

		//hotelInitializer.startup(10);
		boolean expected = roomHandler.getRooms().isEmpty();
		assertEquals(expected, false);

	}

}
