// Question : find the next greatest element in a array of size n;

// arr = 2 1 5 9 7 10
// o/p = 5 5 9 10 10 -1

import java.lang.reflect.Array;
import java.util.*;

public class next_greatest {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 9, 7, 5 };
        int[] ans = new int[arr.length];
        int n = arr.length;
        ans[n - 1] = -1;
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i++) {

            int data = arr[i];

            Deque<Integer> temp = new ArrayDeque<>();

            while (!stack.isEmpty()) {

                if (stack.peek() > data) {
                    ans[i] = stack.peek();
                    stack.push(data);

                    while (!temp.isEmpty()) {
                        stack.push(temp.pop());
                    }
                    break;
                } else {
                    temp.push(stack.pop());
                }
                if (stack.isEmpty()) {
                    ans[i] = -1;
                }

                while (!temp.isEmpty()) {
                    stack.push(temp.pop());
                }

                
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }

}
