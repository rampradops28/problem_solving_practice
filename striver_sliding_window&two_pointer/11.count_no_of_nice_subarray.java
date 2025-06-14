class count_no_of_nice_subarray {
    public static int numberOfSubarrays(int[] nums, int k) {
        
        int n = nums.length;
        int cnt = 0,sum;

        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=i;j<n;j++){
                if(nums[j] % 2 != 0){
                    sum++;
                }

                if(sum == k){
                    cnt++;
                }
            }
        }

        return cnt;
    }
    public static void main(String args[]){
        int[] a = {1,1,2,1,1}; 
        int k = 3;

        int maxlen = numberOfSubarrays(a,k); 

        System.out.println(maxlen);   
    }
}
