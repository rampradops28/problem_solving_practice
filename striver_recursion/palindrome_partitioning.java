import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
        public static void func(int ind, String s, List<String> res, List<List<String>> ans){

        if(ind == s.length()){
            ans.add(new ArrayList< >(res));
            return;
        }

        for(int i=ind;i<s.length();++i){
            if(isPalindrome(s,ind,i)){
                res.add(s.substring(ind,i+1));
                func(i+1,s,res,ans);
                res.remove(res.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s,int ind,int i){
        while(ind <= i){
            if(s.charAt(ind++) != s.charAt(i--)){
                return false;
            }
        }
        return true;
    }
    public static List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList< >();
        List<String> res = new ArrayList<>();
        func(0,s,res,ans);
        return ans;

    }
    public static void main(String args[]) {
        String s = "aabb";
        List < List < String >> ans = partition(s); 
        System.out.println("The Palindromic partitions are :-");
        System.out.print(" [ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
        System.out.print("]");


    }
}
