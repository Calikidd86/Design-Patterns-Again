package strategy_pattern.duck.behaviors.quack;

/**
 * Concrete Quack Behavior implement QuackBehavior
 * Pattern - Strategy
 * Role - Encapsulated Behavior (Class)
 *
 * @author Dante A.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
