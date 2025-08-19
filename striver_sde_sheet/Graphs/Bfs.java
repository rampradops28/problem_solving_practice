import java.util.*;

class Bfs { 
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();           
        int[] vis = new int[v];       
        ArrayList<Integer> ls = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);          
        vis[0] = 1;
        
        while(!q.isEmpty()){
            int node  = q.poll();
            ls.add(node);
            
            for(Integer i: adj.get(node)){
                if(vis[i] == 0){
                    vis[i] = 1;
                    q.add(i);
                }
            }
        }
        return ls;
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
 
        ArrayList<Integer> ans = bfs(adj);
 
        System.out.println("\nBFS Traversal:");
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
