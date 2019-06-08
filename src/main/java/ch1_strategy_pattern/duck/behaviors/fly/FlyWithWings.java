package ch1_strategy_pattern.duck.behaviors.fly;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}
