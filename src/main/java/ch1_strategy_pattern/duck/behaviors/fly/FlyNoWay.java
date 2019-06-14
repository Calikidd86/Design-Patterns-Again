package ch1_strategy_pattern.duck.behaviors.fly;

/**
 * Concrete Fly Behavior implements FlyBehavior
 * Pattern - Strategy
 * Role - Encapsulated Behavior (Class)
 *
 * @author Dante A.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
