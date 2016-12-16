package se.chalmers.cse.mdsd1617.group13.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import se.chalmers.cse.mdsd1617.group13.Administrator;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;

public class AdministratorTests {

	//Administrator admin = new Group13FactoryImpl().createAdministrator();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();

	@BeforeClass
	public static void setUpClass() throws Exception{
		hotelInitializer.startup(10);
	}

	@Test
	public void testBlockValidRoom() {
		boolean expected = roomHandler.blockRoom(2);
		assertEquals(expected, true);
	}

	@Test
	public void testBlockOccupiedRoom(){
		roomHandler.getRoom(3).setOccupied(true);
		boolean expected = roomHandler.blockRoom(3);
		assertEquals(expected, false);
	}

	@Test
	public void testBlockRoomWithInvalidID(){
		boolean expected = roomHandler.blockRoom(999);
		assertEquals(expected, false);
	}

	@Test
	public void testUnBlockValidRoom(){
		roomHandler.getRoom(4).setBlocked(true);
		boolean expected = roomHandler.unblockRoom(4);
		assertEquals(expected, true);
	}

	@Test
	public void addRoomType(){

	}

}
