package ch1_strategy_pattern.duck.behaviors.quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Sillence >>");
    }
}
