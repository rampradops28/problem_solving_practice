public class friendly_array {
    public static int func(int[] arr){
        int n = arr.length;
        if (n < 2) return 0;

        int sum = 0;

        // Calculate the friendliness for each element with its closest neighbors in a circular manner
        for (int i = 0; i < n; i++) {
            int prev = (i == 0) ? arr[n - 1] : arr[i - 1];
            int next = (i == n - 1) ? arr[0] : arr[i + 1];
            sum += Math.min(Math.abs(arr[i] - prev), Math.abs(arr[i] - next));
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,5};
        System.out.println(func(arr));
    }
}
