import java.util.*;
public class SumtillZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lst = new ArrayList<>();//16 item store kar sakta h fir lage to double kar dega
        int ele = sc.nextInt();

        while(ele!=0){
            lst.add(ele);
            ele = sc.nextInt();
        }

        System.out.println("printing...");
        
        for(int i:lst){
            System.out.println(i);
        }
    }
}