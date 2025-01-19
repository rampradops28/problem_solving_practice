// import java.util.ArrayList; // Check if there exists a subsequence with sum K
// import java.util.List;

// public class subseqences {
//     public static boolean subsetSum(int i, List<Integer> res, int k, int sum, int[] a, int n){

//         if(i == n){
//            return  sum == k;
//         }

//         res.add(a[i]);
//         sum += a[i];

//         if(subsetSum(i+1,res,k,sum,a,n)) return true;

//         res.remove(res.size() - 1);
//         sum -= a[i];

//         if(subsetSum(i+1,res,k,sum,a,n)) return true;

//         return false;
//     }
//     public static boolean isSubsetPresent(int n, int k,int []a) {

//          List<Integer> res = new ArrayList<>(); 
//          boolean answer = subsetSum(0,res,k,0,a,n);

//          return answer;

//     }
//     public static void main(String args[]){
//         int n = 3;
//         int a[] = {0,1,0};
//         int k = 2;

//         System.out.println(isSubsetPresent(n, k, a));
//     }
// }

// import java.util.ArrayList; // subsequence with sum K
// import java.util.List;

// public class subseqences {
//     public static void subsetSum(int i, List<Integer> res, int k, int sum, int[] a, int n){

//         if(i == n){
//             if(k == sum){
//                 for(int j=0;j<res.size();j++){
//                     System.out.print(res.get(j)+ " ");
//                 }
//                 System.out.println();
//             }
//             return;
//         }

//         res.add(a[i]);
//         sum += a[i];

//         subsetSum(i+1,res,k,sum,a,n);

//         res.remove(res.size() - 1);
//         sum -= a[i];

//         subsetSum(i+1,res,k,sum,a,n);

        
//     }
//     public static void isSubsetPresent(int n, int k,int []a) {

//          List<Integer> res = new ArrayList<>(); 
//          subsetSum(0,res,k,0,a,n);
 

//     }
//     public static void main(String args[]){
//         int n = 3;
//         int a[] = {1,2,1};
//         int k = 3;

//        isSubsetPresent(n, k, a);
//     }
// }

// subsequence count with sum K  
public class subseqences {
    public static int subsetSumCount(int i, int k, int sum, int[] a, int n){

        if(i == n){
            if(k == sum){
               return 1;
            }
            return 0;
        }
 
        sum += a[i];

        int l = subsetSumCount(i+1,k,sum,a,n);
 
        sum -= a[i];

        int r = subsetSumCount(i+1,k,sum,a,n);

        return l + r;
        
    }
    public static int isSubsetCount(int n, int k,int []a) {
 
         return subsetSumCount(0,k,0,a,n);
 

    }
    public static void main(String args[]){
        int n = 3;
        int a[] = {1,2,1};
        int k = 2;

       System.out.println(isSubsetCount(n, k, a));
    }
}