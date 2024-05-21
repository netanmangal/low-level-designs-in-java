package WithStrategyPattern.Strategy;

public class Strategy20Percent implements DiscountStrategy {

    @Override
    public float getDiscount() {
        return 20;
    }

}
