import java.util.*;

class assign_cookies { // TC - O( nlogn + nlogn + m ) 

    public static int findContentChildren(int[] g, int[] s) {
    int gn = g.length;
    int sn = s.length;

    Arrays.sort(g); // Sort greed
    Arrays.sort(s); // Sort cookie sizes

    int start = 0; // pointer for cookies
    int end = 0;   // pointer for children

    while(start < sn && end < gn){
        if(g[end] <= s[start]){ 
            end++; // child is satisfied
        } 
        start++; // try next cookie
    }

    return end; // number of content children
}

    public static void main(String[] args) { 

    int[] g = {1, 2, 3};   // greed factors
    int[] s = {1, 1, 2, 3}; // cookie sizes

    int result = findContentChildren(g, s);
    System.out.println("Content children: " + result); // 3
}

}