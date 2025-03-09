public class run_length_encoding {
    public static void main(String[] args) {
        String s = "aaaabbbccc";
        System.out.println(encode(s));
    }
    public static String encode(String s) {
        
        int n = s.length();
        int count = 1;
        StringBuilder str = new StringBuilder();
        
        for(int i=1;i<n;i++){
            if(s.charAt(i) != s.charAt(i-1)){
                str.append(s.charAt(i-1));
                str.append(Integer.toString(count));
                count = 1;
            }
            else{
                count++;
            }
        }
        
       str.append(s.charAt(n-1));
       str.append(Integer.toString(count));
        
        return str.toString();
        
    //   int n=s.length();
    //   int i=0;
    //   StringBuilder str = new StringBuilder();
    //   while(i<n){
    //       int count=0;
    //         char curr=s.charAt(i);
    //       while(i<n && curr==s.charAt(i)){
    //           count++;
    //           i++;
    //       }
    //       str.append(curr);
    //       str.append(count);
    //     }
    //      return str.toString();
    }
}
