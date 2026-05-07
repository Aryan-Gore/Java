/* 
u are given a list of cars passing thorugh toll gate per min
u have to find the max no passed in k consecutive min
 */

import java.util.*;

public class SmartCIty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {4,8,15,3,10,12,5,9};

        int sum = 0 ;
        int max = 0 ;

        for(int i  = 0 ;i < k; i++){
            sum += arr[i];
        }
        max = max < sum ? sum : max ;

        for(int i = k ; i < arr.length ;i++){

            sum -= arr[i-k];
        
            sum += arr[i];

            max = max < sum ? sum : max ;


        }
        
        System.out.println(max);
    }
}
