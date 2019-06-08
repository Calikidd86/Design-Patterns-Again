package ch3_decorator_pattern.starbuzzcofffee;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" +
                beverage.cost());

        System.out.println();

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(String.format(beverage1.getDescription() + " $%.2f", beverage1.cost()));

        Beverage beverage2 = new Decaf();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
    }
}
