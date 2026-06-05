import java.util.*;
public class Count_words_in_string{

    public static void main(String args[]){

       
        int count = 0 ;

        // we have to count no of words  in String 

        String s = "Aryan Gore Learning Java";

        String[] words = s.split(" ");

        System.out.println(words.length);


         System.out.println(words[0]);
         System.out.println(words[1]);
         System.out.println(words[2]);
         System.out.println(words[3]);

    }
}