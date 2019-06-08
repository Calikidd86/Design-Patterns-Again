package ch1_strategy_pattern.duck.behaviors.fly;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
