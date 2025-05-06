import java.util.*;
class fruits_into_baskets { // max length subarray with atmost 2 types of numbers
    // public static int func(int[] fruits) { // brute force TC - O(N^2)
        
    //     int n = fruits.length;
    //     int len = 0;
    //     int maxi = 0;

    //     for(int i=0;i<n;i++){
    //         HashMap<Integer,Integer> map = new HashMap<>();
    //         for(int j=i;j<n;j++){
    //             map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);

    //             if(map.size() <= 2){
    //                 len = j-i+1;

    //                 maxi = Math.max(maxi,len);
    //             } 
    //         }
    //     }

    //     return maxi;
    // }
    // public static int func(int[] a){ // better time complexity - O(N+N) , space complexity - O(3)

    //     int n = a.length;
    //     int l=0,r=0,maxi=0;
    //     HashMap<Integer,Integer> map = new HashMap<>();

    //     while(r < n){
            
    //         map.put(a[r], map.getOrDefault(a[r],0)+1);

    //          
//             while(map.size() > 2){
//                 map.put(a[l],map.get(a[l]) - 1);
//                 if(map.get(a[l]) == 0){
//                     map.remove(a[l]);
//                 }
//                 l++;
//             }
    //         

    //         if(map.size() <= 2){
    //             maxi = Math.max(maxi,r-l+1);
    //         }

    //         r++;
    //     }
    //     return maxi;
    // }
    public static int func(int[] a) { // optimal TC - O(N)
        
        int n = a.length; 
        int l=0,r=0,maxi = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        
        while(r < n){
            map.put(a[r],map.getOrDefault(a[r], 0)+1);

            if(map.size() > 2){
                map.put(a[l] , map.get(a[l]) - 1);
                if(map.get(a[l]) == 0){
                    map.remove(a[l]);
                }
                l++;
            }

            if(map.size() <= 2){
                maxi = Math.max(maxi,r-l+1);
            }

            r++;
        }

        return maxi;
    }
    public static void main(String args[]){
        int a[] = {3,3,3,1,2,1,1,2,3,3,4};
        
        int maxlen = func(a);

        System.out.println(maxlen);
    }
}
