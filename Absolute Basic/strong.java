public class strong {

    public static int fact(int n ){

    if(n == 0 || n==1)
        return 1;

            return n*fact(n-1);

        }
    
    public static void main(String[] args) {
        
        int h = 147;

        int strong = 0;
        int temp = h;

        while(temp!=0){

            strong  += fact(temp%10);
            temp/=10;

        }

        if(h == strong){
            System.out.println("strong");
        }

        
    }
}
