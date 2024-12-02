package ChainOfResponsibility.Chains;

public interface LoggerInterface {

    public final static int INFO = 1;
    public final static int DEBUG = 2;
    public final static int ERROR = 3;

    public final static String outputResetColorCode = "\u001B[0m";

    void log(int level, String msg);

}
