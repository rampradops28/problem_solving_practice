import java.util.ArrayList;
import java.util.HashMap;

public class unique_range {
    public static void func(int a, int b){

        
        ArrayList<String> res = new ArrayList<>();

        for(int i=a;i<=b;i++){
            String str = Integer.toString(i); 
            HashMap<Character, Character> map = new HashMap<>();
            boolean isUnique = true;
            for(int j=0;j<str.length();j++){
                if(map.containsKey(str.charAt(j))){
                    isUnique = false;
                    break;
                }
                else{

                    map.put(str.charAt(j),' ');
                }
            }
            
            if (isUnique) {
                res.add(str);
            }
        }

        System.out.println(res.toString());
    }
    public static void main(String[] args) {
        int start = 11;
        int end = 34;

        func(start,end);
    }
}
