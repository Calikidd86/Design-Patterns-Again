package factory_pattern.pet_store;

import factory_pattern.pet_store.products.Bunny;
import factory_pattern.pet_store.products.Cat;
import factory_pattern.pet_store.products.Dog;
import factory_pattern.pet_store.products.Pet;

/**
 * The Pet factory. Responsible for Pet object creation (Factory)
 * Pattern - Factory
 * Role - Factory
 * @author Dante
 */
public class PetFactory {

    /**
     * create a pet of the specified type.
     * @param petType target pet type.
     * @return pet of provided petType.
     */
    public Pet createPet(PetType petType){
        Pet pet = null;

        switch (petType){
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case BUNNY:
                return new Bunny();
        }

        return null;
    }
}
