import java.util.Scanner;

public class geek_onacci_number {
        public static long func(long a, long b, long c, long N){
        
        if (N == 1) return a;
        if (N == 2) return b;
        if (N == 3) return c;
        long count = 3;
        
        long res = 0;
        while(count < N){
            res = a+b+c;
            a = b;
            b = c;
            c = res;
            count++;
        }
        
        return res;
    }
	public static void main (String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            
            long a,b,c,N;
            
            for(long i=0;i<n;i++){
                a = sc.nextLong();
                b = sc.nextLong();
                c = sc.nextLong();
                N = sc.nextLong();
                
                System.out.println(func(a,b,c,N));
            }
        }
		
	}
}
