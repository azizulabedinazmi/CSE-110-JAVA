package AZMI02.Lab13;

import java.util.Scanner;

public class PascalTriangle {
    static int factorial(int n) {
        int f;
        for (f = 1; n > 1; n--) {
            f *= n;
        }
        return f;
    }

    static int m(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = n - 1;
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" " + m(i, j));
            }
            System.out.println();
        }
    }
}