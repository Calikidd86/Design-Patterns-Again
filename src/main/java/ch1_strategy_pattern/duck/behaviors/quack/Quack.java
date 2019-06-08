package ch1_strategy_pattern.duck.behaviors.quack;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
