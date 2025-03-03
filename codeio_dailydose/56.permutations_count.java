public class permutations_count {
        // Function to calculate the length of a string
        public static int length(String str) {
            int len = 0;
            for (char c : str.toCharArray()) {
                len++;
            }
            return len;
        }
    
        // Function to calculate factorial
        public static long factorial(int n) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    
        // Function to find the highest frequency of characters and calculate permutations
        public static long calculatePermutations(String str) {
            int[] charFrequency = new int[26];  // Array to store frequency of characters
    
            // Increment the index corresponding to the character
            for (char c : str.toCharArray()) {
                charFrequency[c - 'a']++;
            }
    
            int len = length(str);
            long permutations = factorial(len);
    
            // Divide by the factorial of frequencies of each character
            for (int freq : charFrequency) {
                if (freq > 1) {
                    permutations /= factorial(freq);
                }
            }
    
            return permutations;
        }
    
        public static void main(String[] args) {
            String input = "aabbcc";
            long result = calculatePermutations(input);
            System.out.println("Number of permutations: " + result);
        }
}
