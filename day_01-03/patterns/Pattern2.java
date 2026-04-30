/*
 A
CBD
 E
GFH
 I
*/   
public class Pattern2 {

   public static void main(String[] args) {
    
    int n = 5;
    int x = 65;

    for(int i = 1; i<= n; i++){

        if((i&1) != 0){
            System.out.print(" ");

            System.out.print((char)x);//explicit Typecasting
            x++;
        }
        else{
             System.out.print((char)(x+1));
              System.out.print((char)x);
               System.out.print((char)(x+2));
               x+=3;
        }
            System.out.println();
   }
    
}
}