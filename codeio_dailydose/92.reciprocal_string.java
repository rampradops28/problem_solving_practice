public class reciprocal_string {
    public static void main(String[] args) {
        String S = "ab C";

        System.out.println(reciprocalString(S));
    }
    static String reciprocalString(String S){
        
        StringBuilder str = new StringBuilder();
        int n = S.length();
        int dis = 0;
        
        for(int i=0;i<n;i++){
            char ch = S.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                dis = ch - 'a';
                str.append((char) ('z' - dis));
            } else if (ch >= 'A' && ch <= 'Z') {
                dis = ch - 'A';
                str.append((char) ('Z' - dis));
            } else {
                str.append(ch);
            }
        }
        
        return str.toString();
    }
}
