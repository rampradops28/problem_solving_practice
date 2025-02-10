public class count_sort {
    public static String countSort(String arr)
    {
            int[] freq = new int[26];
            int n = arr.length();
        
            for(int i=0;i<n;i++){
                freq[arr.charAt(i) - 'a']++;
            }
            
            StringBuilder res = new StringBuilder();
            for(int i=0;i<26;i++){
                for(int j=0;j<freq[i];j++){
                    res.append((char)(i + 'a'));
                }
            }
            
            return res.toString();
    
    }
    public static void main(String[] args) {
        String input1 = "example";
        String input2 = "sorting";
        String input3 = "algorithm";
        String input4 = "testcase";
        String input5 = "frequency";

        System.out.println("Input: " + input1 + " -> Sorted: " + countSort(input1));
        System.out.println("Input: " + input2 + " -> Sorted: " + countSort(input2));
        System.out.println("Input: " + input3 + " -> Sorted: " + countSort(input3));
        System.out.println("Input: " + input4 + " -> Sorted: " + countSort(input4));
        System.out.println("Input: " + input5 + " -> Sorted: " + countSort(input5));
    }  
}
 