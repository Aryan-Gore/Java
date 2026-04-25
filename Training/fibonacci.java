import java.util.*;

public class fibonacci {

    static void fibo(int n){

    int a = 0, b = 1;

    for(int i = 1; i <= n; i++){
        
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of terms : ");
        int n = sc.nextInt();

        fibo(n);

        sc.close();
    }
}