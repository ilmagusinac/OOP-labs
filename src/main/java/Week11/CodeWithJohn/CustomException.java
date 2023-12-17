package Week11.CodeWithJohn;


public class CustomException {
    public static void main(String[] args) throws AgeLessThanZeroException{
        validateAge(-1);

    }

    private static void validateAge(int age) throws AgeLessThanZeroException{
        if(age<0){
            //throw new AgeLessThanZeroException("Oh no something went wrong");
            //throw new AgeLessThanZeroException(new RuntimeException()); //we can do this if we have throwable - it will tell us what is caused by

            //if we include both message and cause in - we can do the following
            throw new AgeLessThanZeroException("Oh no", new RuntimeException());

        }
    }
}
