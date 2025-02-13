public class remove_character {
    public static void main(String[] args) { 
 
        String string1 = "geeksforgeeks";
        String string2 = "mask";
         
        String result = removeChars(string1, string2);
         
        System.out.println(result);  // Output: "geekforgeek"
    }
    // static String removeChars(String string1, String string2){ // Approach 1
        
    //     int freq[] = new int[26];
    //     int len1 = string1.length();
    //     int len2 = string2.length();
        
    //     for(int i=0;i<len2;i++){
    //         freq[string2.charAt(i) - 'a']++;
    //     }
        
    //     String str = "";
    //     for(int i=0;i<len1;i++){
    //         int ind = string1.charAt(i) - 'a';
             
    //         if(freq[ind] == 0){
    //             str += string1.charAt(i);
    //         }
    //     }
    //     return str;
    // }   
    static boolean func(char val, String b,int n){ // Approach 2 
        for(int i=0;i<n;i++){
            if(b.charAt(i) == val){
                return false;
            }
        }
        return true;
    }
    static String removeChars(String string1, String string2){
       
        int len1 = string1.length();
        int len2 = string2.length();
       
        StringBuilder str = new StringBuilder();
     
        for(int i=0;i<len1;i++){
            if(func(string1.charAt(i),string2,len2)){
                str.append(string1.charAt(i));
            }  
        }
        return str.toString();
    }    
}
