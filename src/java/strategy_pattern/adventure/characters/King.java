package strategy_pattern.adventure.characters;

import strategy_pattern.adventure.behavior.weapon.KnifeBehavior;

public class King extends Character {

    public King() {
        weapon = new KnifeBehavior();
    }

}
