 import java.util.*;

public class Representation {
    public static void main(String[] args) {
        int V = 5; 
        int E = 6; 

        int[][] adjMatrix = new int[V][V];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        int[][] edges = {
            {0, 1},
            {0, 4},
            {1, 2},
            {1, 3},
            {1, 4},
            {3, 4}
        };

        for (int i = 0; i < E; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;  

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nAdjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
