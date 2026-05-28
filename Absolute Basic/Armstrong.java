public class Armstrong {

    public static void main(String[] args) {

        int n = 153;

        int no_of_digit = 0;
        int arm = 0;

        int temp = n;

        while(temp != 0){

            no_of_digit++;

            temp /= 10;
        }

        temp = n;

        while(temp != 0){

            int digit = temp % 10;

            arm += Math.pow(digit, no_of_digit);

            temp /= 10;
        }

        if(arm == n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}