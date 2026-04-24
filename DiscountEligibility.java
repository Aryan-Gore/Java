/*If amount ≥5000 → 20% discount 
If ≥3000 → 10% 
Else → no discount 
If user is premium → extra 5% */
import java.util.*;

public class DiscountEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Is user premium? (yes/no): ");
        String premium = sc.next();

        double discount = 0;

     
        if (amount >= 5000) {
            discount = 20;
        } 
        else if (amount >= 3000) {
            discount = 10;
        } 
        else {
            discount = 0;
        }

       
        if (premium.equalsIgnoreCase("yes")) {
            discount += 5;
        }

        
        double finalAmount = amount - (amount * discount / 100);

   
        System.out.println("Final Amount = ₹" + finalAmount);

        sc.close();
    }
}