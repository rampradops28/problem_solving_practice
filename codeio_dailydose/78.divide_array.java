import java.util.ArrayList;
import java.util.Collections;

public class divide_array {
    public static int func(int[] a){

        int n = a.length;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();


        for(int i=0;i<n;i++){
            if(i%2 == 0){
                even.add(a[i]);
            }
            else if(i%2 != 0){
                odd.add(a[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        int sum = even.get(even.size() - 2) + odd.get(odd.size() - 2);

        return sum;
        
    }
    public static void main(String[] args) {
        int a[] = {3,4,1,7,9};

        System.out.println("second largest sum: "+func(a));
    }
}
