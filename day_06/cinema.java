/*
in a online cinema booking system there are n seats in a row ,represented as an array of 0's and 1's 

You need to find the longest strech of consequtive empty seats so A that large family can seat together 
*/

import java.util.*;

public class cinema {
    
    public static void main(String[] args) {
        
        int[] arr = {1,0,0,0,1,0,0};

        int count = 0 ;
        int max = 0 ;

          for(int i  = 0 ;i < arr.length ; i++){
                   
            if(arr[i] == 0){
                count++;
            }
            else if (count !=0){
                max = max < count ? count : max ;
                count = 0;
            }
        }
        
        max = max < count ? count : max ;
        System.out.println(max);
        

    }
}
