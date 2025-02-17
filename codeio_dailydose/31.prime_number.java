public class prime_number {
    public static void main(String args[]){
        int n = 9;
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n) {
         
        if(n <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
