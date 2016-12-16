package se.chalmers.cse.mdsd1617.group13.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import se.chalmers.cse.mdsd1617.group13.Administrator;
import se.chalmers.cse.mdsd1617.group13.Receptionist;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;

public class ReceptionistTests {

	static Receptionist receptionist = new Group13FactoryImpl().createReceptionist();
	static Administrator admin = new Group13FactoryImpl().createAdministrator();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	static BookingHandler bookingHandler = new HotelsystemFactoryImpl().createBookingHandler();
	RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();

	//this happens when the class is created and @Before happens everytime a test is run
	@BeforeClass
	public static void setUp(){
		admin.setIhotelstartupprovides(hotelInitializer);
		admin.getIhotelstartupprovides().startup(20);
		receptionist.setIhotelcustomerprovides(bookingHandler);
	}


	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
