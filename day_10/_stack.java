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
