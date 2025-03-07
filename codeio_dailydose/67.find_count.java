public class find_count {
    public static int func(int n, int[] a, int num, int diff){

        int sum = 0;
        int cnt = 0;

        for(int i=0;i<n;i++){
            sum  = Math.abs(num - a[i]);
            if(sum <= diff){
                cnt++;
            }
        }
        if(cnt == 0){
            return -1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] a = {12,3,14,56,77,13};

        int num = 13;
        int diff = 2;

        System.out.println("Count: "+func(n,a,num,diff));
    }
}
