package ch1_strategy_pattern.duck.behaviors.fly;

public class FlyRockertPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
