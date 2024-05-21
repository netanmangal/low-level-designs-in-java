package WithStrategyPattern;

import WithStrategyPattern.Strategy.Strategy10Percent;

public class AirIndiaFlight extends FlightDetails {

    public AirIndiaFlight(String flightName, String companyName, float price) {
        super(flightName, companyName, price, new Strategy10Percent());
    }

}
