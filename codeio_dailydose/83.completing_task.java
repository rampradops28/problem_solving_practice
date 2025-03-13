import java.util.ArrayList;
import java.util.List;

public class completing_task {
        static List<List<Integer>> findTasks(int[] arr, int k) {
       
       List<List<Integer>> ls = new ArrayList<>();
       int n = arr.length; 
       
       int[] freq = new int[k];
       
       for(int i=0;i<n;i++){
            freq[arr[i] - 1] = 1;;
       }
       
       List<Integer> tanya = new ArrayList<>();
       List<Integer> manya = new ArrayList<>();
       
       int isTanya = 1;
       int isManya = 0;
       
       for(int i=0;i<freq.length;i++){
          
           if(freq[i] == 0){
               
               if(isTanya == 1){
                   tanya.add(i+1);
                   isTanya = 0;
                   isManya = 1;
               }
               else{
                   manya.add(i+1);
                   isTanya = 1;
                   isManya = 0;
               }
           }
       } 
       
       
       System.out.print(tanya.toString());
       
        ls.add(tanya);
        ls.add(manya);
        
        return ls;
    }

     public static void main(String[] args) { 

        // Example input
        int[] arr = {1, 3, 4, 6};
        int k = 6;

        // Finding missing tasks
        List<List<Integer>> result = findTasks(arr, k);

        for (List<Integer> list : result) {
            System.out.print(list + " ");
        }
        // Printing the result
        // System.out.println("Tanya's tasks: " +  );
        // System.out.println("Manya's tasks: " + result.get(1));
    }
}
