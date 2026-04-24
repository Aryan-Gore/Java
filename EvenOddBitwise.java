import java.util.*;

public class EvenOddBitwise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        /*
         Logic:
         - Last bit of an even number = 0
         - Last bit of an odd number  = 1
         - num & 1 checks the last bit
        */

        if ((num & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}