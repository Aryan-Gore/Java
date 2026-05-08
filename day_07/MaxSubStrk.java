import java.util.*;

public class MaxSubStrk{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0 , max = 0;

        for (int i = 0; i<str.length();i++){

            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
            while(map.size() > k){

                if(map.get(str.charAt(left))-1 == 0){
                    map.remove(str.charAt(left));
                    left++;
                    continue;
                }
                map.put(str.charAt(left),map.get(left)-1);
                left++;

            }

            if(max < i-left+1){
                max = i-left+1;
            }


        }

        sc.close();
    }


}