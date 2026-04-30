/*

 *******
  *****
   ***
    *

*/
import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}