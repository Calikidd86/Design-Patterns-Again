package strategy_pattern.duck.behaviors.quack;

/**
 * Concrete Quack Behavior implement QuackBehavior
 * Pattern - Strategy
 * Role - Encapsulated Behavior (Class)
 *
 * @author Dante A.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Sillence >>");
    }
}
