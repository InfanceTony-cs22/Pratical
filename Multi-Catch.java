public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Some code that may cause different types of exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // Accessing an index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        }
    }
}
