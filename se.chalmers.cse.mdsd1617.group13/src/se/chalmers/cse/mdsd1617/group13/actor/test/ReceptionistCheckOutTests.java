package se.chalmers.cse.mdsd1617.group13.actor.test;

import static org.junit.Assert.*;

import org.junit.Test;

import se.chalmers.cse.mdsd1617.group13.actor.Administrator;
import se.chalmers.cse.mdsd1617.group13.actor.Receptionist;
import se.chalmers.cse.mdsd1617.group13.actor.impl.*;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.BookingHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.PaymentHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;
import se.chalmers.cse.mdsd1617.banking.administratorRequires.*;

import org.junit.BeforeClass;

public class ReceptionistCheckOutTests {

	
	static Receptionist receptionist = new ActorFactoryImpl().createReceptionist();
	static Administrator admin = new ActorFactoryImpl().createAdministrator();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	static BookingHandler bookingHandler = new HotelsystemFactoryImpl().createBookingHandler();
	static RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
	static PaymentHandler paymentHandler = new HotelsystemFactoryImpl().createPaymentHandler();

	
	@BeforeClass
	public static void setUpClass() throws Exception{
		admin.setIhotelstartupprovides(hotelInitializer);
		//set up hotel with 20 rooms and 20 roomIds 
		admin.getIhotelstartupprovides().startup(20);
		
		//create a test bank card and add funds to it
		AdministratorRequires bankAdmin = AdministratorRequires.instance();
		bankAdmin.addCreditCard("00000000", "000", 11, 16, "Peter", "Pan");
		bankAdmin.makeDeposit("00000000", "000", 11, 16, "Peter", "Pan", 20000.00);
		receptionist.setIhotelcustomerprovides(bookingHandler);
		receptionist.setIreceptionistprovides(bookingHandler);
		
		//initiate booking that is ready for pay and checkout
		receptionist.getIhotelcustomerprovides().initiateBooking("testFirstName1", "20161216", "20170101", "testLastName1");
		receptionist.getIhotelcustomerprovides().confirmBooking(1);
		receptionist.getIhotelcustomerprovides().addRoomToBooking("Default", 1);
		receptionist.getIhotelcustomerprovides().addRoomToBooking("Default", 1);
		receptionist.getIhotelcustomerprovides().checkInRoom("Default", 1);
		receptionist.getIhotelcustomerprovides().checkInRoom("Default", 1);
	
	}
	
	@Test
	public void testInitiateCheckoutRightBookingId(){
		double result = receptionist.getIhotelcustomerprovides().initiateCheckout(1);
		assertEquals(result, 32000, 0);
	}
	
	@Test
	public void testInitiateCheckoutWrongBookingId(){
		double result = receptionist.getIhotelcustomerprovides().initiateCheckout(99);
		assertEquals(result, -1, 0);
	}
	
/*	@Test
	public void testPayRoomDuringCheckOut(){
		receptionist.getIhotelcustomerprovides().initiateCheckout(1);		
		boolean result = receptionist.getIhotelcustomerprovides().payRoomDuringCheckout(1, "00000000", "000", 11, 16, "Peter", "Pan");
		assertEquals(result, true);
	}*/
	
	@Test
	public void testCheckoutAndPayRightCard(){
		receptionist.getIhotelcustomerprovides().initiateCheckout(1);		
		boolean result = receptionist.getIhotelcustomerprovides().payDuringCheckout("00000000", "000", 11, 16, "Peter", "Pan");
		assertEquals(result, true);
	}
	
	@Test
	public void testCheckoutAndPayWrongCard(){
		receptionist.getIhotelcustomerprovides().initiateCheckout(1);
		boolean result = receptionist.getIhotelcustomerprovides().payDuringCheckout("00000", "000", 11, 16, "Peter", "Pan");
		assertEquals(result, false);
	}

}