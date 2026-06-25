public class LL1 {
// Node of Linked List
static class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
// Insert at Head
static Node addAtHead(int data, Node head) {

    Node newNode = new Node(data);

    if (head == null) {
        return newNode;
    }

    newNode.next = head;
    head = newNode;

    return head;
}

// Insert at Tail
static Node addAtTail(int data, Node head) {

    Node newNode = new Node(data);

    if (head == null) {
        return newNode;
    }

    Node temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;

    return head;
}

// Insert at Position
static Node addAtN(int data, int pos, Node head) {

    if (pos == 0) {
        return addAtHead(data, head);
    }

    Node newNode = new Node(data);
    Node temp = head;

    for (int i = 0; i < pos - 1 && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null) {
        return head;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return head;
}

// Delete Head Node
static Node deleteAtHead(Node head) {

    if (head == null) {
        return null;
    }

    return head.next;
}

// Delete Tail Node
static Node deleteAtTail(Node head) {

    if (head == null) {
        return null;
    }

    if (head.next == null) {
        return null;
    }

    Node temp = head;

    while (temp.next.next != null) {
        temp = temp.next;
    }

    temp.next = null;

    return head;
}

// Delete Node by Value
static Node deleteATData(int target, Node head) {

    if (head == null) {
        return null;
    }

    if (head.data == target) {
        return deleteAtHead(head);
    }

    Node temp = head;

    while (temp.next != null && temp.next.data != target) {
        temp = temp.next;
    }

    if (temp.next != null) {
        temp.next = temp.next.next;
    }

    return head;
}

// Delete Node at Position
static Node deleteAtN(int n, Node head) {

    if (head == null) {
        return null;
    }

    if (n == 0) {
        return deleteAtHead(head);
    }

    Node temp = head;

    for (int i = 0; i < n - 1 && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null || temp.next == null) {
        return head;
    }

    temp.next = temp.next.next;

    return head;
}

// Update Node Value
static Node update(Node head, int target, int data) {

    if (head == null) {
        return null;
    }

    Node temp = head;

    while (temp != null && temp.data != target) {
        temp = temp.next;
    }

    if (temp != null) {
        temp.data = data;
    }

    return head;
}

// Search Value and Return Position
static int searchWithTarget(Node head, int target) {

    int pos = 0;
    Node temp = head;

    while (temp != null) {

        if (temp.data == target) {
            return pos;
        }

        temp = temp.next;
        pos++;
    }

    return -1;
}

// Reverse Linked List
static Node rev(Node head) {

    if (head == null) {
        return null;
    }

    Node prev = null;
    Node temp = head;

    while (temp != null) {

        Node next = temp.next;

        temp.next = prev;
        prev = temp;
        temp = next;
    }

    return prev;
}

//middleNode
static Node middleNode(Node head){

       if (head == null){
        return head ;
       }
       Node slow = head, fast = head;
            
      
       while(fast != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
       }

        return slow;
}

//pallindrome
static boolean isPallindrome(Node head){
     
     if(head == null)
        return true ;

     Node middle = middleNode(head);

     Node head2 = rev(middle.next);

     Node temp1 = head;
     Node temp2 = head2;

     while (temp1 != null && temp2 != null) {
        
        if(temp1.data != temp2.data){
            return false;
        }
            temp1 = temp1.next;
            temp2 = temp2.next;

     }
    return true;
}

static boolean hasCycle(Node head) {

    if (head == null) {
        return false;
    }

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {

        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true;
        }
    }

    return false;
}

//sr=tart of cycle

static Node startOfCycle(Node head){

       if(head == null)
          return null;

       Node slow = head;
       Node fast = head;

       while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;

         if(slow == fast){

            slow = head;
            while(slow != fast){

                slow = slow.next;
                fast = fast.next;
            }
            return slow;
         }
       }
       return null;
}

static Node merge(Node head1 , Node head2){
        
    if(head1 == null){
        return head2;
    }
    if(head2 == null){
        return head1;
    }

    Node temp = head1;

    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = head2;

    return head1;
}

static Node add(Node head1 , Node head2){
      
    Node temp1 = rev(head1);
    Node temp2 = rev(head2);

    Node result = new Node (0);
    Node tail = result;

    int carry = 0;

    int sum = 0;


    while(temp1 != null || temp2 != null || carry !=0){
       
            sum = carry;

        if (temp1  != null) {
            sum += temp1.data;
            temp1 = temp1.next;
        }

        if (temp2 != null) {
            sum += temp2.data;
            temp2 = temp2.next;
        }

        carry = sum / 10;

        tail.next = new Node(sum % 10);
        tail = tail.next;

    }
    return rev(result.next);
}

static void print(Node head){

    if(head == null){
        System.out.println("enpty");
    }

    Node temp = head;

    while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
      System.out.println("NULL");
}
 public static void main(String[] args) {

    
 }
}