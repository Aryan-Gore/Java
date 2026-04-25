/*Withdraw only if
1. Balance ≥ amount  
2. Minimum balance ₹1000 maintained 
Else show reason  */

import java.util.*;

public class Atm{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur Balance :");
        int balance = sc.nextInt();


        System.out.println("Enter ammount u want to withdraw :");
        int amount = sc.nextInt();

        if (balance < amount) {
            System.out.println("Transaction Failed! insufficient balance");
        } 

        else if((balance - amount) > 1000){
            System.out.println("yes");
        }
        else {
            System.out.println("Withdrawal Successful ");
            System.out.println("Remaining Balance: " + (balance - amount));
        }






        
    }

}

