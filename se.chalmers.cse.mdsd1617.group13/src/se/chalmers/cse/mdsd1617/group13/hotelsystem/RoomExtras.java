/**
 */
package se.chalmers.cse.mdsd1617.group13.hotelsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Extras</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras#getPrice <em>Price</em>}</li>
 * <li>{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomExtras()
 */
public interface RoomExtras extends EObject {

    /**
     * Returns the value of the '<em><b>Price</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Price</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setPrice(double)
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomExtras_Price()
     */
    double getPrice();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras#getPrice <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Price</em>' attribute.
     * @generated
     * @see #getPrice()
     */
    void setPrice(double value);

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
     * @see se.chalmers.cse.mdsd1617.group13.hotelsystem.HotelsystemPackage#getRoomExtras_Description()
     */
    String getDescription();

    /**
     * Sets the value of the '{@link se.chalmers.cse.mdsd1617.group13.hotelsystem.RoomExtras#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Description</em>' attribute.
     * @generated
     * @see #getDescription()
     */
    void setDescription(String value);
} // RoomExtras
