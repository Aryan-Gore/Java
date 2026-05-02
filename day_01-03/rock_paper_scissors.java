import java.util.*;

public class rock_paper_scissors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors:");
        int user = sc.nextInt();

        int comp = r.nextInt(3) + 1;

       
        switch(comp){
            case 1 :
                 System.out.println("system chose rock");
                 break;
            
            case 2 :
                 System.out.println("system chose paper");
                 break;

            case 3:
                 System.out.println("system chose scissors");
                 break;

        }

        if (user == comp) {
            System.out.println("Draw");
        }
        else if ((user == 1 && comp == 3) ||
                 (user == 2 && comp == 1) ||
                 (user == 3 && comp == 2)) {
            System.out.println("You Win");
        }
        else {
            System.out.println("You Lose");
        }

        sc.close();
    }
}

