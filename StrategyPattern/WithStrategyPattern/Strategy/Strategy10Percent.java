package WithStrategyPattern.Strategy;

public class Strategy10Percent implements DiscountStrategy {

    @Override
    public float getDiscount() {
        return 10;
    }

}
