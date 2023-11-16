package AZMI02.Lab20;

import static java.lang.Math.cos;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double accuracy = 0.0001, x1, denominator, cosx, cosval;
        n = n * (3.142 / 180.0);
        x1 = 1;
        cosx = x1;
        cosval = cos(n);
        int i = 1;
        do {
            denominator = 2 * i * (2 * i - 1);
            x1 = -x1 * n * n / denominator;
            cosx = cosx + x1;
            i = i + 1;
        } while (accuracy <= cosval - cosx);
        System.out.println(cosx);
        in.close();
    }
}