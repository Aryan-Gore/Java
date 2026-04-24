import java.util.*;

public class AddWithoutPlus {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take two integer inputs from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        /*
         Logic:
         We use bitwise operators to add numbers without using '+'.
         
         XOR (^)  -> gives sum of bits without carry
         AND (&)  -> gives carry
         LEFT SHIFT (<< 1) -> moves carry to next position
        */

        // Repeat until there is no carry left
        while (b != 0) {

            int carry = a & b;     // Step 1: calculate carry

            a = a ^ b;             // Step 2: add without carry

            b = carry << 1;        // Step 3: shift carry to left
        }

        // Final result stored in 'a'
        System.out.println("Sum = " + a);

        // Close scanner to avoid resource leak
        sc.close();
    }
}