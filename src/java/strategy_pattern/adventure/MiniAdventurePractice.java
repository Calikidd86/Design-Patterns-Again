package strategy_pattern.adventure;

import strategy_pattern.adventure.behavior.special.SwordSpecialBehavior;
import strategy_pattern.adventure.behavior.weapon.AxeBehavior;
import strategy_pattern.adventure.behavior.weapon.BowAndArrowBehavior;
import strategy_pattern.adventure.behavior.weapon.KnifeBehavior;
import strategy_pattern.adventure.behavior.weapon.SwordBehavior;
import strategy_pattern.adventure.characters.*;
import strategy_pattern.adventure.characters.Character;

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
        king.setWeapon(new SwordSpecialBehavior(new SwordBehavior()));
        queen.setWeapon(new KnifeBehavior());
        troll.setWeapon(new BowAndArrowBehavior());
        knight.setWeapon(new AxeBehavior());

        System.out.println(king.fight());
        queen.fight();
        troll.fight();
        knight.fight();
    }
}
