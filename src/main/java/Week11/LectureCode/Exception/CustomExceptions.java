package Week11.LectureCode.Exception;



import java.security.InvalidParameterException;

public class CustomExceptions {
    public static void main(String[] args) throws AgeLessThenZeroException {
        validateAgeThrowable(-1);
    }
    public static void validateAge(int age) throws AgeLessThenZeroException {
        if(age < 0)
            throw new AgeLessThenZeroException("Hey man, what are you doing");
    }
    public static void validateAgeThrowable(int age) throws AgeLessThenZeroException {
        if(age < 0)
            throw new AgeLessThenZeroException(new RuntimeException());
    }
    public static void validateAgeThrowableMessage(int age) throws AgeLessThenZeroException {
        if(age < 0)
            throw new AgeLessThenZeroException("Problem with age again", new RuntimeException());
    }
}