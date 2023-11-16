package AZMI03.Lab07;

public class TwinPrimes {
    public static void main(String[] args) {
        System.out.println("Twin Prime Numbers less than 100:");
        for (int i = 3; i < 100; i++) {
            boolean isTwinPrime = isPrime(i) && isPrime(i - 2);
            if (isTwinPrime) {
                System.out.println("(" + (i - 2) + ", " + i + ")");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
