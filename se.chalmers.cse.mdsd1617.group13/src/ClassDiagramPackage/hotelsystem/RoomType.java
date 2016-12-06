/**
 */
package ClassDiagramPackage.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.RoomType#getDescription <em>Description</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.RoomType#getNumBeds <em>Num Beds</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.RoomType#getPricePerNight <em>Price Per Night</em>}</li>
 * </ul>
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoomType_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.RoomType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoomType_NumBeds()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getNumBeds();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.RoomType#getNumBeds <em>Num Beds</em>}' attribute.
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
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoomType_PricePerNight()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	double getPricePerNight();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.RoomType#getPricePerNight <em>Price Per Night</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Per Night</em>' attribute.
	 * @see #getPricePerNight()
	 * @generated
	 */
	void setPricePerNight(double value);

} // RoomType
