package ch1_strategy_pattern.duck;

import ch1_strategy_pattern.duck.behaviors.fly.FlyNoWay;
import ch1_strategy_pattern.duck.behaviors.quack.Quack;

import java.io.IOException;

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
