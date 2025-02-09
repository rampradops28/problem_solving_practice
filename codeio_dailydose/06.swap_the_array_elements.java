public class swap_the_array_elements {
    public static void swapElements(int[] arr) {
        int i = 0;
        int n = arr.length;
        int temp;

        while (i + 2 < n) {
            temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
            i++;
        }
    }
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

        int[] arr1 = {1, 2, 3};
        System.out.println("Input: [1, 2, 3]");
        swapElements(arr1);
        System.out.print("Output: ");
        printArray(arr1); // Output: [3, 2, 1]

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Input: [1, 2, 3, 4, 5]");
        swapElements(arr2);
        System.out.print("Output: ");
        printArray(arr2); // Output: [3, 4, 5, 2, 1]
    }

}
