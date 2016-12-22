package se.chalmers.cse.mdsd1617.group13.actor.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import se.chalmers.cse.mdsd1617.group13.actor.Administrator;
import se.chalmers.cse.mdsd1617.group13.actor.Receptionist;
import se.chalmers.cse.mdsd1617.group13.actor.impl.ActorFactoryImpl;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.Booking;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelCustomerProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.IHotelReceptionistProvides;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler;


public class ReceptionistBookingTests {

	static Receptionist receptionist = new ActorFactoryImpl().createReceptionist();
	static Administrator admin = new ActorFactoryImpl().createAdministrator();

	//static BankAdministratorImpl bankAdmin = new BankAdministratorImpl();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	static BookingHandler bookingHandler = new HotelsystemFactoryImpl().createBookingHandler();
	static RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
	static PaymentHandler paymentHandler = new HotelsystemFactoryImpl().createPaymentHandler();
	private static int booking3Roomnbr;

	//this happens when the class is created
	@BeforeClass
	public static void setUpClass() throws Exception{
		admin.setIhotelstartupprovides(hotelInitializer);
		//set up hotel with 20 rooms and 20 roomIds 
		admin.getIhotelstartupprovides().startup(20);
		
		//create a test bank card
		//AdministratorRequires bankAdmin = AdministratorRequires.instance();
		//bankAdmin.addCreditCard("ccNumber", "ccv", 12, 2019, "firstName", "lastName");
		
		receptionist.setIhotelcustomerprovides(bookingHandler);
		receptionist.setIreceptionistprovides(bookingHandler);
		
		//initiate booking number 1 with booking Id 1
		receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName1", "20161216", "20170101", "testLastName1");
		//initiate booking number 2 with booking Id 2?
		receptionist.getIhotelcustomerprovides().initiateBooking("booking2Name", "20161218", "20170102", "booking2lastName");

		receptionist.getIhotelcustomerprovides().confirmBooking(2);
		receptionist.getIhotelcustomerprovides().addRoomToBooking("Default", 2);
		//System.out.println(bookingHandler.getBookings().get(1));
		

		//initiate booking number 3 with booking Id 3?
		BookingHandlerImpl bookingHandler = (BookingHandlerImpl) receptionist.getIhotelcustomerprovides();
		bookingHandler.initiateBooking("booking3Name", "20161220", "20170103", "booking3lastName");
		bookingHandler.addRoomToBooking("Default", 3);
		EList<Integer> roomNbrs = bookingHandler.listFreeRooms(3);
		booking3Roomnbr = roomNbrs.get(0);
		bookingHandler.confirmBooking(3);
		bookingHandler.checkIn(3,booking3Roomnbr);
		
	}

	//I will set up few bookings and such to test here, use different IDs to test yours.
	@Before
	public void setUp(){
		//System.out.println(receptionist.getIhotelcustomerprovides().confirmBooking(1));
		//receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName2", "20161216", "20170102", "testLastName2");
		//receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName3", "20161216", "20170103", "testLastName3");
	}
	
	@Test
	public void testInitiateBookingValidParameters() {
		int expected = receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName4", "20161216", "20170104", "testLastName4");
		assertEquals(3, expected);
	}
	
	@Test
	public void testInitiateBookingInvalidDate() {
		int expected = receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName5", "20161216", "20150104", "testLastName5");
		assertEquals(-1, expected);
	}
	
	@Test
	public void testInitiateBookingInvalidDateFormat() {
		System.out.println(receptionist.getIreceptionistprovides().listBookings().size());

		int expected = receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName4", "20161216", "201540109", "testLastName4");
		assertEquals(-1, expected);
	}
	
	@Test
	public void testAddValidRoomToValidBooking(){
		int bookingId = receptionist.getIhotelcustomerprovides().initiateBooking("name", "20161219", "20161714", "lastname");
		System.out.println("BookingId is: " + bookingId);
		boolean result = receptionist.getIhotelcustomerprovides().addRoomToBooking("Default", 4);
		assertEquals(true, result);
	}
	
	@Test
	public void testAddValidRoomToInvalidBooking(){
		boolean result = receptionist.getIhotelcustomerprovides().addRoomToBooking("Default", 11);
		assertEquals(false, result);
	}
	
	@Test
	public void testConfirmBookingWithValidId(){
		boolean actual = receptionist.getIhotelcustomerprovides().confirmBooking(2);
		assertEquals(true, actual);
	}
	
	
	@Test
	public void testConfirmBookingWithInvalidId(){
		boolean actual = receptionist.getIhotelcustomerprovides().confirmBooking(99);
		assertEquals(false, actual);
	}
	
