package decorator_pattern.startbuzzcoffee;

/**
 * @author Dante
 * Espresso class extends Beverage abstract class.
 * Concrete component in decorator pattern.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
