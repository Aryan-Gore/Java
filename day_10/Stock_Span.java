// Question : we need to count how many days the price of stock is less than or equal to current price 
// we are given with a set of stock prices
// arr = 50 80 60 70 60 100 90 
// O/P = 1  1   2  3  3  6  6

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class Stock_Span {

    public static void main(String[] args) {
        

        int[] arr = { 50, 80, 60, 70, 60,100,90};
        int[] ans = new int[arr.length];
        int n = arr.length;
        
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        ans[0] = 1;

        for (int i = 1; i < n; i++) {

            int count = 1;
            int curr = arr[i];

            Deque<Integer> temp = new ArrayDeque<>();
        
        while(!stack.isEmpty()){
            if(curr >= stack.peek()){
                count+=stack.size();
                stack.push(curr);
                break ;

            }

            temp.push(stack.pop());
        }
            ans[i] = count;

            while(!temp.isEmpty()){
                stack.push(temp.pop());
            }
        
    }

    for(int i = 0 ; i < n ; i++){
        System.out.print(ans[i]+" ");
    }
}
}