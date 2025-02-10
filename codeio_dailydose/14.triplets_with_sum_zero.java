import java.util.Arrays;

public class triplets_with_sum_zero {
    public static boolean findTriplets(int[] arr) {
        int n = arr.length;
 
        if (n < 3) {
            return false;
        }

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                if (sum == 0) {
                    return true;
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) { 
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr)); // Output: true
    }
}
