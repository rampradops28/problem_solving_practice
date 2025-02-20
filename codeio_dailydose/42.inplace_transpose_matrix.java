public class inplace_transpose_matrix {
    public static void inplace_transpose(int[][] arr){
        
        int row = arr.length;
        int col = arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp; 
            }
        }
    }
    public static void printMatrix(int mat[][]) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = {
            {1, 0, 0},
            {0, 0, 1},
            {0, 0, 0}
        };

        System.out.println("Original Matrix:");
        printMatrix(mat);

        inplace_transpose(mat);

        System.out.println("Modified Matrix:");
        printMatrix(mat);
    }
}
