public class product_smallest_pair {
    public static int func(int sum, int[] a){
        int n = a.length;

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(a[i] < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = a[i];
            }
            else if(secondSmallest != a[i] && a[i] < secondSmallest ){
                secondSmallest = a[i];
            }
        }

        int result = firstSmallest*secondSmallest;
        if(result <= sum) return result;
        return 0;
    }
    public static void main(String[] args) {
        int sum = 9;
        int[] a = {5,2,4,3,9,7,1};
 

        System.out.println("Product: "+func(sum,a));
    }
}
