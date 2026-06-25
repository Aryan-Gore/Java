// Node of Linked List
static class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
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

       
 public static void main(String[] args) {

        }
