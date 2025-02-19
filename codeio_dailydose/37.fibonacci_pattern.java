import java.util.ArrayList;

public class fibonacci_pattern {
    public static void main(String[] args) {
	    int n = 5;
		func1(n); //row-wise
        func2(n); //col-wise
	}
    // public static void func1(int n){ //brute
        
    //     int a = 1;
    //     int b = 1;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<=i;j++){ 
    //             int c = a+b;
    //             System.out.print(a+" ");
    //             a = b;
    //             b = c;
    //         }
    //         a = 1;
    //         b = 1;
    //         System.out.println();
    //     }
    // }
    public static void func1(int n){
        
        ArrayList<Integer> fib = new ArrayList<>();
        
        int a = 1;
        int b = 1;
        
        for(int i=0;i<n;i++){
            fib.add(a);
            int c = a+b; 
            a = b;
            b = c;
            
        } 
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fib.get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void func2(int n){
        
        int a = 1;
        int b = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){ 
                int c = a+b;
                System.out.print(a+" ");
                a = b;
                b = c;
            } 
            System.out.println();
        }
    }
}
