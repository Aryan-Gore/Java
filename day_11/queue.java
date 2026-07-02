public class Queue {

    // Node class for Linked List
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Front points to the first element
    // Rear points to the last element
    static Node front = null;
    static Node rear = null;

    // -------------------- ENQUEUE --------------------
    // Inserts an element at the rear of the queue.
    static void enqueue(int data) {

        Node newNode = new Node(data);

        // If queue is empty
        if (front == null) {
            front = rear = newNode;
            return;
        }

        // Attach new node after rear
        rear.next = newNode;

        // Move rear to the new last node
        rear = newNode;
    }

    // -------------------- DEQUEUE --------------------
    // Removes the front element.
    static void dequeue() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }
    }

    // -------------------- PEEK --------------------
    // Returns the front element without removing it.
    static int peek() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    // -------------------- REVERSE --------------------
    // Reverses the queue using Linked List reversal.
    static Node reverse() {

        Node prev = null;
        Node curr = front;

        // Current front becomes the new rear
        rear = front;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // Update front
        front = prev;

        return front;
    }

    // -------------------- CONTAINS --------------------
    // Checks whether the queue contains the given value.
    static boolean contains(int target) {

        Node temp = front;

        while (temp != null) {

            if (temp.data == target) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // -------------------- DISPLAY --------------------
    // Prints all queue elements.
    static void display() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // -------------------- MAIN --------------------
    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        System.out.print("Queue: ");
        display();

        System.out.println("Peek = " + peek());

        dequeue();
        System.out.print("After Dequeue: ");
        display();

        System.out.println("Contains 30? " + contains(30));
        System.out.println("Contains 100? " + contains(100));

        reverse();
        System.out.print("After Reverse: ");
        display();
    }
}