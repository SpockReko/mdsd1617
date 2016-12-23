package se.chalmers.cse.mdsd1617.group13.actor.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import se.chalmers.cse.mdsd1617.group13.actor.Administrator;
import se.chalmers.cse.mdsd1617.group13.actor.impl.ActorFactoryImpl;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomHandler;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.HotelsystemFactoryImpl;

import static org.junit.Assert.assertEquals;

public class AdministratorTests {

    private static Administrator admin;
    private static RoomHandler roomHandler;


    private static final String INVALID_ROOM_TYPE_NAME = "Unexisting room type name";
    private static final String EXISTING_ROOM_TYPE_NAME = "Single";

    private static final int EXISTING_ROOM_NUMBER = 5;
    private static final int INVALID_ROOM_NUMBER = -5;

    private static final int NUMBER_OF_ROOMS = 10;

    @BeforeClass
    public static void setUpClass() {
        admin = new ActorFactoryImpl().createAdministrator();
        HotelInitializer hotelInitializer = new HotelsystemFactoryImpl().createHotelInitializer();
        admin.setIhotelstartupprovides(hotelInitializer);

        roomHandler = new HotelsystemFactoryImpl().createRoomHandler();
        admin.setIadministratorprovides(roomHandler);
    }

    /**
     * This is run before each test. Each test is independent so they all start with a clean state.
     */
    @Before
    public void setUp() {

        // creation of 10 rooms
        admin.getIhotelstartupprovides().startup(NUMBER_OF_ROOMS);


        //adding a room type to be tested for editing
        admin.getIadministratorprovides().addRoomType(EXISTING_ROOM_TYPE_NAME, 5000, 1, "Basic");
    }

    /**
     * TESTING USE CASE 2.2.1 ADD ROOM TYPE
     */
    @Test
    public void testAddRoomType() {
        boolean expected = admin.getIadministratorprovides().addRoomType("Suite", 5000, 1, "Basic");
        assertEquals(expected, true);
    }

