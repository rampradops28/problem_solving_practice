// import java.util.ArrayList;
// import java.util.List;

// public class combination_sum {
//         public static void func(int i,int pos, int[] arr, List<Integer> ds, List<List<Integer>> ans){

//         if(i == arr.length){
//             if(pos == 0){
//                 ans.add(new ArrayList<>(ds));
//             }
//             return;
//         }

//         if(arr[i] <= pos){
//             ds.add(arr[i]);
//             func(i,pos-arr[i],arr,ds,ans);
//             ds.remove(ds.size() - 1);
//         }
//         func(i+1,pos,arr,ds,ans);
//     }
//     public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
//         List<List<Integer>> ans = new ArrayList<>();

//         func(0,target,candidates,new ArrayList<>(),ans);

//         return ans;
//     } 
//     public static void main(String[] args) {

//             int arr[] = {2,3,6,7};
//             int target = 7; 
//             List < List < Integer >> ls = combinationSum(arr, target);

//             System.out.println("Combinations are: ");

//             // for (int i = 0; i < ls.size(); i++) {

//             //     for (int j = 0; j < ls.get(i).size(); j++) {

//             //         System.out.print(ls.get(i).get(j) + " ");

//             //     }

//             //     System.out.println();
//             // }

//             for (List<Integer> subset : ls) {
//                 System.out.println(subset);
//             }
//         }
    
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum {
    public static void func(int ind, int pos, int[] arr, List<Integer> ds, List<List<Integer>> ans){

        if(pos == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;

            if(arr[i] > pos) break;

            ds.add(arr[i]);
            func(i+1,pos-arr[i],arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        func(0,target,candidates,new ArrayList<>(),ans);

        return ans;
    }
    public static void main(String[] args) {

                    int arr[] = {2,3,6,7};
                    int target = 7; 
                    List < List < Integer >> ls = combinationSum2(arr, target);
        
                    System.out.println("Combinations are: ");
        
                    // for (int i = 0; i < ls.size(); i++) {
        
                    //     for (int j = 0; j < ls.get(i).size(); j++) {
        
                    //         System.out.print(ls.get(i).get(j) + " ");
        
                    //     }
        
                    //     System.out.println();
                    // }
        
                    for (List<Integer> subset : ls) {
                        System.out.println(subset);
                    }
                }
            
}
