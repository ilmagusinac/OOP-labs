package Week11.LectureCode.Exception;

import java.io.FileNotFoundException;

public class CustomException {
    public static void main(String[] args) {
        try {
            // Example usage of validateAge
            validateAge(-5);
        } catch (AgeLessThanZeroException e) {
            System.out.println("Caught AgeLessThanZeroException: " + e.getMessage());
        }
    }

    // Custom exception using RuntimeException
    public static void validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0)
            throw new AgeLessThanZeroException("Age is less than 0!");
    }

    // Custom exception class extending RuntimeException
    public static class AgeLessThanZeroException extends RuntimeException {
        // Constructor to set a custom error message
        public AgeLessThanZeroException(String message) {
            super(message);
        }
        // You can add any additional constructors or methods here
    }
}
