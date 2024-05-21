package WithoutStrategyPattern;

public class IndigoFlight extends FlightDetails {

    public IndigoFlight(String flightName, String companyName, float price) {
        super(flightName, companyName, price);
    }

    @Override
    protected float getDiscount() {
        System.out.println("  -- Applying 20% discount --");
        return 20;
    }

}
