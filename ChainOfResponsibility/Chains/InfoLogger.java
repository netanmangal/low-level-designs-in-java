package ChainOfResponsibility.Chains;

public class InfoLogger implements LoggerInterface {

    private final LoggerInterface nextLoggingInstance;
    private final String outputColorCode;

    public InfoLogger(String outputColorCode, LoggerInterface nextLoggingInstance) {
        this.nextLoggingInstance = nextLoggingInstance;
        this.outputColorCode = outputColorCode;
    }

    public void log(int level, String msg) {
        if (level == INFO) {
            System.out.println(outputColorCode + "Logging::INFO :: " + msg + outputResetColorCode);
        } else {
            nextLoggingInstance.log(level, msg);
        }
    }

}
