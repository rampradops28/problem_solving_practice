import java.util.ArrayList;

public class index_of_subarray_sum {
    public static void main(String[] args) { 

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        
        ArrayList<Integer> result = subarraySum(arr, target);
        
        System.out.println(result);
    }
     static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ls = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0;

        while (j < n) {
            sum += arr[j];

            while (sum > target && i <= j) {
                sum -= arr[i];
                i++;
            }

            if (sum == target) {
                ls.add(i + 1); // +1 to convert to 1-based index
                ls.add(j + 1); // +1 to convert to 1-based index
                return ls;
            }

            j++;
        }

        ls.add(-1);
        return ls;
    }
}
