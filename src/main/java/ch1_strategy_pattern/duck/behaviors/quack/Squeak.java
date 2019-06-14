package ch1_strategy_pattern.duck.behaviors.quack;

/**
 * Concrete Quack Behavior implement QuackBehavior
 * Pattern - Strategy
 * Role - Encapsulated Behavior (Class)
 *
 * @author Dante A.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
