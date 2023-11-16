package AZMI02.Lab05;

import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows : ");
        int rows = input.nextInt();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 2 * (rows - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            input.close();
        }
    }
}