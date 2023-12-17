package Week11.LectureCode.Exception;

public class AgeLessThenZeroException extends Exception{
    public AgeLessThenZeroException(String message){
        super(message);
    }
    public AgeLessThenZeroException(Throwable cause){
        super(cause);
    }
    public AgeLessThenZeroException(String message, Throwable cause){

        super(message, cause);
    }
}