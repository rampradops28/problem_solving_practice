public class max_signal {
    public static void main(String args[]){
        String str = "01010100";
        System.out.println(func(str));
    }
    public static int func(String str){

        int max = Integer.MIN_VALUE;
        int n = str.length();
        int cnt = 0;

        for(int i=0;i<n;i++){
            if(str.charAt(i) == '1'){
                cnt++;
            }
            else{
                max = Math.max(cnt,max);
                cnt = 0;
            }
        }
        return max;
    }
}
