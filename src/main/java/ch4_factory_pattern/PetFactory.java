package ch4_factory_pattern;

/**
 * The Pet factory. Responsible for Pet object creation (Factory)
 * Pattern - Factory
 * Role - Factory
 * @author Dante
 */
public class PetFactory {

    /**
     * The Pet.
     */
    Pet pet;

    /**
     * Create pet pet.
     *
     * @param animal the animal
     * @return the pet
     */
    public Pet createPet(String animal){
        Pet pet = null;

        if (animal.equalsIgnoreCase("Dog")){
            pet = new Dog();
        } else if (animal.equalsIgnoreCase("Cat")){
            pet = new Cat();
        } else if (animal.equalsIgnoreCase("Bunny")) {
            pet = new Bunny();
        }

        return pet;
    }
}
