package CampusMonk;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int n = num;

        // Handle negative numbers
        if (n < 0) {
            n = -n;
        }

        // Count digits
        if (n == 0) {
            count = 1; // Special case for number 0
        } else {
            while (n > 0) {
                n = n / 10;  // Remove last digit
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " = " + count);
    }
}
