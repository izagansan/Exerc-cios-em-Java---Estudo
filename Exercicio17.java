public class LogLine {

    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = logLine.substring(1, 4);

        switch (level) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        int code;

        switch (getLogLevel()) {
            case TRACE:
                code = 1;
                break;
            case DEBUG:
                code = 2;
                break;
            case INFO:
                code = 4;
                break;
            case WARNING:
                code = 5;
                break;
            case ERROR:
                code = 6;
                break;
            case FATAL:
                code = 42;
                break;
            default:
                code = 0;
        }

        String message = logLine.substring(logLine.indexOf("]:") + 2).trim();
        return code + ":" + message;
    }
}
