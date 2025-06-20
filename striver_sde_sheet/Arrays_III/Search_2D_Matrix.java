public class Search_2D_Matrix {
    public static void main(String[] args) { 
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        
        int target = 3;    
        boolean found = searchMatrix(matrix, target);
         
        System.out.println("Target " + target + " found: " + found);
    }

    // public static boolean searchMatrix(int[][] matrix, int target) { // brute force
    //     int n = matrix.length;
    //     int m = matrix[0].length;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if (matrix[i][j] == target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean binarySearch(int[] mat, int x){

        int n = mat.length;
        int left = 0;
        int right = n-1;
        int mid;

        while(left <= right){
            mid = (left + right) / 2;
            if(mat[mid] == x){
                return true;
            }
            else if(mat[mid] < x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) { // better
        
        int n = matrix.length;
        int m = matrix[0].length; 

        for(int i=0;i<n;i++){
            if(matrix[i][0] <= target && target <= matrix[i][m-1]){
                return binarySearch(matrix[i],target);
            }
        }
        return false;
    }
    // public static boolean searchMatrix(int[][] matrix, int target) { // optimal
        
    //     int n = matrix.length;
    //     int m = matrix[0].length; 

    //     int low = 0;
    //     int high = n*m-1;

    //     while(low <= high){
    //         int mid = (low+high)/2;
    //         int row = mid / m;
    //         int col = mid % m;

    //         if(matrix[row][col] == target){
    //             return true;
    //         }
    //         else if(matrix[row][col] <= target){
    //             low = mid + 1;
    //         }
    //         else{
    //             high = mid - 1;
    //         }
    //     }

         
    //     return false;
    // }
}