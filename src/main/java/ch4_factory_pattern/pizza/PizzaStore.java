package ch4_factory_pattern.pizza;

/**
 * PizzaStore class is the Creator class
 * Role - Creator
 * Pattern - Factory Method
 */
public abstract class PizzaStore {

    /**
     * createPizza Pizza factory method
     * @param type Pizza selection
     * @return Pizza
     */
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
