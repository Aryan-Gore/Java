public class LL1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        static Node addAtHead(int data, Node head) {

            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;

                return head;
            }

            newNode.next = head;
            head = newNode;
            return head;
        }

        static Node addAtTail(int data, Node head) {

            Node newNode = new Node(data);

            if (head == null) {

                head = newNode;
                return head;

            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return head;

        }

        static Node addAtN(int data, int pos, Node head) {

            Node newNode = new Node(data);

            if (pos == 0) {
                return addAtHead(data, head);
            }

            Node temp = head;

            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            return head;
        }
    }

    static Node deleteAtHead(Node head) {

        if (head == null) {
            return head;
        }

        head = head.next;

        return head;
    }

    static Node deleteAtTail(Node head) {

        if (head == null) {
            return head;
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

    static Node deleteATData(int target, Node head) {

        if (head == null) {
            return head;
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


    static Node deleteAtN(int n, Node head) {

    if (head == null) {
        return null;
    }

    if (n == 0) {
        return deleteAtHead(head);
    }

    Node temp = head;

    for (int i = 0; i < ( n - 1 ) && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null) {
        return head; 
    }

    temp.next = temp.next.next;

    return head;
}


static Node update(Node head ,int target, int data){

    if(head == null){
        return head;
    }

    Node temp = head;

      while(temp.data!=target){
           temp = temp.next;
      }
     
    if (temp != null) {
        
        temp.data = data;
    }

      return head;
}



    public static void main(String[] args) {

    }
}