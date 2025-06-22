import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2}; 
        System.out.println(longestConsecutive(nums)); // Output: 4 (sequence: 1,2,3,4)
    }
     public static boolean ls(int[] arr, int pos){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == pos){
                return true;
            }
        }
        return false;
    }
    public static int longestConsecutive(int[] nums) { // brute
        
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        if(n == 0) return 0;

        for(int i=0;i<n;i++){
            int cnt = 1;
            int ele = nums[i];
            while(ls(nums,ele+1)){
                cnt++;
                ele++;
            }
            maxi = Math.max(cnt,maxi);
        }
        return maxi;
    }
    // public static int longestConsecutive(int[] a) { // better
        
    //     int n = a.length;
    //     if (n == 0) return 0;
 
    //     Arrays.sort(a);
    //     int lastSmaller = Integer.MIN_VALUE;
    //     int cnt = 0;
    //     int longest = 1;
 
    //     for (int i = 0; i < n; i++) {
    //         if (a[i] - 1 == lastSmaller) { 
    //             cnt += 1;
    //             lastSmaller = a[i];
    //         } else if (a[i] != lastSmaller) {
    //             cnt = 1;
    //             lastSmaller = a[i];
    //         }
    //         longest = Math.max(longest, cnt);
    //     }
    //     return longest;
    // }
}
