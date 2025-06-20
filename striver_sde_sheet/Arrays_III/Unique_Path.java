public class Unique_Path {
    public static void main(String[] args) {
        int m = 3; 
        int n = 7;  
         
        int result = uniquePaths(m, n);
        
        System.out.println("Number of unique paths: " + result);
    }
    // public static int countPath(int i, int j, int m, int n){ // brute
    //     if(i==m-1 && j==n-1) return 1;

    //     if(i>=m || j>=n) return 0;
    //     else return countPath(i+1,j,m,n) + countPath(i,j+1,m,n);

    // }
    public static int countPath(int i, int j, int m, int n,int[][] dp){ // better 
        if(i==m-1 && j==n-1) return 1;

        if(i>=m || j>=n) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        else return dp[i][j] = countPath(i+1,j,m,n,dp) + countPath(i,j+1,m,n,dp);

    }
    public static int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }

        return countPath(0,0,m,n,dp);
    }
    //  public static int uniquePaths(int m, int n) { // optimal
    //     int N = m+n-2;
    //     int r = m-1;
    //     double res = 1;

    //     for(int i=1;i<=r;i++){
    //         res = res * (N - r + i) / i;
    //     }
    //     return (int)res;
    // }
}
