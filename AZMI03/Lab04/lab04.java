package AZMI03.Lab04;

import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, determinant = 0;
        int[][] arr = new int[3][3];
        System.out.println("Input elements in the first matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("element - " + "[" + i + "]" + "["
                        + j + "]" + " : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        x = (arr[1][1] * arr[2][2]) - (arr[2][1] * arr[1][2]);
        y = (arr[1][0] * arr[2][2]) - (arr[2][0] * arr[1][2]);
        z = (arr[1][0] * arr[2][1]) - (arr[2][0] * arr[1][1]);
        determinant = (arr[0][0] * x) - (arr[0][1] * y) + (arr[0][2]
                * z);
        System.out.println("The Determinant of the matrix is : " + determinant);
        input.close();
    }
}
