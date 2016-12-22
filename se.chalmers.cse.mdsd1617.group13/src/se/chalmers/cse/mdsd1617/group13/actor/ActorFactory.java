/**
 */
package se.chalmers.cse.mdsd1617.group13.actor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.chalmers.cse.mdsd1617.group13.actor.ActorPackage
 * @generated
 */
public interface ActorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActorFactory eINSTANCE = se.chalmers.cse.mdsd1617.group13.actor.impl.ActorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Receptionist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receptionist</em>'.
	 * @generated
	 */
	Receptionist createReceptionist();

	/**
	 * Returns a new object of class '<em>Administrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Administrator</em>'.
	 * @generated
	 */
	Administrator createAdministrator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActorPackage getActorPackage();

} //ActorFactory
