import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter X : ");
        x = input.nextInt();
        System.out.print("Enter Y : ");
        y = input.nextInt();
        input.close();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("");
        System.out.println("After Swapping:");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}