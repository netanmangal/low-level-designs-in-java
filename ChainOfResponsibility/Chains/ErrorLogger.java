package ChainOfResponsibility.Chains;

public class ErrorLogger implements LoggerInterface {

    private final LoggerInterface nextLoggingInstance;
    private final String outputColorCode;

    public ErrorLogger(String outputColorCode, LoggerInterface nextLoggingInstance) {
        this.nextLoggingInstance = nextLoggingInstance;
        this.outputColorCode = outputColorCode;
    }

    public void log(int level, String msg) {
        if (level == ERROR) {
            System.out.println(outputColorCode + "Logging::ERROR :: " + msg + outputResetColorCode);
        } else {
            nextLoggingInstance.log(level, msg);
        }
    }

}
