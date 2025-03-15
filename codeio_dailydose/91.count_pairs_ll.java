import java.util.HashMap; 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class count_pairs_ll {
    public static void main(String[] args) {
        // Create first linked list: 1 -> 2 -> 3
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // Create second linked list: 3 -> 2 -> 1
        Node head2 = new Node(3);
        head2.next = new Node(2);
        head2.next.next = new Node(1);

        int x = 4;
 
        int result = countPairs(head1, head2, x);
        System.out.println("Number of pairs: " + result);
    }
    public static int countPairs(Node head1, Node head2, int x) {
        
        Node temp = head1;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        while(temp != null){
            map.put(x-temp.data, 1);
            temp = temp.next;
        }
        
        temp = head2;
        int cnt = 0;
        
        while(temp != null){
            if(map.containsKey(temp.data)){
                cnt += map.get(temp.data);
            }
            temp = temp.next;
        }
        
        return cnt;
    }
}
