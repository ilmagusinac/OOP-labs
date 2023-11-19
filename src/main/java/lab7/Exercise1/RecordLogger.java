package lab7.Exercise1;

public record RecordLogger(String loggerName) implements Logger {
    @Override
    public void logMessage(LogMessageProvider messageProvider){
        System.out.println("record logger [" + loggerName + "]: " + messageProvider.provideMessage());
    }
}