	@Test 
	public void testCheckInRoomWithValidBookingId(){
		int actual = receptionist.getIhotelcustomerprovides().checkInRoom("Default", 2);
		assertEquals(1, actual);
	}
	
	@Test 
	public void testCheckInRoomWithInvalidBookingId(){
		int actual = receptionist.getIhotelcustomerprovides().checkInRoom("Default", 99);
		assertEquals(-1, actual);
	}
	
	/*
	@Test
	public void testPayRoomDuringCheckoutValidRoom(){
		boolean result = bookingHandler.payRoomDuringCheckout(1, "ccNumber", "ccv", 12, 2019, "firstName", "lastName");
		assertEquals(true, result);
	}
	
	@Test
	public void testPayRoomDuringCheckoutInvalidRoom(){
		boolean result = bookingHandler.payRoomDuringCheckout(21, "ccNumber", "ccv", 12, 2019, "firstName", "lastName");
		assertEquals(false, result);
	}
*/
	
	//Test for UC 2.1.1 Make a booking
	@Test
	public void testMakeBooking(){
		//Searching for free rooms is tested in testGetFreeRooms
		int bookingNbr = bookingHandler.initiateBooking("testFirstName", "testEndName", "20161216", "20170102");
		bookingHandler.addRoomTypeToBooking(bookingNbr, "Default", 4);
		bookingHandler.confirmBooking(bookingNbr);
		assertFalse(bookingHandler.confirmBooking(bookingNbr)); //Cannot confirm twice
		EList<Booking> allBookings = bookingHandler.getBookings();
		Booking bookedBooking = null;
		//Find booking object with correct ID
		for(Booking booking : allBookings){
			if(booking.getBookingId() == bookingNbr){
				bookedBooking = booking;
			}
		}
		assertFalse(bookedBooking == null); //Booking object has been added to list of bookings
		assertTrue(bookedBooking.isConfirmed());
		assertFalse(bookedBooking.isCanceled()); //Booking is not canceled
		EList<RoomReservation> reservations = bookedBooking.getRoomReservations();
		for(RoomReservation reservation : reservations){
			//No rooms has been added to reservation since it is not yet checked in
			assertTrue(reservation.getRoom() == null);
			//Reservation dates are same as booking dates
			assertTrue(reservation.getStartDate() == bookedBooking.getStartDate());
			assertTrue(reservation.getEndDate() == bookedBooking.getEndDate());
		}
	}
	
	/*
	 *  Test for UC 2.1.2 Search for free rooms 
	 */
	@Test
	public void testGetFreeRooms(){
		EList<FreeRoomTypesDTO> rooms = receptionist.getIhotelcustomerprovides().getFreeRooms(1, "20161216", "20170102");
		for(FreeRoomTypesDTO type : rooms){
			assertTrue(type.getNumBeds() == 2); 									// 2 beds in te rooms.
			assertTrue(type.getNumFreeRooms() + "", type.getNumFreeRooms() == 19);  //20 rooms in startup, 1 room booked in id 2, 19 room left 			
			assertTrue(type.getPricePerNight() == 1000); 							// default price per night
			assertTrue(type.getRoomTypeDescription() + "",type.getRoomTypeDescription().equals("Default")); //roomtypename
		}
	}
	
	/*
	 *Tests for UC 2.1.5 Edit a booking 	
	 */
	
	//Used for initializing booking to test
	public int initBooking(){
		return receptionist.getIhotelcustomerprovides().initiateBooking("John", "20170101", "20170108", "Doe");
	}
	
	//Used for deleting a booking
	public void clearBooking(int id){
		bookingHandler.getBookings().remove(bookingHandler.getBookingById(id));
	}
	
	/*
	 *Tests for adding room to an existing booking
	 */
	
