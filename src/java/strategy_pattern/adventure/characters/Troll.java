package strategy_pattern.adventure.characters;

import strategy_pattern.adventure.behavior.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll(){
        weapon = new AxeBehavior();
    }
}
