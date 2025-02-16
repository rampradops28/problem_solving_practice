public class armstrong_number {
    public static void main(String args[]){
        int n = 153;
        System.out.println(armstrongNumber(n));
    }
    static boolean armstrongNumber(int n) {
        
        int res = 0;
        int dup = n;
        int cnt = (int)Math.log10(n) + 1;
        while(n > 0){
            int rem = n%10;
            res += Math.pow(rem,cnt);
            n /= 10;
        }
        
        return res == dup;
    }
}
