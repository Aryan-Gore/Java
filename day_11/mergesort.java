package day_11;

public class mergesort {

    static void mergesort(int[] arr , int left , int right){
        

        if(left < right){
          int  mid = left + (right - left )/2;
             mergesort(arr, left, mid);
             mergesort(arr, mid + 1, right);

             merge(arr,left,mid,right);
        }
    }

    static void merge(int[] arr , int left , int mid , int right){

        int n1 = left - right + 1;
        int n2 = left - mid ;
        
        int[] leftarray = new int[n1];
        int[] rightarray = new int[n2];

        for(int i = 0 ; i <=n1 ;i++){
            leftarray[i] = arr[left + i];
        }
        for(int i = 0 ; i <=n2 ;i++){
            rightarray[i] = arr[mid+1+ i];
        }
        
        int i = 0, j = 0 , k = left;

        while(i < n1 && j <n2){

            if(leftarray[i] <= rightarray[j]){   
            arr[k] = leftarray[i];
            k++;
            i++;
        }else{
            arr[k]=rightarray[j];
            i++;
            j++;
        }
        
    }

    while(i < n1){
        arr[k] = leftarray[i];
        k++;
        i++;
    }
   
    while(j < n2){
        arr[k] = rightarray[j];
        k++;
        j++;
    }
}
    public static void main(String[] args) {
        
    }
}
