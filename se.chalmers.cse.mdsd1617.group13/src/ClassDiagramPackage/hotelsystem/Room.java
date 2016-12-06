/**
 */
package ClassDiagramPackage.hotelsystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.Room#isOccupied <em>Occupied</em>}</li>
 * </ul>
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends IAdminRoomProvides, IReceptionistRoomProvides {
	/**
	 * Returns the value of the '<em><b>Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupied</em>' attribute.
	 * @see #setOccupied(boolean)
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoom_Occupied()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOccupied();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.hotelsystem.Room#isOccupied <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupied</em>' attribute.
	 * @see #isOccupied()
	 * @generated
	 */
	void setOccupied(boolean value);

} // Room
