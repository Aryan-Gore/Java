package day_11;

public class quick {
    
     
    static void quick_Sort(int[] arr, int left,int right ){


        while(left < right){
            int pindex = partition(arr, left , right);
            quick_Sort(arr, left, pindex-1);
            quick_Sort(arr, left, pindex+1);
        }
    }

    static int partition(int[] arr, int left, int right){

            int pivot = arr[right];
            int i = left -1 ;

            for(int j = left ; j < right ; j++){
                       if(arr[j] <= pivot){
                        int temp = arr[j];
                         arr[j] = arr[i+1];
                         arr[i+1] = temp;
                       }
            }
            
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
