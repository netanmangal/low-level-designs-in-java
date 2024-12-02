package DecoratorPattern;

import DecoratorPattern.Decorators.BaseDecorator;
import DecoratorPattern.Decorators.ExtraCheese;
import DecoratorPattern.Decorators.ExtraVeggies;
import DecoratorPattern.Decorators.Sauces;
import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.FarmDelight;

public class Main {

    public static void main(String args[]) {
        BasePizza basePizza = new FarmDelight();
        BaseDecorator basePizzaWithCheese = new ExtraCheese(basePizza);
        BaseDecorator basePizzaWithCheeseAndSauces = new Sauces(basePizzaWithCheese);
        BaseDecorator basePizzaWithCheeseAndSaucesAndVeggies = new ExtraVeggies(basePizzaWithCheeseAndSauces);
        System.out.println("Cost of " + basePizza.getClass().getName() + " pizza with Cheese, Sauces, Veggies is : " + basePizzaWithCheeseAndSaucesAndVeggies.cost());

        BasePizza basePizza2 = new FarmDelight();
        BaseDecorator basePizzaWithCheese2 = new ExtraCheese(basePizza2);
        BaseDecorator basePizzaWithCheeseAndVeggies2 = new ExtraVeggies(basePizzaWithCheese2);
        System.out.println("Cost of " + basePizza2.getClass().getName() + " pizza with Cheese, Veggies is : " + basePizzaWithCheeseAndVeggies2.cost());
    }

}
