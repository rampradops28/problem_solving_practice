import java.util.*;

class Dfs {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();        
        int[] vis = new int[v];
        ArrayList<Integer> ls = new ArrayList<>(); 
        func(0, vis, ls, adj);
        return ls;
    }

    public static void func(int node, int[] vis, ArrayList<Integer> ls, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        ls.add(node);
        for(Integer it: adj.get(node)){
            if(vis[it] == 0){
                func(it, vis, ls, adj);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; 
        int E = 4; 

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(4);
        adj.get(4).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(3);
        adj.get(3).add(1);

        System.out.println("Graph (Adjacency List):");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        Dfs solver = new Dfs();
        ArrayList<Integer> ans = solver.dfs(adj);

        System.out.println("\nDFS Traversal:");
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
