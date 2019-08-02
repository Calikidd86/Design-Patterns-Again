package decorator_pattern.startbuzzcoffee;

/**
 * @author Dante
 * Decaf class extends Beverage.
 * Concrete component implementation in Decorator Pattern
 */
public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf Coffee";
    }

    public double cost() {
        return .99;
    }
}
