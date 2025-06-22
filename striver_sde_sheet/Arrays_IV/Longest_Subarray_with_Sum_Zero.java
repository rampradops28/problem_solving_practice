import java.util.HashMap;

public class Longest_Subarray_with_Sum_Zero {
//     static int solve(int[] a){ // brute 
// 	int  max = 0;
// 	for(int i = 0; i < a.length; ++i){
// 		int sum = 0;
// 		for(int j = i; j < a.length; ++j){
// 			sum += a[j];
// 			if(sum == 0){
// 				max = Math.max(max, j-i+1);
// 			}
// 		}
// 	}
// 	return max;
//    }
   static int solve(int A[]) { // optimal
        int n = A.length;
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += A[i]; 

            if(sum == 0) {
                maxi = i + 1; 
            }
            else {
                if(mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {

                    mpp.put(sum, i); 
                }
            }
        }
        return maxi; 
    }

    public static void main(String args[]) 
    { 
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(solve(a));
    } 
}
