package se.chalmers.cse.mdsd1617.group13.actor.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
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

import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomReservation;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.BookingHandlerImpl;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;



public class ReceptionistBookingTests {

	private static Receptionist receptionist = new ActorFactoryImpl().createReceptionist();
	private static Administrator admin = new ActorFactoryImpl().createAdministrator();

	// BankAdministratorImpl bankAdmin = new BankAdministratorImpl();
	private static BookingHandler bookingHandler = new HotelsystemFactoryImpl().createBookingHandler();

	private static int INVALID_BOOKING_ID = -999;
	private static String DEFAULT_ROOM_TYPE_NAME ="Default";


	@BeforeClass
	public static void setUpClass() throws Exception{
        HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
		admin.setIhotelstartupprovides(hotelInitializer);

		//set up hotel with 20 rooms and 20 roomIds
		admin.getIhotelstartupprovides().startup(20);
		admin.setIadministratorprovides(hotelInitializer.getRoomHandler());

		//create a test bank card
		//AdministratorRequires bankAdmin = AdministratorRequires.instance();
		//bankAdmin.addCreditCard("ccNumber", "ccv", 12, 2019, "firstName", "lastName");

		receptionist.setIhotelcustomerprovides(bookingHandler);
		receptionist.setIreceptionistprovides(bookingHandler);

		//initiate booking number 1 with booking Id 1
		receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName1", "20161216", "20170101", "testLastName1");
		//initiate booking number 2 with booking Id 2
		receptionist.getIhotelcustomerprovides().initiateBooking("booking2Name", "20161218", "20170102", "booking2lastName");

		receptionist.getIhotelcustomerprovides().addRoomToBooking(DEFAULT_ROOM_TYPE_NAME, 2);


	}

    /**
     * This is run before each test. Each test is independent so they all start with a clean state.
     */
	@Before
	public void setUp(){
		//System.out.println(receptionist.getIhotelcustomerprovides().confirmBooking(1));
		//receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName2", "20161216", "20170102", "testLastName2");
		//receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName3", "20161216", "20170103", "testLastName3");
	}
	
	@Test
	public void testInitiateBookingValidParameters() {
		// fourth booking => id 4
		int expected = receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName4", "20161216", "20170104", "testLastName4");
		assertEquals(4, expected);
	}

	@Test
	public void testInitiateBookingInvalidDate() {
		int expected = receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName5", "20161216", "20150104", "testLastName5");
		assertEquals(-1, expected);
	}

	@Test
	public void testInitiateBookingInvalidDateFormat() {

		int expected = receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName4", "20161216", "201540109", "testLastName4");
		assertEquals(-1, expected);
	}

	@Test
	public void testAddValidRoomToValidBooking(){
		int bookingId = receptionist.getIhotelcustomerprovides().initiateBooking("name", "20161219", "20161714", "lastname");
		boolean result = receptionist.getIhotelcustomerprovides().addRoomToBooking(DEFAULT_ROOM_TYPE_NAME, bookingId);
		assertEquals(true, result);
	}

	@Test
	public void testAddValidRoomToInvalidBooking(){
		boolean result = receptionist.getIhotelcustomerprovides().addRoomToBooking(DEFAULT_ROOM_TYPE_NAME, INVALID_BOOKING_ID);
		assertEquals(false, result);
	}

	@Test
	public void testConfirmBookingWithValidId(){
		boolean actual = receptionist.getIhotelcustomerprovides().confirmBooking(2);
		assertEquals(true, actual);
	}


	@Test
	public void testConfirmBookingWithInvalidId(){
		boolean actual = receptionist.getIhotelcustomerprovides().confirmBooking(INVALID_BOOKING_ID);
		assertEquals(false, actual);
	}

	@Test
	public void testCheckInRoomWithValidBookingId(){
		int actual = receptionist.getIhotelcustomerprovides().checkInRoom(DEFAULT_ROOM_TYPE_NAME, 2);
        // the check in room, should work so it must return the room number which must be different than -1
		assertNotEquals(-1, actual);
	}

