/*
Pwd strength checker - pwd must have 
1. 28 chr , 1 digit , 1 uppercase and one special char  else show missing criteria
*/

import java.util.*;

public class PwdStrengthChecker {

    static void check (String pwd){
        boolean hasLength = pwd.length() >= 28;
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

    
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            } 
            else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } 
            else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

      
        if (hasLength && hasDigit && hasUpper && hasSpecial) {
            System.out.println("Strong pwd ");
        } else {
            System.out.println("Weak pwd");

            if (!hasLength)
                System.out.println("Missing: Minimum 28 characters");
            if (!hasDigit)
                System.out.println("Missing: At least 1 digit");
            if (!hasUpper)
                System.out.println("Missing: At least 1 uppercase letter");
            if (!hasSpecial)
                System.out.println("Missing: At least 1 special character");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pwd = sc.nextLine();

        check(pwd);

        sc.close();
    }
}