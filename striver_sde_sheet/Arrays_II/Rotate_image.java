package striver_sde_sheet.Arrays_II;

public class Rotate_image {
    // public static void rotate(int[][] matrix) { // brute force
        
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     int[][] dum = new int[n][m];

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             dum[j][n-i-1] = matrix[i][j];
    //         }
    //     }

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             matrix[i][j] = dum[i][j];
    //         }
    //     }
    // }
    public static void rotate(int[][] matrix) { //optimal
        
        int n = matrix.length;
        int m = matrix[0].length;
         
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated matrix:");
        printMatrix(matrix);
    }
}
