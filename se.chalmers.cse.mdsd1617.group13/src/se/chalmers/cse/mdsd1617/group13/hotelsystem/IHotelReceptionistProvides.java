/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Receptionist Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getIHotelReceptionistProvides()
 */
public interface IHotelReceptionistProvides extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" reservationIdRequired="true" reservationIdOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
     * @generated
     */
    boolean editBookingTime(int reservationId, String startDate, String endDate);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false" numberOfRoomsForTypeRequired="true" numberOfRoomsForTypeOrdered="false"
     * @generated
     */
    boolean addRoomTypeToBooking(int bookingId, String roomTypeName, int numberOfRoomsForType);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" nbrToRemoveRequired="true" nbrToRemoveOrdered="false"
     * @generated
     */
    boolean removeRoomTypeFromBooking(int bookingId, String roomType, int nbrToRemove);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
     * @generated
     */
    EList<Integer> listFreeRooms(int bookingId);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" many="false" ordered="false" bookingIdRequired="true" bookingIdOrdered="false" roomNumbersRequired="true" roomNumbersOrdered="false"
     * @generated
     */
    EList checkIn(int bookingId, int roomNumbers);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
     * @generated
     */
    boolean cancelBooking(int bookingId);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model ordered="false"
     * @generated
     */
    EList<Booking> listBookings();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" dateRequired="true" dateOrdered="false"
     * @generated
     */
    Map listOccupiedRooms(String date);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" many="false" ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
     * @generated
     */
    EList listCheckins(String startDate, String endDate);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" many="false" ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
     * @generated
     */
    EList listCheckouts(String startDate, String endDate);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false" roomNumberRequired="true" roomNumberOrdered="false" extraDescriptionRequired="true" extraDescriptionOrdered="false" priceRequired="true" priceOrdered="false"
     * @generated
     */
    boolean addExtraToRoom(int bookingId, int roomNumber, String extraDescription, int price);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
     * @generated
     */
    Room getFreeRoom(RoomType roomType, String startDate, String endDate);

} // IHotelReceptionistProvides