	@Test
	public void testCheckInRoomWithInvalidBookingId(){
		int actual = receptionist.getIhotelcustomerprovides().checkInRoom(DEFAULT_ROOM_TYPE_NAME, INVALID_BOOKING_ID);
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
		int bookingNbr = bookingHandler.initiateBooking("testFirstName", "20161216", "20170102", "testEndName");
		bookingHandler.addRoomTypeToBooking(bookingNbr, DEFAULT_ROOM_TYPE_NAME, 4);
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
            // TODO : do not use == to compare string, use "string".equals("string")
			assertTrue(reservation.getStartDate() == bookedBooking.getStartDate());
			assertTrue(reservation.getEndDate() == bookedBooking.getEndDate());
		}
	}

	/*
	 *  Test for UC 2.1.2 Search for free rooms
	 */
	@Test
	public void testGetFreeRooms(){
		//creates the BIGROOM!
		assertTrue(admin.getIadministratorprovides().addRoomType("BigRoom", 8000, 10, "Big Screen TV and A Beer Fridge"));
		assertTrue(admin.getIadministratorprovides().addRoom(666, "BigRoom"));
		// Test if we can get the new created room
		EList<FreeRoomTypesDTO> rooms = receptionist.getIhotelcustomerprovides().getFreeRooms(8, "20161216", "20170102");
		for(FreeRoomTypesDTO type : rooms){
			assertTrue(type.getNumBeds() == 10); 									 
			assertTrue(type.getNumFreeRooms() + "", type.getNumFreeRooms() == 1);  
			assertTrue(type.getPricePerNight() == 8000); 							
			assertTrue(type.getRoomTypeDescription() + "",type.getRoomTypeDescription().equals("BigRoom"));		}
	}
	
	/*
	 *Tests for UC 2.1.5 Edit a booking 	
	 */

	//Used for initializing booking to test
	private int initBooking(){
		return receptionist.getIhotelcustomerprovides().initiateBooking("John", "20170101", "20170108", "Doe");
	}

	//Used for deleting a booking
	private void clearBooking(int id){
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
		boolean result = receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, DEFAULT_ROOM_TYPE_NAME, 1);
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
		assertFalse(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, DEFAULT_ROOM_TYPE_NAME, 21));
		assertFalse(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, DEFAULT_ROOM_TYPE_NAME, -1));
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
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, DEFAULT_ROOM_TYPE_NAME, 1);
		assertEquals(b.getRoomReservations().size(), 1);
		boolean result = receptionist.getIreceptionistprovides().removeRoomTypeFromBooking(bookingId, DEFAULT_ROOM_TYPE_NAME, 1);
		assertTrue(result);
		assertEquals(b.getRoomReservations().size(), 0);
		clearBooking(bookingId);
	}

	//Tries to change remove a roomtype from an invalid (non-existent) bookingId
	@Test
	public void testRemoveRoomTypeFromBookingInvalidRoomBookingId(){
		int invalidId = -1;
		boolean result = receptionist.getIreceptionistprovides().removeRoomTypeFromBooking(invalidId, DEFAULT_ROOM_TYPE_NAME, 1);
		assertFalse(result);

	}

	//Tries to remove an invalid roomtype from a booking
	@Test
	public void testRemoveRoomTypeFromBookingInvalidRoomType(){
		int bookingId = initBooking();
		Booking b = bookingHandler.getBookingById(bookingId);
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, DEFAULT_ROOM_TYPE_NAME, 1);
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
		assertTrue(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, DEFAULT_ROOM_TYPE_NAME, 1));
		assertTrue(receptionist.getIreceptionistprovides().editBookingTime(bookingId, "20170201", "20170202"));
		clearBooking(bookingId);
	}

	//Tries to edit the time on a booking with an invalid date
	@Test
	public void testEditBookingTimeInvalidDate(){
		int bookingId = initBooking();
		assertTrue(receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, DEFAULT_ROOM_TYPE_NAME, 1));
		assertFalse(receptionist.getIreceptionistprovides().editBookingTime(bookingId, "1", "2"));
		clearBooking(bookingId);
	}

	//Tries to edit a booking with invalid ID
	@Test
	public void testEditBookingTimeInvalidId(){
		int invalidId = -1;
		assertFalse(receptionist.getIreceptionistprovides().editBookingTime(invalidId, "20170201", "20170202"));
	}

	// 2.1.9 List check ins for a specific day 
	// Save the size of checkIn from 20161213 until today, make a booking, checkin and see if the the size is one more 
	@Test
	public void testListCheckIn(){
		String specificDay = "20161213";
		String today = ( new SimpleDateFormat( "yyyyMMdd" ) ).format( Calendar.getInstance().getTime() );
		int listSizeBefore = receptionist.getIreceptionistprovides().listCheckins(specificDay, today).size();	
		int bookingId = receptionist.getIhotelcustomerprovides().initiateBooking("Stefan", specificDay, "20600202", "Bror");
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 1);
		receptionist.getIhotelcustomerprovides().confirmBooking(bookingId);
		receptionist.getIreceptionistprovides().checkIn(bookingId, 5); // Check in a room today.
		int listSizeAfter = receptionist.getIreceptionistprovides().listCheckins(specificDay, today).size();
		assertTrue(bookingId + "",listSizeAfter == listSizeBefore + 1);
	}
	
	// 2.1.10 List check out for a specific day
	// Using current date. At the moment there is only 1 test with checkOut with the current date. If there is more, then
	// we have to change it like in testListCheckOut() with specificDay.
	@Test
	public void testListCheckOut() {
		String specificDay = "20161213";
		String currentDate = (new SimpleDateFormat( "yyyyMMdd" ) ).format( Calendar.getInstance().getTime());
		int listSizeBefore = receptionist.getIreceptionistprovides().listCheckouts(specificDay, currentDate).size();			
		int bookingId = receptionist.getIhotelcustomerprovides().initiateBooking("Lage", specificDay, "20600202", "Bror");
		receptionist.getIreceptionistprovides().addRoomTypeToBooking(bookingId, "Default", 1);
		receptionist.getIhotelcustomerprovides().confirmBooking(bookingId);
		receptionist.getIreceptionistprovides().checkIn(bookingId, 5); // Check in a room today.
		receptionist.getIhotelcustomerprovides().initiateCheckout(bookingId);
		
		assertTrue(bookingId + "",receptionist.getIreceptionistprovides().listCheckouts(specificDay, currentDate).size() == listSizeBefore + 1); 
	}
	//*/

	//2.1.13 Add extra cost to rooms
	@Test
	public void testAddExtraCostToRoom(){
		IHotelReceptionistProvides receptionistProvides = receptionist.getIreceptionistprovides();
		IHotelCustomerProvides customerProvides = receptionist.getIhotelcustomerprovides(); 
		
		// Initiate Booking
		int bookingId = customerProvides.initiateBooking("booking3Name", "20161220", "20170103", "booking3lastName");
        customerProvides.addRoomToBooking(DEFAULT_ROOM_TYPE_NAME, bookingId);
		EList<Integer> roomNbrs = receptionistProvides.listFreeRooms(bookingId);
		int booking3Roomnbr = roomNbrs.get(0);
		customerProvides.confirmBooking(bookingId);
		receptionistProvides.checkIn(bookingId,booking3Roomnbr);
		//add extra to room 
		assertTrue(receptionistProvides.addExtraToRoom(bookingId, booking3Roomnbr, "testExtra", 100));
		double bookingPrice = customerProvides.initiateCheckout(bookingId);
		assertTrue(bookingPrice + "", bookingPrice == 14100); //14 days * 1000/night + price of testExtra (100)
	}

	/**
	 * TESTING 2.1.6 CANCEL A BOOKING
	 */
	@Test
	public void testCancelBooking() {
		assertTrue(receptionist.getIreceptionistprovides().cancelBooking(1));
	}

    /**
     * TESTING 2.1.6 CANCEL A BOOKING with an checked in booking
     */
    @Test
    public void testCancelBookingWithCheckedInBooking() {
        assertFalse(receptionist.getIreceptionistprovides().cancelBooking(3));
    }
}
