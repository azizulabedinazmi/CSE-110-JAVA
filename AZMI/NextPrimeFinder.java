import java.util.Scanner;

public class NextPrimeFinder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number = ");
            int l = 0;
            int m = input.nextInt();
            int x = m;
            for (int j = 1; j <= x; j++) {
                int k = x % j;
                if (k == 0) {
                    l++;
                }
            }
            if (l == 2) {
                System.out.println("nextprime(" + m + ") " + x);
            } else if (l > 2) {
                l = 0;
                while (l <= 1) {
                    x = x + 1; // to increament x
                    for (int j = 1; j <= x; j++) {
                        int k = x % j;
                        if (k == 0) {
                            l++;
                        }
                    }
                    if (l > 2) {
                        l = 0;
                    }
                    if (l == 2) {
                        System.out.println("nextprime(" + m + ") " + x);
                        break;
                    }
                }
            }
        }
    }
}
