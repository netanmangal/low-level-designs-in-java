package WithStrategyPattern;

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

        System.out.println("\n\nWhat we've done here is, since Vistara & Indigo shared same DiscountStrategy, we extracted the implementations of this strategy to separate interface with each of the \"types of strategies\" having their own classes and implementations.");
        System.out.println("This way we've achieved 2 things:");
        System.out.println("  1 : It will be easier to change the logic of certain strategy at single place itself.");
        System.out.println("  2 : Open/Close principles - it allows to extend a logic in some parts of the code (\"open for extension\") without rewriting those parts (\"closed for modification\").");

        vistaraFlight3.bookTicket();
        System.out.println("\n");
        indigoFlight2.bookTicket();
        System.out.println("\n");
        airIndiaFlight1.bookTicket();
    }

}
