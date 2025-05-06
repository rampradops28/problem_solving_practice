import java.util.*;
public class longest_repeating_character_replacement {
    // public static int func(String s, int k){ // brute force TC - O(N^2)

    //     int n = s.length();
    //     int maxi = 0 ;
    //     int changes = 0;
    //     int max;

    //     for(int i=0;i<n;i++){
    //         int[] hash = new int[26];  
    //          max = 0;

    //         for(int j=i;j<n;j++){
    //             hash[s.charAt(j) - 'A']++;

    //             max = Math.max(max,hash[s.charAt(j) - 'A']);

    //             changes = (j-i+1) - max;

    //             if(changes <= k){
    //                 maxi = Math.max(maxi,j-i+1);
    //             }
    //         }

    //     }

    //     return maxi;

    // }
    public static int func(String s, int k){ // better TC - O((N+N)*26) SC - O(26)

        int n = s.length();
        int l=0,r=0,maxi=0,maxf=0;
        int[] hash = new int[26];

        while(r < n){

            hash[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf,hash[s.charAt(r) - 'A']);
            
            while(((r-l+1) - maxf) > k){ // for optimal flip while to if and remove the inner for loop
                hash[s.charAt(l) - 'A']--;
                maxf = 0;
                for(int i=0;i<26;i++){
                    maxf = Math.max(maxf,hash[i]);
                }
                l++;
            } 

            if((r-l+1) - maxf <= k){
                maxi = Math.max(maxi,r-l+1);
            }

            r++;
        }

        return maxi;
    }
    public static void main(String args[]){
        String str = "AABABBA"; 
        int k = 2;

        int maxlen = func(str,k);

        System.out.println(maxlen);   
    }
}
