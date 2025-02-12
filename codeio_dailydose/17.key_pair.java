//link = https://www.geeksforgeeks.org/problems/key-pair5616/1

import java.util.HashSet;
import java.util.Set;

public class key_pair {
    public static void main(String[] args) { 
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(twoSum(arr1, target1));  // Output: true

        int[] arr2 = {1, 2, 3, 4};
        int target2 = 8;
        System.out.println(twoSum(arr2, target2));  // Output: false
    }
//     static boolean twoSum(int arr[], int target) { // brute
         
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//    }
       boolean twoSum(int arr[], int target) { //optimal
      
      Set<Integer> pair = new HashSet<>();
      for(int num : arr){
          int complement = target - num;
          if(pair.contains(complement)){
              return true;
          }
          pair.add(num);
      }
      return false;
    }


}
