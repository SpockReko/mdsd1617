/**
 */
package ClassDiagramPackage.hotelsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.Reservation#getCustomer <em>Customer</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.Reservation#getRoomreservation <em>Roomreservation</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.Reservation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.Reservation#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservation_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.Reservation#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Roomreservation</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagramPackage.hotelsystem.RoomReservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomreservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomreservation</em>' reference list.
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservation_Roomreservation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomReservation> getRoomreservation();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservation_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.Reservation#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getReservation_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.Reservation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	Reservation Reservation(String firstName, String lastName, String startDate, String endDate, int id);

} // Reservation
