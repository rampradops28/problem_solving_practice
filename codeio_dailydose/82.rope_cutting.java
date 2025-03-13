import java.util.ArrayList;
import java.util.Arrays;

public class rope_cutting {
    public static ArrayList<Integer> RopeCutting(int arr[]) {
        ArrayList<Integer> ls = new ArrayList<>();
        int n = arr.length;
        
        Arrays.sort(arr);
        int res = arr[0];
        
        for(int i = 1; i < n; i++){
            if(arr[i] - res > 0){
                ls.add(n - i);
                res = arr[i];
            } 
        } 
        
        return ls;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 1, 2, 3, 5};
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + RopeCutting(arr1)); // Expected Output: [4, 3, 2]
        
        int[] arr2 = {5, 1, 6, 9, 8, 11, 2, 2, 6, 5};
        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Output: " + RopeCutting(arr2)); // Expected Output: [9, 7, 5, 3, 2, 1]
    }
}
