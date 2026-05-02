import java.util.Scanner;


interface Bank {
    default void payment() {
        System.out.println("Payment done using UPI");
    }
}


interface CreditCard {
    default void payment() {
        System.out.println("Payment done using Credit Card");
    }
}


interface DebitCard {
    default void payment() {
        System.out.println("Payment done using Debit Card");
    }
}

// Implementing class
class Payment implements Bank, CreditCard, DebitCard {

    // Resolve conflict
    public void payment(int choice) {

        if (choice == 1) {
            Bank.super.payment();
        } 
        else if (choice == 2) {
            CreditCard.super.payment();
        } 
        else if (choice == 3) {
            DebitCard.super.payment();
        } 
        else {
            System.out.println("Invalid choice");
        }
    }
}

public class Bank1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment p = new Payment();

        System.out.println("Choose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");

        int choice = sc.nextInt();

        p.payment(choice);

        sc.close();
    }
}