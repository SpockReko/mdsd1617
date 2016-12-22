package se.chalmers.cse.mdsd1617.group13.actor.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.chalmers.cse.mdsd1617.group13.actor.Administrator;
import se.chalmers.cse.mdsd1617.group13.actor.impl.ActorFactoryImpl;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;

public class AdministratorTests {

	static Administrator admin = new ActorFactoryImpl().createAdministrator();
	static HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
	static RoomHandler roomHandler = new HotelsystemFactoryImpl().createRoomHandler();

	@BeforeClass
	public static void setUpClass() throws Exception{
		admin.setIhotelstartupprovides(hotelInitializer);
		admin.getIhotelstartupprovides().startup(10);
	}

	@Before
	public void setUp() {
		//if this is put in @BeforeClass, it will have to be static and retain data for all the tests.
		admin.setIadministratorprovides(roomHandler);
		//adding a room type to be tested for editing 
		admin.getIadministratorprovides().addRoomType("Single", 5000, 1, "Basic");
	}
	
	/*
	 * 
	 * TESTING USE CASE 2.2.1 ADD ROOM TYPE
	 * 
	 */

	@Test
	public void testAddRoomType(){
		boolean expected = admin.getIadministratorprovides().addRoomType("Suite", 5000, 1, "Basic");
		assertEquals(expected, true);		
	}
	
	@Test
	public void testAddRoomTypeWithExistingName(){
		boolean expected = admin.getIadministratorprovides().addRoomType("Default", 200, 1, "Basic");
		assertEquals(expected, false);		
	}

	/*
	 * 
	 * TESTING USE CASE 2.2.2 UPDATE ROOM TYPE
	 * 
	 */
	
	@Test 
	public void testUpdateRoomType(){
		boolean expected = admin.getIadministratorprovides().editRoomType("Single", 1000, 2, "New Features Tests");
		assertEquals(expected, true);
	}

	@Test 
	public void testUpdateRoomTypeWithInvalidName(){
		boolean expected = admin.getIadministratorprovides().editRoomType("Double Deluxe", 1000, 2, "New Features Tests");
		assertEquals(expected, false);
	}
	
	/*
	 * 
	 * TESTING USE CASE 2.2.3 REMOVE ROOM TYPE 
	 * 
	 */
	
	@Test
	public void testRemoveRoomType(){
		boolean expected = admin.getIadministratorprovides().removeRoomType("Default");
		assertEquals(expected, true);
	}
	
	@Test
	public void testRemoveRoomTypeWithInvalidName(){
		boolean expected = admin.getIadministratorprovides().removeRoomType("Double Standard");
		assertEquals(expected, false);
	}
	
	/*
	 * 
	 * TESTING USE CASE 2.2.4 ADD ROOM 
	 * 
	 */	
	
	@Test
	public void testAddValidRoom() {
		boolean expected = admin.getIadministratorprovides().addRoom(14, "Default");
		assertEquals(expected, true);
	}
	
	@Test
	public void testAddRoomWithInvalidRoomNumber() {
		boolean expected = admin.getIadministratorprovides().addRoom(5, "Default");
		assertEquals(expected, false);
	}
	
	@Test
	public void testAddRoomWithInvalidRoomType() {
		boolean expected = admin.getIadministratorprovides().addRoom(15, "Presidential Suite");
		assertEquals(expected, false);
	}
	
	@Test
	public void testAddInvalidRoom() {
		boolean expected = admin.getIadministratorprovides().addRoom(16, "Presidential Suite");
		assertEquals(expected, false);
	}
	
	/*
	 * 
	 * TESTING USE CASE 2.2.5 CHANGE ROOM TYPE OF ROOM 
	 * 
	 */		

	@Test
	public void testChangeRoomType() {
		boolean expected = admin.getIadministratorprovides().changeRoomType(1, "Single");
		assertEquals(expected, true);
	}
	
	@Test
	public void testChangeRoomTypeWithInvalidRoomNumber() {
		boolean expected = admin.getIadministratorprovides().changeRoomType(20, "Signle");
		assertEquals(expected, false);
	}
	
	//re implement
	@Test
	public void testChangeRoomTypeWithInvalidRoomType() {
		boolean expected = admin.getIadministratorprovides().changeRoomType(1, "Unexisting RoomType");
		assertEquals(expected, false);
	}
	
	@Test
	public void testChangeRoomTypeWithInvalidParameters() {
		boolean expected = admin.getIadministratorprovides().changeRoomType(99, "Wrong Room Type");
		assertEquals(expected, false);
	}
	
	/*
	 * 
	 * TESTING USE CASE 2.2.6 REMOVE ROOM 
	 * 
	 */	
	
	@Test
	public void testRemoveRoom(){
		boolean expected = admin.getIadministratorprovides().removeRoom(1);
		assertEquals(expected, true);
	}
	
	@Test
	public void testRemoveRoomWithInvalidRoomNumber(){
		boolean expected = admin.getIadministratorprovides().removeRoom(70);
		assertEquals(expected, false);
	}
	
	@Test
	public void testRemoveCheckedInRoom(){
		roomHandler.getRoom(2).setOccupied(true);
		boolean expected = admin.getIadministratorprovides().removeRoom(2);
		assertEquals(expected, false);
	}
	
	/*
	 * 
	 * TESTING USE CASE 2.2.7 UNBLOCK ROOM 
	 * 
	 */	

	@Test
	public void testBlockValidRoom() {
		boolean expected = admin.getIadministratorprovides().blockRoom(2);
		assertEquals(expected, true);
	}

	@Test
	public void testBlockOccupiedRoom(){
		roomHandler.getRoom(3).setOccupied(true);
		boolean expected = admin.getIadministratorprovides().blockRoom(3);
		assertEquals(expected, false);
	}

	@Test
	public void testBlockRoomWithInvalidID(){
		boolean expected = admin.getIadministratorprovides().blockRoom(999);
		assertEquals(expected, false);
	}
	
	/*
	 * 
	 * TESTING USE CASE 2.2.8 UNBLOCK ROOM 
	 * 
	 */	

	@Test
	public void testUnBlockValidRoom(){
		roomHandler.getRoom(4).setBlocked(true);
		boolean expected = admin.getIadministratorprovides().unblockRoom(4);
		assertEquals(expected, true);
	}
	
	@Test
	public void testUnBlockInvalidRoom(){
		roomHandler.getRoom(4).setBlocked(false);
		boolean expected = admin.getIadministratorprovides().unblockRoom(4);
		assertEquals(expected, false);
	}
	
	/*
	 * 
	 * TESTING USE CASE 2.2.9 STARTUP HOTEL SYSTEM
	 * 
	 */
	
	@Test
	public void testStartUpRoomAdded(){
		int totalRooms = roomHandler.getRooms().size();
		assertEquals(totalRooms, 10);
	}
	
	@Test
	public void testStartUpCleanUp(){
		admin.getIhotelstartupprovides().startup(40);
		int totalRooms = roomHandler.getRooms().size();
		//previous rooms are cleared.
		assertEquals(totalRooms, 40);
	}

}
