public class is_length_even {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isLengthEven(Node head) {
        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        return (cnt % 2 == 0);
    }

    public static void main(String[] args) {
        // Creating a linked list 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Test the function
        boolean result = isLengthEven(head);
        System.out.println("Is the length of the linked list even? " + result); // Should print true for this example
    }
}
