/*
   *
  **
 ***
****

*/
import java.util.Scanner;

public class pattern1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int n  = sc.nextInt();

        for(int i = 0; i<=n; i++){

            for(int k = n-i ; k>=0; k--)
            {
                System.out.print(" ");
            }

            for(int j = 0 ; j<i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
            
        }
        sc.close();

        
    }
    
}
