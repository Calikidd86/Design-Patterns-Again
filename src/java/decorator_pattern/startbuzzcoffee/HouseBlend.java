package decorator_pattern.startbuzzcoffee;

/**
 * @author Dante
 * HouseBlend class extends Beverage.
 * Concrete component implementation in Decorator Pattern
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    public double cost() {
        return .89;
    }
}
