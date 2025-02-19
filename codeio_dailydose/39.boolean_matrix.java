public class boolean_matrix {
    public static void booleanMatrix(int mat[][]) {
        int r = mat.length;
        int c = mat[0].length;
        
        int[] row = new int[r];
        int[] col = new int[c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == -1 || col[j] == -1) {
                    mat[i][j] = 1;
                }
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

        booleanMatrix(mat);

        System.out.println("Modified Matrix:");
        printMatrix(mat);
    }
}
