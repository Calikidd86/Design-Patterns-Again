package ch4_factory_pattern.pet_store;

/**
 * A Pet store that use a PetFactory.
 * Pattern - Factory Method
 * Role - Client
 * @author Dante A.
 */
public class PetStore {

    /**
     * The Pet factory.
     */
    PetFactory petFactory;

    /**
     * Purchase Pet.
     *
     * @param pet the pet type
     * @return the pet
     */
    public Pet purchasePet(String pet){
        return petFactory.createPet(pet);
    }
}
