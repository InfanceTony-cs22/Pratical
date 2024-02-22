public class TryCatchFinallyExample {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be reached due to exception
        } catch (ArithmeticException e) {
            // Catching the specific exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code in the finally block will be executed regardless of whether an exception occurs or not
            System.out.println("Finally block executed");
        }
    }

    // A method that may throw an exception
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
