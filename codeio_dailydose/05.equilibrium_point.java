public class equilibrium_point {
    public static int findEquilibrium(int arr[]) {
        
        int n = arr.length;
        int lsum = 0;
        int rsum = 0; 
        
        for(int i=0;i<n;i++){
            rsum += arr[i];
        }
        
        for(int i=0;i<n;i++){
            
            rsum -= arr[i]; 
            if(lsum == rsum){
                return i;
            }
            lsum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 2, 2};
        System.out.println("Input: [1, 3, 5, 2, 2]");
        System.out.println("Equilibrium index: " + findEquilibrium(arr1)); // Output: 2

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println("Input: [1, 2, 3, 4, 5, 6]");
        System.out.println("Equilibrium index: " + findEquilibrium(arr2)); // Output: -1

        int[] arr3 = {10, 5, 3, 1, 1, 2, 7};
        System.out.println("Input: [10, 5, 3, 1, 1, 2, 7]");
        System.out.println("Equilibrium index: " + findEquilibrium(arr3)); // Output: -1
    }
}
