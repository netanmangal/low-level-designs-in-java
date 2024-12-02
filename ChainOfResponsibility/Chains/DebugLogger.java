package ChainOfResponsibility.Chains;

public class DebugLogger implements LoggerInterface {

    private final LoggerInterface nextLoggingInstance;
    private final String outputColorCode;

    public DebugLogger(String outputColorCode, LoggerInterface nextLoggingInstance) {
        this.nextLoggingInstance = nextLoggingInstance;
        this.outputColorCode = outputColorCode;
    }

    public void log(int level, String msg) {
        if (level == DEBUG) {
            System.out.println(outputColorCode + "Logging::DEBUG :: " + msg + outputResetColorCode);
        } else {
            nextLoggingInstance.log(level, msg);
        }
    }

}
