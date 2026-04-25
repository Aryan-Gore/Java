import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {

            int spaces, stars;

            if (i <= n) {
                spaces = n - i;
                stars = 2 * i - 1;
            } else {
                spaces = i - n;
                stars = 2 * (2 * n - i) - 1;
            }

            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}