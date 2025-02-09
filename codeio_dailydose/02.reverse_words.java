public class reverse_words {
    public static String reverseWords(String s) {
         
        StringBuilder str = new StringBuilder();
        
        String[] words = s.trim().split("\\s+");
        
        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]);
            
            if(i!=0){
                str.append(" ");
            }
        }
        
        return str.toString();
    }
    public static void main(String[] args) { 

        String s1 = "the sky is blue";           // Expected output: "blue is sky the"
        String s2 = "  hello world  ";           // Expected output: "world hello"
        String s3 = "a good   example";          // Expected output: "example good a"
        String s4 = "  Bob    Loves  Alice   ";  // Expected output: "Alice Loves Bob"
        String s5 = "Alice does not even like bob"; // Expected output: "bob like even not does Alice"

        System.out.println("Reversed words in s1: \"" + reverseWords(s1) + "\"");
        System.out.println("Reversed words in s2: \"" + reverseWords(s2) + "\"");
        System.out.println("Reversed words in s3: \"" + reverseWords(s3) + "\"");
        System.out.println("Reversed words in s4: \"" + reverseWords(s4) + "\"");
        System.out.println("Reversed words in s5: \"" + reverseWords(s5) + "\"");
    }
}
