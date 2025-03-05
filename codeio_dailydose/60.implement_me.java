import java.util.*;
public class implement_me
{
    public static void func(int[] arr){
        
        int n = arr.length;
        int res[] = new int[n]; 
        
        for(int i=0;i<n;i++){
            
            int target = arr[i];
            int bigSum = 0;
            int smallSum = 0;
            
            for(int j=i+1;j<n;j++){
                if(target < arr[j]){
                    bigSum += arr[j];
                }
                else if(target > arr[j]){
                    smallSum += arr[j];
                } 
            }
            res[i] = bigSum * smallSum;   
        }
         System.out.print(Arrays.toString(res));
    }
	public static void main(String[] args) {
	    int arr[] = {8,4,5,3,2,6,9,1};
	    func(arr); 
	}
}
