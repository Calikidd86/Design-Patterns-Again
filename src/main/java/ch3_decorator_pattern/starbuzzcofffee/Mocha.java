package ch3_decorator_pattern.starbuzzcofffee;

/**
 * @author Dante
 * Mocha class extends CondimentDecorator
 * concrete decorator in decorator pattern.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .15;
    }
}
