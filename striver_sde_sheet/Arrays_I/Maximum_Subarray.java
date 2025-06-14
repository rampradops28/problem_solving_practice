public class Maximum_Subarray {
    // public static int maxSubArray(int[] nums) { // brute force
        
    //     int n = nums.length;
    //     int sum, maxi = Integer.MIN_VALUE; 

    //     for(int i=0;i<n;i++){
    //         sum = 0;
    //         for(int j=i;j<n;j++){
    //             sum += nums[j];
    //             maxi = Math.max(maxi,sum);
    //         }
    //     }
    //     return maxi;
    // }
    public static int maxSubArray(int[] nums) { // optimal approach
        
        int n = nums.length;
        int sum = 0, maxi = Integer.MIN_VALUE; 

        for(int i=0;i<n;i++){

            sum += nums[i];

            maxi = Math.max(maxi,sum);

            if(sum < 0){
                sum = 0;
            }
        }

        return maxi;
    }
    public static void main(String[] args) { 

    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};  
    int result = maxSubArray(nums);

    System.out.println("Maximum subarray sum is: " + result); // output: 6
    }
}

 
// public class Main // follow up question
// {
//     public static int maxSubArray(int[] nums) {
        
//         int n = nums.length;
//         int sum = 0, maxi = Integer.MIN_VALUE; 
//         int ansstart = 0,ansend = 0,start = 0;

//         for(int i=0;i<n;i++){

//             if(sum == 0) start = i;
            
//             sum += nums[i];
            
//             if(sum > maxi){
//                 maxi = sum;
//                 ansstart = start;
//                 ansend = i;
//             }

//             if(sum < 0){
//                 sum = 0; 
//             }
//         }
        
//         System.out.print("The subarray is: [");
//         for (int i = ansstart; i <= ansend; i++) {
//             System.out.print(nums[i] + " ");
//         }
//         System.out.print("]\n");

//         return maxi;
//     }
// 	 public static void main(String[] args) { 
//         int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
//         int result = maxSubArray(nums);
//         System.out.println("Maximum subarray sum is: " + result); // output: The subarray is: [4 -1 2 1 ] Maximum subarray sum is: 6
//     }
// }
