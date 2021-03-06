/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import se.chalmers.cse.mdsd1617.group13.hotelsystem.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model xobject '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl#getRoomTypes <em>Room Types</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.impl.RoomHandlerImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomHandlerImpl extends MinimalEObjectImpl.Container implements RoomHandler {
    /**
     * The cached value of the '{@link #getRoomTypes() <em>Room Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getRoomTypes()
     */
    protected EList<RoomType> roomTypes;

    /**
     * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getRooms()
     */
    protected EList<Room> rooms;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    protected RoomHandlerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HotelsystemPackage.Literals.ROOM_HANDLER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<RoomType> getRoomTypes() {
        if (roomTypes == null) {
            roomTypes = new EObjectResolvingEList<RoomType>(RoomType.class, this,
                    HotelsystemPackage.ROOM_HANDLER__ROOM_TYPES);
        }
        return roomTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<Room> getRooms() {
        if (rooms == null) {
            rooms = new EObjectResolvingEList<Room>(Room.class, this, HotelsystemPackage.ROOM_HANDLER__ROOMS);
        }
        return rooms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<RoomType> getAllRoomTypes(int nrOfBeds) {
        EList<RoomType> result = new BasicEList<RoomType>();
        for (RoomType type : roomTypes) {
            if (type.getNumBeds() >= nrOfBeds) {
                result.add(type);
            }
        }
        return result;
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<Integer> getFreeRooms() {
        EList<Integer> freeRoomNbrs = new BasicEList<Integer>();
        for (Room room : rooms) {
            if (!(room.isOccupied() || room.isBlocked())) {
                int roomNumber = room.getRoomNumber();
                freeRoomNbrs.add(roomNumber);
            }
        }
        return freeRoomNbrs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<Room> getAllRoomsByType(RoomType roomType) {
        EList<Room> result = new BasicEList<Room>();
        for (Room room : rooms) {
            if (room.getRoomtype().getName().equals(roomType.getName())) {
                result.add(room);
            }
        }
        return result;
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean removeRoomType(String roomTypeName) {
        for (Room room : rooms) {
            RoomType roomType = room.getRoomtype();
            String description = roomType.getName();
            if (description.equals(roomTypeName)) {
                room.setRoomtype(null); //Throw exception or return false?
            }
        }
        RoomType roomType = null;
        for (RoomType type : roomTypes) {
            String description = type.getName();
            if (roomTypeName.equals(description)) {
                roomType = type;
                break;
            }
        }
        if (roomType == null) {
            return false;
        } else {
            roomTypes.remove(roomType);
            return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean changeRoomType(int roomNumber, String roomTypeName) {
        Room room = getRoom(roomNumber);
        RoomType rt = getRoomType(roomTypeName);
        if (room != null && rt != null) {
            room.setRoomtype(rt);
            return true;
        }

        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean addRoom(int roomNumber, String roomTypeName) {
        Room room = getRoom(roomNumber);
        RoomType thisRoomType = getRoomType(roomTypeName);
        if (thisRoomType == null || room != null || roomNumber < 1) {
            return false;
        }
        room = new RoomImpl();
        room.setRoomNumber(roomNumber);
        room.setRoomtype(thisRoomType);
        rooms.add(room);
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean removeRoom(int roomNumber) {
        Room room = getRoom(roomNumber);
        if (room != null && !room.isOccupied()) {
            rooms.remove(room);
            return true;
        }

        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean blockRoom(int roomNumber) {
        if (rooms == null || rooms.isEmpty()) {
            return false;
        }
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isOccupied()) {
                room.setBlocked(true);
                return true;
            }
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean unblockRoom(int roomNumber) {
        Room room = getRoom(roomNumber);
        if (null != room && !room.isOccupied() && room.isBlocked()) {
            room.setBlocked(false);
            return true;
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public void initialize(int numberOfRooms) {

        roomTypes = new BasicEList<RoomType>();
        rooms = new BasicEList<Room>();
        addRoomType("Default", 1000, 2, "None");

        for (int i = 0; i < numberOfRooms; i++) { //create all rooms
            addRoom(i + 1, roomTypes.get(0).getName());
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public RoomType getRoomType(String roomTypeName) {
        for (RoomType roomType : roomTypes) {
            if (roomType.getName().equals(roomTypeName)) {
                return roomType;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public Room getFreeRoomByType(String roomTypeName) {
        for (Room room : rooms) {
            if (room.getRoomtype().getName().equals(roomTypeName) && !room.isOccupied() && !room.isBlocked()) {
                return room;
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<Room> getAllRooms() {
        return rooms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean addRoomType(String roomTypeName, double price, int nbrOfBeds, String featureDescription) {
        for (RoomType checkType : roomTypes) {
            if (checkType.getName().equals(roomTypeName)) {
                // two room types cannot have the same description
                return false;
            }
        }
        RoomType type = new RoomTypeImpl();
        type.setName(roomTypeName);
        type.setPricePerNight(price);
        type.setNumBeds(nbrOfBeds);
        type.setDescription(featureDescription);
        roomTypes.add(type);
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public boolean editRoomType(String roomTypeName, double price, int nbrOfBeds, String featuresDescription) {
        RoomType roomType = getRoomType(roomTypeName);
        if (roomType != null) {
            roomType.setNumBeds(nbrOfBeds);
            roomType.setPricePerNight(price);
            roomType.setDescription(featuresDescription);
            return true;
        } else {
            return false;
        }
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case HotelsystemPackage.ROOM_HANDLER__ROOM_TYPES:
                return getRoomTypes();
            case HotelsystemPackage.ROOM_HANDLER__ROOMS:
                return getRooms();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case HotelsystemPackage.ROOM_HANDLER__ROOM_TYPES:
                getRoomTypes().clear();
                getRoomTypes().addAll((Collection<? extends RoomType>) newValue);
                return;
            case HotelsystemPackage.ROOM_HANDLER__ROOMS:
                getRooms().clear();
                getRooms().addAll((Collection<? extends Room>) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case HotelsystemPackage.ROOM_HANDLER__ROOM_TYPES:
                getRoomTypes().clear();
                return;
            case HotelsystemPackage.ROOM_HANDLER__ROOMS:
                getRooms().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case HotelsystemPackage.ROOM_HANDLER__ROOM_TYPES:
                return roomTypes != null && !roomTypes.isEmpty();
            case HotelsystemPackage.ROOM_HANDLER__ROOMS:
                return rooms != null && !rooms.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == IHotelAdministratorProvides.class) {
            switch (baseOperationID) {
                case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING:
                    return HotelsystemPackage.ROOM_HANDLER___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING;
                case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING:
                    return HotelsystemPackage.ROOM_HANDLER___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING;
                case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM_TYPE__STRING:
                    return HotelsystemPackage.ROOM_HANDLER___REMOVE_ROOM_TYPE__STRING;
                case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___CHANGE_ROOM_TYPE__INT_STRING:
                    return HotelsystemPackage.ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING;
                case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___ADD_ROOM__INT_STRING:
                    return HotelsystemPackage.ROOM_HANDLER___ADD_ROOM__INT_STRING;
                case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___REMOVE_ROOM__INT:
                    return HotelsystemPackage.ROOM_HANDLER___REMOVE_ROOM__INT;
                case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___BLOCK_ROOM__INT:
                    return HotelsystemPackage.ROOM_HANDLER___BLOCK_ROOM__INT;
                case HotelsystemPackage.IHOTEL_ADMINISTRATOR_PROVIDES___UNBLOCK_ROOM__INT:
                    return HotelsystemPackage.ROOM_HANDLER___UNBLOCK_ROOM__INT;
                default:
                    return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case HotelsystemPackage.ROOM_HANDLER___GET_ALL_ROOM_TYPES__INT:
                return getAllRoomTypes((Integer) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___GET_FREE_ROOMS:
                return getFreeRooms();
            case HotelsystemPackage.ROOM_HANDLER___GET_ALL_ROOMS_BY_TYPE__ROOMTYPE:
                return getAllRoomsByType((RoomType) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___GET_ROOM_TYPE__STRING:
                return getRoomType((String) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___GET_FREE_ROOM_BY_TYPE__STRING:
                return getFreeRoomByType((String) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___GET_ALL_ROOMS:
                return getAllRooms();
            case HotelsystemPackage.ROOM_HANDLER___ADD_ROOM_TYPE__STRING_DOUBLE_INT_STRING:
                return addRoomType((String) arguments.get(0), (Double) arguments.get(1), (Integer) arguments.get(2),
                        (String) arguments.get(3));
            case HotelsystemPackage.ROOM_HANDLER___EDIT_ROOM_TYPE__STRING_DOUBLE_INT_STRING:
                return editRoomType((String) arguments.get(0), (Double) arguments.get(1), (Integer) arguments.get(2),
                        (String) arguments.get(3));
            case HotelsystemPackage.ROOM_HANDLER___REMOVE_ROOM_TYPE__STRING:
                return removeRoomType((String) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING:
                return changeRoomType((Integer) arguments.get(0), (String) arguments.get(1));
            case HotelsystemPackage.ROOM_HANDLER___ADD_ROOM__INT_STRING:
                return addRoom((Integer) arguments.get(0), (String) arguments.get(1));
            case HotelsystemPackage.ROOM_HANDLER___REMOVE_ROOM__INT:
                return removeRoom((Integer) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___BLOCK_ROOM__INT:
                return blockRoom((Integer) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___UNBLOCK_ROOM__INT:
                return unblockRoom((Integer) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___GET_ROOM__INT:
                return getRoom((Integer) arguments.get(0));
            case HotelsystemPackage.ROOM_HANDLER___INITIALIZE__INT:
                initialize((Integer) arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //RoomHandlerImpl
