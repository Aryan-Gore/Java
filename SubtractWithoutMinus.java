import java.util.*;

public class SubtractWithoutMinus {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        /*
         Logic:
         We subtract using bitwise operations.

         XOR (^)        -> gives subtraction without borrow
         (~a & b)       -> finds borrow
         LEFT SHIFT <<1 -> shifts borrow to correct position
        */

        // Repeat until there is no borrow left
        while (b != 0) {

            int borrow = (~a) & b;  // Step 1: calculate borrow

            a = a ^ b;              // Step 2: subtract without borrow

            b = borrow << 1;        // Step 3: shift borrow
        }

        // Final result
        System.out.println("Result (a - b) = " + a);

        // Close scanner
        sc.close();
    }
}