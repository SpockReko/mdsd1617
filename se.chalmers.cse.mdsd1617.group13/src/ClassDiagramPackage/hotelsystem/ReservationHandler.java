/**
 */
package ClassDiagramPackage.hotelsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getReservation <em>Reservation</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getPaymenthandler <em>Paymenthandler</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getCurrentReservationId <em>Current Reservation Id</em>}</li>
 * </ul>
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservationHandler()
 * @model
 * @generated
 */
public interface ReservationHandler extends IReceptionistProvides {
	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagramPackage.hotelsystem.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference list.
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservationHandler_Reservation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Reservation> getReservation();

	/**
	 * Returns the value of the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymenthandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymenthandler</em>' reference.
	 * @see #setPaymenthandler(PaymentHandler)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservationHandler_Paymenthandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentHandler getPaymenthandler();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getPaymenthandler <em>Paymenthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymenthandler</em>' reference.
	 * @see #getPaymenthandler()
	 * @generated
	 */
	void setPaymenthandler(PaymentHandler value);

	/**
	 * Returns the value of the '<em><b>Roomhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomhandler</em>' reference.
	 * @see #setRoomhandler(IRoomHandler)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservationHandler_Roomhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IRoomHandler getRoomhandler();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getRoomhandler <em>Roomhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomhandler</em>' reference.
	 * @see #getRoomhandler()
	 * @generated
	 */
	void setRoomhandler(IRoomHandler value);

	/**
	 * Returns the value of the '<em><b>Current Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Reservation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Reservation Id</em>' attribute.
	 * @see #setCurrentReservationId(int)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservationHandler_CurrentReservationId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCurrentReservationId();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.ReservationHandler#getCurrentReservationId <em>Current Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Reservation Id</em>' attribute.
	 * @see #getCurrentReservationId()
	 * @generated
	 */
	void setCurrentReservationId(int value);

} // ReservationHandler
