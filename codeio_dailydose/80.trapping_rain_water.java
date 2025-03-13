public class trapping_rain_water { 
        public static int trap(int[] height) {
            
            int len = height.length;
    
            int pre[] = new int[len];
            int post[] = new int[len]; 

            int premax=0;
            for(int i=0;i<len;i++){
                pre[i] = Math.max(premax,height[i]);
                premax=pre[i];
            }
            int postmax=0;
            for(int i=len-1;i>=0;i--){
    
                post[i] = Math.max(postmax,height[i]);
                postmax=post[i];
                
            }
    
            int min=0,sum=0;
            for(int i=0;i<len;i++){
                min=Math.min(pre[i],post[i]);
    
                sum+=min-height[i];
            } 
            
        return   sum; 
    } 
    public static void main(String[] args) { 
        
        // Test input
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        
        // Call the trap method and print the result
        int result = trap(height);
        System.out.println("The amount of trapped water is: " + result);  // Output: 6
    }
}
