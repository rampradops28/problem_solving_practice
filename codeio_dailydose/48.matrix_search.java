public class matrix_search {
    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int x = 5;

        boolean result = matSearch(mat, x);
        System.out.println("Is element " + x + " present in the matrix? " + result); // Should print true for this example
    }
}
