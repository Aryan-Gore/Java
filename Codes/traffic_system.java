/* A smart traffic System tracks overspeeding vehicles if speed > 80 fine = 500
if speed > 100 fine = 1000
if repeated violation double fine */

import java.util.*;

public class traffic_system {

      
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter speed in km/hr: ");
        int speed = sc.nextInt();

      
        System.out.print("Repeated violation? (1 = Yes, 0 = No): ");
        int violation = sc.nextInt();

        int fine = 0;


        if (speed >= 100) {
            fine = 1000;
        } 
        else if (speed >= 80) {
            fine = 500;
        }

        if (fine > 0 && violation == 1) {
            fine = fine * 2;
        }

        System.out.println("Fine = " + fine);

        sc.close();

    
}
}