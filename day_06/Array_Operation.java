import java.util.*;
public class Array_Operation{

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int n = 5 ;

        int[] arr = {10,15,84,59,98};

        for (int i = 0 ; i < arr.length ;i++){
            
            System.out.println(arr[i]);
        }

        int[] arr1 = new int[n]; 


        for (int i = 0 ; i < arr.length ;i++){
            
           arr1[i] = Sc.nextInt();
        }

          for (int i = 0 ; i < arr.length ;i++){
            
            System.out.println(arr1[i]);
        }

        Sc.close();

    }

}