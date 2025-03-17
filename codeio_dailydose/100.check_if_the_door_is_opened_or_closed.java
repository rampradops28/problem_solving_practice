import java.util.Arrays;

public class check_if_the_door_is_opened_or_closed {
    public static void main(String[] args) {
        int n = 9;
        int a[] = checkDoorStatus(n);
        System.out.println(Arrays.toString(a));
    }
    static int[] checkDoorStatus(int N) {
        
        int[] a = new int[N];
        
        for(int i=0;i<N;i++){
            if(Math.sqrt(i+1) == (int)Math.sqrt(i+1)){
                a[i] = 1;
            }
            else{
                a[i] = 0;
            }
        }
        
        return a;
    }
}
