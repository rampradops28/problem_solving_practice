import java.util.Arrays;

public class marathon_sum {   //1
     public static void func(int[] arr){
         
         int n = arr.length; 
         int sum = 0;
         
         for(int i=0;i<n;i++){
             sum += arr[i];
             arr[i] = sum;
         }
         
         System.out.print(Arrays.toString(arr));
    }
	public static void main(String[] args) {
	     int arr[] = {1,5,3,2};
	     func(arr);
	}
}

public class marathon_sum {   //2
    public static void func(int n){
        
        int[] count = new int[10];
        
        while(n != 0){
            int rem = n%10;
            count[rem]++;
            
            System.out.println("ind: "+count[rem]);
            n /= 10;
        } 
        
        int cnt = 0;
        for(int i=0;i<10;i++){
            if(count[i] > 1){
                cnt++;
            }
        }
        System.out.println(Arrays.toString(count));
        System.out.println(cnt);
        
    }
	public static void main(String[] args) {
	    int n = 578378923;
	    func(n);   
	}
}