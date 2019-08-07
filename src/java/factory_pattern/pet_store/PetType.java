package factory_pattern.pet_store;

public enum PetType {
    BUNNY("Bunny"), CAT("Cat"), DOG("Dog");

    private String name;

    PetType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static PetType fromString(String name) {
        for (PetType p : PetType.values()) {
            if (p.name.equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new IllegalArgumentException("We don't carry those, buster!");
    }
}
