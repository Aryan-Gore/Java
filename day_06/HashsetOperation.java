import java.util.*;

public class HashsetOperation {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int ele = sc.nextInt();


        while(ele!= 0){
            set.add(ele);
            ele = sc.nextInt();
        }

        for(int i:set){
            System.out.println(i);
        }
    }
}

