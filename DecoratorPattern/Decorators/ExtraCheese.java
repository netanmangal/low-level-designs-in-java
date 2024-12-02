package DecoratorPattern.Decorators;

import DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends BaseDecorator {

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }

}
