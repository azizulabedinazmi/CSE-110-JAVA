package AZMI02.Lab11;

import java.util.Scanner;

public class lab11 {
    static double Sum(int num) {
        double sum = 0;
        for (double i = 1; i <= num; i++) {
            sum = sum + 1 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Value Of n : ");
        int num = input.nextInt();
        System.out.printf("Sum " + num + "th Value In The Series is: %.2f\n\n", Sum(num));
        input.close();
    }
}
