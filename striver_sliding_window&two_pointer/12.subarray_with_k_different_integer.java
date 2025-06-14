import java.util.*;
class subarray_with_k_different_integer {
    // public static int subarraysWithKDistinct(int[] nums, int k) { // brute TC - O(N^2)
        
    //     int n = nums.length;
    //     int cnt = 0;

    //     for(int i=0;i<n;i++){
    //         HashMap<Integer,Integer> map = new HashMap<>();
    //         for(int j=i;j<n;j++){
    //             map.put(nums[j],map.getOrDefault(nums[j],0)+1);
    //             if(map.size() == k){
    //                 cnt++;
    //             }
    //         }
    //     }

    //     return cnt;
    // }

    public static int subarraysWithKDistinct(int[] nums, int k) { // optimal

        int n = nums.length;
        int l=0,r=0,cnt=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(r < n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.size() > k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }

            cnt += (r-l+1);

            r++;

        }
        return cnt;
    }
    public static void main(String args[]){
        int[] a = {1,2,1,2,3}; 
        int k = 2;

        int maxlen = subarraysWithKDistinct(a,k); 
        int optimal = subarraysWithKDistinct(a,k-1); 

        System.out.println(maxlen-optimal);  // Output : 7 
    }
}
