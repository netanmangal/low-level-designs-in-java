package ChainOfResponsibility;

import ChainOfResponsibility.Chains.DebugLogger;
import ChainOfResponsibility.Chains.ErrorLogger;
import ChainOfResponsibility.Chains.InfoLogger;
import ChainOfResponsibility.Chains.LoggerInterface;

public class Main {

    public static void main(String args[]) {
        String infoOutputColorCode = "\u001B[32m";
        String debugOutputColorCode = "\u001B[33m";
        String errorOutputColorCode = "\u001B[31m";

        LoggerInterface logger = new InfoLogger(infoOutputColorCode, new DebugLogger( debugOutputColorCode,  new ErrorLogger(errorOutputColorCode, null ) ) );

        logger.log(LoggerInterface.INFO, "Yeah, the info !");
        logger.log(LoggerInterface.DEBUG, "Uhff, just a debug !!");
        logger.log(LoggerInterface.ERROR, "Ohh, This is an error message !!!");
    }

}
