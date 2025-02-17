class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class detect_loop_in_a_linked_list {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        Node slowptr = head;
        Node fastptr = head;

        while (slowptr != null && fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;

            if (slowptr == fastptr) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Creating a linked list with a loop
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;

        // Calling detectLoop function
        boolean hasLoop = detectLoop(head);
        System.out.println("Linked list has a loop: " + hasLoop); // Output should be true

        // Creating a linked list without a loop
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        // Calling detectLoop function
        boolean hasLoop2 = detectLoop(head2);
        System.out.println("Linked list has a loop: " + hasLoop2); // Output should be false
    }
}