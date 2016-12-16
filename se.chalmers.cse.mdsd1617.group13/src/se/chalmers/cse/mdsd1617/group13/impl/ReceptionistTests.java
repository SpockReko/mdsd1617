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
import se.chalmers.cse.mdsd1617.banking.administratorRequires.*;

public class ReceptionistTests {

	static Receptionist receptionist = new Group13FactoryImpl().createReceptionist();
	static Administrator admin = new Group13FactoryImpl().createAdministrator();
	//static BankAdministratorImpl bankAdmin = new BankAdministratorImpl();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	static BookingHandler bookingHandler = new HotelsystemFactoryImpl().createBookingHandler();
	RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
	static PaymentHandler paymentHandler = new HotelsystemFactoryImpl().createPaymentHandler();

	//this happens when the class is created and @Before happens everytime a test is run
	@BeforeClass
	public static void setUpClass() throws Exception{
		admin.setIhotelstartupprovides(hotelInitializer);
		admin.getIhotelstartupprovides().startup(20);
		//create a test bank card
		AdministratorRequires bankAdmin = AdministratorRequires.instance();
		bankAdmin.addCreditCard("ccNumber", "ccv", 12, 2019, "firstName", "lastName");
		receptionist.setIhotelcustomerprovides(bookingHandler);
	}

	//I will set up few bookings and such to test here, use different IDs to test yours.
	@Before
	public void setUp(){
		receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName1", "20161216", "20170101", "testLastName1");
		receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName2", "20161216", "20170102", "testLastName2");
		receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName3", "20161216", "20170103", "testLastName3");
	}
	
	@Test
	public void testInitiateBookingValidParameters() {
		int expected = receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName4", "20161216", "20170104", "testLastName4");
		assertEquals(7, expected);
	}
	
	@Test
	public void testAddValidRoomToValidBooking(){
		boolean result = bookingHandler.addRoomToBooking("Default", 1);
		assertEquals(true, result);
	}
	
	@Test
	public void testPayRoomDuringCheckoutValidRoom(){
		boolean result = bookingHandler.payRoomDuringCheckout(7, "ccNumber", "ccv", 12, 2019, "firstName", "lastName");
		assertEquals(true, result);
	}
	
	@Test
	public void testPayRoomDuringCheckoutInvalidRoom(){
		boolean result = bookingHandler.payRoomDuringCheckout(21, "ccNumber", "ccv", 12, 2019, "firstName", "lastName");
		assertEquals(false, result);
	}

}
