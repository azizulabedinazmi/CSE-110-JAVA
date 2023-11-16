package AZMI02.Lab19;

import static java.lang.Math.sin;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double accuracy = (double) 0.0001, denominator, sinx, sinval;
        n = n * (double) (3.142 / 180.0);
        double x1 = n;
        sinx = n;
        sinval = (double) sin(n);
        int i = 1;
        do {
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * n * n / denominator;
            sinx = sinx + x1;
            i = i + 1;
        } while (accuracy <= sinval - sinx);
        System.out.println(sinx);
        in.close();
    }
}