package AZMI02.Lab02;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        long a = 1; // Initialize F(n-2)
        long b = 1; // Initialize F(n-1)
        long fibonacci = 0; // Initialize F(n)

        // Print the first two Fibonacci numbers (F(1) and F(2))
        System.out.print("The first 20 Fibonacci numbers are:\n1 1");

        for (int i = 3; i <= n; i++) {
            fibonacci = a + b;
            System.out.print(" " + fibonacci);

            // Update F(n-2) and F(n-1) for the next iteration
            a = b;
            b = fibonacci;
        }

        // Calculate the harmonic mean
        double harmonicMean = n / (1.0 / fibonacci);
        System.out.println("\nThe harmonic mean is: " + harmonicMean);
    }
}
