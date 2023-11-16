import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = input.nextInt();
        int reversedNum = reverse(n);
        System.out.println("The reversed of " + n + " is " + reversedNum);
        input.close();
    }
    public static int reverse(int n) {
        // Handle negative numbers by making them positive
        if (n < 0) {
            n = -n;
        }

        int reversedNum = 0;
        while (n > 0) {
            // Get the last digit of n using modulo
            int lastDigit = n % 10;
            // Add the last digit to the reversed number after shifting it
            reversedNum = reversedNum * 10 + lastDigit;
            // Remove the last digit from n using integer division
            n = n / 10;
        }

        return reversedNum;
    }
}
