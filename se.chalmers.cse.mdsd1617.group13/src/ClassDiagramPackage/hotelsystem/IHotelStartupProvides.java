/**
 */
package ClassDiagramPackage.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Startup Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagramPackage.hotelsystem.HotelsystemPackage#getIHotelStartupProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelStartupProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numRoomsRequired="true" numRoomsOrdered="false"
	 * @generated
	 */
	void startup(int numRooms);

} // IHotelStartupProvides
