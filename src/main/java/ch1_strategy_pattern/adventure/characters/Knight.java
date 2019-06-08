package ch1_strategy_pattern.adventure.characters;

import ch1_strategy_pattern.adventure.behavior.weapon.SwordBehavior;
import ch1_strategy_pattern.adventure.characters.Character;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }
}
