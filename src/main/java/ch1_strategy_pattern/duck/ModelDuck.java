package ch1_strategy_pattern.duck;

import ch1_strategy_pattern.duck.behaviors.fly.FlyNoWay;
import ch1_strategy_pattern.duck.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
