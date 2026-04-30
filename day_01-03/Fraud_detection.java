    /*
    if payment is greater than 50000 and location mismatch 
    and if  more than 3 transaction in a min
    */

    import java.util.*;

    public class Fraud_detection {

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter amount : ");
            int amount = sc.nextInt();

            System.out.println("location mismatch (1 for yes and 0 for no): ");
            int location = sc.nextInt();

            System.out.println("no. of transactions in a  miniute : ");
            int transactions = sc.nextInt();

            if(amount > 50000 && location == 1){
                System.out.println("fraud detected");
            }
            else if (transactions > 3)
                System.out.println("fraud detected");
            else 
                System.out.println("fraud not detected");

            sc.close();

        }

        
    }


