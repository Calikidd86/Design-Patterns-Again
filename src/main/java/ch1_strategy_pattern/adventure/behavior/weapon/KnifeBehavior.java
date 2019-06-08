package ch1_strategy_pattern.adventure.behavior.weapon;

public class KnifeBehavior implements WeaponBehavior {

    public void useWeapon() {
        System.out.println("Cutting with Knife");
    }
}
