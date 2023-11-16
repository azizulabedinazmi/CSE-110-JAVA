package AZMI02.Lab10;

import java.util.Scanner;

public class a10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows : ");
        int rows = input.nextInt();
        input.close();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(i);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
}