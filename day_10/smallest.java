package day_10;
// Question : remove 3 digit to make smallest no 751246925

import java.util.*;

public class smallest {

    public static void main(String[] args) {
        
        String s = "751246925";
        int chances = 3;

        Deque<Character> stack = new LinkedList<>();

         for(int i = 0 ; i <s.length() ; i++){
              stack.push(s.charAt(i));
         }

             for(int i = 0 ; i <s.length() ; i++){
                 
               char curr = s.charAt(i);


              

         }


    }
    
}
