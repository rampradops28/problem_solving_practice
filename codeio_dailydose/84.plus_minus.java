import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class plus_minus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        List<Integer> arr = new ArrayList<>();
         
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1); 
         
        plusMinus(arr);
        
        scanner.close();
    }
    
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        
        double pos = 0;
        double neg = 0;
        double zero = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == 0) {
                zero++;
            } else if(arr.get(i) > 0) {
                pos++;
            } else {
                neg++;
            }
        } 
        
        System.out.printf("Positive value : %.6f\n", pos / n);
        System.out.printf("Negative value : %.6f\n", neg / n);
        System.out.printf("Zero value : %.6f\n", zero / n);
    }
}