	//Adds a room to a booking and checks if a new room has been added
	@Test
	public void testAddRoomTypeToBookingValid(){
		int bookingId = initBooking();
		Booking b = bookingHandler.getBookingById(bookingId);
		assertEquals(b.getRoomReservations().size(), 0);
		boolean result = receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 1);
		assertTrue(result);
		assertEquals(b.getRoomReservations().size(), 1);
		clearBooking(bookingId);
	}
	
	//Tries to adding too many (and -1) of a room to a booking
	@Test
	public void testAddRoomTypeToBookingInvalidAmount(){
		int bookingId = initBooking();
		Booking b = bookingHandler.getBookingById(bookingId);
		assertEquals(b.getRoomReservations().size(), 0);
		assertFalse(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 21));
		assertFalse(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", -1));
		assertEquals(b.getRoomReservations().size(), 0);
		clearBooking(bookingId);
	}
	
	//Tries to add in invalid roomtype to a booking
	@Test
	public void testAddRoomTypeToBookingInvalidRoomType(){
		int bookingId = initBooking();
		Booking b = bookingHandler.getBookingById(bookingId);
		assertEquals(b.getRoomReservations().size(), 0);
		assertFalse(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Failure", 1));
		assertEquals(b.getRoomReservations().size(), 0);
		clearBooking(bookingId);
	}
	
	/*
	 * Tests for removing rooms from an existing booking
	 * First add a room which is tested above so we now it works as intended, then remove it again
	 */
	@Test
	public void testRemoveRoomTypeFromBookingValid(){
		int bookingId = initBooking();
		Booking b = bookingHandler.getBookingById(bookingId);
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 1);
		assertEquals(b.getRoomReservations().size(), 1);
		boolean result = receptionist.getIreceptionistprovides().removeRoomTypeFromBooking(bookingId, "Default", 1);
		assertTrue(result);
		assertEquals(b.getRoomReservations().size(), 0);
		clearBooking(bookingId);
	}
	
	//Tries to change remove a roomtype from an invalid (non-existent) bookingId
	@Test
	public void testRemoveRoomTypeFromBookingInvalidRoomBookingId(){
		int invalidId = -1;
		boolean result = receptionist.getIreceptionistprovides().removeRoomTypeFromBooking(invalidId, "Default", 1);
		assertFalse(result);
		
	}
	
	//Tries to remove an invalid roomtype from a booking
	@Test
	public void testRemoveRoomTypeFromBookingInvalidRoomType(){
		int bookingId = initBooking();
		Booking b = bookingHandler.getBookingById(bookingId);
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 1);
		assertEquals(b.getRoomReservations().size(), 1);
		boolean result = receptionist.getIreceptionistprovides().removeRoomTypeFromBooking(bookingId, "Failure", 1);
		assertFalse(result);
		assertEquals(b.getRoomReservations().size(), 1);
		clearBooking(bookingId);
	}
	
	//Tests for changing dates of an existing booking
	@Test
	public void testEditBookingTimeValid(){
		int bookingId = initBooking();
		assertTrue(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 1));
		assertTrue(receptionist.getIreceptionistprovides().editBookingTime(bookingId, "20170201", "20170202"));
		clearBooking(bookingId);
	}

	//Tries to edit the time on a booking with an invalid date
	@Test
	public void testEditBookingTimeInvalidDate(){
		int bookingId = initBooking();
		assertTrue(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 1));
		assertFalse(receptionist.getIreceptionistprovides().editBookingTime(bookingId, "", ""));
		clearBooking(bookingId);
	}
	
	//Tries to edit a booking with invalid ID
	@Test
	public void testEditBookingTimeInvalidId(){
		int invalidId = -1;
		assertFalse(receptionist.getIreceptionistprovides().editBookingTime(invalidId, "20170201", "20170202"));
	}
	
	// 2.1.9 List check ins for a specific day
	
	@Test
	public void testListCheckIn(){
		Date dToday = Calendar.getInstance().getTime();
		String today = (new SimpleDateFormat( "yyyyMMdd" ) ).format( dToday );
		assertTrue(receptionist.getIreceptionistprovides().listCheckins(today,today).size() == 0); //empty list		
		int bookingId = receptionist.getIhotelcustomerprovides().initiateBooking("Stefan", today, today, "Fritzon");
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 2);
		//TODO: Problem with how to checkIn a room!
		EList<RoomReservation> list = receptionist.getIreceptionistprovides().checkIn(bookingId, 2); // Check in a room today.
		assertTrue(bookingHandler.listCheckins(today,today).size() + "" ,bookingHandler.listCheckins(today,today).size() == 1); //emptylist
	}
	
	//2.1.13 Add extra cost to rooms
	@Test
	public void testAddExtraCostToRoom(){
		IHotelReceptionistProvides receptionistProvides = receptionist.getIreceptionistprovides();
		IHotelCustomerProvides customerProvides = receptionist.getIhotelcustomerprovides();
		assertTrue(bookingHandler.addExtraToRoom(3, booking3Roomnbr, "testExtra", 100));
		double bookingPrice = customerProvides.initiateCheckout(3);
		assertTrue(bookingPrice == 14100); //14 days * 1000/night + price of testExtra (100)
	}
}