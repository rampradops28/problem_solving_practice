import java.util.ArrayList;

public class 09.snake_pattern {
    public static ArrayList<Integer> snakePattern(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = m - 1; j >= 0; j--) {
                    res.add(matrix[i][j]);
                }
            } else {
                for (int j = 0; j < m; j++) {
                    res.add(matrix[i][j]);
                }
            } 
        }
        
        return res;
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // Function to print the ArrayList
    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) { 

        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Input Matrix:");
        printMatrix(matrix1);
        System.out.println("Snake Pattern Output:");
        printArrayList(snakePattern(matrix1)); // Output: [1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 11, 12, 16, 15, 14, 13]

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Input Matrix:");
        printMatrix(matrix2);
        System.out.println("Snake Pattern Output:");
        printArrayList(snakePattern(matrix2)); // Output: [1, 2, 3, 6, 5, 4, 7, 8, 9]
    }


}
