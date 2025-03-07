public class rat_house_count {
    public static int func(int rat, int unit, int n, int[] a){

        if(n < 1){
            return -1;
        }
        int tot = rat*unit;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += a[i];
            if(sum >= tot){
                return i+1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int rat = 7;
        int unit = 2;
        int n = 8;
        int[] a = {2,8,3,5,7,4,1,2};

        System.out.println("Result: "+func(rat,unit,n,a));
    }
}
