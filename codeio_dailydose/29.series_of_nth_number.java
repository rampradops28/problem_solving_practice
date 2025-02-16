public class series_of_nth_number {
    public static void main(String args[]){
        int n = 3;
        System.out.println(func(n));
    } 
    public static int func(int n){
        
        int a = 1;
        int r;
        int num;

        if(n%2 == 0){
            r = 3;
            num = (n/2) - 1;
            return (int) (a*Math.pow(r,num));
        }
        else{
            r = 2;
            num = n/2;
            return (int) (a*Math.pow(r,num));
        }

    }
}
