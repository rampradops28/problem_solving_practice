public class non_repeating_char {
    public static void main(String[] args) {
        String s = "yy";
		System.out.println(nonRepeatingChar(s));
    }
    static char nonRepeatingChar(String s) {
        
        int[] freq = new int[26];
        int n = s.length();
        
        for(int i=0;i<n;i++){
            freq[s.charAt(i) - 'a']++;
        }   
        
        char ch = ' ';
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                ch = s.charAt(i);
                return ch; 
            } 
        }
        
        return '$';
    }
}
