package AZMI02.Lab16;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1, spcs = 1, start = 0;
        System.out.print("Enter The Number : ");
        int num = input.nextInt();
        System.out.println();
        for (int i = 1; i < (num * 2); i++) {
            for (int spc = num - spcs; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < num) {
                start = i;
                spcs++;
            } else {
                start = num * 2 - i;
                spcs--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < num) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            System.out.println();
            input.close();
        }
    }
}