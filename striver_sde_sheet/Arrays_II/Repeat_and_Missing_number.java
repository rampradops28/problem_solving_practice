package striver_sde_sheet.Arrays_II;

public class Repeat_and_Missing_number {
    // public static int[] findErrorNums(int[] nums) { // brute
        
    //     int n = nums.length;

    //     int miss=-1,repeat=-1; 

    //     for(int i=1;i<=n;i++){
    //         int cnt = 0;
    //         for(int j=0;j<n;j++){
    //             if(nums[j] == i){
    //                 cnt++;
    //             }
    //         }
 
    //         if(cnt == 2){
    //             repeat = i;
    //         }
    //         else if(cnt == 0){
    //             miss = i;
    //         } 

    //         if(miss != -1 && repeat != -1){
    //             break;
    //         }
    //     }

    //     int[] res = {repeat,miss};
    //     return res;

    // }
    // public static int[] findErrorNums(int[] nums) { // better
        
    //     int n = nums.length;

    //     int miss=-1,repeat=-1; 

    //     int[] hash = new int[n+1];

    //     for(int i=0;i<n;i++){
    //         hash[nums[i]]++;
    //     }

    //     for(int i=1;i<=n;i++){
            
    //         if(hash[i] == 2) repeat = i;
    //         else if(hash[i] == 0) miss = i;

    //         if(repeat != -1 && miss != -1){
    //             break;
    //         }
    //     }

    //     int[] res = {repeat,miss};
    //     return res;

    // }
    public static int[] findErrorNums(int[] nums) { // optimal
        
        long n = nums.length; 

        long sumi = n*(n+1) / 2;
        long sqsumi = n*(n+1)*(2*n+1) / 6;

        long sum = 0;
        long sqsum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            sqsum += (long)nums[i]* (long)nums[i];
        } 
         
        long val1 = sumi - sum;
        long val2 = sqsumi - sqsum;
        val2 = val2/val1;

        long x = (val1+val2) / 2;
        long y = x-val1;

        int[] res = {(int)y,(int)x};
        return res;

    }
    public static void main(String[] args) { 

        int[] nums = {1, 2, 2, 4}; 
        int[] result = findErrorNums(nums);
 
        System.out.println("Repeated: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
