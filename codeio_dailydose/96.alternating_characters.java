public class alternating_characters {
    public static void main(String[] args) {
        String s = "AAAA";
        String s1 = "ABABABAB";

        System.out.println(alternatingCharacters(s));
        System.out.println(alternatingCharacters(s1));
        
    }
    public static int alternatingCharacters(String s) {
            
        int n = s.length();
        int cnt = 0;
        
        for(int i=0;i<n-1;i++){
             if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
             }
        }
        
        return cnt;

}

}
