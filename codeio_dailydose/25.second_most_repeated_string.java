import java.util.HashMap;
import java.util.Map;

public class second_most_repeated_string {
    public static void main(String[] args) { 
        
        String[] arr = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        int N = arr.length;
        
        String result = secFrequent(arr, N);
        System.out.println("Second most frequent string: " + result);
    }
    static String secFrequent(String arr[], int N) {
        // Create a HashMap to store the frequency of each string
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each string in the array
        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        
        // Variables to store the maximum and second maximum frequencies
        int maxFreq = Integer.MIN_VALUE;
        int secondMaxFreq = Integer.MIN_VALUE;
        String mostFrequent = "";
        String secondMostFrequent = "";
        
        // Find the most frequent and second most frequent strings
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMostFrequent = mostFrequent;
                maxFreq = freq;
                mostFrequent = entry.getKey();
            } else if (freq > secondMaxFreq && freq != maxFreq) {
                secondMaxFreq = freq;
                secondMostFrequent = entry.getKey();
            }
        }
        
        return secondMostFrequent;
    }
}
