class binary_subarray_with_sum {
    // public static int numberOfSubstrings(int[] nums, int goal) { 
        
    //     int n = nums.length;
    //     int cnt = 0,sum;

    //     for(int i=0;i<n;i++){
    //         sum = 0;
    //         for(int j=i;j<n;j++){
    //             sum += nums[j];

    //             if(sum == goal){
    //                 cnt++;
    //             }
    //         }
    //     }
    //     return cnt;
    // }
    public static int numberOfSubstrings(int[] nums, int goal) {

        int n = nums.length;
        int l=0,r=0,sum=0,cnt=0;

        while(r < n){
            sum += nums[r];

            while(sum > goal){
                sum -= nums[l];
                l++;
            }

            cnt += (r-l+1);
 
            r++;
        }
        return cnt;
    }

    public static void main(String args[]){
        int[] a = {1,0,1,0,1}; 
        int k = 2;

        int maxlen = numberOfSubstrings(a,k);
        int optimal = numberOfSubstrings(a,k-1);

        System.out.println(maxlen-optimal);

        //System.out.println(maxlen);   
    }
}
