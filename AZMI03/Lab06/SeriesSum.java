package AZMI03.Lab06;

public class SeriesSum {
    public static void main(String[] args) {
        double sum = calculateSeriesSum(5); // Change the argument to specify the number of terms you want to sum
        System.out.println("The sum of the series is : " + sum);
    }

    // Function to calculate the sum of the series
    public static double calculateSeriesSum(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double term = factorial(i) / i;
            sum += term;
        }

        return sum;
    }

    // Function to calculate the factorial of a number
    public static double factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
