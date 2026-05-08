/*
find len of longesst subarray whose sum = k 
i/p  1 2 3 -2 5 2 k = 5 O/p 
1 2 6 4 9 11  
*/

import java.util.*;

public class longestSubarrayPrefixSum {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,-2,5,2};
        int k = 5 , sum = 0;
        int n = arr.length;
        int max = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        

        for(int i = 0 ; i<n ;i++){
            sum+=arr[i];
            if(sum == k && max < i+1){
                  max = i+1;
            }

            if(map.containsKey(sum-k)){
                max = max <(i-map.get(sum-k))?i-map.get(sum-k):max;
            }
             if (!map.containsKey(sum)){

                map.put(sum, i);

            }

        }

        System.out.println(max);


    }
}
