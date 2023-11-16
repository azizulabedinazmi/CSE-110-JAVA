package AZMI02.Lab05;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows : ");
        int rows = input.nextInt();
        System.out.println();
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "");
            }
            System.out.println("");
            input.close();
        }
    }
}
