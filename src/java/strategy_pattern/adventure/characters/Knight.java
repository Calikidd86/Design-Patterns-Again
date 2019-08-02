package strategy_pattern.adventure.characters;

import strategy_pattern.adventure.behavior.weapon.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }
}
