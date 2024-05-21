package WithoutStrategyPattern;

public class Main {

    public static void main(String args[]) {
        IndigoFlight indigoFlight1 = new IndigoFlight("AMD->BLR", "Indigo", 3000);
        IndigoFlight indigoFlight2 = new IndigoFlight("DLI->BLR", "Indigo", 8000);
        IndigoFlight indigoFlight3 = new IndigoFlight("KASM->KOCHI", "Indigo", 12000);

        AirIndiaFlight airIndiaFlight1 = new AirIndiaFlight("AMD->BLR", "Air India", 3500);
        AirIndiaFlight airIndiaFlight2 = new AirIndiaFlight("DLI->BLR", "Indigo", 8000);
        AirIndiaFlight airIndiaFlight3 = new AirIndiaFlight("KASM->KOCHI", "Indigo", 12000);

        VistaraFlight vistaraFlight1 = new VistaraFlight("AMD->BLR", "Air India", 5500);
        VistaraFlight vistaraFlight2 = new VistaraFlight("DLI->BLR", "Indigo", 9500);
        VistaraFlight vistaraFlight3 = new VistaraFlight("KASM->KOCHI", "Indigo", 14000);

        System.out.println("\n\nHere, VistaraFlight's is having same getDiscount() code as IndigoFlight's getDiscount(), each of which is a Child class of FlightDetails parent class.");
        System.out.println("When the children classes share the duplicate code, which can't be generalized in Parent class is when we should use Strategy Pattern.");
        System.out.println("VistaraFlight and IndigoFlight are related with FlightDetails using a \"is-a\" relationship. Using Strategy Pattern, we will have \"DiscountStrategy\" implementing a \"has-a\" relationship.\n\n");

        vistaraFlight3.bookTicket();
        System.out.println("\n");
        indigoFlight2.bookTicket();
        System.out.println("\n");
        airIndiaFlight1.bookTicket();
    }

}
