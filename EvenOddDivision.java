import java.util.*;

public class EvenOddDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        /*
         Logic:
         If number = (num / 2) * 2 → Even
         Else → Odd
        */

        if ((num / 2) * 2 == num)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}