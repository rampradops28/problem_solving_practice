import java.util.ArrayList;

public class m_coloring_graph {
    // Check if it's safe to color the current node with the given color
    public static boolean isSafe(int node, ArrayList<Integer>[] g, int[] color, int n, int col) {
        for (int neighbor : g[node]) { // Iterate through neighbors
            if (color[neighbor] == col) {
                return false; // If any neighbor has the same color, return false
            }
        }
        return true;
    }

    // Backtracking function to color the graph
    public static boolean func(int node, ArrayList<Integer>[] g, int[] color, int n, int m) {
        if (node == n) {
            return true; // If all nodes are colored, return true
        }

        for (int col = 1; col <= m; col++) { // Try all colors from 1 to m
            if (isSafe(node, g, color, n, col)) {
                color[node] = col; // Assign color
                if (func(node + 1, g, color, n, m)) { // Recursive call for the next node
                    return true;
                }
                color[node] = 0; // Backtrack
            }
        }
        return false; // If no valid color is found, return false
    }

    // Function to start the graph coloring process
    public static boolean graphColoring(ArrayList<Integer>[] g, int[] color, int i, int m) {
        int n = g.length;
        return func(i, g, color, n, m);
    }

    public static void main(String[] args) {
        int N = 4, M = 3;
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<>();
        }
        // Create the graph
        G[0].add(1);
        G[1].add(0);
        G[1].add(2);
        G[2].add(1);
        G[2].add(3);
        G[3].add(2);
        G[3].add(0);
        G[0].add(3);
        G[0].add(2);
        G[2].add(0);

        int[] color = new int[N]; // Array to store colors of nodes
        boolean ans = graphColoring(G, color, 0, M);

        if (ans) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
