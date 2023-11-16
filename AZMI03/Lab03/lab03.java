package AZMI03.Lab03;

import java.util.Scanner;

public class lab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of the square matrix : ");
        int size = input.nextInt(), right_diagonal = 0;
        int[][] arr = new int[size][size];
        System.out.println("Input elements in the first matrix : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("element - " + "[" + i + "]" + "["
                        + j + "]" + " : ");
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) == (size - 1)) {
                    right_diagonal = right_diagonal + arr[i][j];
                } else {
                    continue;
                }
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Addition of the right Diagonal elements is : " + right_diagonal);
        input.close();
    }
}