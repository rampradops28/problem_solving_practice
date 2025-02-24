import java.util.ArrayList;

public class miss_and_repeat {
    static ArrayList<Integer> findTwoElement(int arr[]) {
         
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int[] dup = new int[n];
        
        for(int i=0;i<n;i++){
            if(dup[arr[i] - 1] == 1){
                res.add(arr[i]);
            }
            dup[arr[i] - 1] = 1;
        } 
        
        for(int i=0;i<n;i++){
            if(dup[i] == 0){
                res.add(i+1);
                break;
            }
        }
        
        return res;
        
   }
        public static void main(String[] args) { 
        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> result = findTwoElement(arr);
        System.out.println("Missing and Repeated Elements: " + result);
    }
}
