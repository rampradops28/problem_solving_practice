package striver_sde_sheet.Arrays_II;

import java.util.Arrays;

public class Find_Duplicate {
    // public static int findDuplicate(int[] nums) { // brute
     
    //     int n = nums.length;
    //     Arrays.sort(nums);
    //     int res = 0;

    //     for(int i=0;i<n-1;i++){
    //         if(nums[i] == nums[i+1]){
    //             res = nums[i];
    //         }
    //     }
         
    //     return res ;
    // }
    public int findDuplicate(int[] nums) { // better
     
        int n = nums.length;
        int[] hash = new int[n+1];
        int res = 0;

        for(int i=0;i<n;i++){
            if(hash[nums[i]] == 0){
               hash[nums[i]]++;
            }
            else{
                res = nums[i];
                break;
            }
        }

        return res;
    }
     public static void main(String[] args) { 
        int[] arr = {1,3,4,2,2};  

        int count = findDuplicate(arr);
        System.out.println("Number of inversions: " + count); // output : 3
    }
}
