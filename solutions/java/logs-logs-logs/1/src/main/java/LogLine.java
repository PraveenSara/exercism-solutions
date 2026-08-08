public class LogLine {

    private LogLevel logLevel;
    private String message;
    
    public LogLine(String logLine) {
        String code = logLine.substring(1,4);
        this.message = logLine.substring(7,logLine.length());

        switch (code) {
    case "TRC" : this.logLevel = LogLevel.TRACE; break;
    case "DBG" : this.logLevel = LogLevel.DEBUG; break;
    case "INF" : this.logLevel = LogLevel.INFO; break;
    case "WRN" : this.logLevel = LogLevel.WARNING; break;
    case "ERR" : this.logLevel = LogLevel.ERROR; break;
    case "FTL" : this.logLevel = LogLevel.FATAL; break;
    default : this.logLevel = LogLevel.UNKNOWN;
        }
    }

    private LogLevel logLine;

    public LogLevel getLogLevel() {        
        return logLevel;
    }

    public String getOutputForShortLog() {
        return String.format("%d:%s", logLevel.getCode(), message);
    }
}
