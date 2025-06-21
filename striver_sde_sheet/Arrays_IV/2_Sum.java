public class 2_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
 
        int[] result = twoSum(nums, target);

        System.out.print("Indices of numbers that sum to target: ");
        for (int idx : result) {
            System.out.print(idx + " ");
        }
        System.out.println();
    }
    
    public int[] twoSum(int[] nums, int target) { // brute
        int  i;
        for(  i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j]) == target){
                     return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    // public static int[] twoSum(int[] nums, int target) { // optimal
    //     Map<Integer,Integer> pair = new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         int complement = target - nums[i];
    //         if(pair.containsKey(complement)){
    //             return new int[]{pair.get(complement),i};
    //         }
    //         pair.put(nums[i],i);
    //     }
    //     return new int[]{};
    // }
}
