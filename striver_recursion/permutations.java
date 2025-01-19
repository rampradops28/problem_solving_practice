// import java.util.ArrayList;
// import java.util.List;

// public class permutations {  //approach 1
//         public static void func(int[] nums, List<Integer> ds, List<List<Integer>> ans , boolean  []arr){

//         if(ds.size() == nums.length){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }

//         for(int i=0;i<nums.length;i++){
//             if(!arr[i]){
//                 arr[i] = true;
//                 ds.add(nums[i]);
//                 func(nums,ds,ans,arr);
//                 ds.remove(ds.size() - 1);
//                 arr[i] = false;
//             }
//         }
//     }
//     public static List<List<Integer>> permute(int[] nums) {
        
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> res =  new ArrayList<>();

//         boolean arr[] = new boolean[nums.length];

//         func(nums,res,ans,arr);

//         return ans;
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,2,3}; 
//         List < List < Integer >> ls = permute(nums);
//         System.out.println("All Permutations are");
//         for (int i = 0; i < ls.size(); i++) {
//             for (int j = 0; j < ls.get(i).size(); j++) {
//                 System.out.print(ls.get(i).get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class permutations{
        public static void func(int ind, int[] nums, List<List<Integer>> ans){

        if(nums.length == ind){

            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            func(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public static void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        func(0,nums,ans);
        return ans;

    }
        public static void main(String[] args) {
        int nums[] = {1,2,3}; 
        List < List < Integer >> ls = permute(nums);
        System.out.println("All Permutations are");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}