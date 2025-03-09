public class complete_calculate {
    public static int func(int m,int n){

        int sum = 0;
        for(int i=m;i<=n;i++){
            if(i%15 == 0){
                sum += i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int m = 12;
        int n = 50;

        System.out.println(func(m,n));
    }
}
