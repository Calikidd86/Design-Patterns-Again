package decorator_pattern.startbuzzcoffee;

/**
 * @author Dante
 * Soy class extends CondimentDecorator
 * Soy concrete decorator in decorator pattern
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}
