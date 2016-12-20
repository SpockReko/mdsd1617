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
import se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler;

public class ReceptionistBookingTests {

	static Receptionist receptionist = new Group13FactoryImpl().createReceptionist();
	static Administrator admin = new Group13FactoryImpl().createAdministrator();
	//static BankAdministratorImpl bankAdmin = new BankAdministratorImpl();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	static BookingHandler bookingHandler = new HotelsystemFactoryImpl().createBookingHandler();
	static RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
	static PaymentHandler paymentHandler = new HotelsystemFactoryImpl().createPaymentHandler();

	//this happens when the class is created and @Before happens every time a test is run
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
}
