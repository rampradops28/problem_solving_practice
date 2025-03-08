public class carry_over {
    public static int func(int a, int b){

        int sum = 0;
        int cnt = 0;
        int carry = 1;

        while(a>0 || b>0){
            int rema = a%10;
            int remb = b%10;  

            sum = rema+remb+carry; 

            if(sum > 9){
                carry = 1;
                cnt ++;
            }
            else{
                carry = 0;
            }
             
            a /= 10;
            b /= 10;
        }

        return cnt;
    }
    public static void main(String[] args) {
        int a = 451;
        int b = 349;

        System.out.println("Count of Carry: "+func(a,b));
    }
}
