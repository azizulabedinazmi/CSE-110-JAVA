package AZMI02.Lab05;

import java.util.Scanner;

public class d5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows : ");
        int rows = input.nextInt();
        System.out.println();
        for (int i = rows; i >= 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            input.close();
        }
    }
}