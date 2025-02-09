public class bitonic_point {
    // public static int findMaximum(int[] arr) { //brute 
    //     int n = arr.length;
    //     for(int i=1;i<n;i++){
    //         if(arr[i] < arr[i-1]) 
    //            return arr[i-1];
    //     }
    //     return 0;
    // }
    public static int findMaximum(int[] arr) { //optimal
         
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid;
        
        while(start <= end){
            mid = (start+end) / 2; 
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            }
            else if (arr[mid] < arr[mid+1]){
                 start = mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) { 

        int[] arr1 = {1, 2, 4, 5, 7, 8, 3};
        System.out.println("Input: [1, 2, 4, 5, 7, 8, 3]");
        System.out.println("Output: " + findMaximum(arr1)); // Output: 8

        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("Input: [10, 20, 30, 40, 50]");
        System.out.println("Output: " + findMaximum(arr2)); // Output: 50

        int[] arr3 = {120, 100, 80, 20, 0};
        System.out.println("Input: [120, 100, 80, 20, 0]");
        System.out.println("Output: " + findMaximum(arr3)); // Output: 120
    }
}
