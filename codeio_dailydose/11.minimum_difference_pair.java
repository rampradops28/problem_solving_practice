import java.util.Arrays;

public class minimum_difference_pair {
    public static int minimumDifference(int[] arr) {
         
         int n = arr.length;
         int i = 0;
         int j = 1;
         int min = Integer.MAX_VALUE;
         int mini;
         
         Arrays.sort(arr);
         
         while(i<n-1){
             mini = arr[j] - arr[i];
             min = Math.min(min,mini);
             i++;
             j++;
         }
         
         return min;
    }
    public static void main(String[] args) { 
        
        int[] arr1 = {2, 4, 5, 9, 7};
        int[] arr2 = {1, 5, 3, 19, 18, 25};
        int[] arr3 = {30, 5, 20, 9};
        int[] arr4 = {1, 19, -4, 31, 38, 25, 100};
        int[] arr5 = {3, 8, 15, 17};
        
        System.out.println("Minimum difference in arr1: " + minimumDifference(arr1));
        System.out.println("Minimum difference in arr2: " + minimumDifference(arr2));
        System.out.println("Minimum difference in arr3: " + minimumDifference(arr3));
        System.out.println("Minimum difference in arr4: " + minimumDifference(arr4));
        System.out.println("Minimum difference in arr5: " + minimumDifference(arr5));
    }
}