    /**
     * TESTING USE CASE 2.2.1 ADD ROOM TYPE with an existing name
     */
    @Test
    public void testAddRoomTypeWithExistingName() {
        boolean expected = admin.getIadministratorprovides().addRoomType(EXISTING_ROOM_TYPE_NAME, 200, 1, "Basic");
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.2 UPDATE ROOM TYPE
     */
    @Test
    public void testUpdateRoomType() {
        boolean expected = admin.getIadministratorprovides().editRoomType(EXISTING_ROOM_TYPE_NAME, 1000, 2,
                "New Features Tests");
        assertEquals(expected, true);
    }

    /**
     * TESTING USE CASE 2.2.2 UPDATE ROOM TYPE with an invalid room type name
     */
    @Test
    public void testUpdateRoomTypeWithInvalidName() {
        boolean expected = admin.getIadministratorprovides().editRoomType(INVALID_ROOM_TYPE_NAME, 1000, 2,
                "New Features Tests");
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.3 REMOVE ROOM TYPE
     */
    @Test
    public void testRemoveRoomType() {
        boolean expected = admin.getIadministratorprovides().removeRoomType(EXISTING_ROOM_TYPE_NAME);
        assertEquals(expected, true);
    }

    /**
     * TESTING USE CASE 2.2.3 REMOVE ROOM TYPE with an invalid room type name
     */
    @Test
    public void testRemoveRoomTypeWithInvalidName() {
        boolean expected = admin.getIadministratorprovides().removeRoomType(INVALID_ROOM_TYPE_NAME);
        assertEquals(expected, false);
    }


    /**
     * TESTING USE CASE 2.2.4 ADD ROOM
     */
    @Test
    public void testAddRoom() {
        boolean expected = admin.getIadministratorprovides().addRoom(14, "Default");
        assertEquals(expected, true);
    }

    /**
     * TESTING USE CASE 2.2.4 ADD ROOM with an existing room number
     */
    @Test
    public void testAddRoomWithExistingRoomNumber() {
        boolean expected = admin.getIadministratorprovides().addRoom(EXISTING_ROOM_NUMBER, "Default");
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.4 ADD ROOM with an invalid room type
     */
    @Test
    public void testAddRoomWithInvalidRoomType() {
        boolean expected = admin.getIadministratorprovides().addRoom(20, INVALID_ROOM_TYPE_NAME);
        assertEquals(expected, false);
    }


    /**
     * TESTING USE CASE 2.2.5 CHANGE ROOM TYPE OF ROOM
     */
    @Test
    public void testChangeRoomType() {
        boolean expected = admin.getIadministratorprovides().changeRoomType(EXISTING_ROOM_NUMBER,
                EXISTING_ROOM_TYPE_NAME);
        assertEquals(expected, true);
    }

    /**
     * TESTING USE CASE 2.2.5 CHANGE ROOM TYPE OF ROOM with an invalid room number
     */
    @Test
    public void testChangeRoomTypeWithInvalidRoomNumber() {
        boolean expected = admin.getIadministratorprovides().changeRoomType(INVALID_ROOM_NUMBER,
                EXISTING_ROOM_TYPE_NAME);
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.5 CHANGE ROOM TYPE OF ROOM with an invalid room type name
     */
    @Test
    public void testChangeRoomTypeWithInvalidRoomTypeName() {
        boolean expected = admin.getIadministratorprovides().changeRoomType(EXISTING_ROOM_NUMBER,
                INVALID_ROOM_TYPE_NAME);
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.5 CHANGE ROOM TYPE OF ROOM with an invalid room number
     */
    @Test
    public void testChangeRoomTypeWithInvalidParameters() {
        boolean expected = admin.getIadministratorprovides().changeRoomType(INVALID_ROOM_NUMBER,
                INVALID_ROOM_TYPE_NAME);
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.6 REMOVE ROOM
     */
    @Test
    public void testRemoveRoom() {
        boolean expected = admin.getIadministratorprovides().removeRoom(EXISTING_ROOM_NUMBER);
        assertEquals(expected, true);
    }

    /**
     * TESTING USE CASE 2.2.6 REMOVE ROOM with an invalid room number
     */
    @Test
    public void testRemoveRoomWithInvalidRoomNumber() {
        boolean expected = admin.getIadministratorprovides().removeRoom(INVALID_ROOM_NUMBER);
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.6 REMOVE ROOM with an occupied room
     */
    @Test
    public void testRemoveCheckedInRoom() {
        int roomNumberToRemove = 2;
        roomHandler.getRoom(roomNumberToRemove).setOccupied(true);
        boolean expected = admin.getIadministratorprovides().removeRoom(roomNumberToRemove);
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.7 BLOCK ROOM
     */
    @Test
    public void testBlockValidRoom() {
        boolean expected = admin.getIadministratorprovides().blockRoom(EXISTING_ROOM_NUMBER);
        assertEquals(expected, true);
    }

    /**
     * TESTING USE CASE 2.2.7 BLOCK ROOM with an occupied room
     */
    @Test
    public void testBlockOccupiedRoom() {
        int roomNumberToBlock = 3;

        roomHandler.getRoom(roomNumberToBlock).setOccupied(true);
        boolean expected = admin.getIadministratorprovides().blockRoom(roomNumberToBlock);
        assertEquals(expected, false);
    }

    @Test
    public void testBlockRoomWithInvalidID() {
        boolean expected = admin.getIadministratorprovides().blockRoom(INVALID_ROOM_NUMBER);
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.8 UNBLOCK ROOM
     */
    @Test
    public void testUnBlockValidRoom() {

        int roomNumberToUnblock = 4;
        roomHandler.getRoom(roomNumberToUnblock).setBlocked(true);
        boolean expected = admin.getIadministratorprovides().unblockRoom(roomNumberToUnblock);
        assertEquals(expected, true);
    }

    /**
     * TESTING USE CASE 2.2.8 UNBLOCK ROOM with an invalid room number
     */
    @Test
    public void testUnBlockWithInvalidRoomNumber() {
        boolean expected = admin.getIadministratorprovides().unblockRoom(INVALID_ROOM_NUMBER);
        assertEquals(expected, false);
    }

    /**
     * TESTING USE CASE 2.2.9 STARTUP HOTEL SYSTEM
     */
    @Test
    public void testStartUpRoomAdded() {
        int totalRooms = roomHandler.getRooms().size();
        assertEquals(totalRooms, NUMBER_OF_ROOMS);
    }

    /**
     * TESTING USE CASE 2.2.9 STARTUP HOTEL SYSTEM (cleanup)
     */
    @Test
    public void testStartUpCleanUp() {
        int newNumberOfRooms = 40;
        admin.getIhotelstartupprovides().startup(newNumberOfRooms);
        int totalRooms = roomHandler.getRooms().size();
        //previous rooms are cleared.
        assertEquals(totalRooms, newNumberOfRooms);
    }

}
