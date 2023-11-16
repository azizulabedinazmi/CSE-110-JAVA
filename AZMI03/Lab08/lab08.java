package AZMI03.Lab08;

import java.util.Scanner;

public class lab08 {
    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = input.nextInt();
        System.out.println("The Factorial : " + fact(n));
        input.close();
    }
}
