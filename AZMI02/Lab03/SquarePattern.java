package AZMI02.Lab03;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        // Check if the input is non-negative
        if (size < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        // Nested loop to print the square pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
