package ch3_decorator_pattern.startbuzzcoffee;

/**
 * @author Dante
 * DarkRoast extends Beverage class
 * Concrete component in decorator pattern
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Most Excellent Dark Roast";
    }

    public double cost() {
        return 1.25;
    }
}
