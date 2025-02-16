public class palindrome {
    public static void main(String args[]){
        int n = 15;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n) {
         
        String str = Integer.toString(n);
        
        String dup = ""; 
        for(int i=str.length()-1;i>=0;i--){
            dup += str.charAt(i);
        }
         
        if(dup.equals(str)){
            return true;
        }
        return false;

        // int dup = n;
        // int res = 0; 
        
        // while(n > 0){
        //     int rem = n%10;
        //     res = res*10 + rem;
        //     n /= 10; 
        // }
        
        // if(res == dup){
        //     return true;
        // }
        
        // return false;
        
        
        
    }
}
