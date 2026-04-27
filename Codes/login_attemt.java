/* user get 3 attemt to login if correct login sucessfull if wrong login locked */

import java.util.*;

public class login_attemt {

  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int correct = 1234;
        boolean success = false;

        for(int i = 0 ; i <3 ; i++){

        System.out.print("enter pwd in 4 digits  ");
        int pwd = sc.nextInt();

            if (pwd == correct){
                System.out.println("login successfull");
                success = true;
                break;
            }
            else {
                System.out.println("Wrong password");
            }
           
        }

        if(!success)
            System.out.println("Login blocked");

        sc.close();
    }
    
}
