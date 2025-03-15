public class lazy_caterer {
    public static int func(int n){
        return 1+(n*(n+1))/2;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(func(n));
    }
}
