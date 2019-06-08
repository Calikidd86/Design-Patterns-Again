package ch1_strategy_pattern.duck.behaviors.quack;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
