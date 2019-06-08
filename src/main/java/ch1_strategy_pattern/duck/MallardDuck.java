package ch1_strategy_pattern.duck;

import ch1_strategy_pattern.duck.behaviors.fly.FlyWithWings;
import ch1_strategy_pattern.duck.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("I'm a real Mallard duck");
    }
}
