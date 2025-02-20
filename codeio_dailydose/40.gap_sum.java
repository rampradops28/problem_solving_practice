public class gap_sum {
    public static void main(String[] args) {
	     int gap = 3;
         int a[] = {1,2,3,4,5,6,7,8,9};
         int n = a.length;

         func(n,a,gap);
	}
    public static void func(int n, int[] a, int gap){
        
        for(int i=0;i<gap;i++){
            int sum = 0;
            for(int j=i;j<n;j+=gap){
                sum += a[j];
            }
            System.out.print(sum+" ");
        }
    }
}
