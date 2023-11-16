package AZMI02.Lab04;

import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows : ");
        int row = input.nextInt();
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
            input.close();
        }
    }
}