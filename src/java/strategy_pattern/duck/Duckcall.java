package strategy_pattern.duck;

import strategy_pattern.duck.behaviors.quack.Quack;
import strategy_pattern.duck.behaviors.quack.QuackBehavior;

/**
 * Concrete Class that uses behaviors, but is not a Duck object
 * Pattern - Strategy
 * Role - Client
 * @author Dante A.
 */
public class Duckcall {
    QuackBehavior quackBehavior;

    public Duckcall(){
        quackBehavior = new Quack();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
