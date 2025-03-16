import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class randsom_note {

//       public static void checkMagazine(List<String> magazine, List<String> note) {  // without hashmap
//         List<String> magazineCopy = new ArrayList<>(magazine); // Create a copy to avoid modifying the original list
        
//         for (String word : note) {
//             if (!magazineCopy.remove(word)) {
//                 System.out.println("No");
//                 return;
//             }
//         }
        
//         System.out.println("Yes");
//     }

     public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        
        // Count the occurrences of each word in the magazine
        for (String word : magazine) {
            magazineMap.put(word, magazineMap.getOrDefault(word, 0) + 1);
        }
        
        // Check if the note can be formed from the magazine
        for (String word : note) {
            if (!magazineMap.containsKey(word) || magazineMap.get(word) == 0) {
                System.out.println("No");
                return;
            }
            magazineMap.put(word, magazineMap.get(word) - 1);
        }
        
        System.out.println("Yes");
    }
    
    public static void main(String[] args) {
        // Example usage
        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        List<String> note = Arrays.asList("two", "times", "two", "is", "four");
        
        checkMagazine(magazine, note);  // Output should be "No"
    }
}
