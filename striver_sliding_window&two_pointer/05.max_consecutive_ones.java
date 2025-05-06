// leetcode - 1004
class max_consecutive_ones{ // longest subarray with atmost K zeros ( flip 0 to 1 and find the max)
    // public static int maxlen(int[] a, int k){ // brute force
    //     int n = a.length;

    //     int maxi = 0;

    //     for(int i=0;i<n;i++){
    //         int zero = 0;
    //         for(int j=i;j<n;j++){
    //             if(a[j] == 0){
    //                 zero ++;
    //             }

    //             if(zero <= k){
    //                 maxi = Math.max(maxi,j-i+1);
    //             }
    //         }
    //     }

    //     return maxi;
    // }
    public static int maxlen(int[] a, int k) { // better 

        int n = a.length;
        int l=0,r=0,maxi=0,zeros=0;

        while(r<n){

            if(a[r] == 0) zeros++;

            while(zeros > k){  // for optimal one , replace while to if because we need to maintain the size of max
                if(a[l] == 0) zeros--;
                l++;
            }

            if(zeros <= k){
                maxi = Math.max(maxi,r-l+1);
            }

            r++;
        }

        return maxi;
    }
    public static void main(String[] args) {
        int a[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int result = maxlen(a,k);

        System.out.println(result);
    }
}