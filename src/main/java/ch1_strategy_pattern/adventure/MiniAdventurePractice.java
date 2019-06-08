package ch1_strategy_pattern.adventure;

import ch1_strategy_pattern.adventure.behavior.weapon.AxeBehavior;
import ch1_strategy_pattern.adventure.behavior.weapon.BowAndArrowBehavior;
import ch1_strategy_pattern.adventure.behavior.weapon.KnifeBehavior;
import ch1_strategy_pattern.adventure.behavior.weapon.SwordBehavior;
import ch1_strategy_pattern.adventure.characters.*;
import ch1_strategy_pattern.adventure.characters.Character;

public class MiniAdventurePractice {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character troll = new Troll();
        Character knight = new Knight();

        king.fight();
        queen.fight();
        troll.fight();
        knight.fight();

        king.setWeapon(new SwordBehavior());
        queen.setWeapon(new KnifeBehavior());
        troll.setWeapon(new BowAndArrowBehavior());
        knight.setWeapon(new AxeBehavior());

        king.fight();
        queen.fight();
        troll.fight();
        knight.fight();
    }
}
