package ch3_decorator_pattern.starbuzzcofffee;

/**
 * @author Dante
 * abstract decorator component in decorator pattern
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();

}
