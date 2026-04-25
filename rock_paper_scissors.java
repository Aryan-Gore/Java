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

// A funtion has 3 main components 1 func prototype 2 body and 3 call 
// fun protype tells us about majorly 3 things - return type of the funtion ,funtion name ,list of arguments with datatype
// for example int add (int s ,int v ,int y)
// funtion body tells us about the actual working of the funtion 
// u can cal a funtion by using its name and req parameters. 
// variation of function no return no argument , with return no argument , with return with argument, no return with argument.

/*
Divide and conquer and combine 
  divide -> it breaks problem into smaller independent problems 
  conquer -> finding soln of smaller sub problem 
  combine -> joining the soln of smaller sub problems to find soln of larger problem.
  
greedy 
  finding optimal soln at each step 

Dp(Dynamic Programming)
  1. samller subproblems it divides in to smaller sub problems and 
  2. interconnectedd problems -> those sub problems must be interconnected in such a way that onr problem is using the soln of already solved one.
  
  
Backtracking 
    it searches for al possible paths for a given problem .if at any branch or path it fails it backtraacks and checks for other paths 
    
    n queen 

Branch and Bound 
    it provides boundaries to the unsoolved problems to manage it into a sorted intervaks , so that it may have possiblity for its soln 
    
    note -> if we cant set intervals then it'll give a exonential time commpelxity which is hard to implement 
    
    
   
 */