package strategy_pattern.adventure.behavior.special;

import strategy_pattern.adventure.behavior.weapon.WeaponBehavior;

/**
 * SpecialBehavior abstract class is the Decorator for WeaponBehavior.
 * Role - Decorator
 * Pattern - Strategy / Decorator
 *
 * @author Dante A.
 */
public abstract class SpecialBehavior implements WeaponBehavior {

    WeaponBehavior weaponBehavior;

    public abstract String useWeapon();

}
