package ch1_strategy_pattern.adventure.characters;

import ch1_strategy_pattern.adventure.behavior.weapon.AxeBehavior;
import ch1_strategy_pattern.adventure.characters.Character;

public class Troll extends Character {

    public Troll(){
        weapon = new AxeBehavior();
    }
}
