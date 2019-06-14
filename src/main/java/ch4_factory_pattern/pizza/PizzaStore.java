package ch4_factory_pattern.pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza();

        return pizza;
    }

    public abstract Pizza createPizza();
}
