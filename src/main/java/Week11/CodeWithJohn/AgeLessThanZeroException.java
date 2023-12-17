package Week11.CodeWithJohn;

public class AgeLessThanZeroException extends Exception{ //we cannot extend Throwable or Error - we can but is not a good reason not to
    public AgeLessThanZeroException() {}; //no args constructor
    public AgeLessThanZeroException(Throwable cause){
        super(cause); //with the message we will also print the cause - name - of the exception that caused it
    }
    public AgeLessThanZeroException(String message){
        super(message);
    }

    public AgeLessThanZeroException(String message, Throwable cause){
        super(message, cause);
    }

}
