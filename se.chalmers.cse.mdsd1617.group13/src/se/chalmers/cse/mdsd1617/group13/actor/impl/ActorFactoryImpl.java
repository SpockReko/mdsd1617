/**
 */
package se.chalmers.cse.mdsd1617.group13.actor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import se.chalmers.cse.mdsd1617.group13.actor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActorFactoryImpl extends EFactoryImpl implements ActorFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static ActorFactory init() {
        try {
            ActorFactory theActorFactory = (ActorFactory) EPackage.Registry.INSTANCE.getEFactory(ActorPackage.eNS_URI);
            if (theActorFactory != null) {
                return theActorFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ActorFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ActorFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ActorPackage.USER:
                return createUser();
            case ActorPackage.RECEPTIONIST:
                return createReceptionist();
            case ActorPackage.ADMINISTRATOR:
                return createAdministrator();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public User createUser() {
        UserImpl user = new UserImpl();
        return user;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Receptionist createReceptionist() {
        ReceptionistImpl receptionist = new ReceptionistImpl();
        return receptionist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Administrator createAdministrator() {
        AdministratorImpl administrator = new AdministratorImpl();
        return administrator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ActorPackage getActorPackage() {
        return (ActorPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @deprecated
     */
    @Deprecated
    public static ActorPackage getPackage() {
        return ActorPackage.eINSTANCE;
    }

} //ActorFactoryImpl
