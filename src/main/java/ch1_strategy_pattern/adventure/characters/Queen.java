package ch1_strategy_pattern.adventure.characters;

import ch1_strategy_pattern.adventure.behavior.weapon.BowAndArrowBehavior;
import ch1_strategy_pattern.adventure.characters.Character;

public class Queen extends Character {

    public Queen(){
        weapon = new BowAndArrowBehavior();
    }
}
