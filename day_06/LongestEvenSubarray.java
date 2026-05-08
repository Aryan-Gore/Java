/* find longest subarray whose sum is even  */
import java.util.*;

public class LongestEvenSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0, max = 0, l = 0,r=n-1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if(sum%2==0){
           System.out.println("Length of longest even sum subarray is: " + arr.length);
           return;
        }
         while(l<n && arr[l]%2==0){
            l++;
        }
        while(r>=0 && arr[r]%2==0){
            r--;
        }
        if(l<r){
            max = Math.max(n-l-1,r);
            System.out.println("Length of longest even sum subarray is: " + max);
        }
        else{
            System.out.println("Length of longest even sum subarray is: " + 0);
        }

        
        sc.close();
    }
}

/*2 4 3 3 0 0 0 1
n = 8
First odd element = 3
leftOdd = 2
8 - 2 - 1 = 5
Remaining subarray:
3 0 0 0 1
Length =5..... and for right 1 odd mil gaya to r=7 ho jayega to (5,7) me 7 bada h to right se element hatana h*/