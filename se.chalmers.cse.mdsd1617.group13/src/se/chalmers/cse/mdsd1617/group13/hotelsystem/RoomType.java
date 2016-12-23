/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getDescription <em>Description</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getNumBeds <em>Num Beds</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getPricePerNight <em>Price Per Night</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomType()
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
     *
     * @return the value of the '<em>Description</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setDescription(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomType_Description()
     */
    String getDescription();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Description</em>' attribute.
     * @generated
     * @see #getDescription()
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
     *
     * @return the value of the '<em>Num Beds</em>' attribute.
     * @model unique="false" required="true" ordered="false"
     * @generated
     * @see #setNumBeds(int)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomType_NumBeds()
     */
    int getNumBeds();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getNumBeds <em>Num Beds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Num Beds</em>' attribute.
     * @generated
     * @see #getNumBeds()
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
     *
     * @return the value of the '<em>Price Per Night</em>' attribute.
     * @model unique="false" required="true" ordered="false"
     * @generated
     * @see #setPricePerNight(double)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomType_PricePerNight()
     */
    double getPricePerNight();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getPricePerNight <em>Price Per Night</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Price Per Night</em>' attribute.
     * @generated
     * @see #getPricePerNight()
     */
    void setPricePerNight(double value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Name</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setName(String)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomType_Name()
     */
    String getName();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Name</em>' attribute.
     * @generated
     * @see #getName()
     */
    void setName(String value);

} // RoomType
