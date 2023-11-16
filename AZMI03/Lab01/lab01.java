package AZMI03.Lab01;

import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Size Of Array : ");
        int num = input.nextInt();
        int arr[] = new int[num];
        System.out.println("Input " + num + " Elements In The Array (Value Must Be <9999) : ");
        for (int i = 0; i < num; i++) {
            System.out.print("element - " + i + " : ");
            if (input.hasNextInt()) {
                arr[i] = input.nextInt();
                if (arr[i] >= 9999) {
                    while (arr[i] >= 9999) {
                        arr[i] = input.nextInt();
                    }
                }
            }
        }
        int temp;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int min = arr[0], min1 = arr[0];
        for (int i = 0; i < num - 1; i++) {
            if (arr[i] > min && arr[i] <= arr[i + 1]) {
                min1 = arr[i];
                break;
            }
        }
        System.out.println("The Second Smallest Element In The Array Is : " + min1);
        input.close();
    }
}