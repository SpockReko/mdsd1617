/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Administrator Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getIHotelAdministratorProvides()
 */
public interface IHotelAdministratorProvides extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false" priceRequired="true" priceOrdered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false" featureDescriptionRequired="true" featureDescriptionOrdered="false"
     * @generated
     */
    boolean addRoomType(String roomTypeName, double price, int nbrOfBeds, String featureDescription);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false" priceRequired="true" priceOrdered="false" nbrOfBedsRequired="true" nbrOfBedsOrdered="false" featuresDescriptionRequired="true" featuresDescriptionOrdered="false"
     * @generated
     */
    boolean editRoomType(String roomTypeName, double price, int nbrOfBeds, String featuresDescription);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false"
     * @generated
     */
    boolean removeRoomType(String roomTypeName);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false"
     * @generated
     */
    boolean changeRoomType(int roomNumber, String roomTypeName);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false" roomTypeNameRequired="true" roomTypeNameOrdered="false"
     * @generated
     */
    boolean addRoom(int roomNumber, String roomTypeName);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
     * @generated
     */
    boolean removeRoom(int roomNumber);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
     * @generated
     */
    boolean blockRoom(int roomNumber);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
     * @generated
     */
    boolean unblockRoom(int roomNumber);

} // IHotelAdministratorProvides
