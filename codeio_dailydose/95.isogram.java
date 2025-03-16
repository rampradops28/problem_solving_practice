public class isogram {
    public static void main(String[] args) {
        String str = "machine";
        String str2 = "geeks";

        System.out.println(isIsogram(str));
        System.out.println(isIsogram(str2));
    }
    static boolean isIsogram(String data){
       
        int n = data.length();
        
        int[] freq = new int[26];
        
        for(int i=0;i<n;i++){
            freq[data.charAt(i) - 'a']++;
        }
         
        
       for(int i=0;i<n;i++){
           if(freq[data.charAt(i) - 'a'] > 1){
               return false;
           }
       }
        
        return true;
     }
}
