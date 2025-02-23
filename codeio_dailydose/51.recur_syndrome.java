public class recur_syndrome {
    public static String reverse(int num){
        String rev = ""; 
        while(num > 0){
            int rem = num % 10;
            rev += rem ;
            num /= 10; 
        }
        return rev;
    }
    public static boolean palindrome(int n){

        String num = Integer.toString(n);
        int start = 0;
        int end = num.length()-1;

        while(start < end){
            if(num.charAt(start) != num.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static int func(int num){

        int sum = num + Integer.parseInt(reverse(num));

        if(palindrome(sum)){
            return sum;
        }
        else{
            return func(sum);
        }
    }
    public static void main(String[] args) {
        int num = 124;
        System.out.println(func(num));
    }
}
