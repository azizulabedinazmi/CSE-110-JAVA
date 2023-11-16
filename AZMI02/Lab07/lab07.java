package AZMI02.Lab07;

import java.util.Scanner;

public class lab07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows : ");
        int rows = input.nextInt();
        System.out.println();
        for (int k = 1; k <= rows; k++) {
            for (int i = 1; i <= k; i++) {
                System.out.print(i);
            }
            for (int j = rows; j > k; j--) {
                System.out.print("*");
            }
            System.out.println();
            input.close();
        }
    }
}