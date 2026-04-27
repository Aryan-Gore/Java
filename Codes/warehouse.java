/* ware house inventory manegment - u are a owner of a WH in which there are n products, with the following attributes:

1. input - N total no. of products.
2. for each product take the current stock and the min req stock.
3. if any product is available in less than min req then print "restock needed  for product x ' where x id product id or name '
4. pritn total no of products needed to restock.
*/
import java.util.*;
public class warehouse {
     
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of products: ");
        int n = sc.nextInt();

        int restockCount = 0; 

        for (int i = 1; i <= n; i++) {

            System.out.println("\nProduct " + i);

      
            System.out.print("Enter current stock: ");
            int current = sc.nextInt();

         
            System.out.print("Enter minimum required stock: ");
            int min = sc.nextInt();

            
            if (current < min) {
                System.out.println("Restock needed for product " + i);
                restockCount++; 
            }
        }

        System.out.println("\nTotal products needing restock = " + restockCount);

        sc.close();
    }
}
