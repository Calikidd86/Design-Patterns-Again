package ch1_strategy_pattern.adventure.characters;

import ch1_strategy_pattern.adventure.behavior.weapon.WeaponBehavior;
import ch1_strategy_pattern.adventure.behavior.special.SpecialBehavior;

public class Character {
    protected WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }
}
