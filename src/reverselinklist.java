public class reverselinklist {
    Node head;
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // Swap values at position m and n
    void reverse(int m, int n) {
        if (head == null) return;
        Node first = null;
        Node second = null;
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (pos == m) first = temp;
            if (pos == n) second = temp;
            temp = temp.next;
            pos++;
        }
        // Swap values
        if (first != null && second != null) {
            int t = first.data;
            first.data = second.data;
            second.data = t;
        }
    }
    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        reverselinklist list = new reverselinklist();
        // Create list: 1 → 2 → 3 → 4 → 5
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.print("Original: ");
        list.display();
        int m = 2;
        int n = 4;
        list.reverse(m, n);
        System.out.print("After swapping m & n: ");
        list.display();
    }
}