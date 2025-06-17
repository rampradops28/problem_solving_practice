package striver_sde_sheet.Arrays_II;

import java.util.Arrays;

public class Merge_Sorted_Array {

    // public static void merge(int[] nums1, int m, int[] nums2, int n) { // brute
        
    //     int[] join = new int[m+n];
    //     int left = 0;
    //     int right = 0;
    //     int ind = 0;

    //     while(left < m && right < n){
    //         if(nums1[left] <= nums2[right]){
    //             join[ind++] = nums1[left++];
    //         }
    //         else{
    //             join[ind++] = nums2[right++];
    //         }
    //     }

    //     while(left < m){
    //         join[ind++] = nums1[left++];
    //     }

    //     while(right < n){
    //         join[ind++] = nums2[right++];
    //     }

    //     for(int i=0;i<n+m;i++){
    //         nums1[i] = join[i];
    //     }
    // }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {  // optimal
        int left = m-1;
        int right = 0;

        while(left >= 0 && right < n){

            if(nums1[left] > nums2[right]){

                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;

                left--;
                right++;
            } 
            else{
                break;
            }
        }

        for(int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }
 
        Arrays.sort(nums1);



    }
       public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
 
        merge(nums1, m, nums2, n);
 
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        // Output: 1 2 2 3 5 6
    }
}
