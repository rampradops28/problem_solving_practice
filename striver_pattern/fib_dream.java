import java.util.*;
public class fib_dream
{
    public static void func(int[] arr, int n){
        
        // int dum[] = new int[n]; //brute
        
        // int start = 0,end = 1;
        // for(int i=0;i<n;i++){
        //     dum[i] = start;
        //   // System.out.print(dum[i] +" ");
        //     int c = start+end;
        //     start = end;
        //     end = c;
        // }
        
        // for(int i=0;i<n;i++){
        //     if(arr[i] == dum[i]){
        //         continue;
        //     }
        //     else{
        //         arr[i] = dum[i];
        //     }
        // }
        
        int start = 0,end = 1; //optimal
        for(int i=0;i<n;i++){
            if(arr[i] != start){
                arr[i] = start;
            } 

            int c = start+end;
            start = end;
            end = c;
        } 
    }
    
	public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         int[] arr = new int[n];
         
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         } 
		 
		 func(arr,n);
		 
		 for(int i=0;i<n;i++){
		     System.out.print(arr[i]+" ");
		 }
	}
}

