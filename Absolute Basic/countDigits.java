
    public class countDigits {

        public static void main(String[] args) {
            int t = 76557655;

        int count = 0;

        while(t>0){
            count ++;
            t/=10;
        }

        System.out.println(count);
    }

        }
        
