public class jumpy_ball {
    static long jumpyBall(long N){
        
        long d = 0;
        while(N != 0){ 
            d += (N+N);
            N /= 2;
        }
        
        return d;
    }
    public static void main(String[] args) {
        long n = 10;
        System.out.println(jumpyBall(n));
    }
}
