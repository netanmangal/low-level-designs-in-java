package WithoutStrategyPattern;

public abstract class FlightDetails {

    private String flightName;
    private String companyName;
    private float price;

    public FlightDetails(String flightName, String companyName, float price) {
        this.flightName = flightName;
        this.companyName = companyName;
        this.price = price;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void bookTicket() {
        System.out.println("Price before booking ticket is : " + this.getPrice());
        float newPrice = this.getPrice() - (this.getPrice() * this.getDiscount() / 100);
        System.out.println("Price after booking ticket is : " + newPrice);
    }

    abstract float getDiscount();

}
