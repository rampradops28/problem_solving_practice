import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public static List<Integer> ncr(int r){

        long res=1;
        List<Integer> ls = new ArrayList<>();
        ls.add(1);

        for(int i=1;i<r;i++){
            res=res*(r-i);
            res=res/(i);
            ls.add((int)res);
        }

        return ls;
    }
    public static List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<=numRows;i++){  
            ans.add(ncr(i));
        }
        return ans;
    }
    public static void main(String[] args) { 
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }
}
