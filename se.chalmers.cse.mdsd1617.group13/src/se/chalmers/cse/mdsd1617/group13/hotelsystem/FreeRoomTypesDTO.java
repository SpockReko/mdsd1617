/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Room Types DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO()
 */
public interface FreeRoomTypesDTO extends EObject {
    /**
     * Returns the value of the '<em><b>Room Type Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Type Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Type Description</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomTypeDescription(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO_RoomTypeDescription()
     */
    String getRoomTypeDescription();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Room Type Description</em>' attribute.
     * @generated
     * @see #getRoomTypeDescription()
     */
    void setRoomTypeDescription(String value);

    /**
     * Returns the value of the '<em><b>Num Beds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Num Beds</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Num Beds</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setNumBeds(int)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO_NumBeds()
     */
    int getNumBeds();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Num Beds</em>' attribute.
     * @generated
     * @see #getNumBeds()
     */
    void setNumBeds(int value);

    /**
     * Returns the value of the '<em><b>Price Per Night</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price Per Night</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Price Per Night</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setPricePerNight(double)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO_PricePerNight()
     */
    double getPricePerNight();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Price Per Night</em>' attribute.
     * @generated
     * @see #getPricePerNight()
     */
    void setPricePerNight(double value);

    /**
     * Returns the value of the '<em><b>Num Free Rooms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Num Free Rooms</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Num Free Rooms</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setNumFreeRooms(int)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO_NumFreeRooms()
     */
    int getNumFreeRooms();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Num Free Rooms</em>' attribute.
     * @generated
     * @see #getNumFreeRooms()
     */
    void setNumFreeRooms(int value);

} // FreeRoomTypesDTO
