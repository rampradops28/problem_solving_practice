public class oddly_even_sum {
    public static int func(String str){

        int oddsum = 0;
        int evensum = 0;

        int n = str.length();
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                evensum += str.charAt(i) - '0';
            }
            else if(i%2 != 0){
                oddsum += str.charAt(i) - '0';
            }
        }

        System.out.println(oddsum);
        System.out.println(evensum);
        int res = Math.abs(evensum - oddsum);
        return res;
    }
    public static void main(String args[]){
        String str = "983469123";
        System.out.println(func(str));
    }
}
