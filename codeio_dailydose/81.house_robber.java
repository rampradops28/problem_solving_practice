public class house_robber {
    static int maximizeMoney(int N , int K) {
         
        if(N%2 != 0){
            return ((N/2)+1) * K;
        }
        
        return (N/2) * K;
    }
    public static void main(String[] args) {
        int N = 5;
        int K = 10;

        System.out.println(maximizeMoney(N,K));
    }
}
