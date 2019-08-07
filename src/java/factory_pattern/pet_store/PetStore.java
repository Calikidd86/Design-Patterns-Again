package factory_pattern.pet_store;

import factory_pattern.pet_store.products.Pet;

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
    PetFactory petFactory = new PetFactory();

    /**
     * Purchase Pet.
     *
     * @param pet the pet type
     * @return the pet
     */
    public Pet purchasePet(String pet){
        PetType petType = PetType.fromString(pet);
        return petFactory.createPet(petType);
    }

    public static void main(String[] args) {
        PetStore petStore = new PetStore();

        Pet puppy = petStore.purchasePet("Dog");
        Pet bunny = petStore.purchasePet("Bunny");
        Pet walrus = petStore.purchasePet("Walrus");

        System.out.println("Pet 1 is a " + puppy.getClass() + " and Pet 2 is a " + bunny.getClass());
    }
}
