/*
Game checks numbers ll 0 is entered. Count odd & even numbers.
*/
import java.util.*;

public class OddEvenGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {

            int num = sc.nextInt();

            // Stop condition
            if (num == 0) {
                break;
            }

            // Check even or odd
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);

        sc.close();
    }
}