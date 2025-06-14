import java.util.*;
class minimum_window_substring {
    // public static String minWindow(String s, String t) { // brute force

    //     int n = s.length();
    //     int m = t.length();
    //     int minlen = Integer.MAX_VALUE;
    //     int startind = 0;
    //     int cnt;

    //     for(int i=0;i<n;i++){
    //         HashMap<Character,Integer> map = new HashMap<>();
    //         cnt = 0;
    //         for(int j=0;j<m;j++){
    //             map.put(t.charAt(j),map.getOrDefault(t.charAt(j),0)+1);
    //         }
    //         for(int j=i;j<n;j++){
    //             if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) > 0){
    //                 cnt++;
    //             }
    //             map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
    //             if(cnt == m){
    //                 if(minlen > (j-i+1)){
    //                     minlen = j-i+1;
    //                     startind = i;
    //                     break;
    //                 }
    //             }
    //         }
    //     } 

    //     System.out.println(minlen);
    //     System.out.println(startind);
    //     String str = ""; 

    //     if(startind+minlen <= n){
    //          str = s.substring(startind,startind+minlen); 
    //     }

    //     return str;
    // }
    public String minWindow(String s, String t) {

        int n = s.length();
        int m = t.length();
        int minlen = Integer.MAX_VALUE;
        int startind = 0;
        int cnt;


        System.out.println(minlen);
        System.out.println(startind);
        String str = ""; 

        if(startind+minlen <= n){
             str = s.substring(startind,startind+minlen); 
        }

        return str;
    }
    public static void main(String args[]){
        String s = "ADOBECODEBANC"; 
        String t = "ABC";

        String str = minWindow(s,t);  

        System.out.println(str);  // Output : "BANC"
    }
}
