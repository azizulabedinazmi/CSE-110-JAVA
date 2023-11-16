package AZMI02.Lab05;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Input number of size : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}