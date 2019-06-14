package ch1_strategy_pattern.adventure.behavior.weapon;


/**
 * The interface Weapon behavior. The Encapsulated Behavior in Character (strategy) and
 * the Component in SpecialBehavior (Decorator).
 * Role - Encapsulated Behavior Interface / Component
 * Pattern - Strategy / Decorator
 *
 * @author Dante A.
 */
public interface WeaponBehavior {
    /**
     * Use weapon string.
     *
     * @return the string
     */
    public String useWeapon();
}
