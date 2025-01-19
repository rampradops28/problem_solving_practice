import java.util.ArrayList;

public class rat_in_the_maze {
    public static void func(int i, int j, int n, ArrayList<String> ans, ArrayList<ArrayList<Integer>> mat, String move, int[][] visited){
        
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        
        //downward
        if(i+1<n && visited[i+1][j] == 0 && mat.get(i+1).get(j) == 1){
            visited[i+1][j] = 1;
            func(i+1,j,n,ans,mat,move + 'D',visited);
            visited[i+1][j] = 0;
        }
        
        //leftward
        if(j-1>=0 && visited[i][j-1] == 0 && mat.get(i).get(j-1) == 1){
            visited[i][j-1] = 1;
            func(i,j-1,n,ans,mat,move + 'L',visited);
            visited[i][j-1] = 0;
        }
        
        //rightward
        if(j+1<n && visited[i][j+1] == 0 && mat.get(i).get(j+1) == 1){
            visited[i][j+1] = 1;
            func(i,j+1,n,ans,mat,move + 'R',visited);
            visited[i][j+1] = 0;
        }
        
        //upward
        if(i-1>=0 && visited[i-1][j] == 0 && mat.get(i-1).get(j) == 1){
            visited[i-1][j] = 1;
            func(i-1,j,n,ans,mat,move + 'U',visited);
            visited[i-1][j] = 0;
        }
    }
    // Function to find all possible paths
    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
         
         int n = mat.size();
         int[][] visited = new int[n][n];
         
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 visited[i][j] = 0;
             }
         }
         
         ArrayList<String> ans = new ArrayList<>();
         if(mat.get(0).get(0) == 1){
              visited[0][0] = 1;
              func(0,0,n,ans,mat,"",visited);
         } 
         return ans;
    }
       public static void main(String[] args) {
        int n = 4;
        int[][] a = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};

        // Convert the 2D array into an ArrayList<ArrayList<Integer>>
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(a[i][j]);
            }
            mat.add(row);
        }

        // Assuming findPath is implemented and accepts ArrayList<ArrayList<Integer>>
        ArrayList<String> res = findPath(mat);
        if (res.size() > 0) {
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i) + " ");
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
    
      }
}



// class Solution{
    
//     public static void func(int i, int j, ArrayList<ArrayList<Integer>> mat, int n, ArrayList<String> ans, String move, int[][] visited, int[] di, int[] dj){
        
//         if(i == n-1 && j == n-1){
//             ans.add(move);
//             return;
//         }
        
//         String res = "DLRU";
        
//         for(int ind=0;ind<4;ind++){
            
//             int indi = i + di[ind];
//             int indj = j + dj[ind];
            
//             if(indi<n && indj<n && indi>=0 && indj>=0 && visited[indi][indj] == 0 && mat.get(indi).get(indj) == 1){
//                 visited[i][j] = 1;
//                 func(indi,indj,mat,n,ans,move+res.charAt(ind),visited,di,dj);
//                 visited[i][j] = 0;
//             }
//         }
//     }
//     public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        
//         int n = mat.size();
//         int[][] visited = new int[n][n];
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 visited[i][j] = 0;
//             }
//         }
        
//         int[] di = {+1,0,0,-1};
//         int[] dj = {0,-1,+1,0};
        
//         ArrayList<String> ans = new ArrayList<>();
//         if(mat.get(0).get(0) == 1){
//             func(0,0,mat,n,ans,"",visited,di,dj);
//         }
//         return ans;
//     }
// }