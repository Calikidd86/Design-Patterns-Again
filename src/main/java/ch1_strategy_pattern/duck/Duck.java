package ch1_strategy_pattern.duck;

import ch1_strategy_pattern.duck.behaviors.fly.FlyBehavior;
import ch1_strategy_pattern.duck.behaviors.quack.QuackBehavior;

/**
 * Abstract Duck Class that is composed of behaviors
 * Pattern - Strategy
 * Role - Client
 *
 * @author Dante A.
 */
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(){}

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
