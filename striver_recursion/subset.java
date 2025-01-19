// import java.util.ArrayList; 
// import java.util.Collections;

// public class subset { // subset sum
//     public static void func(int i, int s, ArrayList<Integer> res, int[] arr){
        
//         if(i == arr.length){
//             res.add(s);
//             return;
//         }
        
//         func(i+1, s+arr[i], res, arr);
        
//         func(i+1, s, res, arr);
//     }
//     public static  ArrayList<Integer> subsetSums(int[] arr) { 
        
//          ArrayList<Integer> res = new ArrayList<>();
        
//         func(0,0,res,arr);
        
//         Collections.sort(res);
        
//         return res;
//     }

//     public static void main(String args[]) {

//          int arr[] = {1,2,3,2,2,3};

//         ArrayList < Integer > ans = subsetSums(arr);

//         Collections.sort(ans);
//         System.out.println("The sum of each subset is ");
//         for (int i = 0; i < ans.size(); i++)
//             System.out.print(ans.get(i) + " ");
// }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset{ // remove duplicates

    public static void func(int ind, List<Integer> ds, int[] nums, List<List<Integer>> ans){

        ans.add(new ArrayList<>(ds));

        for(int i=ind;i<nums.length;i++){
            if(i != ind && nums[i] == nums[i-1]) continue;

            ds.add(nums[i]);
            func(i+1,ds,nums,ans);
            ds.remove(ds.size()-1);
        }

    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        func(0,new ArrayList<>(),nums,ans);

        return ans;
    }
    static void printAns(List <List<Integer>>  ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(","," "));
    }
    public static void main(String args[]) {
        int nums[]={1,2,2};
        
        List < List<Integer>> ans = subsetsWithDup(nums);
        
        //printAns(ans);
        
        System.out.println("Subsets:");
        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }
     }
}