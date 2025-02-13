import java.util.Stack;

class GfG {
    int minEle;
    Stack<Integer> s;
    Stack<Integer> minStack;

    // Constructor
    GfG() {
        s = new Stack<>();
        minStack = new Stack<>();
    }

    /* returns min element from stack */
    int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }

    /* returns popped element from stack */
    int pop() {
        if (s.isEmpty()) {
            return -1;
        }
        int popped = s.pop();
        if (!minStack.isEmpty() && popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    /* push element x into the stack */
    void push(int x) {
        s.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
}

public class get_min_from_stack {
    public static void main(String[] args) {
        GfG gfg = new GfG();

        // Example inputs
        int[] queries = {1, 2, 3, 1, 1, 3};
        int[] values = {2, 3, -1, 1, -1, -1};

        for (int i = 0; i < queries.length; i++) {
            if (queries[i] == 1) {
                gfg.push(values[i]);
            } else if (queries[i] == 2) {
                System.out.println(gfg.pop());
            } else if (queries[i] == 3) {
                System.out.println(gfg.getMin());
            }
        }
    }
}