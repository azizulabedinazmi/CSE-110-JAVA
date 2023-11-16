package AZMI02.Lab09;

import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 10, 3, 8, 15, 6};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        int[] separatedArray = separateEvenOdd(numbers);

        System.out.println("Separated Array: " + Arrays.toString(separatedArray));
    }

    public static int[] separateEvenOdd(int[] arr) {
        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        for (int number : arr) {
            if (number % 2 == 0) {
                result[evenIndex] = number;
                evenIndex++;
            } else {
                result[oddIndex] = number;
                oddIndex--;
            }
        }

        return result;
    }
}
