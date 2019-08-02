package strategy_pattern.adventure.characters;

import strategy_pattern.adventure.behavior.weapon.BowAndArrowBehavior;

public class Queen extends Character {

    public Queen(){
        weapon = new BowAndArrowBehavior();
    }
}
