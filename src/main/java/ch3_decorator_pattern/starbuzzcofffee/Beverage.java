package ch3_decorator_pattern.starbuzzcofffee;

/**
 * @author Dante
 * abstract component in decorator pattern
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
