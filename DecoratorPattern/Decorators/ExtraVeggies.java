package DecoratorPattern.Decorators;

import DecoratorPattern.Pizza.BasePizza;

public class ExtraVeggies extends BaseDecorator {

    public ExtraVeggies(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 80;
    }

}
