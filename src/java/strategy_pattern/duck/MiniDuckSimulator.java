package strategy_pattern.duck;

import strategy_pattern.duck.behaviors.fly.FlyNoWay;
import strategy_pattern.duck.behaviors.fly.FlyRockertPowered;
import strategy_pattern.duck.behaviors.quack.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRockertPowered());
        model.performFly();

        Duckcall duckcall = new Duckcall();

        duckcall.performQuack();
    }
}
