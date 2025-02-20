import java.util.Arrays;

public class replace_frequent_string {
    public static String func(String s1, char s2){

        int[] freq = new int[26];
        int n = s1.length();

        for(int i=0;i<n;i++){
            freq[s1.charAt(i) - 'a']++;
        }

        System.out.println(Arrays.toString(freq));

        int max = 0;
        char s = ' ';
        for(int i=0;i<n;i++){
            int str = freq[s1.charAt(i) - 'a'];
            System.out.println(str);
            if(str > max){
                max = str;
                s = s1.charAt(i);
            }
        }
        System.out.println(max);
        System.out.println(s);

        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s1.charAt(i) == s){
                str.append(s2);
            } 
            else{
                str.append(s1.charAt(i));
            }
          
        }

        return str.toString();
         
    }
    public static void main(String[] args) {
        String s1 = "bbc";
        char s2 = 'x';

        System.out.println(func(s1,s2));
        
         
    }
}
