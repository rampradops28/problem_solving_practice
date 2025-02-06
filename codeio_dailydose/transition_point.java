public class transition_point {
    static int transitionPoint(int arr[]) {
         
        int n = arr.length;
        int start = 0;
        int end = n-1; 
        
        if(n == 1 && arr[0] == 1) return 0;
        
        while(start <= end){
            
            int mid = (start+end) / 2;
            
            if(arr[mid] == 1 && (mid == 0 || arr[mid-1] == 0)){ 
                return mid;
            }
            else if(arr[mid] == 1){ 
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
         
        return -1;
   }
    public static void main(String[] args) { 

        int[] arr1 = {0, 0, 0, 1, 1, 1}; // Expected output: 3
        int[] arr2 = {0, 0, 0, 0};       // Expected output: -1
        int[] arr3 = {1, 1, 1, 1};       // Expected output: 0
        int[] arr4 = {0, 1};             // Expected output: 1
        int[] arr5 = {0};                // Expected output: -1
        int[] arr6 = {1};                // Expected output: 0

        System.out.println("Transition point in arr1: " +  transitionPoint(arr1));
        System.out.println("Transition point in arr2: " +  transitionPoint(arr2));
        System.out.println("Transition point in arr3: " +  transitionPoint(arr3));
        System.out.println("Transition point in arr4: " +  transitionPoint(arr4));
        System.out.println("Transition point in arr5: " +  transitionPoint(arr5));
        System.out.println("Transition point in arr6: " +  transitionPoint(arr6));
    }
}