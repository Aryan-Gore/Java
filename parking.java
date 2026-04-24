/*you own a parking lot in which their are var prices foe diff no. of hrs u need to hire a devloper who can write the prog to calculate the total bill 
1. for the first 2 hrs 100rs per hr
2. for the next 3 hrs 50rs per hr 
3. remaining hr 25rs per hr */

import java.util.*;
public class parking {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hrs u need for parking ");

        double hrs = sc.nextDouble();

        double bill = 0;

        if (hrs<=2)
             bill = hrs * 100;

        else if (hrs <= 5)
            bill = 2*100 + (hrs-2)*50;

        else 
            bill = 2*100 + 3*50 + (hrs-5)*25 ;

        System.out.println("Total " + bill);

        sc.close();

    }

    
}


 