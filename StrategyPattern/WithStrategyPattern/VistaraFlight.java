package WithStrategyPattern;

import WithStrategyPattern.Strategy.Strategy20Percent;

public class VistaraFlight extends FlightDetails {

    public VistaraFlight(String flightName, String companyName, float price) {
        super(flightName, companyName, price, new Strategy20Percent());
    }

}
