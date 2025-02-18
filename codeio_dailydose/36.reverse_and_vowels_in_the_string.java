public class reverse_and_vowels_in_the_string {
    public static void main(String[] args) { 
        String str1 = "hello";
        String str2 = "hello world";

        String reversed = reverseString(str1);
        String result =  removeVowels(str2);

        System.out.println("Original: " + str1);
        System.out.println("Reversed: " + reversed);
        System.out.println("Original: " + str2);
        System.out.println("Without Vowels: " + result); 
    }
    public static String reverseString(String s) {
        
        char[] str = s.toCharArray();
        int n = str.length;
        
        int start = 0;
        int end = n-1;
        
        while(start < end){
            
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            
            start++;
            end--;
        }
        
        return new String(str);
    }
    static String removeVowels(String s) {
        
        StringBuilder str = new StringBuilder();
        int n = s.length();
        
        for(int i=0;i<n;i++){
            char j = s.charAt(i);
            if(j != 'a' && j != 'e' && j != 'i' && j != 'o' && j != 'u'){
                str.append(j);
            }
        }
        
        return str.toString();
    } 
}
