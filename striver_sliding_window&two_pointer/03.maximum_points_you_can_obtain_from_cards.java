// leetcode - 1432
class maximum_points_you_can_obtain_from_cards {
    public static int maxSum(int []a, int k){  // time complexity => O(2*K)

        int n = a.length;
        int lsum = 0;
        int rsum = 0;
        

        for(int i=0;i<k;i++){
            lsum += a[i];
        }

        int maxi = lsum; 
        int r = n-1;

        for(int i=k-1;i>=0;i--){
            lsum -= a[i]; 
            rsum += a[r];
            r--;
            maxi = Math.max(maxi,lsum+rsum);
        }

        return maxi;
    }
    public static void main(String[] args) {
        int a[] = {6,2,3,4,7,2,1,7,1};
        int k = 4;

        int maxi = maxSum(a,k);

        System.out.println(maxi);
    }
}
