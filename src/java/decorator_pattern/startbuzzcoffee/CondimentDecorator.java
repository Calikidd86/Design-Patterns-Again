package decorator_pattern.startbuzzcoffee;

/**
 * @author Dante
 * abstract decorator component in decorator pattern
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();

}
