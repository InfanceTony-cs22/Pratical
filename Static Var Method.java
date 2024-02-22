public class StaticDemo {

    // Static variable
    static int staticVariable = 10;

    // Static block
    static {
        System.out.println("This is a static block. Static variable value: " + staticVariable);
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Accessing static variable: " + staticVariable);

        // Calling static method
        staticMethod();
    }
}
