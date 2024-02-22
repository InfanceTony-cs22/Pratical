interface PrimeChecker {
    boolean isPrime(int number);
}

class PrimeCheckerImpl implements PrimeChecker {
    @Override
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeNumberCheck {
    public static void main(String[] args) {
        PrimeChecker primeChecker = new PrimeCheckerImpl();

        int numToCheck = 17; // Change this to the number you want to check for primality

        if (primeChecker.isPrime(numToCheck)) {
            System.out.println(numToCheck + " is a prime number.");
        } else {
            System.out.println(numToCheck + " is not a prime number.");
        }
    }
}
