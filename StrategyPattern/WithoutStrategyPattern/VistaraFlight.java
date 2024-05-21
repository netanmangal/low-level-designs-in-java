package WithoutStrategyPattern;

public class VistaraFlight extends FlightDetails {

    public VistaraFlight(String flightName, String companyName, float price) {
        super(flightName, companyName, price);
    }

    @Override
    protected float getDiscount() {
        System.out.println("  -- Applying 20% discount --");
        return 20;
    }

}
