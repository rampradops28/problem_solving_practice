public class super_ascii_checker {
    static String func(String str){

        int[] freq = new int[26];
        int n = str.length();

        for(int i=0;i<n;i++){
             freq[str.charAt(i) - 'a']++;
        }

        for(int i=0;i<n;i++){
            int ind = str.charAt(i) - 'a';
            if(freq[ind] != ind+1){
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args){
        String str = "bba"; //yes

        System.out.println(func(str));
    }
}
