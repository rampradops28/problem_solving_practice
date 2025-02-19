public class valid_anagram {
    public static boolean areAnagrams(String s1, String s2) {
        int freq[] = new int[26];
        int lena = s1.length();
        int lenb = s2.length();
        
        if (lena != lenb) return false;
        
        for (int i = 0; i < lena; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < lenb; i++) {
            freq[s2.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        
        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
