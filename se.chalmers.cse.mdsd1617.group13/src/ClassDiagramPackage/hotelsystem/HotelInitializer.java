/**
 */
package ClassDiagramPackage.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.HotelInitializer#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.HotelInitializer#getReservationhandler <em>Reservationhandler</em>}</li>
 * </ul>
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getHotelInitializer()
 * @model
 * @generated
 */
public interface HotelInitializer extends EObject {
	/**
	 * Returns the value of the '<em><b>Roomhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomhandler</em>' reference.
	 * @see #setRoomhandler(RoomHandler)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getHotelInitializer_Roomhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomHandler getRoomhandler();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.HotelInitializer#getRoomhandler <em>Roomhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomhandler</em>' reference.
	 * @see #getRoomhandler()
	 * @generated
	 */
	void setRoomhandler(RoomHandler value);

	/**
	 * Returns the value of the '<em><b>Reservationhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservationhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservationhandler</em>' reference.
	 * @see #setReservationhandler(ReservationHandler)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getHotelInitializer_Reservationhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReservationHandler getReservationhandler();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.HotelInitializer#getReservationhandler <em>Reservationhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservationhandler</em>' reference.
	 * @see #getReservationhandler()
	 * @generated
	 */
	void setReservationhandler(ReservationHandler value);

} // HotelInitializer
