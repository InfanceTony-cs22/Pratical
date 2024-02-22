class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main class
public class UserDefinedExceptionExample {
    // Method that may throw the custom exception
    static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    // Main method to test the user-defined exception
    public static void main(String[] args) {
        try {
            // Test with an age that triggers the custom exception
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
