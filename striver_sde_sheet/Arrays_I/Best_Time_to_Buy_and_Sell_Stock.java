class Best_Time_to_Buy_and_Sell_Stock{
    // public static int maxProfit(int[] prices) { // Brute Force
        
    //     int n = prices.length;
    //     int sum,maxi = 0;

    //     for(int i=0;i<n;i++){
    //         sum = 0;
    //         for(int j=i+1;j<n;j++){
    //             if(prices[i] < prices[j]){
    //                 sum = prices[j] - prices[i];
    //                 maxi = Math.max(maxi,sum);
    //             }
    //         }
    //     }

    //     return maxi;
    // }
    public static int maxProfit(int[] prices) { // optimal approach
        
        int n = prices.length;
        int profit = 0,mini = prices[0];

        for(int i=1;i<n;i++){
            mini = Math.min(mini,prices[i]);
            profit = Math.max(profit,prices[i] - mini);
        }

        return profit;

    }
    public static void main(String[] args) {
        // if you can sell on that ith day, then you buy a minimum price from i to i-1
        int[] prices = {7, 1, 5, 3, 6, 4};  
 
        int result = maxProfit(prices);

        System.out.println("Output: " + result);  // Output: 5
    }
}