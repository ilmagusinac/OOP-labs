package lab7.Exercise1;

public class ClassLogger implements Logger{
    private String loggerName;
    public ClassLogger(String loggerName){
        this.loggerName=loggerName;
    }

    @Override
    public void logMessage(LogMessageProvider messageProvider){
        System.out.println("record logger [" + loggerName + "]: " + messageProvider.provideMessage());
    }
}
