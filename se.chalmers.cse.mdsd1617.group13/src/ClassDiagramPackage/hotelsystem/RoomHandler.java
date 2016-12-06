/**
 */
package ClassDiagramPackage.hotelsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.hotelsystem.RoomHandler#getIadminroomtypeprovides <em>Iadminroomtypeprovides</em>}</li>
 *   <li>{@link ClassDiagramPackage.hotelsystem.RoomHandler#getIadminroomprovides <em>Iadminroomprovides</em>}</li>
 * </ul>
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoomHandler()
 * @model
 * @generated
 */
public interface RoomHandler extends IHotelStartupProvides, IRoomHandler {
	/**
	 * Returns the value of the '<em><b>Iadminroomtypeprovides</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagramPackage.hotelsystem.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iadminroomtypeprovides</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iadminroomtypeprovides</em>' reference list.
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoomHandler_Iadminroomtypeprovides()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomType> getIadminroomtypeprovides();

	/**
	 * Returns the value of the '<em><b>Iadminroomprovides</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagramPackage.hotelsystem.IAdminRoomProvides}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iadminroomprovides</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iadminroomprovides</em>' reference list.
	 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getRoomHandler_Iadminroomprovides()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IAdminRoomProvides> getIadminroomprovides();

} // RoomHandler
