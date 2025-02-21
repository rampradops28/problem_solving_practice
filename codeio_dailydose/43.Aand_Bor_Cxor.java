public class Aand_Bor_Cxor {
    public static void main(String args[]){
        String str = "1c0c1c1a0b1";
        System.out.println(func(str));
    }
    public static int func(String str){

        int n = str.length();
        int sum = str.charAt(0) - '0';

        System.out.println(sum);
        for(int i=1;i<n-1;i++){
            char s = str.charAt(i);
            int r = str.charAt(i+1) - '0';
            if(s == 'a'){
                sum = sum & r;
            }
            else if(s == 'b'){
                sum = sum | r;
            }
            else if(s == 'c'){
                sum = sum ^ r;
            }
        }
        return sum;
    }
}
