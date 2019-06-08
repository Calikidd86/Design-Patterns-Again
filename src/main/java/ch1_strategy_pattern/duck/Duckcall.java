package ch1_strategy_pattern.duck;

import ch1_strategy_pattern.duck.behaviors.quack.Quack;
import ch1_strategy_pattern.duck.behaviors.quack.QuackBehavior;

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
