package strategy_pattern.duck.behaviors.fly;

/**
 * Concrete Fly Behavior implements FlyBehavior
 * Pattern - Strategy
 * Role - Encapsulated Behavior (Class)
 *
 * @author Dante A.
 */
public class FlyRockertPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
