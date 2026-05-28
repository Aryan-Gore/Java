
public class sumDigit {
   public static void main(String[] args) {
    int t = 76557655;

     int sum = 0;

      while(t>0){
        sum += t%10;
        t/=10;
      }

      System.out.println(sum);
   }

}
