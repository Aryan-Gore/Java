/* find the longest subarray whose sum <= k in a list of elements */

import java.util.*;

public class LongestSubArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,1,0,1,1,0,1};
        int k = 4 , left = 0 , sum = 0 , max = 0;

        for (int r = 0 ; r < arr.length ; r++){

                sum += arr[r];
                

                while(sum>k){
                    sum-=arr[left];
                    left++;
                }

                if(max < r-left+1 && sum <= k){
                    max = r-left+1;
                }

        }

        System.out.println(max);
    }
}
