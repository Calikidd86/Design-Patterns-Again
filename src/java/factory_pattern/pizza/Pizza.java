package factory_pattern.pizza;

/**
 * PizzaStore class is abstract product class
 * Role - Abstract Product
 * Pattern - Factory Method
 */
public abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

}
