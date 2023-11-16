import java.util.Scanner;

public class ArmstrongNumberChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int temp = n;
        int r, sum = 0;
        //Function to check if a number is an Armstrong number
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum)
            System.out.println(temp + " is an Armstrong number.");
        else
            System.out.println(temp + " is not an Armstrong number.");
            scanner.close();
    }
}