package strategy_pattern.adventure.characters;

import strategy_pattern.adventure.behavior.weapon.WeaponBehavior;

public class Character {
    protected WeaponBehavior weapon;

    public String fight() {
        return weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }
}
