// find longest subarray whose sum is even 
import java.util.*;
public class LongestEvenSubarray {
    public static void main(String[] args) {
        
    
     int[] arr = {2,4,6,8,1,3,5};
        int left = 0 , sum = 0 , max = 0 , right = arr.length-1;


        for (int i = 0 ; i < arr.length ; i++){

        }
        if(sum % 2 == 0){
           System.out.println(arr.length);
            return;
        }
        while(left < arr.length && arr[left] % 2 == 0){
            left++;
        } 
        while(right > 0 && arr[right] % 2 == 0){
            right--;
        } 

        max = right - left + 1 > right ? right-left +1 : right ;



        
    }
}

