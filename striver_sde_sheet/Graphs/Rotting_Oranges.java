import java.util.*;

class Pair {
    int row;
    int col;
    int tm;
    public Pair(int row, int col, int tm){
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}

public class Rotting_Oranges {
    public static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] vis = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        int cntFresh = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                else {
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1) cntFresh++;
            }
        }

        int tm = 0;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        int cnt = 0;

        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            tm = Math.max(tm,t);
            q.remove();

            for(int i=0; i<4; i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] != 2 && grid[nrow][ncol] == 1){
                    q.add(new Pair(nrow, ncol, t+1));
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }

        if(cnt != cntFresh) return -1;
        return tm;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };  
        System.out.println("Grid:");
        System.out.println("Time to rot all oranges: " +  orangesRotting(grid));
    }
}
