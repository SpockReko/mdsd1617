/**
 */
package ClassDiagramPackage;

import ClassDiagramPackage.hotelsystem.IHotelAdministratorProvides;
import ClassDiagramPackage.hotelsystem.IHotelStartupProvides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagramPackage.Administrator#getIadministratorprovides <em>Iadministratorprovides</em>}</li>
 *   <li>{@link ClassDiagramPackage.Administrator#getIhotelstartupprovides <em>Ihotelstartupprovides</em>}</li>
 * </ul>
 *
 * @see ClassDiagramPackage.ClassDiagramPackagePackage#getAdministrator()
 * @model
 * @generated
 */
public interface Administrator extends User {
	/**
	 * Returns the value of the '<em><b>Iadministratorprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iadministratorprovides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iadministratorprovides</em>' reference.
	 * @see #setIadministratorprovides(IHotelAdministratorProvides)
	 * @see ClassDiagramPackage.ClassDiagramPackagePackage#getAdministrator_Iadministratorprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IHotelAdministratorProvides getIadministratorprovides();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.Administrator#getIadministratorprovides <em>Iadministratorprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iadministratorprovides</em>' reference.
	 * @see #getIadministratorprovides()
	 * @generated
	 */
	void setIadministratorprovides(IHotelAdministratorProvides value);

	/**
	 * Returns the value of the '<em><b>Ihotelstartupprovides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ihotelstartupprovides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ihotelstartupprovides</em>' reference.
	 * @see #setIhotelstartupprovides(IHotelStartupProvides)
	 * @see ClassDiagramPackage.ClassDiagramPackagePackage#getAdministrator_Ihotelstartupprovides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IHotelStartupProvides getIhotelstartupprovides();

	/**
	 * Sets the value of the '{@link ClassDiagramPackage.Administrator#getIhotelstartupprovides <em>Ihotelstartupprovides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ihotelstartupprovides</em>' reference.
	 * @see #getIhotelstartupprovides()
	 * @generated
	 */
	void setIhotelstartupprovides(IHotelStartupProvides value);

} // Administrator
