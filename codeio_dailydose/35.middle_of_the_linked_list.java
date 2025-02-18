

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class middle_of_the_linked_list {
    static int getMiddle(Node head) {
        if (head == null) {
            return -1;  
        }

        Node slowptr = head;
        Node fastptr = head;

        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }

        return slowptr.data;
    }

    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
 
        int middle = getMiddle(head);
        System.out.println("The middle element is: " + middle); // Output should be 3
    }
}