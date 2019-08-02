package strategy_pattern.duck;

import strategy_pattern.duck.behaviors.fly.FlyNoWay;
import strategy_pattern.duck.behaviors.quack.Quack;

/**
 * Concrete Duck Class that uses behaviors
 * Pattern - Strategy
 * Role - Client
 *
 * @author Dante A.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
