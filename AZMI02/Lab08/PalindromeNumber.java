package AZMI02.Lab08;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int r, sum = 0, temp;
        System.out.print("write a number check it is Palindrome or not : ");
        int n = input.nextInt();

        temp = n;
        while (n > 0) {
            r = n % 10;  
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
            input.close();
        }
    }
}