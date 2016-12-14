/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Administrator Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getIHotelAdministratorProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelAdministratorProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeDescriptionRequired="true" roomTypeDescriptionOrdered="false" priceRequired="true" priceOrdered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false"
	 * @generated
	 */
	boolean addRoomType(String roomTypeDescription, double price, int nbrOfBeds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeDescriptionRequired="true" roomTypeDescriptionOrdered="false" priceRequired="true" priceOrdered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false"
	 * @generated
	 */
	boolean editRoomType(String roomTypeDescription, double price, int nbrOfBeds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeDescriptionRequired="true" roomTypeDescriptionOrdered="false"
	 * @generated
	 */
	boolean removeRoomType(String roomTypeDescription);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean changeRoomType(int roomNumber, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false" roomTypeDescriptionRequired="true" roomTypeDescriptionOrdered="false"
	 * @generated
	 */
	boolean addRoom(int roomNumber, String roomTypeDescription);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	boolean removeRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	boolean blockRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	boolean unblockRoom(int roomNumber);

} // IHotelAdministratorProvides
