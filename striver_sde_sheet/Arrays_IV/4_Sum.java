public class 4_Sum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
 
        List<List<Integer>> result = fourSum(nums, target);

        System.out.println("Quadruplets that sum to target:");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
 
    // public static List<List<Integer>> fourSum(int[] nums, int target) { // brute
    //     Set<List<Integer>> set = new HashSet<>();
    //     int n = nums.length;

    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             for(int k=j+1;k<n;k++){
    //                 for(int l=k+1;l<n;l++){
    //                     long sum = nums[i]+nums[j];
    //                     sum += nums[k];
    //                     sum += nums[l];

    //                     if(sum == target){
    //                         List<Integer> ls = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
    //                         ls.sort(null);
    //                         set.add(ls);
    //                     }
    //                 }
    //             }
    //         }
    //     }

    //     List<List<Integer>> list = new ArrayList<>(set);
    //     return list;
    // }
    public List<List<Integer>> fourSum(int[] nums, int target) { //better
        
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> s = new HashSet<>();
                for(int k=j+1;k<n;k++){ 
                    long sum = nums[i]+nums[j];
                    sum += nums[k];
                    sum = target - sum;

                    if(s.contains(sum)){
                        List<Integer> ls = Arrays.asList(nums[i],nums[j],nums[k],(int)sum);
                        ls.sort(null);
                        set.add(ls);
                    }
                    s.add((long)nums[k]);
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}
