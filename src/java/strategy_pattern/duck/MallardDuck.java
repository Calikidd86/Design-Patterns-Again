package strategy_pattern.duck;

import strategy_pattern.duck.behaviors.fly.FlyWithWings;
import strategy_pattern.duck.behaviors.quack.Quack;

/**
 * Concrete Duck Class that uses behaviors
 * Pattern - Strategy
 * Role - Client
 *
 * @author Dante A.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
