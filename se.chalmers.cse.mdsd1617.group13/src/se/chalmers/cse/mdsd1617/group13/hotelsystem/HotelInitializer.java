/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer#getRoomHandler <em>Room Handler</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getHotelInitializer()
 */
public interface HotelInitializer extends IHotelStartupProvides {
    /**
     * Returns the value of the '<em><b>Room Handler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Handler</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Room Handler</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setRoomHandler(RoomHandler)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getHotelInitializer_RoomHandler()
     */
    RoomHandler getRoomHandler();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelInitializer#getRoomHandler <em>Room Handler</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Room Handler</em>' reference.
     * @generated
     * @see #getRoomHandler()
     */
    void setRoomHandler(RoomHandler value);

} // HotelInitializer
