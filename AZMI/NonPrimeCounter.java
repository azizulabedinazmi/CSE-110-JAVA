public class NonPrimeCounter {
    public static void main(String[] args) {
        int n = 10;
        int count = countNonPrimeNumbers(n);
        System.out.println("Number of non-prime numbers up to " + n + ": " + count); // Output: 6

        n = 5;
        count = countNonPrimeNumbers(n);
        System.out.println("Number of non-prime numbers up to " + n + ": " + count); // Output: 2
    }

    public static int countNonPrimeNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}