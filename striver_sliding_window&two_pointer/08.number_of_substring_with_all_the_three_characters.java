// leetcode - 1358
public class 08.number_of_substring_with_all_the_three_characters {
    // public static int numberOfSubstrings(String s) { // brute force 
        
    //     int n = s.length();
    //     int maxi = 0;
        
    //     for(int i=0;i<n;i++){
    //         int[] hash = new int[3];
    //         for(int j=i;j<n;j++){
                 
    //             hash[s.charAt(j) - 'a'] = 1;

    //             if(hash[0] + hash[1] + hash[2] == 3){
    //                 maxi = maxi + (n-j);
    //                  break;
    //             }
    //         }
    //     }

    //     return maxi;
    // }
    // public static int numberOfSubstrings(String s) { // my brute force
        
    //     int n = s.length();
    //     int maxi = 0;
        
    //     for(int i=0;i<n;i++){ 
    //         String str = "";
    //         for(int j=i;j<n;j++){ 
    //             str += s.charAt(j);
    //             if(str.contains("a") && str.contains("b") && str.contains("c")){
    //                 maxi++;
    //             }
    //         }
    //     }

    //     return maxi;
    // }
    public static int numberOfSubstrings(String s) {

        int n = s.length();
        int cnt=0;
        int[] a = {-1,-1,-1}; 

        for(int i=0;i<n;i++){

            a[s.charAt(i) - 'a'] = i;

            if(a[0] != -1 && a[1] != -1 && a[2] != -1){
                int c = Math.min(a[0],a[1]);
                cnt += (1+Math.min(c,a[2]));
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        String str = "abcabc"; 

        int maxlen = numberOfSubstrings(str);

        System.out.println(maxlen);  // output : 10
    }

}
