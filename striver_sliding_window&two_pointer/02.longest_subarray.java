class longest_subarray{  //longest subarray whose sum <= k
    // public static int long_subarray(int[] a, int k){ // brute force - time complxity => O(n^2)

    //     int n = a.length;
    //     int maxlen = 0;
    //     int sum;

    //     for(int i=0;i<n;i++){
    //          sum = 0;
    //         for(int j=i;j<n;j++){
    //             sum += a[j];

    //             if(sum <= k){
    //                 maxlen = Math.max(maxlen,j-i+1);
    //             }
    //             else if(sum > k){
    //                 break;
    //             }
    //         }
    //     }

    //     return maxlen;
    // }
    public static int long_subarray(int[] a, int k){ // better - time complxity => O(N+N)

        int n = a.length;

        int l = 0;
        int r = 0;
        int sum = 0;
        int maxSum = 0;

        while(r < n){
            sum += a[r];

            while(sum > k){  // for optimal one, number of subarray only posiible to replace it with while to if 
                sum -= a[l];
                l++;
            }

            if(sum <= k){
                maxSum = Math.max(maxSum,r-l+1);
            }

            r++;
        }
        return maxSum;
        
    }
    public static void main(String[] args) {
        int[] a = {2,5,1,7,10};
        int sum = 14;

        int len = long_subarray(a,sum);
        System.out.println(len);
    }
}