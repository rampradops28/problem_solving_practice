import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_k_elements_in_the_queue {
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // Create a stack to hold the first k elements
        Stack<Integer> s = new Stack<>();
        
        // Push the first k elements into the stack
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }
        
        // Enqueue the elements from the stack back into the queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        
        // Remove the remaining elements and enqueue them back to maintain the order
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }

        return q;
    }
    public static void main(String[] args) { 
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;
        Queue<Integer> modifiedQueue = modifyQueue(q, k);

        System.out.print("Modified Queue: ");
        while (!modifiedQueue.isEmpty()) {
            System.out.print(modifiedQueue.poll() + " ");
        }
    }
}
