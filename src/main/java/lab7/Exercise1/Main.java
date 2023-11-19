package lab7.Exercise1;

public class Main {
    public static void main(String[] args){
        Logger recordLogger = new RecordLogger("RecordLogger");
        recordLogger.logMessage(() -> "Logging with lambda function in a record");
        Logger classLogger = new ClassLogger("ClassLogger");
        classLogger.logMessage(()-> "Logging with lambda function in a class");
    }
}
