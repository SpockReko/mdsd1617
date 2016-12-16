/**
 */
package se.chalmers.cse.mdsd1617.group13.z;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Administrator Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see se.chalmers.cse.mdsd1617.group13.z.ZPackage#getIHotelAdministratorProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelAdministratorProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false" priceRequired="true" priceOrdered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false" featureDescriptionRequired="true" featureDescriptionOrdered="false"
	 * @generated
	 */
	boolean addRoomType(String roomTypeName, double price, int nbrOfBeds, String featureDescription);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false" priceRequired="true" priceOrdered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false" featuresDescriptionRequired="true" featuresDescriptionOrdered="false"
	 * @generated
	 */
	boolean editRoomType(String roomTypeName, double price, int nbrOfBeds, String featuresDescription);

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
