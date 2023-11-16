package AZMI03.Lab02;

import java.util.Scanner;

public class lab02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the rows and columns of first matrix : ");
        int r1 = input.nextInt();
        int c1 = input.nextInt();
        System.out.print("Input the rows and columns of second matrix : ");
        int r2 = input.nextInt();
        int c2 = input.nextInt();
        if (c1 == r2) {
            int m1[][] = new int[r1][c1];
            int m2[][] = new int[r2][c2];
            int r[][] = new int[r1][c2];
            System.out.println("Input elements in the first matrix : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("element- " + "[" + i + "]" +
                            "[" + j + "]: ");
                    m1[i][j] = input.nextInt();
                }
            }
            System.out.println("Input elements in the second matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("element- " + "[" + i + "]" +
                            "[" + j + "]: ");
                    m2[i][j] = input.nextInt();
                }
            }
            System.out.println("\nThe First matrix is : ");
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1.length; j++) {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nThe Second matrix is : ");
            for (int i = 0; i < m2.length; i++) {
                for (int j = 0; j < m2.length; j++) {
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nThe multiplication of two matrix is : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    int sum = 0;
                    for (int k = 0; k < r2; k++) {
                        sum += m1[i][k] * m2[k][j];
                    }
                    r[i][j] = sum;
                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(r[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.print("multipication does not exist ");
            input.close();
        }
    }
}