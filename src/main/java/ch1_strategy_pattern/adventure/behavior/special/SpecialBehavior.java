package ch1_strategy_pattern.adventure.behavior.special;

import ch1_strategy_pattern.adventure.behavior.weapon.WeaponBehavior;

public abstract class SpecialBehavior implements WeaponBehavior {

    WeaponBehavior weaponBehavior;

    public abstract String useWeapon();

}
