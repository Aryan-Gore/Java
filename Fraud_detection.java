/*
if payment is greater than 50000 and location mismatch 
and more than 3 transaction in a min
*/

import java.util.*;

public class Fraud_detection {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount : ");
        int amount = sc.nextInt();

        System.out.println("location mismatch (1 for yes and 0 for no): ");
        int loc = sc.nextInt();

        System.out.println("no. of transactions in a  miniute : ");
        int transactions = sc.nextInt();


    }

    
}


