import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
//Stack implementation Using Linkedlist
public class _stack {
     
    //creating a node
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
//make Global head
  static Node top = null;

//push in stack
static void push(int data){

    Node newnode = new Node(data);
    if(top == null){
        top = newnode;
        return;
    }

    newnode.next = top;
    top = newnode;
}

//pop in stack
static int pop(){

    
    if(top == null){
        return -1;
    }

    int val = top.data;
    top = top.next;

    return val;
}

//peak element 
static int peak(int data){
    if(top == null){
        return -1;
    }
     return top.data;
}

//Display
static void Display(){

    if(top == null){
        return;
    }

    Node temp = top;

    while(temp!=null){
        System.out.println(temp.data);
        temp = temp.next;
    }
} 

//isempty
static boolean isEmpty(){
           if(top == null)
                return true;

           return false;
}

//reverse using stack
static void reverseStack(){

    if(top == null){
        return ;
    }

    Node top2 = null;
    Node temp = top;

    while(temp != null){
         int val = pop();
        Node newnode = new Node(val);
        newnode.next = top2;
        top2 = newnode;

        temp = temp.next;
    }
     top = top2;
 
}


    // Add two stacks
    static Node add(Node s1, Node s2) {

          Node result = null;
 
        while (s1 != null || s2 != null) {

            int x = 0;
            int y = 0;
            int sum = 0;

            if (s1 != null) {
                x = s1.data;
                s1 = s1.next;
            }

            if (s2 != null) {
                y = s2.data;
                s2 = s2.next;
            }
            
            sum = x + y;

        Node newNode = new Node(x + y);
        newNode.next = result;
        result = newNode;
       
        }

        return result;
    }


//merge 2 stacks

static Node merge(Node s1,Node s2){

    if(s1 == null) return s2;
    if(s2 == null) return s1;

    // Stack<Integer> stack = new Stack<>(); depritiated onwards java 8
    
    Deque<Integer> st = new LinkedList<>();

    while(s2 != null){
        st.push(s2.data);
        s2 = s2.next;
    }

          while(!st.isEmpty()){
                 int val = st.pop();
                 Node newnode = new Node(val);

                 newnode.next = s1;
                 s1 = newnode;
          }

          return s1;

}

static boolean contains(int key){

    if(top == null){
        return false;
    }

    Node temp = top;

    while(temp!=null){
        if(temp.data == key)
            return true;

        temp = temp.next;
    }

    return false;
}

//mid of stack
static int midAverage() {

    if (top == null)
        return -1;

    Node slow = top;
    Node fast = top;
    Node prev = null;

    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    if (fast == null)
        return (prev.data + slow.data) / 2;

    return slow.data;
}
//contains , merge 2 stacks , add 2 Stack
public static void main(String[] args) {
     push(10);
     push(20);
     push(30);
     push(50);
     push(50);
     push(60);

     Display();
     
     reverseStack();

     Display();
}
}
