package AZMI02.Lab14;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, factor = 1;
        int number = in.nextInt();
        in.close();
        for (i = 1; i <= number; i++) {
            factor = factor * i;
        }
        System.out.println("Factorial of " + number + " is: " + factor);
    }
}