package DecoratorPattern.Decorators;

import DecoratorPattern.Pizza.BasePizza;

public class Sauces extends BaseDecorator {

    public Sauces(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }

}
