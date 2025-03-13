import java.util.Arrays;

class atleast_two_greater{
    public static void main(String[] args) {
        long[] arr = {2, 8, 7, 1, 5};

        long res[] = findElements(arr);

        System.out.println(Arrays.toString(res));
    }
     public static long[] findElements(long arr[]) {
        
        int n = arr.length;
        long[] result = new long[n-2];
        
        Arrays.sort(arr);
        
        for(int i=0;i<n-2;i++){
            result[i] = arr[i];
        }
        
        return result;
    }
}