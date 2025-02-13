public class replace_0_with_5 {
    public static void main(String[] args) { 

        // Example inputs
        int n1 = 1004;
        int n2 = 0;
        int n3 = 123;
        int n4 = 5000;
        
        // Calling the convertFive method and printing the results
        System.out.println("Input: " + n1 + " -> Output: " + convertFive(n1));  // Output: 1554
        System.out.println("Input: " + n2 + " -> Output: " + convertFive(n2));  // Output: 5
        System.out.println("Input: " + n3 + " -> Output: " + convertFive(n3));  // Output: 123
        System.out.println("Input: " + n4 + " -> Output: " + convertFive(n4));  // Output: 5555
    }
    public static int convertFive(int n){
        
        int ans = 0;
        int fact = 1;
        
        if(n == 0) return 5;
        
        while(n>0){
            
            if( n%10 == 0){
                ans += (5*fact);
            }
            else{
                ans += (n%10 * fact);
            }
            
            n /= 10;
            fact *= 10;
        }
        
        return ans;
    }
}
