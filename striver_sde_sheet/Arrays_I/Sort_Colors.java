import java.util.Arrays;

public class Sort_Colors {
    //     public static void sortColors(int[] nums) { // brute froce
        
    //     int n = nums.length;
    //     int a=0,b=0;

    //     for(int i=0;i<n;i++){
    //         if(nums[i] == 0) a++;
    //         if(nums[i] == 1) b++; 
    //     }

    //     for(int i=0;i<a;i++){
    //         nums[i] = 0;
    //     }

    //     for(int i=a;i<a+b;i++){
    //         nums[i] = 1;
    //     }
 
    //     for(int i=a+b;i<n;i++){
    //         nums[i] = 2;
    //     }
    // }
    public static void sortColors(int[] nums) { // optimal 
        
        // dutch national flag algo
        //arr[0….low-1] contains 0. [Extreme left part]
        //arr[low….mid-1] contains 1.
        //arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
        
        int n = nums.length;
        int low = 0,mid = 0,high = n-1;

        while(mid <= high){
            if(nums[mid] == 0){

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }  
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};   

        sortColors(nums); 

        System.out.println("Sorted colors: " + Arrays.toString(nums)); // Expected: [0, 0, 1, 1, 2, 2]
    }
}
