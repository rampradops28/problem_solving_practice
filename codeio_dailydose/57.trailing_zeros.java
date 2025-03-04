public class trailing_zeros {
    public static int func(int n){

        if(n < 5) return 0;

        int ans = 0;
        int sum = 0;
        while(n>=5){
            sum += n / 5;
            n /= 5;
        }

        return sum;
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.println(func(n));
    }
}
