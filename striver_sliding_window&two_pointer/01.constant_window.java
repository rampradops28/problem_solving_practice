class constant_window{ // maximum range(k) of sum 
    public static int maxSumRange(int[] a, int k){

        int n = a.length;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += a[i]; 
        }
 

        int maxSum = 0;
        int l = 0;
        int r = k-1;
        for(int i=l;i<r;i++){  
            while(r < n-1){
                sum -= a[l];
                l++;
                r++;
                sum += a[r];

                maxSum = Math.max(maxSum,sum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
         int a[] = {-1,2,3,3,4,5,-1};
         int k = 4;

         int result = maxSumRange(a,k); // output: 15 [3,3,4,5]
         System.out.println(result);
    }
}