public class panagram {
    public static void main(String[] args) {
        String S = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is the string a pangram? " + (isPangram(S) == 1 ? "Yes" : "No"));
    }

    public static int isPangram(String S) {
        int n = S.length();
        boolean[] freq = new boolean[26];

        for (int i = 0; i < n; i++) {
            char s = S.charAt(i);

            if (s >= 'A' && s <= 'Z') {
                freq[Character.toLowerCase(s) - 'a'] = true;
            } else if (s >= 'a' && s <= 'z') {
                freq[s - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!freq[i]) {
                return 0; // Not a pangram
            }
        }
        return 1; // Is a pangram
    }
}
