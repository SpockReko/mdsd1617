/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Room Types DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}</li>
 *   <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}</li>
 * </ul>
 *
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO()
 * @model
 * @generated
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
	 * @return the value of the '<em>Room Type Description</em>' attribute.
	 * @see #setRoomTypeDescription(String)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO_RoomTypeDescription()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getRoomTypeDescription();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getRoomTypeDescription <em>Room Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Description</em>' attribute.
	 * @see #getRoomTypeDescription()
	 * @generated
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
	 * @return the value of the '<em>Num Beds</em>' attribute.
	 * @see #setNumBeds(int)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO_NumBeds()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumBeds();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumBeds <em>Num Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Beds</em>' attribute.
	 * @see #getNumBeds()
	 * @generated
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
	 * @return the value of the '<em>Price Per Night</em>' attribute.
	 * @see #setPricePerNight(double)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO_PricePerNight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPricePerNight();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getPricePerNight <em>Price Per Night</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Per Night</em>' attribute.
	 * @see #getPricePerNight()
	 * @generated
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
	 * @return the value of the '<em>Num Free Rooms</em>' attribute.
	 * @see #setNumFreeRooms(int)
	 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getFreeRoomTypesDTO_NumFreeRooms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumFreeRooms();

	/**
	 * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.FreeRoomTypesDTO#getNumFreeRooms <em>Num Free Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Free Rooms</em>' attribute.
	 * @see #getNumFreeRooms()
	 * @generated
	 */
	void setNumFreeRooms(int value);

} // FreeRoomTypesDTO