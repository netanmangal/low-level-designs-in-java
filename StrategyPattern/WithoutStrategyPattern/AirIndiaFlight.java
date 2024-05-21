package WithoutStrategyPattern;

public class AirIndiaFlight extends FlightDetails {

    public AirIndiaFlight(String flightName, String companyName, float price) {
        super(flightName, companyName, price);
    }

    @Override
    protected float getDiscount() {
        System.out.println("  -- Applying 10% discount --");
        return 10;
    }
}
