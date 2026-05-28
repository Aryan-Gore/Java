public class Rev {

    public static void main(String[] args) {
      int t = 76557655;

        int rev = 0;
        int n ;

        while(t>0){

            n = t%10;
            rev = rev * 10 + n;
            t/=10;
            
        }

        System.out.println(rev);
      
    }
       

}
