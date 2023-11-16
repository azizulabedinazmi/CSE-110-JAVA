package AZMI02.Lab12;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        in.close();
        int a = x;
        int b = y;
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        System.out.println("GCD of " + a + " and " + b + " is " + y);
    }
}