package AZMI02.Lab15;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = input.nextInt();
        System.out.println();
        input.close();
        int rev = 0;
        for (; num != 0; num /= 10) {
            int temp = num % 10;
            rev = rev * 10 + temp;
        }
        System.out.println("Reverse Number Is : " + rev);
    }
}