import java.util.ArrayList;
import java.util.Arrays;

public class sort_asc_desc {
     public static void main(String[] args) {
        int[] inputArray = {5, 9, 1, 3, 7, 6, 8, 2};

        ArrayList<Integer> sortedList = customSort(inputArray);
        
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Custom Sorted ArrayList: " + sortedList);
    }

    public static ArrayList<Integer> customSort(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        int n = arr.length;

        Arrays.sort(arr, 0, n / 2);
        for (int i = 0; i < n / 2; i++) {
            res.add(arr[i]);
        }

        Arrays.sort(arr, n / 2, n);
        for (int i = n - 1; i >= n / 2; i--) {
            res.add(arr[i]);
        }

        return res;
    }
}
