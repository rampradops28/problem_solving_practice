import java.util.HashMap;
import java.util.List;

public class sock_merchant {
    public static void main(String[] args) {
        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int n = ar.size();

        // Get the number of pairs
        int pairs = sockMerchant(n, ar);

        // Print the result
        System.out.println(pairs); // Expected output: 3
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each color
        for (int num : ar) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        // Calculate the number of pairs for each color
        for (int count : map.values()) {
            sum += count / 2;
        }

        return sum;
    }
}
