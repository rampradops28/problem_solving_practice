public class number_of_island {
    public static void mark0(char[][] grid, int i, int j){

        int n = grid.length;
        int m = grid[0].length;

        if(i<0 || j<0) return;
        if(i>=n || j>=m) return;

        if(grid[i][j] == '0') return;

        grid[i][j] = '0';

        mark0(grid,i-1,j);
        mark0(grid,i+1,j);
        mark0(grid,i,j-1);
        mark0(grid,i,j+1);
    }
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    count++;
                    mark0(grid,i,j);
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        char[][] grid= {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
          };
        
        System.out.println("Count: "+numIslands(grid));
    }
}
