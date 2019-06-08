package ch1_strategy_pattern.adventure.characters;

import ch1_strategy_pattern.adventure.behavior.weapon.KnifeBehavior;
import ch1_strategy_pattern.adventure.characters.Character;

public class King extends Character {

    public King() {
        weapon = new KnifeBehavior();
    }

}
