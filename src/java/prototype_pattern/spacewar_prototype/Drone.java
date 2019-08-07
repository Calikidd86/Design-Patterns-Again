package prototype_pattern.spacewar_prototype;

public class Drone extends Enemy {

    public Drone(){
        super();
    }

    void addAlien() {
        this.clone();
    }
}
