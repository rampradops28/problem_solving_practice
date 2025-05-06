// 1358 leetcode

import java.util.*;
class longest_substring_with_atmost_k_distinct_characters { 
    // public static int func(String str,int k){ // brute force TC - O(N^2) * log(256)

    //     int n = str.length();
    //     int maxi = 0;

    //     for(int i=0;i<n;i++){
    //         HashMap<Character,Integer> map = new HashMap<>();
    //         for(int j=i;j<n;j++){
    //             map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
    //             if(map.size() <= k){
    //                 maxi = Math.max(maxi,j-i+1);
    //             }
    //             else{
    //                 break;
    //             }

    //         }
    //     }
    //     return maxi;
    // }
    // public static int func(String str, int k){ // better TC - O(N+N)

    //     int n = str.length();
    //     int r=0,l=0,maxi = 0;
    //     HashMap<Character,Integer> map = new HashMap<>();

    //     while(r<n){
    //         map.put(str.charAt(r),map.getOrDefault(str.charAt(r),0)+1);
 
    //         while(map.size() > k){
    //             map.put(str.charAt(l), map.get(str.charAt(l)) - 1);

    //             if(map.get(str.charAt(l)) == 0){
    //                 map.remove(str.charAt(l));
    //             }
    //             l++;
    //         }
             

    //         if(map.size() <= k){
    //             maxi = Math.max(maxi,r-l+1);
    //         }

    //         r++;
    //     }
    //     return maxi;
    // }
    public static int func(String str, int k){ // optimal TC - O(N)

        int n = str.length();
        int r=0,l=0,maxi = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(r<n){
            map.put(str.charAt(r),map.getOrDefault(str.charAt(r),0)+1);
 
            if(map.size() > k){
                map.put(str.charAt(l), map.get(str.charAt(l)) - 1);

                if(map.get(str.charAt(l)) == 0){
                    map.remove(str.charAt(l));
                }
                l++;
            }
             

            if(map.size() <= k){
                maxi = Math.max(maxi,r-l+1);
            }

            r++;
        }
        return maxi;
    }
    public static void main(String args[]){
        String str = "aaabbccd";
        int k = 2;

        int maxlen = func(str,k);

        System.out.println(maxlen);
    }
}
