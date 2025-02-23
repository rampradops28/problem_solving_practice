import java.util.HashMap;

public class map_string {
    public static boolean func(String s1, String s2){

        HashMap<Character,Character> map = new HashMap<>();

        int len = s1.length();

        for(int i=0;i<len;i++){
            if(map.containsKey(s1.charAt(i))){
                 if(map.get(s1.charAt(i)) != s2.charAt(i)){
                    return false;
                 }
            }
            map.put(s1.charAt(i),s2.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "ada";
        String s2 = "eff";

        if(func(s1,s2) && func(s2,s1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    } 
}
