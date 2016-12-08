/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IReceptionist Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getIReceptionistProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IReceptionistProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationIdRequired="true" reservationIdOrdered="false" firstNameRequired="true" firstNameOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	void editBookingTime(int reservationId, String firstName, String endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationIdRequired="true" reservationIdOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" numberOfRoomsForTypeRequired="true" numberOfRoomsForTypeOrdered="false"
	 * @generated
	 */
	boolean addRoomTypeToBooking(int reservationId, String roomType, int numberOfRoomsForType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationIdRequired="true" reservationIdOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean removeRoomTypeFromBooking(int reservationId, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationIdRequired="true" reservationIdOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" numberOfRoomsForTypeRequired="true" numberOfRoomsForTypeOrdered="false"
	 * @generated
	 */
	boolean editRoomType(int reservationId, String roomType, int numberOfRoomsForType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	EList<Integer> listFreeRooms(int reservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" reservationIdRequired="true" reservationIdOrdered="false" roomNumbersRequired="true" roomNumbersOrdered="false"
	 * @generated
	 */
	EList checkIn(int reservationId, int roomNumbers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	boolean cancelBooking(int reservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> listBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	EList<Booking> listOccupiedRooms(String date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" startDateRequired="true" startDateOrdered="false"
	 * @generated
	 */
	EList listCheckins(String startDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	EList listCheckouts(String startDate, String endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationIdRequired="true" reservationIdOrdered="false" roomNumberRequired="true" roomNumberOrdered="false" extraDescriptionRequired="true" extraDescriptionOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	boolean addExtraToRoom(int reservationId, int roomNumber, String extraDescription, int price);

} // IReceptionistProvides
