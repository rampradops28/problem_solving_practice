public class hamming_distance {
    public static int count(int num){ 
        int cnt = 0;

        while(num > 0){ 
            if(num%2 == 1){
                cnt++;
            }
            num /= 2; 
        }

        return cnt;
    }
    public static int func(int a, int b){

        int c = a^b;

        
        return count(c);

    }
    public static void main(String[] args) {
        int a = 3;
        int b = 14;

        System.out.println(func(a,b));
    }
}
