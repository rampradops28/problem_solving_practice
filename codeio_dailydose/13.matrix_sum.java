import java.util.ArrayList;

public class matrix_sum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;
        ArrayList<Integer> result = sumTriangles(matrix, n);
        System.out.println("Upper Triangle Sum: " + result.get(0));
        System.out.println("Lower Triangle Sum: " + result.get(1));
    }
 
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int uppersum = 0;
        int lowersum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    uppersum += matrix[i][j];
                    lowersum += matrix[i][j];
                } else if (j > i) {
                    uppersum += matrix[i][j];
                } else {
                    lowersum += matrix[i][j];
                }
            }
        }

        res.add(uppersum);
        res.add(lowersum);
        return res;
    }
}
