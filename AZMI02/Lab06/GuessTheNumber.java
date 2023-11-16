package AZMI02.Lab06;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;

        Scanner scanner = new Scanner(System.in);
        
        int guess;
        
        System.out.println("Guess the number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            }
            
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number: " + randomNumber);
        scanner.close();
    }
}
