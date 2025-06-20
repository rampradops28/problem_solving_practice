import java.util.ArrayList;

public class Reverse_Pairs {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1}; 
 
        int result = reversePairs(nums);

        System.out.println("Number of reverse pairs: " + result);
    }

    // public static int reversePairs(int[] nums) { // brute
    //     int n = nums.length;
    //     int cnt = 0;

    //     for(int i = 0; i < n; i++) {
    //         for(int j = i + 1; j < n; j++) {
    //             if(nums[i] > 2 * nums[j]) {
    //                 cnt++;
    //             }
    //         }
    //     }
    //     return cnt;
    // }
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long)arr[i] > 2 * (long)arr[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += countPairs(arr, low, mid, high); //Modification
        merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }
    public int reversePairs(int[] nums) { // optimal
        return mergeSort(nums,0,nums.length-1);
    }
}
