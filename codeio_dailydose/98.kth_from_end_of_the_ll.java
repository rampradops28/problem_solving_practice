
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}  

public class kth_from_end_of_the_ll {
    public static void main(String[] args) {
        // Create a linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5); 

        // Test cases
        System.out.println(getKthFromLast(head, 1)); // Output: 5
        System.out.println(getKthFromLast(head, 2)); // Output: 4
        System.out.println(getKthFromLast(head, 3)); // Output: 3
        System.out.println(getKthFromLast(head, 5)); // Output: 1
        System.out.println(getKthFromLast(head, 6)); // Output: -1 (k is larger than the length of the list)
        System.out.println(getKthFromLast(null, 1)); // Output: -1 (list is empty)
    }
    static int getKthFromLast(Node head, int k) {
         
        Node start = head;
        Node end = head;
        
        while(end != null){
            if(k == 0){
                break;
            }
            end = end.next;
            k--;
        }
        
        if(k > 0){
            return -1;
        }
        
        while(end != null){
            start = start.next;
            end = end.next;
        }
        
        return start.data;
   }
}
