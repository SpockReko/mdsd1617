/**
 */
package ClassDiagramPackage.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Administrator Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getIHotelAdministratorProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelAdministratorProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false" priceRequired="true" priceOrdered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false" featuresRequired="true" featuresOrdered="false"
	 * @generated
	 */
	boolean addRoomType(String roomType, double price, int nbrOfBeds, String features);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false" priceRequired="true" priceOrdered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false" featuresRequired="true" featuresOrdered="false"
	 * @generated
	 */
	boolean editRoomType(String roomType, double price, int nbrOfBeds, String features);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean removeRoomType(String roomType);

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
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean addRoom(int roomNumber, String roomType);

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
