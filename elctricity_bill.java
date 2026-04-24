/* u need to calculate the total electricity bill based on the no. of units and consumption  
1. for 0-100 unit 1.5rs per unit
2. for 101-200 unit 3.5 rs per unit 
3. for rest units 5rs per unit 

calculate the total bill and adds a rs 50 as a fixed charge.
add a surplus fine of 10% of the total bill if bill exceeds rs 2000.
 
*/

import java.util.*;

public class elctricity_bill {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter units or consumption ");

        double unit = sc.nextDouble();

        double bill = 50;

        if (unit <= 100)   
            bill = bill + (unit * 1.5);
        else if (unit <= 200)
             bill = bill + (100 * 1.5) + ((unit - 100) * 3.5);
        else 
             bill = bill + (100 * 1.5) + (100 * 3.5) + ((unit - 200) * 5);


        if (bill > 2000) {
            bill = bill + (bill * 0.10); 
        }

       
        System.out.println("Total Electricity Bill = rs" + bill);

        sc.close();
             
}
}
