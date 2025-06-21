// leetcode - 3
import java.util.*;
class Longest_Substring_Without_Repeating_Characters {
    // public static int lengthOfLongestSubstring(String s) { //brute force

    //     int n = s.length();
    //     int maxi = 0;
    //     int len = 0;

    //     for(int i=0;i<n;i++){
            
    //         int hash[] = new int[256];

    //         for(int j=i;j<n;j++){

    //             if(hash[s.charAt(j)] == 1) break;

    //             hash[s.charAt(j)] = 1;

    //             len = j-i+1;

    //             maxi = Math.max(maxi,len);
    //         }
    //     }
    //     return maxi;
    // }
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int l=0,r=0;
        int maxi = 0;
        int len = 0;

        int hash[] = new int[256];
        Arrays.fill(hash,-1);

        while(r < n){

            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >= l){
                    l = hash[s.charAt(r)] + 1;
                }
            }

            len = r-l+1;

            maxi = Math.max(maxi, len);

            hash[s.charAt(r)] = r;

            r++;


        }

        return maxi;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result); // Output: 3
    }
}
