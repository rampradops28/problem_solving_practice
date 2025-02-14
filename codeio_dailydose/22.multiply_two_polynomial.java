public class multiply_two_polynomial {
    public static void main(String[] args) {
        int[] Arr1 = {1, 0, 3, 2}; // Coefficients of first polynomial (5 + 0x + 10x^2 + 6x^3)
        int[] Arr2 = {2, 0, 4};     // Coefficients of second polynomial (1 + 2x + 4x^2)
        int M = Arr1.length;        // Length of the first array
        int N = Arr2.length;        // Length of the second array
        
        int[] result = polyMultiply(Arr1, Arr2, M, N);

         
        System.out.print("Resultant polynomial: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? " + " : ""));
        }
    }

    public static int[] polyMultiply(int Arr1[], int Arr2[], int M, int N) {
        int[] res = new int[M + N - 1];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                res[i + j] += Arr1[i] * Arr2[j]; 
            }
        }
        return res;
    }
}
