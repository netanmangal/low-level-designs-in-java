package WithStrategyPattern;

import WithStrategyPattern.Strategy.Strategy20Percent;

public class IndigoFlight extends FlightDetails {

    public IndigoFlight(String flightName, String companyName, float price) {
        super(flightName, companyName, price, new Strategy20Percent());
    }

}
