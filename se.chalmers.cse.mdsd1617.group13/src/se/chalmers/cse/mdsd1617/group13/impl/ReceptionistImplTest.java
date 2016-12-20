package se.chalmers.cse.mdsd1617.group13.impl;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import se.chalmers.cse.mdsd1617.group13.Administrator;
import se.chalmers.cse.mdsd1617.group13.Receptionist;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;

public class ReceptionistImplTest {

	static Administrator admin = new Group13FactoryImpl().createAdministrator();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	static RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
	static Receptionist receptionist = new Group13FactoryImpl().createReceptionist();
	static BookingHandler bookingHandler = new HotelsystemFactoryImpl().createBookingHandler();

	@BeforeClass
	public static void setUpClass() throws Exception{
		admin.setIhotelstartupprovides(hotelInitializer);
		admin.setIadministratorprovides(roomHandler);
		receptionist.setIhotelcustomerprovides(bookingHandler);
		receptionist.setIreceptionistprovides(bookingHandler);		
		admin.getIhotelstartupprovides().startup(10);
		roomHandler.addRoomType("New", 1, 1, "Test");
		roomHandler.getRooms().get(0).setRoomtype(roomHandler.getRoomType("New"));
	}
	
	@Before
	public void clearBooking(){
		if(bookingHandler.getBookings().size() > 0){
			bookingHandler.getBookings().clear();
		}
		receptionist.getIhotelcustomerprovides().initiateBooking("John", "20170101", "20170108", "Doe");
	}
	
	/*
	 * Tests for UC 2.1.5 - edit a booking
	 * this method allows for adding new rooms to an existing booking
	 * the same method is also used for just adding rooms too bookings
	 */
	@Test
	public void testAddRoomTypeToBookingValid(){
		Booking b =  bookingHandler.getBookings().get(0);
		int bookingId = b.getBookingId();
		assertEquals(b.getRoomReservations().size(), 0);
		boolean result = receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "New", 1);
		assertTrue(result);
		assertEquals(b.getRoomReservations().size(), 1);
	}
	
	@Test
	public void testAddRoomTypeToBookingInvalidAmount(){
		Booking b =  bookingHandler.getBookings().get(0);
		int bookingId = b.getBookingId();
		assertEquals(b.getRoomReservations().size(), 0);
		assertFalse(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "New", 2));
		assertEquals(b.getRoomReservations().size(), 0);
	}
	
	@Test
	public void testAddRoomTypeToBookingInvalidRoomType(){
		Booking b =  bookingHandler.getBookings().get(0);
		int bookingId = b.getBookingId();
		assertEquals(b.getRoomReservations().size(), 0);
		assertFalse(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Failure", 1));
		assertEquals(b.getRoomReservations().size(), 0);
	}
	
	/*
	 * Tests for UC 2.1.5 - edit a booking
	 * this method allows for removing rooms from a roomtype
	 * first we add a room, which is tested above for correctness, then remove it againg (or fail to)
	 */
	@Test
	public void testRemoveRoomTypeFromBookingValid(){
		//First add a room which is tested above so we now it works as intended, then remove it again
		Booking b =  bookingHandler.getBookings().get(0);
		int bookingId = b.getBookingId();
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "New", 1);
		assertEquals(b.getRoomReservations().size(), 1);
		boolean result = receptionist.getIreceptionistprovides().removeRoomTypeFromBooking(bookingId, "New", 1);
		assertTrue(result);
		assertEquals(b.getRoomReservations().size(), 0);
	}
	
	@Test
	public void testRemoveRoomTypeFromBookingInvalidRoomId(){
		//First add a room which is tested above so we now it works as intended, then remove it again
		Booking b =  bookingHandler.getBookings().get(0);
		int bookingId = b.getBookingId();
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "New", 1);
		assertEquals(b.getRoomReservations().size(), 1);
		int invalidId = -1;
		boolean result = receptionist.getIreceptionistprovides().removeRoomTypeFromBooking(invalidId, "New", 1);
		assertFalse(result);
		assertEquals(b.getRoomReservations().size(), 1);
	}
	
	@Test
	public void testRemoveRoomTypeFromBookingInvalidRoomType(){
		//First add a room which is tested above so we now it works as intended, then remove it again
		Booking b =  bookingHandler.getBookings().get(0);
		int bookingId = b.getBookingId();
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "New", 1);
		assertEquals(b.getRoomReservations().size(), 1);
		boolean result = receptionist.getIreceptionistprovides().removeRoomTypeFromBooking(bookingId, "Failure", 1);
		assertFalse(result);
		assertEquals(b.getRoomReservations().size(), 1);
	}
	
	/*
	 * Tests for UC 2.1.5 - edit a booking
	 * this method allows for edit dates of bookings
	 * first we add a room, which is tested above for correctness, then try to edit to dates
	 * that may or may not work
	 */
	@Test
	public void testEditBookingTimeValid(){
		Booking b =  bookingHandler.getBookings().get(0);
		int bookingId = b.getBookingId();
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "New", 1);
		assertTrue(receptionist.getIreceptionistprovides().editBookingTime(bookingId, "20170201", "20170202"));
	}

	@Test
	public void testEditBookingTimeInvalidDate(){
		Booking b =  bookingHandler.getBookings().get(0);
		int bookingId = b.getBookingId();
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "New", 1);
		assertTrue(receptionist.getIreceptionistprovides().editBookingTime(bookingId, "20170201", "20170202"));
	}

}
