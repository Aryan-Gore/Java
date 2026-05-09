// Find 2nd largest and 3rd smallest number in an array

import java.util.*;

public class largest {

    public static void main(String[] args) {

        int[] arr = {1,2,5,6,4,2,5,12,5};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int thirdsmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {

           
            if(arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }

            if(arr[i] < smallest) {
                thirdsmallest = secondsmallest;
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondsmallest && arr[i] != smallest) {
                thirdsmallest = secondsmallest;
                secondsmallest = arr[i];
            }
            else if(arr[i] < thirdsmallest && arr[i] != secondsmallest) {

                thirdsmallest = arr[i];
            }
        }

        System.out.println(secondlargest);
        System.out.println(thirdsmallest);
    }
}