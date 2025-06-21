public class 3_Sum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4}; 

        List<List<Integer>> result = threeSum(nums);

        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
 
    // public static List<List<Integer>> threeSum(int[] nums) { // brute
    //     Set<List<Integer>> set = new HashSet<>();
    //     int n = nums.length;

    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             for(int k=j+1;k<n;k++){
    //                 if(nums[i]+nums[j]+nums[k] == 0){
    //                     List<Integer> ls = Arrays.asList(nums[i],nums[j],nums[k]);
    //                     ls.sort(null);
    //                     set.add(ls);
    //                 }
    //             }
    //         }
    //     }

    //     List<List<Integer>> res = new ArrayList<>(set);
    //     return res;
    // }
    // public static List<List<Integer>> threeSum(int[] nums) { // better

    //     Set<List<Integer>> set = new HashSet<>();
    //     int n = nums.length;

    //     for(int i=0;i<n;i++){
    //         Set<Integer> s = new HashSet<>();
    //         for(int j=i+1;j<n;j++){ 
    //             int k = -(nums[i]+nums[j]);

    //             if(s.contains(k)){
    //                 List<Integer> ls = Arrays.asList(nums[i],nums[j],k);
    //                 ls.sort(null);
    //                 set.add(ls);
    //             }
    //             s.add(nums[j]);
    //         }
    //     }

    //     List<List<Integer>> res = new ArrayList<>(set);
    //     return res;
    // }
}
