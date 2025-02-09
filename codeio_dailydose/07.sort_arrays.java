public class sort_arrays {
    public static void sort012(int[] arr) { 
        int c0 = 0;
        int c1 = 0; 
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            } 
        }

        for (int i = 0; i < c0; i++) {
            arr[i] = 0;
        }

        for (int i = c0; i < c0 + c1; i++) {
            arr[i] = 1;
        }

        for (int i = c0 + c1; i < n; i++) {
            arr[i] = 2;
        }
    }
    // public static void sort012(int[] arr) { //better
    //     int n = arr.length; 
 
    //     int[] count = new int[3];
 
    //     for (int i = 0; i < n; i++) {
    //         count[arr[i]]++;
    //     }
 
    //     int index = 0;
    //     for (int i = 0; i < count[0]; i++) {
    //         arr[index++] = 0;
    //     }
    //     for (int i = 0; i < count[1]; i++) {
    //         arr[index++] = 1;
    //     }
    //     for (int i = 0; i < count[2]; i++) {
    //         arr[index++] = 2;
    //     }
    // }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) { 

        int[] arr1 = {0, 1, 2, 0, 1, 2};
        System.out.println("Input: [0, 1, 2, 0, 1, 2]");
        sort012(arr1);
        System.out.print("Output: ");
        printArray(arr1); // Output: [0, 0, 1, 1, 2, 2]

        int[] arr2 = {2, 1, 0, 2, 1, 0};
        System.out.println("Input: [2, 1, 0, 2, 1, 0]");
        sort012(arr2);
        System.out.print("Output: ");
        printArray(arr2); // Output: [0, 0, 1, 1, 2, 2]

        int[] arr3 = {1, 0, 1, 2, 0, 1};
        System.out.println("Input: [1, 0, 1, 2, 0, 1]");
        sort012(arr3);
        System.out.print("Output: ");
        printArray(arr3); // Output: [0, 0, 1, 1, 1, 2]
    }
}
