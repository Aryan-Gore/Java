//create a bank class with the following attributes Accno. , pwd , acc holder name , balance and behaviours - withdraw , deposit , check balance .u needd to implemet it by following encapsulation.
// Note -> write getter and setters where u need it 

import java.util.Scanner;

class Bank {

    // private data (encapsulation)
    private String accno;
    private String pwd;
    private String name;
    private double balance;

    // Constructor
    public Bank(String accno, String pwd, String name, double balance) {
        this.accno = accno;
        this.pwd = pwd;
        this.name = name;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for password
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount, String password) {
        if (!this.pwd.equals(password)) {
            System.out.println("Wrong Password");
            return;
        }

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Check Balance
    public void checkBalance(String password) {
        if (this.pwd.equals(password)) {
            System.out.println("Available Balance: " + balance);
        } else {
            System.out.println("Wrong Password");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank obj = new Bank("12345", "pass123", "Aryan Gore", 10000);

        obj.deposit(2000);

        obj.withdraw(3000, "pass123");

        obj.checkBalance("pass123");
    }
}