package ch1_strategy_pattern.duck;

import ch1_strategy_pattern.duck.behaviors.fly.FlyBehavior;
import ch1_strategy_pattern.duck.behaviors.quack.QuackBehavior;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Duck class. Practicing creating a class while using proper design techniques.
 * As the Fly and Quack behaviors may vary for each duck, we have turned them into
 * interfaces. This allows us flexibility when creating objects of this class.
 */
public abstract class Duck {

    private static final Logger LOGGER = LogManager.getLogger();
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void display() {

    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
