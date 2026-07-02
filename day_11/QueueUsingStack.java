import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    // Insert element
    static void enqueue(int data) {
        s1.push(data);
    }

    // Remove front element
    static int dequeue() {

        if (s1.isEmpty()) {
            return -1;
        }

        // Move all elements to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Front element
        int ans = s2.pop();

        // Move back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return ans;
    }

    // Return front element
    static int peek() {

        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int ans = s2.peek();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return ans;
    }

    // Display queue
    static void display() {
        System.out.println(s1);
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();

        System.out.println("Peek : " + peek());

        System.out.println("Removed : " + dequeue());

        display();
    }
}