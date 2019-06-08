package ch1_strategy_pattern.adventure.behavior.special;

import ch1_strategy_pattern.adventure.behavior.weapon.WeaponBehavior;

public abstract class SwordSpecialBehavior extends SpecialBehavior  {

    String description;

    public SwordSpecialBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public String useWeapon() {
        return weaponBehavior.useWeapon() + this.description;
    }

    public String getDescription() {
        return description;
    }
}
