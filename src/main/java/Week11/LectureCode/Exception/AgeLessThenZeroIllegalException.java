package Week11.LectureCode.Exception;

public class AgeLessThenZeroIllegalException extends IllegalArgumentException{
    public AgeLessThenZeroIllegalException(String message){
        super(message);
    }
    public AgeLessThenZeroIllegalException(Throwable cause){
        super(cause);
    }
    public AgeLessThenZeroIllegalException(String message, Throwable cause){
        super(message, cause);
    }
}