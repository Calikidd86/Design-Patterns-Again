package strategy_pattern.adventure.behavior.special;

import strategy_pattern.adventure.behavior.weapon.WeaponBehavior;

/**
 * SwordSpecialBehavior concrete decorator class for WeaponBehavior.
 * Role - Concrete Decorator
 * Pattern - Strategy / Decorator
 *
 * @author Dante A.
 */
public class SwordSpecialBehavior extends SpecialBehavior  {

    private String description = "The edge of this weapon begins to shimmer menacingly... ";

    public SwordSpecialBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public String useWeapon() {
        return this.description + weaponBehavior.useWeapon();
    }

    public String getDescription() {
        return description;
    }
}
